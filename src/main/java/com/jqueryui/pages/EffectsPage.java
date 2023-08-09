package com.jqueryui.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EffectsPage {

	@FindBy(xpath = "//a[text()='Add Class']")
	WebElement addClass;

	@FindBy(xpath = "//a[text()='Color Animation']")
	WebElement colorAnimation;

	@FindBy(xpath = "//a[text()='Easing']")
	WebElement easing;

	@FindBy(xpath = "//a[text()='Effect']")
	WebElement effect;

	@FindBy(xpath = "//a[text()='Hide']")
	WebElement hide;

	@FindBy(xpath = "//a[text()='Remove Class']")
	WebElement removeClass;

	@FindBy(xpath = "//a[text()='Show']")
	WebElement show;

	@FindBy(xpath = "//a[text()='Switch Class']")
	WebElement switchClass;

	@FindBy(xpath = "//a[text()='Toggle']")
	WebElement toggle;

	@FindBy(xpath = "//a[text()='Toggle Class']")
	WebElement toggleClass;

	@FindBy(className = "demo-frame")
	public WebElement iframe;
//####################################################################################################################################
	
	WebDriver driver;
	Actions action;

	public EffectsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		action = new Actions(driver);
	}

	public void addClass() {
		addClass.click();
		switchToiframe();
	}

	public void colorAnimation() {
		colorAnimation.click();
		switchToiframe();
	}

	public void easing() {
		easing.click();
		switchToiframe();
	}

	public void effect() {
		effect.click();
		switchToiframe();
	}

	public void hide() {
		hide.click();
		switchToiframe();
	}

	public void removeClass() {
		removeClass.click();
		switchToiframe();
	}

	public void show() {
		show.click();
		switchToiframe();
	}

	public void switchClass() {
		switchClass.click();
		switchToiframe();
	}

	public void toggle() {
		toggle.click();
		switchToiframe();
	}

	public void toggleClass() {
		toggleClass.click();
		switchToiframe();
	}

	public void switchToiframe() {
		driver.switchTo().frame(iframe);
	}

	public void switchToMainPage() {
		driver.get("https://jqueryui.com/");
	}

}
