package definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.en_scouse.An;
import net.thucydides.core.annotations.Steps;
import steps.modulAdminSteps;

public class modulAdminDefinitions {
    @Steps
    modulAdminSteps modulAdminSteps;

    public modulAdminDefinitions(){
        this.modulAdminSteps = new modulAdminSteps();
    }

    @And("ingreso la informacion del usuario doy click en buscar")
    public void searchUser(){
        modulAdminSteps.SearchUserSystem();
    }
}
