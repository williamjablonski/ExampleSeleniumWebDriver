package br.com.softdesign.exemploSeleniumWebDriver.test.pages.interactions;

import org.testng.Assert;
import br.com.softdesign.exemploSeleniumWebDriver.test.pages.PortalIndexPage;

public class PortalIndexPageInteractions extends PortalIndexPage{

    public void assertBtnLogoutExists() {
    	Assert.assertEquals(linkSair.getText(),"Sair");
    }
    
    public void actionLogout() {
        
    	linkSair.click();
    }

}