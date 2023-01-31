package pages;

import com.google.inject.Inject;
import helper.BaseDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HomePage extends BasePage{

    @Inject
    public HomePage(BaseDriver web){
        super(web);
    }

    @FindBy(xpath = "//*[@id=\"logo\"]/a/img") public WebElement companyLogo;
    @FindBy(xpath = "//*[@id=\"our-brands\"]/a") public WebElement ourBrandsTabButton;
    @FindBy(xpath = "//*[@id=\"MainWrapper\"]/main/div[1]/div/div/div/div/ul/li")
    List<WebElement> brandList;
    @FindBy(xpath = "//*[@id=\"MainWrapper\"]/section/div/div/div/div/div[1]/h1") public WebElement brandHeader;
    @FindBy(xpath = "//*[@id=\"MainWrapper\"]/header/div[1]/div/div/div[2]/a[3]") public  WebElement searchIcon;
    @FindBy(xpath = "//*[@id=\"searchTextbox\"]") public WebElement seacrhInputField;
    @FindBy(xpath = "//*[@id=\"MainWrapper\"]/section/div/div/div/div/div/h1") public WebElement searchPageTitle;
    @FindBy(xpath = "//*[@id=\"searchButton\"]") public  WebElement searchButton;
    @FindBy(xpath = "//*[@id=\"MainWrapper\"]/header/div[1]/div/div/div[2]/div[2]/ul/li") public List<WebElement>  languageSwitcher;
    @FindBy(xpath = "//*[@id=\"MainWrapper\"]/header/div[1]/div/div/div[2]/div[2]/span")  public WebElement languageDropdown;
    @FindBy(xpath = "//*[@id=\"the-group\"]/a/span") public WebElement elGruopButton;

    public void goToURL(String url){
        web.driver.get(url);

        //Mazimize current window
        web.driver.manage().window().maximize();

        //Delay execution for 5 seconds to view the maximize operation
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public String  getTitle(){
        return  web.driver.getTitle();
    }

    public String getSearchResultTitle (){return  searchPageTitle.getText();}

    public void checkCompanyLogoIsPresent(){
        companyLogo.isDisplayed();
    }

    public void pressOurBrandButton(){
        ourBrandsTabButton.click();
    }

    public void clickBrandByText(int index){
        brandList.get(index).click();
    }
    public void changeLanguageByIndex(int index){
        languageSwitcher.get(index).click();

        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void backButton(){
            web.driver.navigate().back();
    }
    public  void clickSearchButton(){
        searchButton.click();
    }

    public String getText(){
        return  brandHeader.getText();
    }
    public String getGroupButtonText(){
        return  elGruopButton.getText();
    }

    public void clickSearchIcon(){
        searchIcon.click();
    }
    public void searchKeywords(String keyword){
        seacrhInputField.sendKeys(keyword);

    }
    public void clickLanguageDropDown(){
        languageDropdown.click();
    }

}
