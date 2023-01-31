package helper;

import org.openqa.selenium.WebDriver;

public class DriverManagerFactory {
    public WebDriver getManager() {

        return new ChromeDriverManager().getDriver();
    }
}