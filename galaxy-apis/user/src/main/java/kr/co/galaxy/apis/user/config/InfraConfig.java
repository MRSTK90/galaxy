package kr.co.galaxy.apis.user.config;

import kr.co.galaxy.core.infra.EnableGalaxyConfig;
import kr.co.galaxy.core.infra.GalaxyConfigGroup;
import org.springframework.context.annotation.Configuration;

/**
 * Class Description 
 *
 *
 * @class InfraConfig
 * @author SungTae Kim
 * @version 1.0
 * @modification
 * <pre>
 * since	    author	        description
 * ---------	------------	---------------------
 * 2024-02-14      SungTae Kim	    최초 작성		
 * </pre>
 */

@Configuration(proxyBeanMethods = false)
@EnableGalaxyConfig({
        GalaxyConfigGroup.JASYPT,
        GalaxyConfigGroup.JPA,
        GalaxyConfigGroup.REDIS
})
public class InfraConfig {
}
