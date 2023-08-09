package z.automation.sampleCodes;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestActions {

	WebDriverWait wait = null;
	WebDriver driver = null;

	@Parameters("browser")
	@BeforeClass
	public void beforeClass(@Optional("chrome") String browser) {

		if (browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		} else if (browser.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		}
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://jqueryui.com/");
		driver.manage().window().maximize();
		wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	}

	@Test
	public void testDragable() {

		driver.findElement(By.linkText("Draggable")).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("demo-frame")));
		WebElement frame = driver.findElement(By.className("demo-frame"));
		driver.switchTo().frame(frame);

		WebElement source = driver.findElement(By.id("draggable"));
		// This statement is used for mouse-hover condition in selenium
		Actions action = new Actions(driver);

		action.dragAndDropBy(source, 200, 200).build().perform();

	}

	@Test
	public void testDropable() {
		driver.findElement(By.linkText("Droppable")).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("demo-frame")));
		WebElement frame = driver.findElement(By.className("demo-frame"));
		driver.switchTo().frame(frame);

		WebElement source = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));
		// This statement is used for mouse-hover condition in selenium
		Actions action = new Actions(driver);

		action.dragAndDrop(source, target).build().perform();

	}

	@Test
	public void ReSizeAble() {
		driver.findElement(By.linkText("Resizable")).click();
		WebElement frame = driver.findElement(By.className("demo-frame"));
		driver.switchTo().frame(frame);
		WebElement source = driver.findElement(By.xpath("//div[3]"));
		// WebElement target = driver.findElement(By.xpath("//div[@style=\'width: 250px;
		// height: 250px;']"));
		Actions action = new Actions(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[3]")));
		action.dragAndDropBy(source, 150, 150).build().perform();
	}

	@Test
	public void testSelectable() {
		driver.findElement(By.linkText("Selectable")).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("demo-frame")));
		WebElement frame = driver.findElement(By.className("demo-frame"));
		driver.switchTo().frame(frame);

		WebElement item2 = driver.findElement(By.xpath("//li[text()='Item 2']"));
		WebElement item4 = driver.findElement(By.xpath("//li[text()='Item 4']"));
		WebElement item6 = driver.findElement(By.xpath("//li[text()='Item 6']"));
		// This statement is used for mouse-hover condition in selenium
		Actions action = new Actions(driver);

		action.keyDown(Keys.CONTROL).click(item2).click(item4).click(item6).build().perform();
	}

	@Test
	public void Sortable() {
		driver.findElement(By.linkText("Sortable")).click();
		WebElement frame = driver.findElement(By.className("demo-frame"));
		driver.switchTo().frame(frame);

		WebElement item7 = driver.findElement(By.xpath("//li[normalize-space()='Item 7']"));
		WebElement item1 = driver.findElement(By.xpath("//li[normalize-space()='Item 1']"));
		WebElement item6 = driver.findElement(By.xpath("//li[normalize-space()='Item 6']"));
		WebElement item2 = driver.findElement(By.xpath("//li[normalize-space()='Item 2']"));
		Actions action = new Actions(driver);
		action.clickAndHold(item7).moveToElement(item1).build().perform();
		action.dragAndDrop(item6, item2).build().perform();
	}

	@Test
	public void Accordion() {
		driver.findElement(By.linkText("Accordion")).click();
		WebElement frame = driver.findElement(By.className("demo-frame"));
		driver.switchTo().frame(frame);
		driver.findElement(By.id("ui-id-7")).click();
		driver.findElement(By.id("ui-id-3")).click();
	}

	@Test
	public void Autocomplete() {
		driver.findElement(By.linkText("Autocomplete")).click();
		WebElement frame = driver.findElement(By.className("demo-frame"));
		driver.switchTo().frame(frame);
		driver.findElement(By.className("ui-autocomplete-input")).sendKeys("a");
		Actions action = new Actions(driver);
		action.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform(); // why this
																											// line is
																											// throwing
																											// error ?
	}

	@Test
	public void Button() { // not working
		driver.findElement(By.linkText("Button")).click();
		driver.findElement(By.linkText("Icons")).click();
		WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(frame);
		driver.findElement(By.xpath("//button[contains(text(),'Button with icon on the left')]")).click();

	}

	@Test
	public void Checkboxradio() {
		driver.findElement(By.linkText("Checkboxradio")).click();
		driver.findElement(By.linkText("Default functionality")).click();
		WebElement frame = driver.findElement(By.className("demo-frame"));
		driver.switchTo().frame(frame);

		WebElement paris = driver.findElement(By.xpath("//label[normalize-space()='Paris']"));
		WebElement ThreeStar = driver.findElement(By.xpath("//label[normalize-space()='3 Star']"));
		WebElement FiveStar = driver.findElement(By.xpath("//label[normalize-space()='5 Star']"));
		Actions action = new Actions(driver);
		action.moveToElement(paris).pause(Duration.ofSeconds(1)).click().moveToElement(ThreeStar)
				.pause(Duration.ofSeconds(1)).click().moveToElement(FiveStar).pause(Duration.ofSeconds(1)).click()
				.build().perform();
	}

	@Test
	public void testMenu() {
		driver.findElement(By.linkText("Menu")).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("demo-frame")));
		WebElement frame = driver.findElement(By.className("demo-frame"));
		driver.switchTo().frame(frame);

		WebElement menu = driver.findElement(By.id("ui-id-9"));
		WebElement submenu = driver.findElement(By.id("ui-id-13"));
		WebElement mordern = driver.findElement(By.id("ui-id-16"));
		// This statement is used for mouse-hover condition in selenium
		Actions action = new Actions(driver);

		action.moveToElement(menu).pause(Duration.ofSeconds(1)).moveToElement(submenu).pause(Duration.ofSeconds(1))
				.moveToElement(mordern).click().build().perform();

	}

	@Test
	public void selectDropDown() {
		Actions actions = new Actions(driver);
		
		driver.findElement(By.xpath("//a[text()='Selectmenu']")).click();

		WebElement iframe = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(iframe);

		WebElement dropDown = driver.findElement(By.xpath("//span[@id='speed-button']"));
		actions.click(dropDown).perform();

		WebElement faster_dropDown = driver.findElement(By.xpath("//div[text()='Faster']"));
		actions.click(faster_dropDown).perform();
	}

	@Test
	public void dropDownByListStorage() throws InterruptedException {
		driver.findElement(By.xpath("//a[text()='Selectmenu']")).click();
		WebElement iframe = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(iframe);
		driver.findElement(By.xpath("//span[@id='number-button']")).click();

		List<WebElement> allOptions = driver.findElements(By.xpath("//ul[@id='number-menu']/li"));
		for (WebElement el : allOptions) {
			if (el.getText().contains("17")) {
				el.click();
			}

		}
	}
}
