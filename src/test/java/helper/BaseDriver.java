package helper;

import io.cucumber.guice.ScenarioScoped;
import org.openqa.selenium.WebDriver;

@ScenarioScoped
public class BaseDriver {

    public final WebDriver driver = new DriverManagerFactory().getManager();
    //    public Support support = new Support();
    public Wait wait = new Wait(driver);
}
