package tests;

import java.util.concurrent.TimeUnit;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.SauceDemoLoginPage;
import utilities.Driver;
import utilities.PropertiesReader;

public class SauceDemoLoginTest {

	SauceDemoLoginPage sauceDemoPage;

	@Test
	public void sauceDemoLoginTest() {
		sauceDemoPage = new SauceDemoLoginPage();

		Driver.getDriver().get(PropertiesReader.getProperty("url"));
		sauceDemoPage.userName.sendKeys("standard_user");
		sauceDemoPage.password.sendKeys("secret_sauce");
		sauceDemoPage.login.click();

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
}
