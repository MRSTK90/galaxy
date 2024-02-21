package kr.co.galaxy.apis.user.app.web;

import kr.co.galaxy.apis.user.app.application.RefreshTokenService;
import kr.co.galaxy.core.domain.auth.RefreshToken;
import kr.co.galaxy.core.domain.auth.RefreshTokenRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Class Description 
 *
 *
 * @class RefreshTokenController
 * @author SungTae Kim 
 * @version 1.0
 * @modification
 * <pre>
 * since	    author	        description
 * ---------	------------	---------------------
 * 2024-02-21      SungTae Kim	    최초 작성		
 * </pre>
 */

@RestController
@RequiredArgsConstructor
@RequestMapping("refresh-token")
public class RefreshTokenController {

    private final RefreshTokenService refreshTokenService;
    
    @GetMapping
    public ResponseEntity<Object> get(){
        RefreshToken refreshToken = refreshTokenService.create();
        return ResponseEntity.ok(refreshToken);
    }
}
