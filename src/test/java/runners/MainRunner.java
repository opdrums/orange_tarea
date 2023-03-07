package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.runner.RunWith;
import utils.lectura_data.BeforeSuite;
import utils.lectura_data.DataToFeature;
import utils.reporting.Reporte;

import java.io.IOException;

@RunWith(RunnerPersonalizado.class)
@CucumberOptions(
        features = "src/test/resources/features"
        ,glue = "definitions"
        ,tags = "@login"
        ,monochrome = true
        ,snippets = SnippetType.CAMELCASE
)
public class MainRunner {

    @BeforeSuite
    public static void test() throws InvalidFormatException, IOException {
        Reporte.initReport();
        DataToFeature.overrideFeatureFiles("./src/test/resources/features");
    }
}
