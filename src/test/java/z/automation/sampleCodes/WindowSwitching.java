package z.automation.sampleCodes;

import java.time.Duration; 
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class WindowSwitching {
	WebDriver driver ;
	WebDriverWait wait ;
	
	@Parameters("browser")
	@BeforeClass
	public void beforeClass(@Optional("chrome")String browser) {
		
		if(browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		}
		wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.get("https://www.freecodecamp.org/news/how-to-use-html-to-open-link-in-new-tab/");
		driver.manage().window().maximize();
	}
	
	@Test
	public void testWindowSwitching() {
		String tab1 = driver.getWindowHandle();
		driver.findElement(By.xpath("//a[text()=\"freeCodeCamp\" and @target=\"_blank\"]")).click();
		String title = driver.getTitle();
		Assert.assertEquals(title,"How to Use HTML to Open a Link in a New Tab");  
		
		Set<String> tabs = driver.getWindowHandles();
		tabs.remove(tab1);
		String tab2 = (String) tabs.toArray()[0];
		driver.switchTo().window(tab2);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//button/span[text()='Menu']")));
		String title2 = driver.getTitle();
		
		Assert.assertEquals(title2,  "Learn to Code — For Free — Coding Courses for Busy People");
		//driver.close();
		driver.switchTo().window(tab1);
		driver.findElement(By.xpath("//a[text()='Donate']"));
		//driver.close();
		
	}
	
}
