package steps;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.apache.regexp.RE;
import org.junit.Assert;
import pageObjects.loginPo;
import pageObjects.registerPo;
import utils.driver_factory.DriverFactory;
import utils.reporting.Reporte;

public class registerSteps {
    private registerPo register;

    public registerSteps(){
        register = new registerPo();
        register.setDriver(DriverFactory.getDriver());
    }

    @Step
    public void clickButtonAdminAndAddUser(String main){
        register.clickMainOption(main);
    }

    @Step
    public void SelectElementListForm(String rol, String userState, String employee){
        register.ClickButtonAddUser();
        register.clickFielddUserRol();
        register.clickElementList(rol);
        register.clickFieldStateUser();
        register.clickElementList(userState);
        register.fieldEmployeeName();
        register.clickElementList(employee);
    }

    @Step
    public void fieldFormUser(String name, String password, String comPassword){
        register.sendKeyUserName(name);
        register.sendKeyUserPassword(password);
        register.sendKeyUserComfirmatePassword(comPassword);
    }

    @Step
    public void saveUser(){
        register.clickButtonSaveUser();
        if(!register.alertUser()){
            Reporte.reports("FAIL","usuario no creado correctamente", Reporte.takeSnapShot(DriverFactory.getDriver()));
            Assert.fail("Credenciales incorrectamente");
        }
        Reporte.reports("PASS","Usuario creeado correctamente", Reporte.takeSnapShot(DriverFactory.getDriver()));
    }

}
