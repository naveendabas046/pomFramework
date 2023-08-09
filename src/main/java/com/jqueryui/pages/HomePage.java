package com.jqueryui.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	@FindBy(xpath = "//a[text()='Demos']")
	WebElement demoButton;

	@FindBy(xpath = "//h1[text()='jQuery UI Demos']")
	public WebElement demoH1text;

//	####################################################################################################################################
	
	WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void checkHeaderButtons() {
		demoButton.click();
	}
	
	public void switchToMainPage() {
		driver.get("https://jqueryui.com/");
	}
}
