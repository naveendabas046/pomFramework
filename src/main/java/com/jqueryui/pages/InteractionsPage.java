package com.jqueryui.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InteractionsPage {
	
	@FindBy(xpath ="//a[text()='Draggable']")
	WebElement draggable;
	
	@FindBy(xpath ="//a[text()='Droppable']")
	WebElement droppable;
	
	@FindBy(xpath ="//a[text()='Resizable']")
	WebElement resizable;
	
	@FindBy(xpath ="//a[text()='Selectable']")
	WebElement selectable;
	
	@FindBy(xpath ="//a[text()='Sortable']")
	WebElement sortable;
	
	@FindBy(className = "demo-frame")
	public WebElement iframe;
	
	@FindBy(xpath = "//div[@id='draggable']")
	public WebElement dragBox;
	
	@FindBy(xpath = "//div[@id='droppable']")
	public WebElement dropBox;
	
	@FindBy(xpath = "//div[@class='ui-resizable-handle ui-resizable-se ui-icon ui-icon-gripsmall-diagonal-se']")
	public WebElement changeSize;
	
	@FindBy(xpath = "//li[text()='Item 1']")
	public WebElement item1;
	
	@FindBy(xpath = "//li[text()='Item 3']")
	public WebElement item3;
	
	@FindBy(xpath = "//li[text()='Item 7']")
	public WebElement item7;
	
	
	WebDriver driver;
	Actions action;
	
	public InteractionsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		action = new Actions(driver);
	}
	
	
	public void draggable() {
		draggable.click();
		switchToiframe();
		action.dragAndDropBy(dragBox, 150, 150).build().perform();
	}

	public void droppable() {
		droppable.click();
		switchToiframe();
		action.dragAndDrop(dragBox, dropBox).build().perform();
	}

	public void resizable() {
		resizable.click();
		switchToiframe();
		action.dragAndDropBy(changeSize, 200, 150).build().perform();
	}

	public void selectable() {
		selectable.click();
		switchToiframe();
		item1.click();
		action.clickAndHold(item3).click(item7).build().perform();
	}

	public void sortable() {
		sortable.click();
		switchToiframe();
		action.dragAndDrop(item3, item7).build().perform();
	}

	
	public void switchToiframe() {
		driver.switchTo().frame(iframe);
	}

	public void switchToMainPage() {
		driver.get("https://jqueryui.com/");
	}

}
