package pages;

import helper.BaseDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {
    protected final BaseDriver web;

    public BasePage(BaseDriver web){
        this.web = web;
        PageFactory.initElements(web.driver,this);
    }
}
