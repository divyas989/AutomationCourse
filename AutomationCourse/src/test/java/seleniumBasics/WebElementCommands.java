package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WebElementCommands extends Base{
	
	public void verifyCommand() {
		
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement messagebox=driver.findElement(By.xpath("//input[@id='single-input-field']"));
		messagebox.sendKeys("Divya");
		WebElement showMessageBtn = driver.findElement(By.id("button-one"));
		showMessageBtn.click();	
		WebElement yourMsgTxt= driver.findElement(By.id("message-one"));
		System.out.println(yourMsgTxt.getText());
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebElementCommands command= new WebElementCommands();
		command.intialiseBrowser();
		command.verifyCommand();

	}

}
