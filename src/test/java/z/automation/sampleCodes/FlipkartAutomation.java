package z.automation.sampleCodes;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FlipkartAutomation {
	WebDriver driver;
	DesiredCapabilities cap;
	WebDriverWait wait;
	Wait waitF;

	@BeforeClass
	public void beforeClass() {
		cap = new DesiredCapabilities();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		{
			ChromeOptions options = new ChromeOptions();
			options.setAcceptInsecureCerts(true);
			options.addArguments("--incognito");
			options.addArguments("Window");
			cap.merge(options);
		}
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();

	}

	@Test
	public void Flipkart() {
		Actions action = new Actions(driver);

		driver.findElement(By.xpath("//button[text()= '✕']")).click();
		driver.findElement(By.xpath("//div[text()='Mobiles']")).click();
		WebElement menSectionLocation = driver.findElement(By.xpath("//span[normalize-space()='Men']"));
		driver.findElement(By.xpath("//span[normalize-space()='Men']")).click();
		WebElement ethenic = driver.findElement(By.xpath("//a[@title='Ethnic wear']"));
		action.moveToElement(ethenic).click().build().perform();
		driver.findElement(By.xpath("//div[text()='Newest First']")).click();
		String tab1 = driver.getWindowHandle();
	    driver.findElement(By.xpath("//div[@data-id = 'PYJGKSZZQHWYZFQ6']")).click();  
		Set<String> tabs = driver.getWindowHandles();
		tabs.remove(tab1);
		String tab2 = (String) tabs.toArray()[0];
		driver.switchTo().window(tab2);
		
		driver.quit();
	}
}
