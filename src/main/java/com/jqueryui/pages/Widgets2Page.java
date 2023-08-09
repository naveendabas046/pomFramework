package com.jqueryui.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Widgets2Page {
	
	@FindBy(className = "demo-frame")
	public WebElement iframe;

	@FindBy(xpath = "//a[text()='Datepicker']")
	WebElement datepicker;

	@FindBy(xpath = "//a[text()='Dialog']")
	WebElement dialog;

	@FindBy(xpath = "//a[text()='Menu']")
	WebElement menu;

	@FindBy(xpath = "//a[text()='Progressbar']")
	WebElement progressbar;

	@FindBy(xpath = "//a[text()='Selectmenu']")
	WebElement selectmenu;

	@FindBy(xpath = "//a[text()='Slider']")
	WebElement slider;

	@FindBy(xpath = "//a[text()='Spinner']")
	WebElement spinner;

	@FindBy(xpath = "//a[text()='Tabs']")
	WebElement tabs;

	@FindBy(xpath = "//a[text()='Tooltip']")
	WebElement tooltip;

	
	
	
	
	WebDriver driver;
	Actions action;

	public Widgets2Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		action = new Actions(driver);
	}

	public void datepicker() {
		datepicker.click();
		switchToiframe();
	}

	public void dialog() {
		dialog.click();
		switchToiframe();
	}

	public void menu() {
		menu.click();
		switchToiframe();
	}

	public void progressbar() {
		progressbar.click();
		switchToiframe();
	}

	public void selectmenu() {
		selectmenu.click();
		switchToiframe();
	}

	public void slider() {
		slider.click();
		switchToiframe();
	}

	public void spinner() {
		spinner.click();
		switchToiframe();
	}

	public void tabs() {
		tabs.click();
		switchToiframe();
	}

	public void tooltip() {
		tooltip.click();
		switchToiframe();
	}
	
	public void switchToiframe() {
		driver.switchTo().frame(iframe);
	}

	public void switchToMainPage() {
		driver.get("https://jqueryui.com/");
	}
	
	
}
