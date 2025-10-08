package gr;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/hello")
public class HelloResource {

    @Inject
    ProjectConfig projectConfig;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return """
    project.id = %s
    project.identity = %s
    project.identity.onboardingValidateVerifyValues = %s
    project.identity.onboardingValidateVerifyValues.EMAIL = %s
    """.formatted(projectConfig.id(),
                projectConfig.identity().identityValues(),
                projectConfig.identity().onboardingValidateVerifyValues(),
                projectConfig.identity().onboardingValidateVerifyValues().get(OnboardingIdentity.EMAIL)
        );
    }
}
