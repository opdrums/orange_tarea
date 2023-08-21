package pageObjects;
import net.serenitybdd.core.annotations.findby.FindBy;
import org.openqa.selenium.WebElement;

public class pimPo extends WebBasePage{

    @FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")
    WebElement buttonAdd;

    @FindBy(xpath = "//input[@name='firstName']")
    WebElement fieldName;

    @FindBy(xpath = "//input[@name='middleName']")
    WebElement middleName;

    @FindBy(xpath = "//input[@name='lastName']")
    WebElement lastName;

    @FindBy(xpath = "//span[@class='oxd-switch-input oxd-switch-input--active --label-right']")
    WebElement checkboxLogin;

    @FindBy(xpath = "//div[@class='oxd-form-row'][2]//input[@class='oxd-input oxd-input--active']")
    WebElement userName;
    @FindBy(xpath = "//div[@class='oxd-grid-item oxd-grid-item--gutters user-password-cell']//input[@type='password'][1]")
    WebElement fieldPassword;

    @FindBy(xpath = "//div[@class='oxd-grid-item oxd-grid-item--gutters']//input[@type='password'][1]")
    WebElement comPassword;

    @FindBy(xpath = "//button[@type='submit']")
    WebElement buttonSave;

    @FindBy (xpath = "//p[@class='oxd-text oxd-text--p oxd-text--toast-message oxd-toast-content-text']")
    WebElement getLabelAlert;

    @FindBy (xpath = "//div[@class='oxd-table-body']/div[1]/div/div[2]")
    WebElement id;

    @FindBy (xpath = "//div[@class='oxd-table-body']/div[1]/div/div[3]")
    WebElement getFirst;
    @FindBy (xpath = "//div[@class='oxd-table-body']/div[1]/div/div[5]")
    WebElement getJobTitle;
    @FindBy (xpath = "//div[@class='oxd-table-body']/div[1]/div/div[6]")
    WebElement getEmployment;
    @FindBy (xpath = "//div[@class='oxd-table-body']/div[1]/div/div[7]")
    WebElement getSubUnit;
    @FindBy (xpath = "//div[@class='oxd-table-body']/div[1]/div/div[8]")
    WebElement getSupervisor;

    @FindBy(xpath = "//*[@id='app']/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/div/div/input")
    WebElement inputEmployeeName;

    @FindBy(xpath = "//*[@id='app']/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[2]/div/div[2]/input")
    WebElement inputEmployeeId;

    @FindBy(xpath = "//*[@id='app']/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[5]/div/div[2]/div/div/input")
    WebElement inputSupervisorName;

    @FindBy(xpath = "//*[@id='app']/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[6]/div/div[2]/div/div/div[1]")
    WebElement inputJobTitle;

    @FindBy(xpath = "//*[@id='app']/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[7]/div/div[2]/div/div/div[1]")
    WebElement inputSubUnit;

    @FindBy(xpath = "//*[@id='app']/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[3]/div/div[2]/div/div/div[1]")
    WebElement getInputEmployeeStatus;

    @FindBy(xpath = "//button[@class='oxd-icon-button oxd-table-cell-action-space'][2]")
    WebElement buttonEditPim;

    public void clickButtonAdd(){
        waitUntilElementIsVisible(buttonAdd);
        buttonAdd.click();
    }

    public void fieldFirstName (String name){
        waitUntilElementIsVisible(fieldName);
        fieldName.sendKeys(name);
    }

    public void fieldMiddleName (String name){
        waitUntilElementIsVisible(middleName);
        middleName.sendKeys(name);
    }

    public void fieldLastName (String name){
        waitUntilElementIsVisible(lastName);
        lastName.sendKeys(name);
    }

    public void clickLoginDetail(){
        waitUntilElementIsVisible(checkboxLogin);
        checkboxLogin.click();
    }

    public void fieldUserName(String name){
        waitUntilElementIsVisible(userName);
        userName.sendKeys(name);
    }

    public  void fieldUserPassword(String name){
        waitUntilElementIsVisible(fieldPassword);
        fieldPassword.sendKeys(name);
    }
    public void fieldUserComPassword(String name){
        waitUntilElementIsVisible(comPassword);
        comPassword.sendKeys(name);
    }

    public void  clickButtonSave(){
        waitUntilElementIsVisible(buttonSave);
        buttonSave.click();
    }

    public boolean isVisibleAlert(){
        waitUntilElementIsVisible(getLabelAlert);
        return isVisible(getLabelAlert);
    }

    public String getLabelRegister(){
        waitUntilElementIsVisible(getLabelAlert);
        return getLabelAlert.getText();
    }

    public String getLabelId(){
        waitUntilElementIsVisible(id);
        return id.getText();
    }

    public void inputGetIdUser(String name){
        waitUntilElementIsVisible(inputEmployeeId);
        inputEmployeeId.sendKeys(name);
    }

    public String getLabelFirstUser(){
        waitUntilElementIsVisible(getFirst);
        return getFirst.getText();
    }

    public void inputGetFirstNameUser(String name){
        waitUntilElementIsVisible(inputEmployeeName);
        inputEmployeeName.sendKeys(name);
    }


    public String getLabelJobTitle(){
        waitUntilElementIsVisible(getJobTitle);
        return getJobTitle.getText();
    }

    public void inputGetJobTitle(String name){
        waitUntilElementIsVisible(inputJobTitle);
        inputJobTitle.sendKeys(name);

    }
    public String getLabelEmploymentStatus(){
        waitUntilElementIsVisible(getEmployment);
        return getEmployment.getText();
    }

    public void inputGetEmploymentStatus(String name){
        waitUntilElementIsVisible(getInputEmployeeStatus);
        getInputEmployeeStatus.sendKeys(name);
    }
    public String getLabelSubUnit(){
        waitUntilElementIsVisible(getSubUnit);
        return getSubUnit.getText();
    }

    public void inputGetSubUnit(String name){
        waitUntilElementIsVisible(inputSubUnit);
        getSubUnit.sendKeys(name);
    }
    public String getLabelSupervisorUser(){
        waitUntilElementIsVisible(getSupervisor);
        return getSupervisor.getText();
    }

    public void inputGetSupervisorName(String name){
        waitUntilElementIsVisible(inputSupervisorName);
        inputSupervisorName.sendKeys(name);
        inputSupervisorName.click();
    }

    public void  clickIconEdit(){
        waitUntilElementIsVisible(buttonEditPim);
        buttonEditPim.click();
    }
}
