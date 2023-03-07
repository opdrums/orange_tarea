package definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import steps.loginSteps;

import java.util.Locale;

public class loginDefinitions {
    private static String ambiente = "";

    @Steps
    loginSteps loginSteps;

    public loginDefinitions(){
        this.loginSteps = new loginSteps();
    }

    @Given("^ingreso a la pagina (.*)$")
    public void ingresarPagina(String ambiente){
        loginDefinitions.ambiente = ambiente.trim();
        loginSteps.abrirNavegador(loginDefinitions.ambiente.toUpperCase());
        loginSteps.abrirNavegador(ambiente);
    }

    @When("tomo las credenciales del usuario e ingreso las credenciales username y password")
    public void LoginUser(){
        loginSteps.sendKeyEmailAndPassword();
        loginSteps.clickButtonLogin();
    }

    @Then("visualizar el nombre del usuario")
    public  void viewUserName(){
        loginSteps.validateUserLogin();
    }
}
