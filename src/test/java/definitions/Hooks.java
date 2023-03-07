package definitions;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import utils.Utils;
import utils.driver_factory.DriverFactory;
import utils.reporting.Reporte;

import java.io.IOException;
import java.util.concurrent.TimeUnit;


public class Hooks {
    Scenario scenario;
    WebDriver driver;

    @Before
    public void config(Scenario scenario) throws IOException{
        String controlador = Utils.readProperty("configurations", "Ruta_Driver");
        String navegador = Utils.readProperty("configurations", "navegador");
        driver = DriverFactory.getDriverManager(navegador.toUpperCase(), controlador);
        //driver.manage().window().maximize();
        this.scenario = scenario;
        Reporte.startReport(scenario.getName());
    }

    @After
    public void terminar(Scenario scenario){
        if (scenario.isFailed()) {
            Reporte.reportarCasoFallido(("MODULO: "+System.getProperty("tags")+" --> ESCENARIO: "+scenario.getName()).replace("null","Pibox"));
            if (DriverFactory.getDriver() == null) {
                Reporte.reports("FAIL", "Se finaliza el flujo automatizado debido al error generado!");
            } else {
                DriverFactory.getDriver().manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
                Reporte.reports("FAIL", "Se finaliza el flujo automatizado debido al error generado!", Reporte.takeSnapShot(DriverFactory.getDriver()));
            }
        } else {
            Reporte.reports("PASS", "Se finaliza el flujo automatizado correctamente!");
        }
        Reporte.finishReport();
        DriverFactory.quitDriver();
    }
}
