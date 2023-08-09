package com.jqueryui.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UtilitiesPage {

	@FindBy(className = "demo-frame")
	public WebElement iframe;
	
	@FindBy(xpath = "//a[text()='Position']")
	WebElement position;

	@FindBy(xpath = "//a[text()='Widget Factory']")
	WebElement widgetFactory;

	
	
//	####################################################################################################################################
	WebDriver driver ;
	Actions action;
	
	public UtilitiesPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		action = new Actions(driver);
	}
	
	
	public void position() {
		position.click();
		switchToiframe();
	}

	public void widgetFactory() {
		widgetFactory.click();
		switchToiframe();
	}
	
	public void switchToiframe() {
		driver.switchTo().frame(iframe);
	}

	public void switchToMainPage() {
		driver.get("https://jqueryui.com/");
	}
}
