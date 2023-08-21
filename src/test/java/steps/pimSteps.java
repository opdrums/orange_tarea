package steps;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import pageObjects.pimPo;
import utils.driver_factory.DriverFactory;
import utils.reporting.Reporte;


public class pimSteps {

    private pimPo pim;

    public pimSteps(){
        pim = new pimPo();
        pim.setDriver(DriverFactory.getDriver());
    }

    @Step
    public void clickAddPim(){
        pim.clickButtonAdd();
    }

    @Step
    public void inputAddUserPim(String firstUser, String middle, String last, String userName, String password){
        pim.fieldFirstName(firstUser);
        pim.fieldMiddleName(middle);
        pim.fieldLastName(last);
        pim.clickLoginDetail();
        pim.fieldUserName(userName);
        pim.fieldUserPassword(password);
        pim.fieldUserComPassword(password);
    }


    @Step
    public void inputAddWhitoutDetailLoginUserPim(String firstUser, String middle, String last){
        pim.fieldFirstName(firstUser);
        pim.fieldMiddleName(middle);
        pim.fieldLastName(last);
    }

    public void RegisterUser(){
        pim.clickButtonSave();

        if(!pim.isVisibleAlert()){
            Reporte.reports("FAIL","usuario no se pudo registrar", Reporte.takeSnapShot(DriverFactory.getDriver()));
            Assert.fail("falla al registrar el usuario");
        }
        Reporte.reports("PASS","mssg: " + pim.getLabelRegister(), Reporte.takeSnapShot(DriverFactory.getDriver()));
    }


    public void searchUserPim(){
        pim.inputGetFirstNameUser(pim.getLabelFirstUser());
        pim.inputGetIdUser(pim.getLabelId());
       // pim.inputGetEmploymentStatus(pim.getLabelEmploymentStatus());
        //pim.inputGetSupervisorName(pim.getLabelSupervisorUser());
        //pim.inputGetJobTitle(pim.getLabelJobTitle());
        //pim.inputGetSubUnit(pim.getLabelSubUnit());
        pim.clickButtonSave();
        pim.clickIconEdit();
    }
}
