package kr.co.galaxy.core.infra.jpa;

import kr.co.galaxy.core.infra.GalaxyConfig;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement
@EntityScan("kr.co.galaxy")
@EnableJpaRepositories("kr.co.galaxy")
public class JpaConfig implements GalaxyConfig {
}
