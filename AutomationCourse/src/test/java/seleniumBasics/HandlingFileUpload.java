package seleniumBasics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingFileUpload extends Base{
	
	public void verifyFileuploadusingSendkeys() {
		
		driver.navigate().to("https://demo.guru99.com/test/upload/");
		WebElement fileuploadBtn = driver.findElement(By.id("uploadfile_0"));
		fileuploadBtn.sendKeys("C:\\Users\\Admin\\git\\AutomationCourse\\AutomationCourse\\src\\test\\resources\\registration form.pdf");
		
		WebElement checkBoxTerms = driver.findElement(By.id("terms"));
		checkBoxTerms.click();
		
		WebElement submitBtn =driver.findElement(By.id("submitbutton"));
		submitBtn.click();
	}
	
	public void fileuploadUsingRobot() throws AWTException {
		
		driver.navigate().to("https://www.ilovepdf.com/pdf_to_word");
		WebElement pickFileBtn = driver.findElement(By.id("pickfiles"));
		pickFileBtn.click();
		
		StringSelection stringSelection = new StringSelection("C:\\Users\\Admin\\git\\AutomationCourse\\AutomationCourse\\src\\test\\resources\\registration form.pdf");	
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
		
		Robot r=new Robot();
		r.delay(2500);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HandlingFileUpload handlingFileupload =new HandlingFileUpload();
		handlingFileupload.intialiseBrowser();
		//handlingFileupload.verifyFileuploadusingSendkeys();
		try {
			handlingFileupload.fileuploadUsingRobot();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
