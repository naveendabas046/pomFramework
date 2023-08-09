package z.automation.sampleCodes;

import org.openqa.selenium.By; 
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ForAcivhersSample {
	
  WebDriver driver;
	
	@BeforeClass
	public void beforeClass() {		
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
	}
	
	@Test
	public void googleSearch() throws InterruptedException {
		
		driver.findElement(By.name("q")).sendKeys("Selenium"+ Keys.ENTER);
		driver.findElement(By.xpath("//h3[text()='Selenium']")).click();
		String actualurl = driver.getCurrentUrl();
		Assert.assertEquals(actualurl, "https://www.selenium.dev/");
		driver.findElement(By.className("DocSearch-Button-Placeholder")).click();
		driver.findElement(By.id("docsearch-input")).sendKeys("Grid");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//mark[text()='Grid']")).click();
		String actualGridUrl = driver.getCurrentUrl();
		Assert.assertEquals(actualGridUrl, "https://www.selenium.dev/documentation/grid/");
		Thread.sleep(500);
		driver.findElement(By.linkText("Watch the Videos")).click();
	}
}

