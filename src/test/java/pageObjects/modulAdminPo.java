package pageObjects;

import net.serenitybdd.core.annotations.findby.FindBy;
import org.openqa.selenium.WebElement;

public class modulAdminPo extends WebBasePage {

    private String optionList = "(//div[@role='option'])/span[text()='Replaceable']";

    @FindBy (xpath = "(//div[@class='oxd-table-row oxd-table-row--with-border'])[3]/div[2]/div")
    private WebElement labelUserNameConsult;

    @FindBy (xpath = "(//div[@class='oxd-table-row oxd-table-row--with-border'])")
    private WebElement labelUserNameConsult1;

    @FindBy (xpath = "(//div[@class='oxd-table-row oxd-table-row--with-border'])[3]//div[3]/div")
    private WebElement labeluserRol;
    @FindBy (xpath = "(//div[@class='oxd-table-row oxd-table-row--with-border'])[3]//div[5]/div")
    private WebElement labeluserState;
    @FindBy (xpath = "(//input[@class='oxd-input oxd-input--active'])[2]")
    private WebElement fieldUserName;
    @FindBy (xpath = "(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[1]")
    private WebElement fieldUserRol;
    @FindBy (xpath = "(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[2]")
    private WebElement fieldUserState;
    @FindBy (xpath = "//button[@type='submit']")
    private WebElement buttonSearch;

    @FindBy (xpath = "//button[@class='oxd-icon-button oxd-table-cell-action-space']")
    private WebElement iconDelete;

    @FindBy (xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--label-danger orangehrm-button-margin']")
    private WebElement comIconDelete;

    @FindBy (xpath = "//div[@class='orangehrm-text-center-align']/p")
    private WebElement getTextDelete;

    @FindBy (xpath = "//p[@class='oxd-text oxd-text--p oxd-text--toast-message oxd-toast-content-text']")
    private WebElement labelDeleteUser;

    public String getLabelUserNameConsult(){
        waitUntilElementIsVisible(labelUserNameConsult);
       return labelUserNameConsult.getText();
    }

    public boolean isVisibleUserSearch(){
        waitUntilElementIsVisibleNonThrow(labelUserNameConsult1, 10);
        return isVisible(labelUserNameConsult1);
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

    public void setfieldUserState(){
        waitUntilElementIsVisible(fieldUserState);
        fieldUserState.click();
    }

    public void fieldButtonSearch(){
        waitUntilElementIsVisible(buttonSearch);
        buttonSearch.click();
    }

    public void buttonIconDelete(){
        waitUntilElementIsVisible(iconDelete);
        iconDelete.click();
    }

    public void buttonComIconDelete(){
        waitUntilElementIsVisible(comIconDelete);
        comIconDelete.click();
    }

    public String getLabelComDeleteUser(){
        waitUntilElementIsVisible(getTextDelete);
        return getTextDelete.getText();
    }
    public boolean isVisibleLabelDelete(){
        waitUntilElementIsVisible(getTextDelete);
        return  isVisible(getTextDelete);
    }

    public String getLabelSuccesDeleteUser(){
        waitUntilElementIsVisible(labelDeleteUser);
        return labelDeleteUser.getText();
    }

    public boolean isVisibleSuccesDeleteUser(){
        waitUntilElementIsVisible(labelDeleteUser);
        return  isVisible(labelDeleteUser);
    }
}
