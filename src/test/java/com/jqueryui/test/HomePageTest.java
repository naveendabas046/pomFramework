package com.jqueryui.test;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import com.jqueryui.pages.HomePage;

public class HomePageTest extends BaseTest {

	HomePage homePage;

	@BeforeClass
	public void startWebDriver() {
		setupWebDriver("chrome", "remote");
		homePage = new HomePage(driver);
	}

	@Test
	public void testHeader() {
		homePage.checkHeaderButtons();
		Assert.assertEquals(homePage.demoH1text.getText(), "jQuery UI Demos");
	}
	
	@BeforeMethod(groups = "base setup")
	public void goToMainPage() {
		homePage.switchToMainPage();
	}
	
	@AfterClass
	public void close() {
		System.out.println("closing browser");
		closeBrowser();
	}

}
