package kr.co.galaxy.user.auth.security;

import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UserDetails;

@RequiredArgsConstructor
public class GalaxyAuthenticationProvider implements AuthenticationProvider {

    private final GalaxyUserDetailsService userDetailsService;

    @Override
    public Authentication authenticate(Authentication authentication)
            throws AuthenticationException {
        String username = authentication.getName();
        String password = authentication.getCredentials().toString();
        UserDetails user = userDetailsService.loadUserByUsername(username);
        //user null check
        if (user == null) {
            throw new IllegalArgumentException();
        }
        //username, password check
        if (!user.getPassword().equals(password)) {
            throw new IllegalArgumentException();
        }
        return new GalaxyAuthenticationToken(user.getAuthorities(), user.getUsername(),
                user.getPassword());
    }

    @Override
    public boolean supports(Class<?> authentication) {
        return authentication.isAssignableFrom(GalaxyAuthenticationToken.class);
    }
}
