package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

	public WebDriver driver;
	 
	public LoginPage(WebDriver driver) {
		this.driver= driver;
	}
	By email = By.id("user_email");
	By pass = By.id("user_password");
	By submit = By.xpath("//input[@type='submit']");
	
	public WebElement getEmail() {
		return driver.findElement(email);
	}
	
	public WebElement getPass() {
		return driver.findElement(pass);
	}
	
	public WebElement submitButton() {
		return driver.findElement(submit);
	}
}
