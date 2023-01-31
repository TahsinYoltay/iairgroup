package helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;


/**

 Class ChromeDriverManager

 This class extends the {@link DriverManager} abstract class and implements the methods createDriver and getDriver.

 createDriver method is used to initialize a ChromeDriver instance and set its implicit wait time to 10 seconds.

 getDriver method returns the ChromeDriver instance and creates one if it is not already created.

 @author TAHSIN YOLTAY

 */

public class ChromeDriverManager extends DriverManager {

    /**

     Private instance of the WebDriver interface, which is implemented by the ChromeDriver class
     */
    protected WebDriver driver;

    /**

     Method createDriver
     This method is used to initialize the ChromeDriver instance and set its implicit wait time to 10 seconds.
     It sets the "webdriver.chrome.driver" system property to the path of the ChromeDriver executable file.
     @return the ChromeDriver instance
     */
    @Override
    protected WebDriver createDriver() {
        System.setProperty("webdriver.chrome.driver","webdriver/chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return driver;
    }

    /**

     Method getDriver
     This method returns the ChromeDriver instance and creates one if it is not already created.
     @return the ChromeDriver instance
     */
    @Override
    public WebDriver getDriver() {
        if (driver == null) {
            this.createDriver();
        }
        return driver;
    }

}