package pageObjects;

import net.serenitybdd.core.annotations.findby.FindBy;
import org.openqa.selenium.WebElement;

public class modulAdminPo extends WebBasePage {

    private String optionList = "(//div[@role='option'])/span[text()='Replaceable']";

    @FindBy (xpath = "(//div[@class='oxd-table-row oxd-table-row--with-border'])[2]/div[2]/div")
    private WebElement labelUserNameConsult;
    @FindBy (xpath = "(//div[@class='oxd-table-row oxd-table-row--with-border'])[2]//div[3]/div")
    private WebElement labeluserRol;
    @FindBy (xpath = "(//div[@class='oxd-table-row oxd-table-row--with-border'])[2]//div[4]/div")
    private  WebElement labelEmployeName;
    @FindBy (xpath = "(//div[@class='oxd-table-row oxd-table-row--with-border'])[2]//div[5]/div")
    private WebElement labeluserState;
    @FindBy (xpath = "(//input[@class='oxd-input oxd-input--active'])[2]")
    private WebElement fieldUserName;
    @FindBy (xpath = "(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[1]")
    private WebElement fieldUserRol;
    @FindBy (xpath = "(//input[@placeholder])[2]")
    private WebElement fieldEmployeeName;
    @FindBy (xpath = "(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[2]")
    private WebElement fieldUserState;
    @FindBy (xpath = "//button[@type='submit']")
    private WebElement buttonSearch;

    public String getLabelUserNameConsult(){
        waitUntilElementIsVisible(labelUserNameConsult);
       return labelUserNameConsult.getText();
    }

    public String getlabelEmployeName(){
        waitUntilElementIsVisible(labelEmployeName);
        return labelEmployeName.getText();
    }

    public String getlabelUserRol(){
        waitUntilElementIsVisible(labeluserRol);
        return labeluserRol.getText();
    }

    public boolean setlabelUserRol(){
        waitUntilElementIsVisible(labeluserRol);
        return isVisible(labeluserRol);
    }

    public String getlabelUserState(){
        waitUntilElementIsVisible(labeluserState);
        return labeluserState.getText();
    }

    public void clickElementList(String name){
        WebElement element = getElement(optionList, name);
        waitUntilElementIsVisible(element);
        waitTime(1);
        element.click();
    }

    public void setFieldUserName(String texUserName){
        waitUntilElementIsVisible(fieldUserName);
        fieldUserName.sendKeys(texUserName);
    }

    public void setFieldUserRol(){
        waitUntilElementIsVisible(fieldUserRol);
        fieldUserRol.click();
    }

    public void setfieldEmployeeName(String texUserName){
        waitUntilElementIsVisible(fieldEmployeeName);
        fieldEmployeeName.sendKeys(texUserName);
    }

    public void setfieldUserState(){
        waitUntilElementIsVisible(fieldUserState);
        fieldUserState.click();
    }

    public void fieldButtonSearch(){
        waitUntilElementIsVisible(buttonSearch);
        buttonSearch.click();
    }


}
