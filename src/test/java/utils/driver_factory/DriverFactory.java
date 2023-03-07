package utils.driver_factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import utils.reporting.Reporte;

import java.util.ArrayList;

public class DriverFactory {
    static WebDriver driver;

    public static WebDriver getDriverManager(String browser, String controlador) {
        if (browser.equals("CHROME")) {
            System.setProperty("webdriver.chrome.driver", controlador);
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--disable-notifications");
            options.addArguments("--disable-features=EnableEphemeralFlashPermission");
            options.addArguments("--disable-infobars");
            options.addArguments("--disable-blink-features=AutomationControlled");
            driver = new ChromeDriver(options);
            } else if (browser.equals("IE")) {
                System.setProperty("webdriver.ie.driver", controlador);
                driver = new InternetExplorerDriver();
            }else if (browser.equals("MOZILLA")) {
                System.setProperty("webdriver.gecko.driver", controlador);
                driver = new FirefoxDriver();
        }

        return driver;
    }

    public static WebDriver getDriver() {
        return driver;
    }

    public static void quitDriver() {
        driver.quit();
    }

    public static boolean cambiarANuevaPestana(int numeroPestana) {
        try {
            ArrayList<String> tabs2 = new ArrayList<>(driver.getWindowHandles());
            driver.switchTo().window(tabs2.get(numeroPestana));
            return true;
        } catch (Exception e) {
            Reporte.reports("FAIL", "No se pudo cambiar a la nueva pestaña");
            return false;
        }
    }

}