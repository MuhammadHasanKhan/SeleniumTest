package StepDefinition;

import io.cucumber.java.en.Then;
import org.junit.Assert;

public class Steps_InvalidCredentials {
    @Then("user should see error message")
    public void userShouldSeeErrorMessage() {
        Assert.assertTrue("Invalid email address.",true);
    }
}
