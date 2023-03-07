package pageObjects;

import net.serenitybdd.core.annotations.findby.FindBy;
import org.openqa.selenium.WebElement;

public class loginPo extends WebBasePage {

    @FindBy (xpath = "//p[1]")
    private WebElement getTextUser;

    @FindBy (xpath = "//p[2]")
    private WebElement getTextPassword;

    @FindBy (xpath = "//p")
    private WebElement labelNameUser;

    @FindBy (xpath = "//input[@name='username']")
    private WebElement fieldUserName;

    @FindBy (xpath = "//input[@name='password']")
    private WebElement fieldUserPassword;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement buttonLogin;

    public String getTexUserName(){
        waitUntilElementIsVisible(getTextUser);
        String name =  getTextUser.getText();
        return name.substring(11,16);
    }

    public String getTexUserPassword(){
        waitUntilElementIsVisible(getTextPassword);
        String name =  getTextPassword.getText();
        return name.substring(11,19);
    }

    public boolean isVisibleTextNameAndPasword(){
        waitUntilElementIsVisibleNonThrow(getTextUser, 10);
        waitUntilElementIsVisibleNonThrow(getTextPassword, 10);
        return isVisible(getTextUser) && isVisible(getTextPassword);
    }

    public void setFieldUserName(String texUserName){
        waitUntilElementIsVisible(fieldUserName);
        fieldUserName.sendKeys(texUserName);
    }

    public void setFieldUserPassword(String texUserName){
        waitUntilElementIsVisible(fieldUserPassword);
        fieldUserPassword.sendKeys(texUserName);
    }

    public String getTextUserName(){
        waitUntilElementIsVisible(labelNameUser);
        return labelNameUser.getText();
    }

    public boolean isVisibleNameUser(){
        waitUntilElementIsVisible(labelNameUser);
        return isVisible(labelNameUser);
    }

    public void clickButtonLogin(){
        waitUntilElementIsVisible(buttonLogin);
        buttonLogin.click();
    }
}
