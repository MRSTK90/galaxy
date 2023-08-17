package kr.co.galaxy.user.exception;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class ExceptionEntity {
    private String status;
    private int code;
    private String message;

}
