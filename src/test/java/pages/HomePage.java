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

    public void checkCompanyLogoIsPresent(){
        companyLogo.isDisplayed();
    }

    public void pressOurBrandButton(){
        ourBrandsTabButton.click();
    }

    public void clickBrandByText(int index){
        brandList.get(index).click();
    }
    public void backButton(){
            web.driver.navigate().back();
    }

    public String getText(){
        return  brandHeader.getText();
    }

}
