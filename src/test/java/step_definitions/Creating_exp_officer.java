package step_definitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.Expenses_To_Submit_Page;
import pages.Login_Page;
import utilities.Config;
import utilities.Driver;

import javax.security.auth.login.LoginContext;

public class Creating_exp_officer {
    Expenses_To_Submit_Page  expenses = new Expenses_To_Submit_Page();
    Login_Page login = new Login_Page();
    @Given("User clicks on the Expenses functionality")
    public void user_clicks_on_the_Expenses_functionality() {
        Driver.getDriver().get(Config.getProperty("url"));
        login.emailInput.sendKeys(Config.getProperty("email"));
        login.passwordInput.sendKeys(Config.getProperty("password"));
        login.loginButton.click();
        login.expenseModule.click();

    }

    @When("User clicks on the Create button")
    public void user_clicks_on_the_Create_button() {
        expenses.createButton.click();

    }

    @Then("Expense window should pop up")
    public void expense_window_should_pop_up() {
        Assert.assertTrue(expenses.newTextDisplay.isDisplayed());

    }

    @When("user fills out the expense description")
    public void user_fills_out_the_expense_description() {
        //expenses.expenseDescriptionInput.sendKeys(Config.getProperty("expenseDescription"));

    }

    @When("User clicks on the product dropdown")
    public void user_clicks_on_the_product_dropdown() throws InterruptedException {
        expenses.productInput.click();
        Thread.sleep(3000);
        //expenses.chosenProduct.sendKeys(Config.getProperty("product"));
        expenses.productTshirt.click();
        String productT = expenses.productTshirt.getText();
        Assert.assertEquals("Text doesn't match", expenses.expenseDescriptionInput.getText(), productT );

    }
    @When("User chooses {string} from product dropdown")
    public void user_chooses_from_product_dropdown(String productValue) {
      //expenses.productInput.sendKeys(productValue + Keys.ENTER);
      //expenses.cancelButton.click();

    }

    @When("User clicks on the unit price module")
    public void user_clicks_on_the_unit_price_module() {


    }

    @When("User clicks on the quantity module")
    public void user_clicks_on_the_quantity_module() {

    }

    @When("clicks on the Expense Date button")
    public void clicks_on_the_Expense_Date_button() {

    }

    @When("User clicks on the Employee dropdown")
    public void user_clicks_on_the_Employee_dropdown() throws InterruptedException {
        expenses.employeeField.click();
        Thread.sleep(3000);
        expenses.employeeName.click();
    }
    @When("User chooses {string} from employee dropdown")
    public void user_chooses_from_employee_dropdown(String employeeValue) throws InterruptedException {
        //expenses.employeeField.sendKeys(employeeValue );
        Thread.sleep(3000);
        //expenses.cancelButton.click();
    }

    @When("User clicks on the Employee/Company checkbox under")
    public void user_clicks_on_the_Employee_Company_checkbox_under() {

    }

    @When("User clicks on the Notes box")
    public void user_clicks_on_the_Notes_box() {

    }

    @When("User clicks on the save button")
    public void user_clicks_on_the_save_button() {
        expenses.saveButton.click();


    }

    @Then("User clicks on the Submit to Manager button")
    public void user_clicks_on_the_Submit_to_Manager_button() throws InterruptedException {
        expenses.submitToManagerButton.click();
        Thread.sleep(2000);
        expenses.saveButton.click();
        Thread.sleep(2000);
        Assert.assertTrue("Expense report not submitted!",expenses.textAfterSave.isDisplayed());
        System.out.println(expenses.textAfterSave.getText());
        Driver.quitDriver();

    }


    @When("User enters unlisted product and adds it")
    public void user_enters_unlisted_product_and_adds_it() throws InterruptedException {
        //expenses.productInput.click();
        //Thread.sleep(3000);
        expenses.productInput.sendKeys("wooden spoon");
        expenses.table.click();
        Thread.sleep(2000);
        expenses.newproductcreate.click();
        Thread.sleep(3000);
        expenses.newproductcreate.click();
        Thread.sleep(2000);
        expenses.okButton.click();
        Thread.sleep(2000);
        expenses.discardButton.click();


    }

    @Then("User sees error message")
    public void user_sees_error_message() throws InterruptedException {
        //Assert.assertTrue("Error message not displayed!",expenses.errormessage.isDisplayed());
        //Assert.assertTrue(expenses.errormessage.isDisplayed());


    }

}
