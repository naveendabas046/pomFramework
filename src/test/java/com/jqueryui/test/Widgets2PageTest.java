package com.jqueryui.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.jqueryui.pages.Widgets2Page;

public class Widgets2PageTest extends BaseTest {
  
	
	Widgets2Page widgets2Page;

	@BeforeClass
	public void startWebDriver() {
		setupWebDriver("firefox", "remote");
		widgets2Page = new Widgets2Page(driver);
	}
	
	@BeforeMethod(groups = "base setup")
	public void goToMainPage() {
		widgets2Page.switchToMainPage();
	}
	
	@Test
	public void datepickerTest() {
		widgets2Page.datepicker();
	}
	
	@Test
	public void dialogTest() {
		widgets2Page.dialog();
	}
	
	@Test
	public void menuTest() {
		widgets2Page.menu();
	}
	
	@Test
	public void progressbarTest() {
		widgets2Page.progressbar();
	}
	
	@Test
	public void selectmenuTest() {
		widgets2Page.selectmenu();
	}
	
	@Test
	public void sliderTest() {
		widgets2Page.slider();
	}
	
	@Test
	public void tooltipTest() {
		widgets2Page.tooltip();
	}
	
	@Test
	public void tabsTest() {
		widgets2Page.tabs();
	}
	
	@Test
	public void spinnerTest() {
		widgets2Page.spinner();
	}
	
	@AfterClass(groups = "base setup")
	public void closeBrowser1() {
		closeBrowser();
	}

	
	
	
}
