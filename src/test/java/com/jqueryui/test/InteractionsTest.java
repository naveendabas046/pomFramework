package com.jqueryui.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.jqueryui.pages.InteractionsPage;

public class InteractionsTest extends BaseTest {

	InteractionsPage interactionsPage;

	@Parameters({ "browser", "locationMode" })
	@BeforeClass
	public void startWebDriver(String browser, String locationMode) {
		setupWebDriver(browser, locationMode);
		interactionsPage = new InteractionsPage(driver);
	}

	@BeforeMethod(groups = "base setup")
	public void goToMainPage() {
		interactionsPage.switchToMainPage();
	}

	@Test(priority = 1, groups = "E2E")
	public void draggableTest() {
		interactionsPage.draggable();
	}

	@Test(priority = 2, groups = "E2E")
	public void droppableTest() {
		interactionsPage.droppable();
	}

	@Test(priority = 3, groups = "E2E")
	public void resizableTest() {
		interactionsPage.resizable();
	}

	@Test(priority = 4, groups = "E2E")
	public void selectableTest() {
		interactionsPage.selectable();
	}

	@Test(priority = 5, groups = "E2E")
	public void sortableTest() {
		interactionsPage.sortable();
	}

	@AfterClass(groups = "base setup")
	public void closeBrowser1() {
		closeBrowser();
	}

}
