package kr.co.galaxy.core.infra.redis;

import kr.co.galaxy.core.infra.GalaxyConfig;
import org.springframework.data.redis.core.RedisKeyValueAdapter;
import org.springframework.data.redis.repository.configuration.EnableRedisRepositories;

/**
 * Class Description 
 *
 *
 * @class RedisConfig
 * @author SungTae Kim
 * @version 1.0
 * @modification
 * <pre>
 * since	    author	        description
 * ---------	------------	---------------------
 * 2024-02-21      SungTae Kim	    최초 작성		
 * </pre>
 */
@EnableRedisRepositories(
        basePackages = "kr.co.galaxy",
        enableKeyspaceEvents = RedisKeyValueAdapter.EnableKeyspaceEvents.ON_STARTUP
)
public class RedisConfig implements GalaxyConfig {
}
