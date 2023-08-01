package kr.co.galaxy.user.auth.security;

import java.util.Collection;
import java.util.stream.Collectors;
import kr.co.galaxy.user.domain.User;
import kr.co.galaxy.user.infra.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class GalaxyUserDetailsService implements UserDetailsService {

    private final UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.getReferenceById(username);

        if(user == null){
            return null;
        }

        Collection<GrantedAuthority> roles = user.getRoles()
                .stream()
                .map(SimpleGrantedAuthority::new)
                .collect(Collectors.toList());

        return new GalaxyUserDetails(user.getEmail(), user.getPassword(), roles);
    }
}
