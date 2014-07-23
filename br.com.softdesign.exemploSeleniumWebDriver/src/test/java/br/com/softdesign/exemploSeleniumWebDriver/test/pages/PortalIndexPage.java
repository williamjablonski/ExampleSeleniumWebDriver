package br.com.softdesign.exemploSeleniumWebDriver.test.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class PortalIndexPage{

	@FindBy(linkText = "Sair")
    private WebElement linkSair;

    public void assertBtnLogoutExists() {
    	Assert.assertEquals(linkSair.getText(),"Sair");
    }
    
    public void actionLogout() {
        
    	linkSair.click();
    }

}