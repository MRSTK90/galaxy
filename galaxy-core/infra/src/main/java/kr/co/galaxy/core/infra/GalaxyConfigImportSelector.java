package kr.co.galaxy.core.infra;

import org.apache.commons.collections4.MapUtils;
import org.springframework.context.annotation.DeferredImportSelector;
import org.springframework.core.type.AnnotationMetadata;

import java.util.Arrays;
import java.util.Map;

public class GalaxyConfigImportSelector implements DeferredImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata metadata) {
        return Arrays.stream(getValues(metadata))
                .map(v -> v.getConfigClass().getName())
                .toArray(String[]::new);
    }

    private GalaxyConfigGroup[] getValues(AnnotationMetadata metadata){
        Map<String, Object> attributes = metadata.getAnnotationAttributes(EnableGalaxyConfig.class.getName());
        return (GalaxyConfigGroup[]) MapUtils.getObject(attributes, "value", new GalaxyConfigGroup[]{});
    }
}
