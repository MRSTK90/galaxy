package kr.co.galaxy.user.application.dto;

import lombok.Getter;

@Getter
public class LoginResponse {
    private String accessToken;
    private String refreshToken;
    private String code;
    private String state;
}
