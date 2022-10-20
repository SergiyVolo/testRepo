package tests;

import org.testng.annotations.Test;
import pages.AmazonPages;
import utilities.Driver;
import utilities.PropertiesReader;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import java.util.concurrent.TimeUnit;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class AmazonTests {

	AmazonPages amazonPage;

	@Test
	public void amazonSearchTest() {
		amazonPage = new AmazonPages();

		// go to amazon.com
		Driver.getDriver().get(PropertiesReader.getProperty("url"));
		// search for a coffee mug
		amazonPage.searchBox.sendKeys("coffee mug");
		amazonPage.searchButton.click();
	}

	@BeforeMethod
	public void beforeMethod() {
		Driver.getDriver().manage().window().maximize();
		Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@AfterMethod
	public void afterMethod() {
		Driver.quitDriver();
	}

	@Parameters("data1")
	@Test(priority = 1, groups = { "smokeTest" })
	public void google(String str) {
		System.out.println("I'm going to google in " + str);
	}

	@Test(priority = 2, description = "this is etsy test")
	public void etsy() {
		System.out.println("I'm going to etsy.");
	}

	@Test(priority = 30, description = "facebook test", groups = "smokeTest")
	public void facebook() {
		Assert.fail();
		System.out.println("I'm going to facebook.");
	}

	@Test(dependsOnMethods = "facebook", groups = { "smokeTest", "amazonSearchTest" })
	public void amazon() {
		System.out.println("I'm going to amazon.");
		
	}

}
