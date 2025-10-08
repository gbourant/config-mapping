package gr;

import io.smallrye.config.ConfigMapping;

@ConfigMapping(prefix = "project")
public interface ProjectConfig {
    String id();

    Identity identity();
}
