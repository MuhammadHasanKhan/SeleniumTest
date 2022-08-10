package PageFactory;

import Common.Config;
import constant.ConstantID;
import constant.ConstantPath;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class PF_Steps {

    Config config = new Config();

    WebDriver driver;

    //---Registration_Form---//

    @FindBy(className = ConstantID.BTN_SIGNIN_CLASSNAME)
    WebElement btn_signIn;

    @FindBy(id = ConstantID.EMAIL_ADDRESS_ID)
    WebElement email_address;

    @FindBy(xpath = ConstantPath.LOGIN_BUTTON_XPATH)
    WebElement btn_create;

    @FindBy(id = ConstantID.GENDER_ID)
    WebElement gender;

    @FindBy(xpath = ConstantPath.FIRST_NAME)
    WebElement first_name;

    @FindBy(xpath = ConstantPath.LAST_NAME)
    WebElement last_name;

    @FindBy(xpath = ConstantPath.PASSWORD)
    WebElement pass;

    @FindBy(xpath = ConstantPath.DAY)
    WebElement day;

    @FindBy(xpath = ConstantPath.MONTH)
    WebElement month;

    @FindBy(xpath = ConstantPath.YEAR)
    WebElement year;

    @FindBy(id = ConstantID.ADDRESS_ID)
    WebElement address;

    @FindBy(id = ConstantID.CITY_ID)
    WebElement city;

    @FindBy(xpath = ConstantPath.STATE)
    WebElement state;

    @FindBy(id = ConstantID.CODE_ID)
    WebElement code;

    @FindBy(id = ConstantID.COUNTRY_ID)
    WebElement country;

    @FindBy(id = ConstantID.NUMBER_ID)
    WebElement number;

    @FindBy(xpath = ConstantPath.REGISTER_BUTTON)
    WebElement btn_regidter;

    public PF_Steps(WebDriver driver) throws IOException {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickSignIn() {
        btn_signIn.click();
        Assert.assertEquals("Login - My Store", driver.getTitle());
    }

    public void enterValidEmail() throws IOException {
        email_address.sendKeys(config.getEmail());
        btn_create.click();
    }

    public void formFillUp() throws IOException {
        gender.click();
        first_name.sendKeys(config.getFirstname());
        last_name.sendKeys(config.getLastName());
        pass.sendKeys(config.getPassword());
        day.click();
        month.click();
        year.click();
        address.sendKeys(config.getAddress());
        city.sendKeys(config.getCity());
        state.click();
        code.sendKeys(config.getCode());
        country.click();
        number.sendKeys(config.getNumber());
    }

    public void registerForm() {
        btn_regidter.click();
    }

    //---Place_an_order---//


    @FindBy(xpath = ConstantPath.SIGNIN_EMAIL)
    WebElement signin_email;

    @FindBy(id = ConstantID.PASSWORD_ID)
    WebElement password;

    @FindBy(xpath = ConstantPath.BTN_SIGN_IN)
    WebElement sign_in_btn;

    @FindBy(xpath = ConstantPath.BTN_WOMEN)
    WebElement btn_women;

    @FindBy(xpath = ConstantPath.BTN_TOP)
    WebElement btn_top;

    @FindBy(xpath = ConstantPath.BTN_TSHIRT)
    WebElement btn_tshirt;

    @FindBy(xpath = ConstantPath.PRODUCT)
    WebElement product;

    @FindBy(xpath = ConstantPath.BTN_ADD_TO_CART)
    WebElement add_to_cart;

    @FindBy(xpath = ConstantPath.BTN_CONTINUE_SHOPPING)
    WebElement btn_continue_shopping;

    @FindBy(xpath = ConstantPath.BTN_HOME)
    WebElement btn_home;

    @FindBy(xpath = ConstantPath.BTN_CART)
    WebElement btn_cart;

    @FindBy(xpath = ConstantPath.BTN_CHECKOUT)
    WebElement btn_checkout;

    @FindBy(xpath = ConstantPath.BTN_PROCEED_1)
    WebElement btn_proceed_1;

    @FindBy(xpath = ConstantPath.BTN_PROCEED_2)
    WebElement btn_proceed_2;

    @FindBy(id = ConstantID.TERMS_OF_SERVICE)
    WebElement terms_of_service;

    @FindBy(xpath = ConstantPath.BTN_PROCEED_3)
    WebElement btn_proceed_3;

    @FindBy(className = ConstantID.PAYMENT_METHOD)
    WebElement payment_mehtod;

    @FindBy(xpath = ConstantPath.BTN_CONFIRM_ORDER)
    WebElement btn_confirm_order;

    public void signinWithValidCreadentials() throws IOException {
        signin_email.sendKeys(config.getEmail());
        password.sendKeys(config.getPassword());
        sign_in_btn.click();
    }

    public void signinWithInvalidCreadentials() throws IOException {
        signin_email.sendKeys(config.getInvalidEmail());
        password.sendKeys(config.getInvalidPassword());
        sign_in_btn.click();
    }

    public void selectTshirt() throws InterruptedException {
        btn_women.click();
        Thread.sleep(ConstantPath.THREAD_SLEEP);
        btn_top.click();
        Thread.sleep(ConstantPath.THREAD_SLEEP);
        btn_tshirt.click();
        Thread.sleep(ConstantPath.THREAD_SLEEP);
        Actions actions = new Actions(driver);
        WebElement target = driver.findElement(By.xpath(ConstantPath.PRODUCT));
        actions.moveToElement(target).perform();
        Thread.sleep(ConstantPath.THREAD_SLEEP);
    }

    public void addToCart() {
        add_to_cart.click();
    }

    public void continueShopping() throws InterruptedException {
        Thread.sleep(ConstantPath.THREAD_SLEEP);
        btn_continue_shopping.click();
    }

    public void cart() throws InterruptedException {
        btn_home.click();
        Actions actions = new Actions(driver);
        WebElement target = driver.findElement(By.xpath(ConstantPath.BTN_CART));
        actions.moveToElement(target).perform();
        Thread.sleep(ConstantPath.THREAD_SLEEP);
        btn_checkout.click();
        Thread.sleep(ConstantPath.THREAD_SLEEP);
    }

    public void placingOrder() throws InterruptedException {
        btn_proceed_1.click();
        Thread.sleep(ConstantPath.THREAD_SLEEP);
        btn_proceed_2.click();
        Thread.sleep(ConstantPath.THREAD_SLEEP);
        terms_of_service.click();
        Thread.sleep(ConstantPath.THREAD_SLEEP);
        btn_proceed_3.click();
        Thread.sleep(ConstantPath.THREAD_SLEEP);
        payment_mehtod.click();
        Thread.sleep(ConstantPath.THREAD_SLEEP);
        btn_confirm_order.click();
        Thread.sleep(ConstantPath.THREAD_SLEEP);
    }
}

//   Actions actions = new Actions(driver);
//   WebElement target = driver.findElement(Any By strategy & locator);
//   actions.moveToElement(target).perform();