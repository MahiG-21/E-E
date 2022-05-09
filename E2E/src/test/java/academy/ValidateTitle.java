package academy;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObject.LandingPage;
import resourcs.BasePage;

public class ValidateTitle extends BasePage {
	 public WebDriver driver;

	public static Logger log = LogManager.getLogger(BasePage.class.getName());
	
	@BeforeTest
	public void initilize() throws IOException {
		log.info("Driver is initilized ");
		driver=initilizeDriver();
		driver.get(prop.getProperty("url"));
		log.info("Navigated to home");

		
	}

	@Test

	public void basePageNavigation() throws IOException {
		
		LandingPage l= new LandingPage(driver);
		
		Assert.assertEquals(l.getTitle().getText(),"FEATURED COURSES123");
		log.info("Successfull message");


	}
	@AfterTest
	public void tear() {
		driver.close();
	}
}
