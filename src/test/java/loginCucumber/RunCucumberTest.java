package loginCucumber;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty"},
        glue = "loginCucumber.stepdefinitions",
        features = "src\\test\\resources\\loginCucumber\\login.feature"
)
public class RunCucumberTest {
}
