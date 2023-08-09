package com.jqueryui.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.jqueryui.pages.UtilitiesPage;

public class UtilitiesPageTest extends BaseTest {

	UtilitiesPage utilitiesPage;

	@BeforeClass
	public void startWebDriver() {
		setupWebDriver("", "");
		utilitiesPage = new UtilitiesPage(driver);
	}
	
	@BeforeMethod(groups = "base setup")
	public void goToMainPage() {
		utilitiesPage.switchToMainPage();
	}
	
	@Test
	public void widgetFactoryTest() {
		utilitiesPage.widgetFactory();
	}
	
	@Test
	public void positionTest() {
		utilitiesPage.position();
	}
	
	@AfterClass(groups = "base setup")
	public void closeBrowser1() {
		closeBrowser();
	}
}
