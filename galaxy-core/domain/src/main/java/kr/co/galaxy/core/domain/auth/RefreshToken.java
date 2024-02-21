package kr.co.galaxy.core.domain.auth;

import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;
import org.springframework.data.redis.core.TimeToLive;
import org.springframework.data.redis.core.index.Indexed;

/**
 * Class Description 
 *
 *
 * @class RefreshToken
 * @author SungTae Kim
 * @version 1.0
 * @modification
 * <pre>
 * since	    author	        description
 * ---------	------------	---------------------
 * 2024-02-21      SungTae Kim	    최초 작성		
 * </pre>
 */

@Getter
@NoArgsConstructor
@RedisHash(value = "refresh", timeToLive = 45)
public class RefreshToken {

    @Id
    private String uid;

    //@Indexed
    private String tokenValue;

    //@TimeToLive
    private Long expiration;

    public RefreshToken(String tokenValue, Long expiration) {
        this.tokenValue = tokenValue;
        this.expiration = expiration;
    }
}
