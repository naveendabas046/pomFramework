package z.automation.sampleCodes;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BrokenURL {

	WebDriver driver;
	DesiredCapabilities cap;

	@BeforeClass
	public void beforeclass() throws MalformedURLException {
		cap = new DesiredCapabilities();

		ChromeOptions options = new ChromeOptions();
		options.setAcceptInsecureCerts(true);
		options.addArguments("--incognito");
		options.addArguments("Window");
		cap.merge(options);

		driver = new RemoteWebDriver(new URL("http://192.168.1.6:4444"), cap);
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
	}

	@Test
	public void findBrokenURL() throws Exception {
		List<WebElement> li = driver.findElements(By.xpath("//a"));

		for (WebElement El : li) {

			String url = El.getAttribute("href");
			HttpURLConnection req = (HttpURLConnection) (new URL(url).openConnection());
			req.setRequestMethod("HEAD");
			req.connect();
			int responseCode = req.getResponseCode();
			if (responseCode >= 400) {
				System.out.println("broken links - " + url);
			} else {
				System.out.println("valid links - " + url);
			}
		}
		driver.close();
	}
}
