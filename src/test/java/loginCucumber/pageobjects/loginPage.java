package loginCucumber.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import loginCucumber.stepdefinitions.Hook;

import java.util.concurrent.TimeUnit;

public class loginPage {

    WebDriver driver;
    By txtEmail = By.cssSelector("input#user_email");
    By txtPassword = By.cssSelector("input#user_password");
    By btnLogin = By.cssSelector("input[class=\"ht-btn--main-action\"]");
    By projectPage = By.cssSelector(".page-content-header__title-section__title");
    By messageError = By.cssSelector("div.ht-alert.ht-alert--error p");

    public loginPage()
    {
        this.driver = Hook.driver;
    }

    public void Open()
    {
        this.driver.get("https://studio.cucumber.io/users/sign_in");
        this.driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    public void InputEmail(String username)
    {
        driver.findElement(txtEmail).sendKeys(username);
    }

    public void InputPassword(String password){
        driver.findElement(txtPassword).sendKeys(password);
    }

    public void clickButton(){
        driver.findElement(btnLogin).click();
    }

    public String GetprojectPgae()
    {
        WebDriverWait waiter = new WebDriverWait(this.driver, 5);
        WebElement txtResult = waiter.until(ExpectedConditions.visibilityOf(this.driver.findElement(projectPage)));
        return txtResult.getText();
    }

    public String GetmessageError()
    {
        WebDriverWait waiter = new WebDriverWait(this.driver, 5);
        WebElement txtResult = waiter.until(ExpectedConditions.visibilityOf(this.driver.findElement(messageError)));
        return txtResult.getText();
    }

}
