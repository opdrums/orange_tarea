package definitions;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import steps.registerSteps;

public class registerDefinition {

    @Steps
    steps.registerSteps registerSteps;

    public registerDefinition(){
        this.registerSteps = new registerSteps();
    }

    @When("^doy click en el menu lateral (.*)$")
    public void selectMainAndAddUser(String main){
        registerSteps.clickButtonAdminAndAddUser(main);
    }

    @And("^seleccionar elemento de la lista del formulario (.*) (.*) (.*)$")
    public void elementListForm(String rol, String userState, String employee){
        registerSteps.SelectElementListForm(rol, userState, employee);
    }

    @And("^lleno los formularios de (.*) (.*) (.*)$")
    public void sendKeyForm(String name, String password, String comPassword){
        registerSteps.fieldFormUser(name, password, comPassword);
    }

    @Then("que se cree de la forma correcta")
    public void createUser(){
        registerSteps.saveUser();
    }
}
