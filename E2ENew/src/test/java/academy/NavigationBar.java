package academy;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObject.LandingPage;
import resourcs.BasePage;

public class NavigationBar extends BasePage {
	 public WebDriver driver;
	
	@BeforeTest
	public void initilize() throws IOException {
		driver=initilizeDriver();
		driver.get(prop.getProperty("url"));
	}
	@Test
	public void navigation() throws IOException {
		
		LandingPage l= new LandingPage(driver);
	
	Assert.assertTrue(l.geNavigation().isDisplayed());

	}

	@AfterTest
	public void tear() {
		driver.close();
	}
}
