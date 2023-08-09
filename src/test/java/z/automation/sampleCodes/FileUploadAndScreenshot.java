package z.automation.sampleCodes;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class FileUploadAndScreenshot {
	WebDriver driver = null;
	WebDriverWait wait = null;
	
	@Parameters("browser")
	@BeforeClass
	public void beforeClass(@Optional("chrome") String browser) {
		
		if(browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		}
		else if (browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		}
		else if (browser.equalsIgnoreCase("edge")) {
			driver = new FirefoxDriver();
		}
		else {
			System.out.println("no broswer found");
		}
		
		driver.get("https://demo.guru99.com/test/upload/");
		driver.manage().window().maximize();
		wait = new WebDriverWait(driver, Duration.ofSeconds(1));
	}
	

	@Test
	public void testFileUpload() throws IOException {
		driver.findElement(By.name("uploadfile_0")).sendKeys("C:/Users/navee/Downloads/Resume.pdf");
		driver.findElement(By.id("terms")).click();
		driver.findElement(By.id("submitbutton")).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//center[text()='has been successfully uploaded.']")));
		boolean successmsg = driver.findElement(By.xpath("//center[text()='has been successfully uploaded.']")).isDisplayed();
		Assert.assertEquals(successmsg, true);
		
		TakesScreenshot scrShot = ((TakesScreenshot)driver)	;
		
		File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
		String fileWithPath = ".Screenshot/Image1.jpeg";
		File DestFile = new File(fileWithPath);
		FileUtils.copyFile(SrcFile,DestFile);
	}
}
