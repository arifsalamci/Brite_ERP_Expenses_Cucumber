package step_definitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pages.Expense_Reports_To_Approve_Page;
import pages.Expenses_Main_Page;
import utilities.Driver;

public class Expense_Report_To_Approve_Approve_StepDefs {
    Expense_Reports_To_Approve_Page moduleObject = new Expense_Reports_To_Approve_Page();
    Expenses_Main_Page expenses_main_page = new Expenses_Main_Page();


    @When("User click to Expenses module user should be navigate Expenses module")
    public void user_click_to_Expenses_module_user_should_be_navigate_Expenses_module() {
        moduleObject.expensesModule.click();

    }

    @When("User click to Expenses Report to Approve user should be navigate this page")
    public void user_click_to_Expenses_Report_to_Approve_user_should_be_navigate_this_page() {
        expenses_main_page.expenseReportsToApprove.click();

    }

    @Then("The title of the current page should contains {string}")
    public void the_title_of_the_current_page_should_contains(String fuctionPageTitle) {
        String actualTitle= Driver.getDriver().getTitle();
        fuctionPageTitle = "Odoo";
        Assert.assertTrue(actualTitle.contains(fuctionPageTitle));
    }


    @When("User click to any submitted entry user shoul be navigate the the entry page")
    public void user_click_to_any_submitted_entry_user_should_be_navigate_the_the_entry_page() {
        moduleObject.sampleEntry.click();

    }

    @When("user in entry page Approve button should be displayed and should be clicked")
    public void user_in_entry_page_Approve_button_should_be_displayed_and_should_be_clicked() {
        moduleObject.approveButton.click();

    }

    @Then("Approved button should not be displayed")
    public void approved_button_should_not_be_displayed() {
        Assert.assertTrue(moduleObject.approveButton.isDisplayed());

        Driver.quitDriver();
    }

}
