package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class JavaScriptExecutorSample extends Base {
	
	public void verifyJavaScript() {
		
driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		
		WebElement showMessageButton=driver.findElement(By.xpath("//button[@id='button-one']"));		
		JavascriptExecutor js = (JavascriptExecutor)driver;	//casting the control of driver
		js.executeScript("arguments[0].click();", showMessageButton);	//to execute an action and arguments[0].click()-->predefined method if normal click() is not worked
		
		
		js.executeScript("window.scrollBy(0,350)", ""); // window.scrollBy(0,350) --To scroll 350 pixels --->
		//If we give 2 ScrollBy , then it will add y axis value, so 350+350 =700 pixel will scroll down
		
		//scrollTo(0,350)- 350 will scroll from 0 to 350
		//scrollTo(0,500)-->(500-350=150 will scroll again (it will always consider from 0)
		//To scroll up , give -350--> scroll up 350 pixels from current position
		js.executeScript("window.scrollBy(0,-350)", ""); //To scroll up , give -350--> scroll up 350 pixels from current position
		//scrollBy(x-axis value, y-axis value);
	
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JavaScriptExecutorSample js = new JavaScriptExecutorSample();
		js.intialiseBrowser();
		js.verifyJavaScript();

	}

}
