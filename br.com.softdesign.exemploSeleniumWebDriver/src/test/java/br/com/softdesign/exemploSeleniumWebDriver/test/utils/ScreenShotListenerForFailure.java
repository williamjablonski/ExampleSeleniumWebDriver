package br.com.softdesign.exemploSeleniumWebDriver.test.utils;

import org.testng.ITestResult;
import org.testng.TestListenerAdapter;
import com.thoughtworks.selenium.DefaultSelenium;
 
public class ScreenShotListenerForFailure extends TestListenerAdapter
{
 
    public void onTestFailure(ITestResult result)
    {        
        try {
 
            DriverTestIntance testCase = (DriverTestIntance) result.getTestClass().getInstances(false)[0];
 
            DefaultSelenium selenium = (DefaultSelenium) testCase.driver;
            if (selenium != null) {
                String fileName = System.getProperty(
                        "screenshots.dir", "/tmp")
                        + "/" + result.getTestClass().getName() + "-" + result.getName() + ".png";
                System.out.println("Capturando erro em: " + fileName);
                selenium.captureEntirePageScreenshot(fileName, "background=#FFFFFF");
            }
 
        } catch (Exception e2) {
            System.err
                    .println("Não foi possível capturar o screenshot");
        }
    }
}