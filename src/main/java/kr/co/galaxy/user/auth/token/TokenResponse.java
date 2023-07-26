package kr.co.galaxy.user.auth.token;

import lombok.Getter;

@Getter
public class TokenResponse {
    private String accessToken;
    private String refreshToken;

}
