package br.com.softdesign.exemploSeleniumWebDriver.test.dataProviders;

import org.testng.annotations.DataProvider;

public class LoginDataProvider {
	
	//This method will provide data to any test method that declares that its Data Provider
		@DataProvider(name="DadosDeTesteParaLoginComSucesso")
		public static Object[][] createDataForSucessLogin() {
		 return new Object[][] {
		   { "user", "password" }, // Change for your user and password
		   { "user", "password"},  //for more users in one test
		 };
		};
		
	//This method will provide data to any test method that declares that its Data Provider		
		@DataProvider(name="DadosDeTesteParaLoginSemSucesso")
		public static Object[][] createDataForErrorLogin() {
		 return new Object[][] {
		   { "user", "password" },
		   { "user", "yyy"},
		 };
		};
	
}
