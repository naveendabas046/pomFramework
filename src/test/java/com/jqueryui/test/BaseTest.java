package com.jqueryui.test;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.Test;

public class BaseTest {

	public static WebDriver driver;
	WebDriverWait wait;
	DesiredCapabilities cap;

	public void setupWebDriver(String browser, String locationMode) {
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
		} else if (browser.equalsIgnoreCase("firefox")) {
			FirefoxOptions options = new FirefoxOptions();
			options.setAcceptInsecureCerts(true);
			options.addArguments("Window");
			// options.setProxy("");
			cap.merge(options);
		}
		if (locationMode.equalsIgnoreCase("remote")) {
			try {
				System.out.println("executing via Remote WebDriver");
				driver = new RemoteWebDriver(new URL(" http://192.168.1.11:4444"), cap);
			} catch (MalformedURLException e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("executing via local WebDriver because remote wasnt selected");
			driver = new ChromeDriver();
		}

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		wait = new WebDriverWait(driver, Duration.ofSeconds(4));
	}

	public void takeScreenShot(ITestResult Result) {
		File screenShotFile = ((RemoteWebDriver) driver).getScreenshotAs(OutputType.FILE);

		LocalDateTime currentDateTime = LocalDateTime.now();
		String shortDateTime = currentDateTime.toString().substring(0, 10)
				+ currentDateTime.toString().subSequence(10, 22);
		shortDateTime = shortDateTime.replace(":", "_");

		try {
			FileUtils.copyFile(screenShotFile,
					new File("screenShots/" + Result.getName() + "_" + shortDateTime + ".jpg"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void closeBrowser() {
		// program should wait 3 seconds before executing next line
		driver.close();
	}
}
