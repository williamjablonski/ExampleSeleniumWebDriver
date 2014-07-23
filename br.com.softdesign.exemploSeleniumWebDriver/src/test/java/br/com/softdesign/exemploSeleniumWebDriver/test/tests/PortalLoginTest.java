package br.com.softdesign.exemploSeleniumWebDriver.test.tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import br.com.softdesign.exemploSeleniumWebDriver.test.dataProviders.LoginDataProvider;
import br.com.softdesign.exemploSeleniumWebDriver.test.pages.PortalIndexPage;
import br.com.softdesign.exemploSeleniumWebDriver.test.pages.PortalLoginPage;
import br.com.softdesign.exemploSeleniumWebDriver.test.utils.DriverTestIntance;

public class PortalLoginTest extends DriverTestIntance{

	//initialise data provider with test
    @Test(dataProvider = "DadosDeTesteParaLoginComSucesso", dataProviderClass=LoginDataProvider.class)
    public void loginTestSucess(String user, String password) throws Exception {
    	
    	// Create a new instance of the index page class
        // and initialise any WebElement fields in it.
        PortalLoginPage loginPage = PageFactory.initElements(driver, PortalLoginPage.class);
        
        // And now do the login.
        loginPage.setUser(user);
        loginPage.setPassword(password);
        loginPage.actionLogin();
        // Initialize the index page
        PortalIndexPage indexPage = PageFactory.initElements(driver, PortalIndexPage.class);
        // Assert button lougout exists
        indexPage.assertBtnLogoutExists();
        // Execute logout action
        indexPage.actionLogout();
        
    }

}