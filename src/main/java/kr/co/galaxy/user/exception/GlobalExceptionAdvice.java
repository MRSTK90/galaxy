package kr.co.galaxy.user.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionAdvice {

    @ExceptionHandler(BaseException.class)
    public ResponseEntity<ExceptionEntity> handleBaseException(BaseException e){
        return ResponseEntity
                .status(e.getHttpStatus())
                .body(ExceptionEntity.builder()
                        .code(e.getHttpStatus().value())
                        .status(e.getHttpStatus().name())
                        .message(e.getMessage())
                        .build());
    }


}
