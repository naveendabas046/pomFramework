package z.automation.sampleCodes;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class NGclass1 {
	@BeforeSuite
	public void beforesuite() {
		System.out.println("Ngclass1 \"before suite\"");
	}

	@BeforeTest
	public void beforetest() {
		System.out.println("NGclass1 \"before test\"");
	}

	@BeforeClass
	public void beforeNGclass1() {
		System.out.println("NGclass1 \"before class\"");
	}

	@BeforeMethod(enabled = true)
	public void beforeMethod() {
		System.out.println("NGclass1 before method");
	}

	@Parameters({ "browserName", "windowsName" })
	@Test(timeOut = 1000)
	public void signupMethod(@Optional("chrome_opt") String browserName, @Optional("windowsXP") String windowsName)
			throws InterruptedException {
		Thread.sleep(900);
		System.out.println("NGclass1 signup done on " + browserName + " browser");
		System.out.println("NGclass1 signup done on " + windowsName + " windows");
	}

	@Test(dataProvider = "uLoginData")
	public void userLogin(String classname, String username, String password) {
		System.out.println(classname + "signup details   name - " + username + "| password - " + password);
	}

	@Test(dataProvider = "uLoginData", description = "login using String[] type perameter")
	public void userLogin1(String[] uDetails) {
		System.out.println(uDetails[0] + "signup details   name - " + uDetails[1] + "| password - " + uDetails[2]);
	}

	@DataProvider(name = "uLoginData")
	public Object[][] userLoginData() {
		Object[][] userdata = { { "NGclass1 ", "sachin ", "sachin@123" }, { "NGclass1 ", "saurav ", "saurav@123" }, };
		return userdata;
	}

	@BeforeGroups("Sanity")                                // here we can declare group directly , on other places we can not 
	public void beforeGroup() {
		System.out.println("NGclass1 \"before group\"");
	}

	@Test(priority = 2, description = "NGclass1 login in progress", groups = "Sanity")
	public void LoginNG() {
		System.out.println("NGclass1 - process 0  login done");
	}

	@AfterGroups("Sanity")                                 // if group name will not be declared then it will executes before/after all the groups  
	public void afterGroup() {
		System.out.println("NGclass1 \"after group\"");
	}

	@Test(priority = 3, groups = { "Re-Testing", "performance testing" })
	public void Process1() {
		System.out.println("NGclass1 - process 1 ");
	}

	@Test(priority = 4, dependsOnMethods = {"LoginNG","Process1"}, groups = { "performance testing" })
	public void Process2() {
		System.out.println("NGclass1 - process 2");
	}

	@Test(priority = 5, groups = { "Re-Testing", "performance testing" })
	public void Process3() {
		System.out.println("NGclass1 - process 3");
	}

	@Test(priority = 5,  groups = { "Re-Testing" })
	public void Process4() throws Exception {
		System.out.println("NGclass1 - process 4");
		throw new Exception("throwing self made error");
	}

	@Test(priority = 6, invocationCount = 2, groups = { "Re-Testing" })
	public void Process5() {
		System.out.println("NGclass1 - process 5");
	}

	@Test(priority = 6, groups = { "Re-Testing" })
	public void Process6() {
		System.out.println("NGclass1 - process 6");
	}

	@Test(priority = 7, enabled = false, groups = { "e2e" })
	public void Process7() {
		System.out.println("NGclass1 - disabled process 7");
	}

	@Test(priority = 9, enabled = true, groups = { "Sanity" })
	public void Logout() {
		Process7();
		System.out.println("NGclass1 - logged out");
	}
	
	@AfterMethod()
	public void aftermethod() {
		System.out.println("NGclass1 after method");
	}
	
	@AfterClass
	public void afterNGclass1() {
		System.out.println("NGclass1 \"after class\"");
	}
	
	@AfterTest
	public void aftertest() {
		System.out.println("NGclass1 \"after test\"");
	}
	
	@AfterSuite
	public void aftersuite() {
		System.out.println("Ngclass1 \"after suite\"");
	}

}