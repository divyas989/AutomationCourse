package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage{
	
	public WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(id="user-name")WebElement username;
	@FindBy(id="password")WebElement paswrd;
	@FindBy(id="login-button")WebElement loginbtn;
	
	
	public void enterUserNameOnUserNameField() {
		
		username.sendKeys("standard_user");
		
	}
	
	public void enterPasswordOnPasswordField() {
		
		paswrd.sendKeys("secret_sauce");
		
	}
	
	public void loginButtonClick() {
	loginbtn.click();
	}

	

}
