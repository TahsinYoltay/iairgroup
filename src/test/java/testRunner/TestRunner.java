package testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


/**

 The TestRunner class is a JUnit test runner for running Cucumber tests.
 This class is annotated with @RunWith to indicate that the test should be run using the Cucumber class.
 The CucumberOptions annotation is used to specify the configuration options for running the Cucumber tests.
 The features attribute specifies the directory containing the feature files.
 The glue attribute specifies the package containing the step definitions.
 The plugin attribute is used to specify the plugin for generating reports. In this case, the "pretty" plugin is used for a console report and the "json:Report" plugin for a JSON report.
 The monochrome attribute is used to specify whether or not the console output should be in a monochrome format.
 The dryRun attribute can be used to check if the feature file and step definition match without actually executing the tests.
 The stepNotifications attribute can be used to display notifications for each step of the test.
 */
@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"features"},
        glue = {"steps"},
        plugin = {"pretty","json:Report"},
        monochrome = true
//        dryRun = false
//        stepNotifications = true
)
public class TestRunner {
}

