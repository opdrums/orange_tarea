package pageObjects;
import net.serenitybdd.core.annotations.findby.FindBy;
import org.openqa.selenium.WebElement;

public class registerPo extends WebBasePage{

    private String optionMain = "//div/ul[@class='oxd-main-menu']/li['Replaceable']/a";
    private String optionList = "//div[@role='option'][Replaceable]";

    @FindBy (xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")
    private WebElement buttonAddUser;

    @FindBy (xpath = "//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[1]/div/div[2]/div/div/div[2]/i")
    private WebElement selectListUserRol;

    @FindBy (xpath = "//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[3]/div/div[2]/div/div/div[2]/i")
    private WebElement selectListStateUser;

    @FindBy (xpath = "//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/div/div[2]/div/div/input")
    private  WebElement fieldEmployeeName;

    @FindBy (xpath = "//div[@class='oxd-grid-item oxd-grid-item--gutters'][4]//div//div[2]//input")
    private WebElement fieldUserName;

    @FindBy (xpath = "//div[@class='oxd-form-row user-password-row']//div[@class='oxd-grid-item oxd-grid-item--gutters user-password-cell']//input")
    private WebElement fieldPassword;

    @FindBy (xpath = "//div[@class='oxd-form-row user-password-row']//div[@class='oxd-grid-item oxd-grid-item--gutters']//input")
    private WebElement fieldComfirmatePassword;

    @FindBy (xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")
    private  WebElement buttonSaveUser;

    @FindBy (xpath = "//div[@class='oxd-toast oxd-toast--success oxd-toast-container--toast']")
    private WebElement viewAlert;

    public void clickMainOption(String number){
        WebElement element = getElement(optionMain, number);
        waitUntilElementIsVisible(element);
        element.click();
    }

    public void clickElementList(String name){
        WebElement element = getElement(optionList, name);
        waitUntilElementIsVisible(element);
        waitTime(1);
        element.click();
    }
    public void ClickButtonAddUser(){
        waitUntilElementIsVisible(buttonAddUser);
        buttonAddUser.click();
    }

    public void clickFielddUserRol(){
        waitUntilElementIsVisible(selectListUserRol);
        selectListUserRol.click();
    }
    public void clickFieldStateUser(){
        waitUntilElementIsVisible(selectListStateUser);
        selectListStateUser.click();
    }

    public void fieldEmployeeName(){
        waitUntilElementIsVisible(fieldEmployeeName);
        fieldEmployeeName.sendKeys("a");
        waitTime(2);
    }

    public void sendKeyUserName(String name){
        waitUntilElementIsVisible(fieldUserName);
        fieldUserName.sendKeys(name);
        waitTime(1);
    }

    public void sendKeyUserPassword(String name){
        waitUntilElementIsVisible(fieldPassword);
        fieldPassword.sendKeys(name);
    }

    public void sendKeyUserComfirmatePassword(String name){
        waitUntilElementIsVisible(fieldComfirmatePassword);
        fieldComfirmatePassword.sendKeys(name);
    }

    public void clickButtonSaveUser(){
        waitUntilElementIsVisible(buttonSaveUser);
        buttonSaveUser.click();
        waitTime(2);
    }

    public boolean alertUser(){
        return isVisible(viewAlert);
    }
}
