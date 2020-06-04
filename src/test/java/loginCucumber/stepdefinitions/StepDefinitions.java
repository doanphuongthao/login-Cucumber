package loginCucumber.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import loginCucumber.pageobjects.loginPage;

public class StepDefinitions {
    loginPage calPage;

    public StepDefinitions()
    {
        this.calPage = new loginPage();
    }
    @Given("^The login screen is displayed on brower$")
    public void the_login_screen_is_displayed_on_brower() throws Throwable {
        this.calPage.Open();
    }

    //case1
    @When("^The User attempt to login with his (.+) and (.+) credentials$")
    public void the_user_attempt_to_login_with_his_and_credentials(String username, String password) throws Throwable {
        this.calPage.InputEmail(username);
        this.calPage.InputPassword(password);
        this.calPage.clickButton();
    }

    @Then("^The (.+) projectpage will be showed$")
    public void the_projectpage_will_be_showed(String title) throws Throwable {
        Assert.assertEquals(title, this.calPage.GetprojectPgae());

    }
    //case2

    @When("^The User attempt to login with (.+) and invalid (.+)$")
    public void the_user_attempt_to_login_with_and_invalid(String username, String password) throws Throwable {

        this.calPage.InputEmail(username);
        this.calPage.InputPassword(password);
        this.calPage.clickButton();
    }

    @Then("^The error (.+) is showed$")
    public void the_error_is_showed(String message) throws Throwable {
        Assert.assertEquals(message, this.calPage.GetmessageError());
    }

}
