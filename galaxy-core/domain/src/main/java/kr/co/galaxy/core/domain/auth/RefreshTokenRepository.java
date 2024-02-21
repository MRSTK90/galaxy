package kr.co.galaxy.core.domain.auth;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Class Description 
 *
 *
 * @class RefreshTokenRepository
 * @author SungTae Kim
 * @version 1.0
 * @modification
 * <pre>
 * since	    author	        description
 * ---------	------------	---------------------
 * 2024-02-21      SungTae Kim	    최초 작성		
 * </pre>
 */

public interface RefreshTokenRepository  extends CrudRepository<RefreshToken, String> {

}
