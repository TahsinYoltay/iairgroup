package helper;

import io.cucumber.guice.ScenarioScoped;
import org.openqa.selenium.WebDriver;

@ScenarioScoped
public class BaseDriver {

    /**
     * The WebDriver instance that is created using the DriverManagerFactory class.
     */
    public final WebDriver driver = new DriverManagerFactory().getManager();
    //    public Support support = new Support();

    /**
     * A Wait instance, which takes the WebDriver instance as its parameter in its constructor.
     */
    public Wait wait = new Wait(driver);
}
