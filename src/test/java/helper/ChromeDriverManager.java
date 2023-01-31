package helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ChromeDriverManager extends DriverManager {

    protected WebDriver driver;

    @Override
    protected WebDriver createDriver() {
        System.setProperty("webdriver.chrome.driver","webdriver/chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return driver;
    }

    @Override
    public WebDriver getDriver() {
        if (driver == null) {
            this.createDriver();
        }
        return driver;
    }

}