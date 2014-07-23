package br.com.softdesign.exemploSeleniumWebDriver.test.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

public class DriverTestIntance{

    // Create a new instance of a driver
    public WebDriver driver = new FirefoxDriver();
    
    @BeforeClass
    public void setUp() {
        // Navigate to the right place
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://portal.softdesign-rs.com.br/");
    }

     @AfterClass
     public void tearDown(){
         // Close the browser
         driver.quit();
     }

}