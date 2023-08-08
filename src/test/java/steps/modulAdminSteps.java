package steps;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import pageObjects.loginPo;
import utils.Utils;
import utils.driver_factory.DriverFactory;
import utils.reporting.Reporte;
import pageObjects.modulAdminPo;

public class modulAdminSteps {

    private  modulAdminPo modulAdminPo;

    public  modulAdminSteps(){
        modulAdminPo = new modulAdminPo();
        modulAdminPo.setDriver(DriverFactory.getDriver());
    }

    @Step
    public void searchUserSystem(){
        modulAdminPo.setFieldUserName(modulAdminPo.getLabelUserNameConsult());
        modulAdminPo.setFieldUserRol();
        modulAdminPo.clickElementList(modulAdminPo.getlabelUserRol());
        modulAdminPo.setfieldUserState();
        modulAdminPo.clickElementList(modulAdminPo.getlabelUserState());
        modulAdminPo.fieldButtonSearch();
    }

    @Step
    public void validationImforUserSearch(){
        if(!modulAdminPo.isVisibleUserSearch()){
            Reporte.reports("FAIL","usuario no encontrado en la busqueda", Reporte.takeSnapShot(DriverFactory.getDriver()));
            Assert.fail("falla de credenciales");
        }
        Reporte.reports("PASS","usuario encontrado en la busqueda ", Reporte.takeSnapShot(DriverFactory.getDriver()));
    }

    @Step
    public void deleteUser(){
        modulAdminPo.buttonIconDelete();
        if(!modulAdminPo.isVisibleLabelDelete()){
            Reporte.reports("FAIL","mssg no encontrado", Reporte.takeSnapShot(DriverFactory.getDriver()));
            Assert.fail("falla en el mssg de comfirmacion eliminar");
        }
        Reporte.reports("PASS","mssg: " + modulAdminPo.getLabelComDeleteUser(), Reporte.takeSnapShot(DriverFactory.getDriver()));
        modulAdminPo.buttonComIconDelete();
    }

    public void validationDeleteUser(){
        if(!modulAdminPo.isVisibleSuccesDeleteUser()){
            Reporte.reports("FAIL","usuario no se pudo eliminar", Reporte.takeSnapShot(DriverFactory.getDriver()));
            Assert.fail("falla al elminar el usuario");
        }
        Reporte.reports("PASS","mssg: " + modulAdminPo.getLabelSuccesDeleteUser(), Reporte.takeSnapShot(DriverFactory.getDriver()));
    }
}
