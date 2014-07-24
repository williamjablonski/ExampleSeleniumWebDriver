package br.com.softdesign.exemploSeleniumWebDriver.test.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PortalIndexPage{

	@FindBy(linkText = "Sair")
	protected WebElement linkSair;

}