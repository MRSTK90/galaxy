package kr.co.galaxy.apis.user.app.application;

import kr.co.galaxy.core.domain.auth.RefreshToken;
import kr.co.galaxy.core.domain.auth.RefreshTokenRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * Class Description 
 *
 *
 * @class RefreshTokenService
 * @author SungTae Kim
 * @version 1.0
 * @modification
 * <pre>
 * since	    author	        description
 * ---------	------------	---------------------
 * 2024-02-21      SungTae Kim	    최초 작성		
 * </pre>
 */

@Service
@RequiredArgsConstructor
public class RefreshTokenService {
    private final RefreshTokenRepository refreshTokenRepository;

    public RefreshToken create(){
        RefreshToken refreshToken = new RefreshToken("qweqwe", 30L);
        refreshTokenRepository.save(refreshToken);
        return refreshToken;
    }
}
