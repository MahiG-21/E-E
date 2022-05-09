package resourcs;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasePage {
 public WebDriver driver;
 public Properties prop;
	public WebDriver initilizeDriver() throws IOException {
 prop = new Properties();
FileInputStream fis = new FileInputStream("C:\\Users\\mahim\\OneDrive\\Desktop\\New folder\\E2E\\src\\main\\java\\resourcs\\data.properties");
 prop.load(fis);
 String browserName=prop.getProperty("browser");
 if(browserName.equals("chrome")) {
 System.setProperty("webdriver.chrome.driver","C:\\Users\\mahim\\OneDrive\\Desktop\\ChromeDriver\\chromeDriver.exe");
  driver = new ChromeDriver();
 }
 
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
return driver;
 
	}
	public void getScreenShot(String testCaseName,WebDriver driver) throws IOException {
		TakesScreenshot ts=(TakesScreenshot)driver;
	File source	=ts.getScreenshotAs(OutputType.FILE);
	String destinationFile = System.getProperty("user.dir")+"\\reports\\"+testCaseName+".png";

	
		FileUtils.copyFile(source,new File(destinationFile));
	
	
	}
}
 