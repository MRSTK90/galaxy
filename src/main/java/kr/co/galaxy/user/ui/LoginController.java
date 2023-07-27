package kr.co.galaxy.user.ui;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import kr.co.galaxy.user.application.dto.LoginRequest;
import kr.co.galaxy.user.application.dto.LoginResponse;
import kr.co.galaxy.user.auth.token.UserAuthentication;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class LoginController {

    @PostMapping("/login")
    public ResponseEntity<LoginResponse> login(@RequestBody LoginRequest loginRequest,
            HttpServletResponse response) throws JsonProcessingException {
        LoginResponse loginResponse = new LoginResponse();
        Collection<? extends GrantedAuthority> authorities = new ArrayList<>();
        UserDetails details = User.builder()
                .username("kst")
                .password("1234")
                .authorities("TEST_AUTH")
                .roles("TEST_ROLE")
                .build();

        UserAuthentication authentication = new UserAuthentication(details.getAuthorities());
        Authentication auth = new UserAuthentication();
        ObjectMapper objectMapper = new ObjectMapper();
        String authJson = objectMapper.writeValueAsString(auth);

        response.addHeader("auth", authJson);

        return ResponseEntity.ok().body(loginResponse);
    }

    @GetMapping("/status")
    public ResponseEntity<String> status(){
        return ResponseEntity.ok().body("ok");
    }

}
