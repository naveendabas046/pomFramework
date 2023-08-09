package z.automation.sampleCodes;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ImpicitExplicitSample {
     WebDriver driver;
     WebDriverWait wait;
     Wait<WebDriver> waitF;
     
     @BeforeClass
     public void BeforeClass() {
    	 driver = new ChromeDriver();
    	 driver.get("https://www.google.com");
    	 driver.manage().window().maximize();
    	// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));           // implicit wait, will wait before every method
    	 wait = new WebDriverWait(driver,Duration.ofSeconds(2));                       // explicit wait, will wait only before desired method
    	 waitF = new FluentWait<>(driver)                                              // fluent wait
    			    .withTimeout(Duration.ofSeconds(4))
    			    .pollingEvery(Duration.ofMillis(500))
    			    .ignoring(NoSuchElementException.class);
    			  

     }
     
     @Test
     public void ImplicitSample() {
    	 driver.findElement(By.name("q")).sendKeys("Selenium" +Keys.ENTER);
    	 driver.findElement(By.xpath("//h3[text()='Selenium']")).click();
    	 driver.findElement(By.className("DocSearch-Button-Placeholder")).click();
    	 driver.findElement(By.id("docsearch-input")).sendKeys("Grid");
    	 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mark[text()='Grid']")));    // explicit wait 
    	 driver.findElement(By.xpath("//mark[text()='Grid']")).click();
    	 waitF.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(@class,'DocSearch-Button-Placeholder')]")));  // fluent wait
    	 driver.findElement(By.xpath("//span[contains(@class,\"DocSearch-Button-Placeholder\")]")).click();
    	 driver.findElement(By.className("DocSearch-Input")).sendKeys("naveen" +Keys.ENTER);
    	 driver.close();
     }
}  
