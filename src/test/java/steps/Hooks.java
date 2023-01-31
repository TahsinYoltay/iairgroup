package steps;

import com.google.inject.Inject;
import helper.BaseDriver;
import helper.TestConfiguration;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.apache.log4j.Logger;
//import org.apache.log4j.Logger;

public class Hooks {
    private static Logger log;
    @Inject
    private BaseDriver baseDriver;

    @Before
    public static void beforeAll() throws Exception {
        TestConfiguration.loadAPropertiesFile("src/test/resources/testConfiguration.yaml");
    }

    @Before("@UI")
    public void setUp() throws Exception {

    }

    @After("@UI")
    public void tearDown() throws Exception {
        baseDriver.driver.quit();
        Thread.sleep(1000);
    }

}
