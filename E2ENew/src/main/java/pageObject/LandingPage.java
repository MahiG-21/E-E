package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {

	public WebDriver driver;
	public LandingPage(WebDriver driver) {
		this.driver=driver;
	}
	
	By signIn=By.cssSelector("a[href*=sign_in]");
	
    By title= By.xpath("//div[@class='text-center']//h2");
    By naviga= By.cssSelector(".nav.navbar-nav.navbar-right>li>a");
    
	public WebElement getlogin() {
	return	driver.findElement(signIn);
		
	}
	
	public WebElement getTitle() {
		return	driver.findElement(title);
			
		}
	public WebElement geNavigation() {
		return	driver.findElement(naviga);
			
		}
	
}
