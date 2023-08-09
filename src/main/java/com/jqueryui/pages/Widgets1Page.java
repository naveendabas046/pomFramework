package com.jqueryui.pages;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Widgets1Page {
	
	@FindBy(xpath ="//a[text()='Accordion']")
	WebElement accordion;
	
	@FindBy(xpath ="//a[text()='Autocomplete']")
	WebElement autocomplete;
	
	@FindBy(xpath ="//a[text()='Button']")
	WebElement button;
	
	@FindBy(xpath ="//a[text()='Checkboxradio']")
	WebElement checkboxradio;
	
	@FindBy(xpath ="//a[text()='Controlgroup']")
	WebElement controlgroup;
	
	@FindBy(xpath = "//h3[text()='Section 4']")
	public WebElement section4;
	
	@FindBy(className = "ui-autocomplete-input")
	public WebElement autoComplete;
	
	@FindBy(xpath = "(//button[text()='A button element'])[1]")
	public WebElement widget1stButton;
	
	@FindBy(xpath = "(//input[@value='A submit button'])[1]")
	public WebElement widget2ndButton;
	
	@FindBy(xpath = "//div/a[text()='An anchor']")
	public WebElement widget3rdButton;
	
	@FindBy(xpath = "//body/button[text()='A button element']")
	public WebElement css1stButton;

	@FindBy(xpath = "//body/input[@value='A submit button']")
	public WebElement css2ndButton;
	
	@FindBy(xpath = "//body/a[text()='An anchor']")
	public WebElement css3rdButton;
	
	@FindBy(xpath = "//span[@id='car-type-button']")
	public WebElement carSelectDropDown;
	
	@FindBy(xpath = "//label[@for='transmission-standard']")
	public WebElement manualTransmisson;
	
	@FindBy(xpath = "//label[@for='insurance']")
	public WebElement insurance;
	
	@FindBy(id = "horizontal-spinner")
	public WebElement carQuantity;
	
	@FindBy(className ="demo-frame")
	public WebElement iframe;
	
	
	
	WebDriver driver;
	Actions action;

	public Widgets1Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		action = new Actions(driver);
	}
	
	
	
	public void accordion() {
		accordion.click();
		switchToiframe();
		section4.click();
	}

	public void autocomplete() {
		autocomplete.click();
		switchToiframe();
		action.click(autoComplete).sendKeys("a").pause(Duration.ofSeconds(2)).sendKeys(Keys.DOWN )
		.sendKeys(Keys.DOWN ).pause(Duration.ofSeconds(2)).sendKeys(Keys.ENTER ).build().perform();	
	}
	
	public void button() {
		button.click();
		switchToiframe();
		widget1stButton.click();
		widget2ndButton.click();
		widget3rdButton.click();
		css1stButton.click();
		css2ndButton.click();
		action.clickAndHold(css3rdButton).pause(Duration.ofSeconds(3)).release().build().perform();
	}

	public void checkboxradio() {
		checkboxradio.click();
		switchToiframe();
	}

	public void controlgroup() {
		controlgroup.click();
		switchToiframe();
		action.click(carSelectDropDown).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.DOWN)
		.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.DOWN).sendKeys(Keys.ENTER).build().perform();
		manualTransmisson.click();
		insurance.click();
		carQuantity.sendKeys("4" +Keys.ENTER);
	}

	
	public void switchToiframe() {
		driver.switchTo().frame(iframe);
	}

	public void switchToMainPage() {
		driver.get("https://jqueryui.com/");
	}
}
