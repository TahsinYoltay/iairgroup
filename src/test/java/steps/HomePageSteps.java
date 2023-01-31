package steps;

import com.google.inject.Inject;
import helper.BaseDriver;
import helper.TestConfiguration;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.BasePage;
import pages.HomePage;

import java.util.List;
import java.util.Map;

public class HomePageSteps {

    final HomePage homePage;

    @Inject
    public HomePageSteps(BaseDriver web, HomePage homePage){
        this.homePage=homePage;
    }

    @Given("the user navigates to {string}")
    public void theUserNavigatesToHttpsWwwIairgroupCom(String mainPage) {
        String main= TestConfiguration.getProperty("webURL." + mainPage);
        homePage.goToURL(main);

    }


    @When("the user loads the home page")
    public void theUserLoadsTheHomePage() {

        Assert.assertEquals("IAG – International Airlines Group",homePage.getTitle());
       
    }

    @Then("the home page should be displayed correctly, with all the elements loaded properly")
    public void theHomePageShouldBeDisplayedCorrectlyWithAllTheElementsLoadedProperly() {
        homePage.checkCompanyLogoIsPresent();
    }

//    @Given("the user navigates to https:\\/\\/www.iairgroup.com\\/")
//    public void theUserNavigatesToHttpsWwwIairgroupCom() {
//    }

    @When("the user click on our brands tab in the header")
    public void theUserClickOnOurBrandsTabInTheHeader() {
        homePage.pressOurBrandButton();
    }

    @Then("the user should be navigated to the correct page")
    public void theUserShouldBeNavigatedToTheCorrectPage(DataTable data) {
        List<Map<String, String>> brands = data.asMaps(String.class, String.class);
        for (Map<String, String> columns : brands) {
            homePage.clickBrandByText(Integer.parseInt(columns.get("index")));
            Assert.assertEquals(columns.get("name"),homePage.getText());
            homePage.backButton();
        }
    }


}
