package step_definitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pages.Login_Page;
import utilities.Config;
import utilities.Driver;

public class LoginPage_Step_Def {
    private Login_Page lp = new Login_Page();

    @When("User is on BrightERP login page")
    public void user_is_on_BrightERP_login_page() {
        Driver.getDriver().get(Config.getProperty("url"));

    }

    @When("User enters username and password and click the button")
    public void user_enters_username_and_password_and_click_the_button() {
        lp.emailInput.sendKeys(Config.getProperty("email"));
        lp.passwordInput.sendKeys(Config.getProperty("password"));
        lp.loginButton.click();

    }

    @Then("User should be logged in and be able to verify {string} text is displayed as a title")
    public void user_should_be_logged_in_and_be_able_to_verify_text_is_displayed_as_a_title(String expectedTitle) {
       expectedTitle = "Odoo";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertTrue(actualTitle.contains(expectedTitle));


    }


}
