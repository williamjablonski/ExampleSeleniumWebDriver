package br.com.softdesign.exemploSeleniumWebDriver.test.dataProviders;

import org.testng.annotations.DataProvider;

public class LoginDataProvider {
	
	//This method will provide data to any test method that declares that its Data Provider
		@DataProvider(name="DadosDeTesteParaLoginComSucesso")
		public static Object[][] createDataForSucessLogin() {
		 return new Object[][] {
		   { "William.jablonski", "password" },
		   { "user", "password"},
		 };
		};
		
	//This method will provide data to any test method that declares that its Data Provider		
		@DataProvider(name="DadosDeTesteParaLoginSemSucesso")
		public static Object[][] createDataForErrorLogin() {
		 return new Object[][] {
		   { "William.jablonski", "xxx" },
		   { "user", "yyy"},
		 };
		};
	
}
