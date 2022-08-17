package Com.bridgelabz;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;
public class BaseTestNg {
	@BeforeMethod
	public void beforeMethod() {
		Reporter.log("beforeMethod", true);
	}
	@Test
	@AfterMethod
	public void afterMethod() {
		Reporter.log("afterMethod", true);
	}
	@BeforeClass
	public void beforeClass() {
		Reporter.log("beforeClass", true);
	}
	@AfterClass
	public void afterClass() {
		Reporter.log("afterClass", true);
	}
	@BeforeTest
	public void beforeTest() {
		Reporter.log("beforeTest", true);
	}
	@AfterTest
	public void afterTest() {
		Reporter.log("afterTest", true);
	}
	@BeforeSuite
	public void beforeSuite() {
		Reporter.log("beforeSuite", true);
	}
	@AfterSuite
	public void afterSuite() {
		Reporter.log("afterSuite", true);
	}
}
