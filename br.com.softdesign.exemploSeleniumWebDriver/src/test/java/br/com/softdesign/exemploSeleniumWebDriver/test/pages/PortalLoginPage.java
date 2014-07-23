package br.com.softdesign.exemploSeleniumWebDriver.test.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PortalLoginPage {

    @FindBy(name = "name")
    private WebElement user;
    
    @FindBy(name = "pass")
    private WebElement password;
    
    @FindBy(name = "op")
    private WebElement btnSubmit;

    public void setUser(String text) {
         
    	user.sendKeys(text);
    }
    
    public void setPassword(String text) {
        
    	password.sendKeys(text);
    }
    
    public void actionLogin() {
     
    	btnSubmit.click();
    }

}