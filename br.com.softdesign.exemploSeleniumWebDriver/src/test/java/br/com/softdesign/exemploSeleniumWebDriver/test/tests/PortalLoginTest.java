package br.com.softdesign.exemploSeleniumWebDriver.test.tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import br.com.softdesign.exemploSeleniumWebDriver.test.dataProviders.LoginDataProvider;
import br.com.softdesign.exemploSeleniumWebDriver.test.pages.interactions.PortalIndexPageInteractions;
import br.com.softdesign.exemploSeleniumWebDriver.test.pages.interactions.PortalLoginPageInteractions;
import br.com.softdesign.exemploSeleniumWebDriver.test.utils.DriverTestIntance;

public class PortalLoginTest extends DriverTestIntance{

	//initialize data provider with test
    @Test(dataProvider = "DadosDeTesteParaLoginComSucesso", dataProviderClass=LoginDataProvider.class)
    public void loginTestSucess(String user, String password) throws Exception {
    	
    	// Create a new instance of the index page class
        // and initialize any WebElement fields in it.
        PortalLoginPageInteractions loginPageInteractor = PageFactory.initElements(driver, PortalLoginPageInteractions.class);
        
        // And now do the login.
        loginPageInteractor.setUser(user);
        loginPageInteractor.setPassword(password);
        loginPageInteractor.actionLogin();
        // Initialize the index page
        PortalIndexPageInteractions indexPageInteractor = PageFactory.initElements(driver, PortalIndexPageInteractions.class);
        // Assert button logout exists
        indexPageInteractor.assertBtnLogoutExists();
        // Execute logout action
        indexPageInteractor.actionLogout();
        
    }

}