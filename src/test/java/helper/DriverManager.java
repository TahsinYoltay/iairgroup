
/**

 DriverManager is an abstract class that provides the blueprint for concrete driver manager classes to implement.

 This class is responsible for creating and returning the {@link WebDriver} instance.

 @author TAHSIN YOLTAY

 @version 1.0

 */
package helper;

import org.openqa.selenium.WebDriver;

public abstract class DriverManager {

    protected abstract WebDriver createDriver();
    public abstract WebDriver getDriver();

}