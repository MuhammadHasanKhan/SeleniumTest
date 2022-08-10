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

public class Steps_PlacingOrder {
    WebDriver driver;
    PF_Steps step;
    Config config = new Config();

    public Steps_PlacingOrder() throws IOException {
    }//this new

    @Given("user navigated to Home page and clicks sign in")
    public void userSignInWithValidCredentials() throws IOException {
        this.driver = Platform.chrome();
        driver.get(config.getBaseUrl());
        step = new PF_Steps(driver);
        step.clickSignIn();
    }

    @And("sign in with valid credentials")
    public void signInWithValidCredentials() throws IOException {
        step.signinWithValidCreadentials();
    }

    @And("sign in with Invalid credentials")
    public void signInWithInvalidCredentials() throws IOException {
        step.signinWithInvalidCreadentials();
    }

    @When("user navigated to T-shirt block and hoverover on any T-shirt")
    public void userNavigatedToTShirtBlockAndHoveroverOnAnyTShirt() throws InterruptedException {
        step.selectTshirt();
    }

    @And("user see Add to cart button and clicks on it")
    public void userSeeAddToCartButtonAndClicksOnIt() {
        step.addToCart();
    }

    @And("user should see a confirmation message and click to continue shopping")
    public void userShouldSeeAConfirmationMessageAndClickToContinueShopping() throws InterruptedException {
        step.continueShopping();
        Assert.assertTrue(driver.getPageSource().contains("Product successfully added to your shopping cart"));
    }

    @Then("user navigated to Home page and go to cart")
    public void userNavigatedToHomePageAndGoToCart() throws InterruptedException {
        step.cart();
    }

    @And("place an order to end")
    public void placeAnOrderToEnd() throws InterruptedException {
        step.placingOrder();
        Assert.assertTrue(driver.getPageSource().contains("Your order on My Store is complete."));
        driver.close();
    }
}
