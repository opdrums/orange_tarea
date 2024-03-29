package steps;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import pageObjects.loginPo;
import utils.Utils;
import utils.driver_factory.DriverFactory;
import utils.reporting.Reporte;

public class loginSteps {
    private  loginPo login;

    public  loginSteps(){
        login = new loginPo();
        login.setDriver(DriverFactory.getDriver());
    }

    @Step
    public void abrirNavegador(String ambiente) {
        try {
            login.getDriver().get(Utils.readProperty("configurations", "orange_" + ambiente));
        } catch (Exception e) {
        }
    }

    @Step
    public void sendKeyEmailAndPassword(){
        if(!login.isVisibleTextNameAndPasword()){
            Reporte.reports("FAIL","usuario no encontrado", Reporte.takeSnapShot(DriverFactory.getDriver()));
            Assert.fail("falla de credenciales");
        }
        login.setFieldUserName(login.getTexUserName());
        login.setFieldUserPassword(login.getTexUserPassword());
        Reporte.reports("PASS","usuario ingresado correctamente", Reporte.takeSnapShot(DriverFactory.getDriver()));
    }

    public void loginCredentialUser(String name, String password){
        login.setFieldUserName(name);
        login.setFieldUserPassword(password);
    }

    public  void clickButtonLogin(){
        login.clickButtonLogin();
    }

    public void validateUserLogin(){
        if(login.isVisibleCredentialInvalid()){
            Reporte.reports("FAIL","usuario tiene: " + login.getTextCredentialInvalid(), Reporte.takeSnapShot(DriverFactory.getDriver()));
            Assert.fail("no realizo login de la forma correcta");
        }
        Reporte.reports("PASS","usuario ingresado correctamente: " + login.getTextUserName(), Reporte.takeSnapShot(DriverFactory.getDriver()));
    }
}
