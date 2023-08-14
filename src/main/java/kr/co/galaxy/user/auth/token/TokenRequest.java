package kr.co.galaxy.user.auth.token;

import java.util.Collection;
import lombok.Getter;

@Getter
public class TokenRequest {
    private String email;
    private Collection<String> roles;

    public TokenRequest(String email, Collection<String> roles) {
        this.email = email;
        this.roles = roles;
    }
}
