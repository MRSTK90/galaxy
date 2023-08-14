package kr.co.galaxy.user.auth.security;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import kr.co.galaxy.user.auth.token.TokenRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;


@RequiredArgsConstructor
public class LoginFilter extends OncePerRequestFilter {

    private static final String ID_FIELD = "email";
    private static final String PW_FIELD = "password";

    private final AuthenticationProvider authenticationProvider;

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response,
            FilterChain filterChain) throws ServletException, IOException {

        Map<String, String[]> parameterMap = request.getParameterMap();
        String username = parameterMap.get(ID_FIELD)[0];
        String password = parameterMap.get(PW_FIELD)[0];

        // 1. attemptAuthentication using (id,pw) -> make AuthenticationToken -> AuthenticationManager.authenticate => return Authentication
        // 2. successfulAuthentication Or unsuccessfulAuthentication using Authentication (1. result)
        // 3. process SuccessHandler, failureHanlder

        GalaxyAuthenticationToken token = new GalaxyAuthenticationToken(username, password);
        Authentication authentication = authenticationProvider.authenticate(token);
        successfulAuthentication(request, response, authentication);
        unsuccessfulAuthentication(request, response, null);
/*
        GalaxyAuthenticationToken token= new GalaxyAuthenticationToken(null, username, password);

        try {
            Authentication authentication = authenticationManager.authenticate(token);
        }catch(Exception e){
            e.printStackTrace();
        }

 */
    }

    private void successfulAuthentication(HttpServletRequest request, HttpServletResponse response,
            Authentication authentication) {
        // 1. make token
        String username = authentication.getPrincipal().toString();
        Collection<String> roles = authentication.getAuthorities().stream()
                                    .map(GrantedAuthority::toString).collect(Collectors.toList());

        TokenRequest tokenRequest = new TokenRequest(username, roles);

        // 2. response

    }

    private void unsuccessfulAuthentication(HttpServletRequest request,
            HttpServletResponse response, Exception ex) {
    }
}
