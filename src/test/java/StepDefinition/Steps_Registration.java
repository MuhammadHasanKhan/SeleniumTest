package StepDefinition;

import Browser.Platform;
import Common.Config;
import PageFactory.PF_Steps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class Steps_Registration {
    WebDriver driver;
    PF_Steps step;
    Config config = new Config();

    public Steps_Registration() throws IOException {
    }

    //---Scenerio # 01---//

    @Given("user is on home page")
    public void userIsOnHomePage() throws Throwable {
        this.driver = Platform.chrome();
        driver.get(config.getBaseUrl());
        step = new PF_Steps(driver);
    }

    @When("user clicks on sign in, user navigated to sign in page")
    public void userClicksOnSignIn() {
        step.clickSignIn();
    }

    @And("user enter valid email and clicks on register")
    public void userEnterValidEmailAndClicksOnRegister() throws IOException {
        step.enterValidEmail();
    }

    @Then("user sees a registration form and fills it up")
    public void userSeesARegistrationFormAndFillsItUp() throws IOException {
        step.formFillUp();
    }

    @And("clicks on register")
    public void clicksOnRegister() {
        step.registerForm();
        driver.close();
    }
}
