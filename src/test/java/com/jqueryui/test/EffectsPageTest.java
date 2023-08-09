package com.jqueryui.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.jqueryui.pages.EffectsPage;

public class EffectsPageTest extends BaseTest {

	EffectsPage effectsPage;

	@BeforeClass
	public void startWebDriver() {
		setupWebDriver("edge", "local");
		effectsPage = new EffectsPage(driver);
	}
	
	@BeforeMethod
	public void goToMainPage() {
		effectsPage.switchToMainPage();
	}
	
	@Test
	public void addClassTest() {
		effectsPage.addClass();
	}
	
	@Test
	public void colorAnimationTest() {
		effectsPage.colorAnimation();
	}
	
	@Test
	public void easingTest() {
		effectsPage.easing();
	}
	
	@Test
	public void effectTest() {
		effectsPage.effect();
	}
	
	@Test
	public void hideTest() {
		effectsPage.hide();
	}
	
	@Test
	public void removeClassTest() {
		effectsPage.removeClass();
	}
	
	@Test
	public void showTest() {
		effectsPage.show();
	}
	
	@Test
	public void toggleTest() {
		effectsPage.toggle();
	}
	
	@Test
	public void toggleClassTest() {
		effectsPage.toggleClass();
	}
	
	@Test
	public void switchClassTest() {
		effectsPage.switchClass();
	}
	
	@AfterClass
	public void closeBrowser1() {
		closeBrowser();
	}
	

}
