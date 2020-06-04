package loginCucumber.stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.net.MalformedURLException;

public class Hook {

    public static WebDriver driver;
    @Before
    public void InitTest() throws MalformedURLException {
        System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
        System.setProperty("webdriver.gecko.driver", "D:\\geckodriver.exe");
        String browserName = System.getProperty("browser", "chrome");
        if(browserName.equalsIgnoreCase("chrome"))
            driver=new ChromeDriver();
        else driver = new FirefoxDriver();
    }

    @After
    public void AfterTest(){
        this.driver.quit();
    }
}
