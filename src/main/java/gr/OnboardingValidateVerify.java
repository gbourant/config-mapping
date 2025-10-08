package gr;

import io.smallrye.config.WithDefault;
import io.smallrye.config.WithName;

import java.util.Optional;

public interface OnboardingValidateVerify {

    Optional<String> verify();

    @WithDefault("true")
    @WithName("register.enabled")
    boolean registerEnabled();

}
