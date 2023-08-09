package z.automation.sampleCodes;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class RemoteExecution {
	RemoteWebDriver driver;
	WebDriverWait wait;
	DesiredCapabilities cap;

	@Parameters("browser")
	@BeforeClass
	public void beforeClass(@Optional("edge") String browser) throws MalformedURLException {

		cap = new DesiredCapabilities();

		if (browser.equalsIgnoreCase("chrome")) {
			ChromeOptions options = new ChromeOptions();
			options.setAcceptInsecureCerts(true);
			options.addArguments("--incognito");
			options.addArguments("Window");
			cap.merge(options);
		} else if (browser.equalsIgnoreCase("edge")) {
			EdgeOptions options = new EdgeOptions();
			options.setAcceptInsecureCerts(true);
			options.addArguments("InPrivate");
			options.addArguments("Window");
			cap.merge(options);
		}
		driver = new RemoteWebDriver(new URL("http://192.168.1.6:4444"),cap);
		wait = new WebDriverWait(driver, Duration.ofSeconds(1));
		driver.get("https://jqueryui.com/");
		driver.manage().window().maximize();
	}

	@Test
	public void TestDragable() {
		driver.findElement(By.linkText("Draggable")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("demo-frame")));
		WebElement frame = driver.findElement(By.className("demo-frame"));
		driver.switchTo().frame(frame);

		WebElement source = driver.findElement(By.id("draggable"));
		Actions action = new Actions(driver);

		action.dragAndDropBy(source, 100, 100).build().perform();
	}

}
