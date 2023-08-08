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
    public void SearchUserSystem(){
        modulAdminPo.setFieldUserName(modulAdminPo.getLabelUserNameConsult());
        modulAdminPo.setFieldUserRol();
        modulAdminPo.clickElementList(modulAdminPo.getlabelUserRol());
        modulAdminPo.setfieldUserState();
        modulAdminPo.clickElementList(modulAdminPo.getlabelUserState());
        //modulAdminPo.setfieldEmployeeName(modulAdminPo.getlabelEmployeName());
        //modulAdminPo.clickElementList(modulAdminPo.getlabelEmployeName());

        modulAdminPo.fieldButtonSearch();
    }
}
