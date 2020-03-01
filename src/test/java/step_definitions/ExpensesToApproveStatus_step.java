package step_definitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.Expense_Reports_To_Approve_Page;
import pages.Login_Page;
import utilities.Config;
import utilities.Driver;

import java.util.List;

public class ExpensesToApproveStatus_step {

    Login_Page login_page = new Login_Page();
    Expense_Reports_To_Approve_Page expenseReportsToApprovePage= new Expense_Reports_To_Approve_Page();
    WebDriverWait webDriverWait = new WebDriverWait(Driver.getDriver(), 10);

    @When("User Go to the BRIDE ERP web page")
    public void user_Go_to_the_BRIDE_ERP_web_page() throws InterruptedException {

        Driver.getDriver().get(Config.getProperty("url"));

    }

    @When("User  logged into BRIDE ERP Manager account and on Expenses page")
    public void user_logged_into_BRIDE_ERP_Manager_account_and_on_Expenses_page() {
        login_page.emailInput.sendKeys(Config.getProperty("email"));
        login_page.passwordInput.sendKeys(Config.getProperty("password"));
//        WebDriverWait webDriverWait = new WebDriverWait(Driver.getDriver(), 10);
//        webDriverWait.until(ExpectedConditions.elementToBeClickable(login_page.loginButton));


        login_page.loginButton.click();
        login_page.expenseModule.click();


    }

    @When("User Click on Expense Reports to Approve")
    public void user_Click_on_Expense_Reports_to_Approve() {
        expenseReportsToApprovePage.expense_Report_To_Approve.click();


    }

    @When("Remove to approve filter on the search box")
    public void remove_to_approve_filter_on_the_search_box() throws InterruptedException{
        Thread.sleep(3000);
       // webDriverWait.until(ExpectedConditions.elementToBeClickable( expenseReportsToApprovePage.toApproveRemoveButton));
        expenseReportsToApprovePage.toApproveRemoveButton.click();


    }

    @When("Enter Approved on search box")
    public void enter_Approved_on_search_box() {
   expenseReportsToApprovePage.searchBox.sendKeys("Approved");



    }

    @When("Fined the to approved filter on the search box and click on it")
    public void fined_the_to_approved_filter_on_the_search_box_and_click_on_it() {
        webDriverWait.until(ExpectedConditions.elementToBeClickable(expenseReportsToApprovePage.approvedOption));
        expenseReportsToApprovePage.approvedOption.click();

    }

    @When("count and print all approved expenses")
    public void count_and_print_all_approved_expenses() throws InterruptedException{


     Thread.sleep(2000);
        for(WebElement approve: expenseReportsToApprovePage.listOfElements){
            String actual = approve.getText();
            String expected = "Approved";
            Assert.assertEquals(actual, expected);
            System.out.println(actual);
        }


    }

    @Then("User should be able to see how many approved status")
    public void user_should_be_able_to_see_how_many_approved_status() throws InterruptedException{
        int count =0;

        Thread.sleep(2000);
        for(WebElement approve: expenseReportsToApprovePage.listOfElements){
            String actual = approve.getText();
            String expected = "Approved";
            Assert.assertEquals(actual, expected);
            count++;

        }
        System.out.println(count);
        Driver.quitDriver();

    }

    @When("Enter Refuse on search box")
    public void enter_Refuse_on_search_box() {

        expenseReportsToApprovePage.searchBox.sendKeys("Refuse");


    }

    @When("Fined the Refuse filter and click on it")
    public void fined_the_Refuse_filter_and_click_on_it() {
        expenseReportsToApprovePage.refusedOption.click();

    }

    @When("count and print all Refuse expenses")
    public void count_and_print_all_Refuse_expenses() throws InterruptedException{

        List<WebElement> statuses = expenseReportsToApprovePage.expensesStatus;

        Thread.sleep(2000);
        for (WebElement status : statuses) {
            String actual = status.getText();
            String expected = "Refused";
            Assert.assertEquals(actual, expected);

            System.out.println(actual);
        }


    }

    @Then("User should be able to see how many Refuse status")
    public void user_should_be_able_to_see_how_many_Refuse_status() throws InterruptedException{
        List<WebElement> statuses = expenseReportsToApprovePage.expensesStatus;
        int count = 0;

        Thread.sleep(2000);
        for (WebElement status : statuses) {
            String actual = status.getText();
            String expected = "Refused";
            Assert.assertEquals(actual, expected);
            count++;
        }
        System.out.println(count);
        Driver.quitDriver();


    }



    @When("Enter Submitted on search box")
    public void enter_Submitted_on_search_box() throws InterruptedException{
        Thread.sleep(2000);
        expenseReportsToApprovePage.searchBox.sendKeys("Submitted");


    }

    @When("Fined the Submitted filter and click on it")
    public void fined_the_Submitted_filter_and_click_on_it()throws InterruptedException {
        Thread.sleep(2000);
        expenseReportsToApprovePage.refusedOption.click();

    }

    @When("count and print all Submitted expenses")
    public void count_and_print_all_Submitted_expenses() throws InterruptedException {
        Thread.sleep(2000);
        List<WebElement> statuses = expenseReportsToApprovePage.expensesSubmittedStatus;
        int count = 0;

        for (WebElement status : statuses) {
            String actual = status.getText();
            String expected = "Submitted";
            Assert.assertEquals(actual, expected);
            count++;
            System.out.println(actual);
        }

    }

    @Then("User should be able to see how many Submitted status")
    public void user_should_be_able_to_see_how_many_Submitted_status() throws InterruptedException{
        Thread.sleep(2000);
        List<WebElement> statuses = expenseReportsToApprovePage.expensesSubmittedStatus;
        int count = 0;

        for (WebElement status : statuses) {
            String actual = status.getText();
            String expected = "Submitted";
            Assert.assertEquals(actual, expected);
            count++;
        }
        System.out.println(count);
Driver.quitDriver();
    }

    }

