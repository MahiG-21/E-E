package academy;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObject.LandingPage;
import pageObject.LoginPage;
import resourcs.BasePage;

public class HomePage extends BasePage  {
	 public WebDriver driver;
	public static Logger log = LogManager.getLogger(BasePage.class.getName());
			
	@BeforeTest
	public void initilize() throws IOException {
		driver=initilizeDriver();
	}

	@Test(dataProvider="getData")
	public void basePageNavigatin(String email,String pass) throws IOException {
		
		driver.get(prop.getProperty("url"));

	
	LandingPage lp = new LandingPage(driver);
	lp.getlogin().click();
	LoginPage lop = new LoginPage(driver);
	lop.getEmail().sendKeys("email");
	lop.getPass().sendKeys("pass");
	lop.submitButton().click();
	
	}
	@DataProvider
	public Object[][] getData() {
	Object [][] data = new Object[2][2];	

	data[0][0] ="abc@gmail.com";
	data[0][1] ="12345";
	data[1][0] ="abcde@gmail.com";
	data[1][1] ="35354";
		return data;
	}
	@AfterTest
	public void tear() {
		driver.close();
	}

	

}
