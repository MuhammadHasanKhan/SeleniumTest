package Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/java/Feature"},
        glue = {"StepDefinition"},
        monochrome = true,
        plugin = {"pretty", "html:target/HtmlReports.html",
                "json:target/JSONReport.json",
                "junit:target/JunitReports.xml"}
//tags = "@Smoke"
)
public class testRunner{}
