package kr.co.galaxy.core.infra;

import kr.co.galaxy.core.infra.jasypt.JasyptConfig;
import kr.co.galaxy.core.infra.jpa.JpaConfig;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum GalaxyConfigGroup {

    JASYPT(JasyptConfig.class),
    JPA(JpaConfig.class);

    private final Class<? extends GalaxyConfig> configClass;
}
