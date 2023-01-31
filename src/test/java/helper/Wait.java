package helper;
import org.openqa.selenium.WebDriver;

public class Wait {

    private final WebDriver driver;

    public Wait(WebDriver driver) {
        super();
        this.driver = driver;
    }

//    public void waitElement(WebElement element) {
//        new WebDriverWait(driver, 5000);
////                until(ExpectedConditions.elementToBeClickable(element));
//    }
}