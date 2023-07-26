package kr.co.galaxy.user.ui;

import kr.co.galaxy.user.application.dto.LoginRequest;
import kr.co.galaxy.user.application.dto.LoginResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class LoginController {

    @PostMapping("/login")
    public ResponseEntity<LoginResponse> login(@RequestBody LoginRequest loginRequest) {
        LoginResponse response = new LoginResponse();

        return ResponseEntity.ok().body(response);
    }

}
