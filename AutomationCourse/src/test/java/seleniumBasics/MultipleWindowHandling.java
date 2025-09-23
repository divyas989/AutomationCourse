package seleniumBasics;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MultipleWindowHandling extends Base {
	
	public void VerifyWindowHandling() {
		
		driver.navigate().to("https://demo.guru99.com/popup.php");
		
		String parentId=driver.getWindowHandle();
		System.out.println(parentId);
		WebElement clickHere = driver.findElement(By.xpath("//a[text()='Click Here']"));
		clickHere.click();
		
		Set<String> handleIds = driver.getWindowHandles();
		System.out.println(handleIds);
		Iterator<String> it = handleIds.iterator();
		while(it.hasNext()) {
			String currentId = it.next();
			if(!currentId.equals(parentId)) {
				
				driver.switchTo().window(currentId);
				
				WebElement email=driver.findElement(By.name("emailid"));
				email.sendKeys("abc@gmail.com");
				WebElement submitBtn = driver.findElement(By.name("btnLogin"));
				submitBtn.click();
			}
		}
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MultipleWindowHandling windowHandling = new MultipleWindowHandling();
		windowHandling.intialiseBrowser();
		windowHandling.VerifyWindowHandling();
		
		
	}

}
