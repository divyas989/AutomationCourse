package seleniumBasics;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebElementCommands extends Base{
	
	public void verifyCommand() {
		
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement messagebox=driver.findElement(By.xpath("//input[@id='single-input-field']"));
		messagebox.sendKeys("Divya");
		WebElement showMessageBtn = driver.findElement(By.id("button-one"));
		System.out.println(showMessageBtn.isDisplayed());//isDisplayed verified here
		System.out.println(showMessageBtn.isEnabled());//isEnabled verified here
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(showMessageBtn));
		//Explicit wait command to wait for clickable
		
		Wait<WebDriver> fluentwait =new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(5)).pollingEvery(Duration.ofSeconds(1)).ignoring(NoSuchElementException.class);
		fluentwait.until(ExpectedConditions.elementToBeClickable(showMessageBtn));
		//Fluent wait command
		
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
