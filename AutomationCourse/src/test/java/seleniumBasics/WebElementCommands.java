package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WebElementCommands extends Base{
	
	public void verifyCommand() {
		
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement messagebox=driver.findElement(By.xpath("//input[@id='single-input-field']"));
		messagebox.sendKeys("Divya");
		WebElement showMessageBtn = driver.findElement(By.id("button-one"));
		System.out.println(showMessageBtn.isDisplayed());//isDisplayed verified here
		System.out.println(showMessageBtn.isEnabled());//isEnabled verified here
		showMessageBtn.click();	
		WebElement yourMsgTxt= driver.findElement(By.id("message-one"));
		System.out.println(yourMsgTxt.getText());
		System.out.println(showMessageBtn.getTagName());
		System.out.println(showMessageBtn.getCssValue("color"));
		messagebox.clear();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebElementCommands command= new WebElementCommands();
		command.intialiseBrowser();
		command.verifyCommand();

	}

}
