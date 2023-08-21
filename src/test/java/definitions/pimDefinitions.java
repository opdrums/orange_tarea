package definitions;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import steps.pimSteps;

public class pimDefinitions {

    @Steps
    pimSteps pimSteps;

    public  pimDefinitions(){
        this.pimSteps = new pimSteps();
    }

    @When("doy click en el boton agregar")
    public void clickButtonAddUserPim(){
        pimSteps.clickAddPim();
    }

    @When("busco al usuario pim")
    public void buscar(){
        pimSteps.searchUserPim();

    }

    @And("^lleno los formulario del usuario pim (.*) (.*) (.*) (.*) (.*)$")
    public void addInfoUserPim(String firstUserPim, String middle, String last, String userName, String password){
        pimSteps.inputAddUserPim(firstUserPim, middle, last, userName, password);
    }

    @And("^lleno los formulario del usuario sin detalle del login (.*) (.*) (.*)$")
    public void inputAddWhitoutDetailLogin(String firstUserPim, String middle, String last){
        pimSteps.inputAddWhitoutDetailLoginUserPim(firstUserPim, middle, last);
    }

    @Then("evidenciar alerta de registro exitoso")
    public void RegisterUsersPim(){
        pimSteps.RegisterUser();
    }



}
