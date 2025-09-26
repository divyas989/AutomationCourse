package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import automationCore.TestNGBase;

public class LoginTest extends TestNGBase{
	
	@Test
	public void verifyWheterUserisAbleToLoginWithValidCredentials() {
		
		WebElement username=driver.findElement(By.id("user-name"));
		username.sendKeys("standard_user");
		WebElement paswrd=driver.findElement(By.id("password"));
		paswrd.sendKeys("secret_sauce");
		WebElement loginbtn=driver.findElement(By.id("login-button"));
		loginbtn.click();
	}
	
	@Test
	
	public void verifyWhetherUserisAbleToLoginWithValidUsernameInvalidPaswrd() {
		
		WebElement username=driver.findElement(By.id("user-name"));
		username.sendKeys("standard_user");
		WebElement paswrd=driver.findElement(By.id("password"));
		paswrd.sendKeys("InvalidPaswrd");
		WebElement loginbtn=driver.findElement(By.id("login-button"));
		loginbtn.click();
		
	}
	
     @Test
	
	public void verifyWhetherUserisAbleToLoginWithInvalidUsernameValidPaswrd() {
		
		WebElement username=driver.findElement(By.id("user-name"));
		username.sendKeys("Invalid_User");
		WebElement paswrd=driver.findElement(By.id("password"));
		paswrd.sendKeys("secret_sauce");
		WebElement loginbtn=driver.findElement(By.id("login-button"));
		loginbtn.click();
     }
     
     @Test
     public void verifyWheteherUserisAbleToLoginWithInvalidCredentials() {
    	 
    	WebElement username=driver.findElement(By.id("user-name"));
 		username.sendKeys("Invalid_User");
 		WebElement paswrd=driver.findElement(By.id("password"));
 		paswrd.sendKeys("InvalidPaswrd");
 		WebElement loginbtn=driver.findElement(By.id("login-button"));
 		loginbtn.click();
    	 
     }
}
