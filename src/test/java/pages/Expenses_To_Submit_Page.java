package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Expenses_To_Submit_Page {

    public Expenses_To_Submit_Page(){

        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "//li[.='My Expenses to Submit']")
    public WebElement textDisplay;

    @FindBy(xpath = "//li[.='New']")
    public WebElement newTextDisplay;

    @FindBy(xpath = "//button[@class='btn btn-primary btn-sm o_list_button_add']")
    public WebElement createButton;

    @FindBy(xpath = "//input[@class='o_field_char o_field_widget o_input o_required_modifier']")
    public WebElement expenseDescriptionInput;

    @FindBy(xpath = "(//input[@class='o_input ui-autocomplete-input'])[1]")
    public WebElement productInput;


    @FindBy(xpath = "//a[.='[CARD] Apple80']")
    public WebElement chosenProduct;

    @FindBy(xpath = "//input[@id='o_field_input_21']")
    public WebElement unitPriceInput;

    @FindBy(xpath = "//input[@id='o_field_input_70']")
    public WebElement expenseDate;

    @FindBy(xpath = "//div[@name='employee_id']/div")
    public WebElement employeeField;

    @FindBy(xpath = "//a[.='David Samson'][1]")
    public WebElement employeeName;

    @FindBy(xpath = "//button[@class='btn btn-primary btn-sm o_form_button_save']")
    public WebElement saveButton;

    @FindBy(xpath = "//button[.='Submit to Manager']")
    public WebElement submitToManagerButton;

    @FindBy(xpath = "//button[.='Approve']")
    public WebElement approveButton;

    @FindBy(xpath = "//div[@class='o_thread_message_content']")
    public WebElement textAfterSave;

    @FindBy (xpath = "(//div[@class='o_thread_message_content']/p)[1]")
    public WebElement submittedMessage;

    @FindBy(xpath = "//p[.='Expense created']")
    public WebElement expenseCreatedText;

    @FindBy(xpath = "//li[.='[253] Tshirt'][1]")
    public WebElement productTshirt;

    @FindBy(xpath = "(//button[@class='btn btn-sm btn-primary'])[1]")
    public WebElement newproductcreate;

    @FindBy(xpath = "(//button[@class='btn btn-sm btn-primary'])[2]")
    public WebElement okButton;

    @FindBy(xpath = "(//h4[@class='modal-title'])[1]")
    public WebElement errormessage;

    @FindBy(xpath = "(//table[@class='o_group o_inner_group o_group_col_6'][1])")
    public WebElement table;

    @FindBy(xpath = "//button[@class='btn btn-sm btn-default o_form_button_cancel']")
    public WebElement discardButton;

    @FindBy(xpath = "//button[@class='btn btn-sm btn-default']")
    public WebElement cancelButton;



}
