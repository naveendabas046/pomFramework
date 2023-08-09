package z.automation.sampleCodes;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DropDownList {

	  WebDriver driver;
	  WebDriverWait wait;
		
		@BeforeClass
		public void beforeClass() {	
			
			driver = new ChromeDriver();
			driver.get("file:///D:/study_center/selanium/SelectSite.html");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));   // Max 10 seconds --- .5s  500ms
	    //    wait = new WebDriverWait(driver, Duration.ofSeconds(20));	
		}
		// <Select> not for <ul>
		@Test
		public void selectDropDownList() throws InterruptedException {
			
			WebElement element = driver.findElement(By.name("pets"));
			Select select = new Select(element);
			Thread.sleep(2000);
			select.selectByVisibleText("Dog");
			Thread.sleep(2000);
			select.selectByIndex(4);
			Thread.sleep(2000);	
			select.selectByValue("goldfish");
			Thread.sleep(2000);
		//	select.deselectAll();
		
		}

		// Alert is written in JavaScript
		@Test
		public void testAlert() {
			
			driver.findElement(By.xpath("//input[@value='Click me']")).click();
			
			Alert alert = driver.switchTo().alert();
			String alerttext =  alert.getText();
			
			Assert.assertEquals(alerttext, "This is an alert dialog box");
			alert.accept();
			
		}	
}
