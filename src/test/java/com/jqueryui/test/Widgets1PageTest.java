package com.jqueryui.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.jqueryui.pages.Widgets1Page;

public class Widgets1PageTest extends BaseTest {

	Widgets1Page widgets1Page;

	@BeforeClass
	public void startWebDriver() {
		setupWebDriver("firefox", "local");
		widgets1Page = new Widgets1Page(driver);
	}
	
	@BeforeMethod(groups = "base setup")
	public void goToMainPage() {
		widgets1Page.switchToMainPage();
	}
	
	@Test
	public void accordionTest() {
		widgets1Page.accordion();
	}
	
	@Test
	public void autocompleteTest() {
		widgets1Page.autocomplete();
	}
	
	@Test
	public void buttonTest() {
		widgets1Page.button();
	}
	
	@Test
	public void checkboxradioTest() {
		widgets1Page.checkboxradio();
	}
	
	@Test(groups = "only this test")
	public void controlgroupTest() {
		widgets1Page.controlgroup();
	}
	
	@AfterClass(groups = "base setup")
	public void closeBrowser1() {
		closeBrowser();
	}

}
