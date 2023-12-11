package driver;

import com.thoughtworks.gauge.AfterSuite;
import com.thoughtworks.gauge.BeforeScenario;
import com.thoughtworks.gauge.BeforeSuite;
import org.openqa.selenium.WebDriver;

import static com.codeborne.selenide.Selenide.open;

public class Driver {

    // Holds the WebDriver instance
    public static WebDriver webDriver;

    // Initialize a webDriver instance of required browser
    // Since this does not have a significance in the application's business domain, the BeforeSuite hook is used to instantiate the webDriver
    @BeforeScenario
    public void initializeDriver(){
        System.out.println("before senaryo");

    }

    // Close the webDriver instance
    @AfterSuite
    public void closeDriver(){
        System.out.println("after senaryo");
    }

}
