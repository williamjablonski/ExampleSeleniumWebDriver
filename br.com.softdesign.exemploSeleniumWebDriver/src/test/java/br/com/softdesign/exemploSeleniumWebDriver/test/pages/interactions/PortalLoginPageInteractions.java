package br.com.softdesign.exemploSeleniumWebDriver.test.pages.interactions;

import br.com.softdesign.exemploSeleniumWebDriver.test.pages.PortalLoginPage;

public class PortalLoginPageInteractions extends PortalLoginPage{

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