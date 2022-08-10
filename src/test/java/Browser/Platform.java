package Browser;

import constant.ConstantPath;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Platform {
    public static WebDriver chrome() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(ConstantPath.TIME_IN_SECONDS, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(ConstantPath.TIME_IN_SECONDS, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        return driver;
    }
}
