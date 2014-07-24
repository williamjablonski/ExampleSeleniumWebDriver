package br.com.softdesign.exemploSeleniumWebDriver.test.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PortalLoginPage {

    @FindBy(name = "name")
	protected WebElement user;
    
    @FindBy(name = "pass")
    protected WebElement password;
    
    @FindBy(name = "op")
    protected WebElement btnSubmit;

}