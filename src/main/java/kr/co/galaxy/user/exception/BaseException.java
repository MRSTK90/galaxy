package kr.co.galaxy.user.exception;

import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public class BaseException extends RuntimeException{
    private HttpStatus httpStatus;
    private String message;

    public BaseException(){
        super();
    }
    public BaseException(HttpStatus httpStatus){
        this(httpStatus, httpStatus.getReasonPhrase());
    }

    public BaseException(String message){
        super(message);
    }

    public BaseException(HttpStatus httpStatus, String message) {
        this.httpStatus = httpStatus;
        this.message = message;
    }
}
