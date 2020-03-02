package step_definitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import pages.*;
import test.Excel;
import utilities.Config;
import utilities.Driver;
import utilities.login.LoginSetUp;

import javax.swing.*;
import java.io.IOException;

public class ExpencesReportToTable_step_definitions {

Login_Page login_page = new Login_Page();
Expenses_Main_Page expenses_main_page = new Expenses_Main_Page();
Expense_Reports_Page expense_reports_page= new Expense_Reports_Page();
Expense_Reports_To_Approve_Page expense_reports_to_approve_page = new Expense_Reports_To_Approve_Page();

    @Given("User on the landing page of the app")
    public void user_on_the_landing_page_of_the_app() {
    Driver.getDriver().get(Config.getProperty("url"));
        LoginSetUp.loginTest();

    }

    @Given("User press Expensess Horizontal Sidebar")
    public void user_press_Expensess_Horizontal_Sidebar() {
        login_page.expenseModule.click();
    }

    @Given("Expenses page open and User Press Expenses Report Sidebar")
    public void expenses_page_open_and_User_Press_Expenses_Report_Sidebar() {
expenses_main_page.expenseReport.click();
    }

    @Given("My reports page open and User Press create button")
    public void my_reports_page_open_and_User_Press_create_button() throws InterruptedException {
        Thread.sleep(2000);
        expense_reports_page.createBtn.click();
    }

    @Given("Expenses Report frame popup and User fill up all information and press Add an item button")
    public void expenses_Report_frame_popup_and_User_fill_up_all_information_and_press_Add_an_item_button() throws IOException, InterruptedException {
       expense_reports_page.expense_Report_SummaryField.sendKeys(Excel.getDescription(1));
       expense_reports_page.employee_to_selectField.sendKeys(Excel.getName(1));
       Driver.getDriver().findElement(By.xpath("//ul[@id='ui-id-1']//li[.='"+Excel.getName(1)+"']")).click();
expense_reports_page.addAnItem.click();

    }

    @Given("Expense Lines page open")
    public void expense_Lines_page_open() throws InterruptedException, IOException {
        expense_reports_page.filter_in_bigWindow.sendKeys(Excel.getName(1)+Keys.ENTER);
        Thread.sleep(2000);
    }

    @Given("User select item and press select button")
    public void user_select_item_and_press_select_button() {
        expense_reports_page.checkBox_inTable.click();
        expense_reports_page.selectButton.click();
    }

    @Given("User press Save button")
    public void user_press_Save_button() {
        expense_reports_page.saveButton.click();
    }

    @Then("confirmation message :Expense report submitted, waiting approval should be displayed")
    public void confirmation_message_Expense_report_submitted_waiting_approval_should_be_displayed() {
        String actualResult=expense_reports_page.confirmMessage.getText();
        String expectedResult="Expense report submitted, waiting approval";
        Assert.assertEquals(actualResult,expectedResult);
    }

    @Given("Expenses page open and User Press Expense Reports to Approve")
    public void expenses_page_open_and_User_Press_Expense_Reports_to_Approve() {
        expenses_main_page.expenseReportsToApprove.click();
    }

    @Given("Expenses reports to approve Table should be displayed")
    public void expenses_reports_to_approve_Table_should_be_displayed() throws IOException {


    }

    @Given("User choose created report")
    public void user_choose_created_report() {
        expense_reports_to_approve_page.FirstElementInTable.click();
    }

    @Then("Created report should open, all information inside the report should match entered information")
    public void created_report_should_open_all_information_inside_the_report_should_match_entered_information() throws IOException {
        Assert.assertTrue(expense_reports_to_approve_page.expenceDescriptionFromFrame.getText().contains(Excel.getDescription(1).toString()));
        Assert.assertTrue(expense_reports_to_approve_page.employeeNameFromFRame.getText().contains(Excel.getName(1).toString()));

    }


}
