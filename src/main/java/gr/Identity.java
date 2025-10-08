package gr;

import io.smallrye.config.WithDefault;
import io.smallrye.config.WithParentName;

import java.util.List;
import java.util.Map;

public interface Identity {

    @WithParentName
    @WithDefault("EMAIL")
    List<OnboardingIdentity> identityValues();

    @WithParentName
    Map<OnboardingIdentity, OnboardingValidateVerify> onboardingValidateVerifyValues();
}
