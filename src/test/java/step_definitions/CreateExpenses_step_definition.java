package step_definitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.Expenses_To_Submit_Page;
import pages.Login_Page;
import utilities.Config;
import utilities.Driver;
import utilities.login.LoginSetUp;

import java.io.File;
import java.io.IOException;

public class CreateExpenses_step_definition {

   Login_Page login_page = new Login_Page();
   Expenses_To_Submit_Page expenseSubmit = new Expenses_To_Submit_Page();

    @Given("User entered correct credentials and logs in")
    public void user_entered_correct_credentials_and_logs_in() {
        LoginSetUp.loginTest();
    }

    @When("user press create button")
    public void user_press_create_button() {
        expenseSubmit.createButton.click();
    }

    @Then("Expenses to submit frame popup")
    public void expenses_to_submit_frame_popup() {
        String expected = "Expense Description";
        String actual = expenseSubmit.expenseDescpriptionPage.getText();
        Assert.assertTrue("Text are not matching, Failed!", actual.equals(expected));
    }

//    @Given("User fills up expense description information")
//    public void user_fills_up_expense_description_information() {
//        Assert.assertTrue(expenseSubmit.expenseDescriptionInput.getText().equals(expenseSubmit.productInput.getText()));
//    }

    @Given("User chooses product in the product dropdown")
    public void user_chooses_product_in_the_product_dropdown() throws InterruptedException {
        expenseSubmit.productInput.click();
        Expenses_To_Submit_Page.productDropdown(2).click();
        Thread.sleep(2000);
    }
    @Given("user chooses employee from employee dropdown")
    public void user_chooses_employee_from_employee_dropdown() throws InterruptedException {
        expenseSubmit.employeeField.click();
        Expenses_To_Submit_Page.employeeDropdown(2).click();
        Thread.sleep(2000);
    }
    @Then("User verifies product input displayed in the expense description field")
    public void user_verifies_product_input_displayed_in_the_expense_description_field() {
        String actualRes = expenseSubmit.expenseDescriptionInput.getText();
        String expectedRes = expenseSubmit.productInput.getText();
        Assert.assertTrue(actualRes.equals(expectedRes));
    }
    @When("user presses Save button")
    public void user_presses_Save_button() {
        expenseSubmit.saveButton.click();
    }

    @Then("confirmation message {string} should be displayed")
    public void confirmation_message_should_be_displayed(String confirmMsg) {
     String actualMsg = expenseSubmit.expenseCreatedText.getText();
     Assert.assertTrue(actualMsg.equals(confirmMsg));
    }

    @Then("submit to manager button should be displayed")
    public void submit_to_manager_button_should_be_displayed() {
        Assert.assertTrue(expenseSubmit.submitToManagerButton.isDisplayed());
    }

    @When("user clicks submit_to_manager button")
    public void user_clicks_submit_to_manager_button() {

        expenseSubmit.submitToManagerButton.click();
    }

    @Then("user should see approve and refuse button")
    public void user_should_see_approve_and_refuse_button() {
        Assert.assertTrue(expenseSubmit.approveButton.isDisplayed());
        Assert.assertTrue(expenseSubmit.refuseButton.isDisplayed());
    }

    @When("user clicks save button")
    public void user_clicks_save_button() {
        expenseSubmit.saveButton.click();
    }

    @Then("user should see {string} message")
    public void user_should_see_message(String expectedText) {

        String actualText = expenseSubmit.submittedMessage.getText();
        Assert.assertTrue(expectedText.equals(actualText));
    }

    @Given("User fills up {string} information")
    public void user_fills_up_information(String productDesc) {
     expenseSubmit.expenseDescriptionInput.sendKeys(productDesc);
Driver.quitDriver();
    }

//    @Given("User chooses {string} in the product dropdown")
//    public void user_chooses_in_the_product_dropdown(String product) throws IOException {
//        expenseSubmit.productInput.click();
//
//        for (WebElement element : expenseSubmit.list){
//            if (element.getText().equals(product)){
//                System.out.println(element.getText());
//            }
//        }
//        System.out.println(s);
//        System.out.println(expenseSubmit.list.size());
//        expenseSubmit.productInput.click();
//        expenseSubmit.productDropdown();
//    }
//
//    @Given("user chooses {string} from employee dropdown")
//    public void user_chooses_from_employee_dropdown(String employee) {
//        expenseSubmit.employeeField.click();
//
//    }
}
