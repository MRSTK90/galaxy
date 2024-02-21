package kr.co.galaxy.core.infra;

import kr.co.galaxy.core.infra.jasypt.JasyptConfig;
import kr.co.galaxy.core.infra.jpa.JpaConfig;
import kr.co.galaxy.core.infra.redis.RedisConfig;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum GalaxyConfigGroup {

    JASYPT(JasyptConfig.class),
    JPA(JpaConfig.class),
    REDIS(RedisConfig.class);

    private final Class<? extends GalaxyConfig> configClass;
}
