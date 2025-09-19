package seleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingFrames extends Base{
	
	public void verifyFrames () {
		
		driver.navigate().to("https://demoqa.com/frames");
		List<WebElement> totalFrame = driver.findElements(By.tagName("frame1"));
		System.out.println(totalFrame.size());
		
		WebElement frame1 = driver.findElement(By.id("frame1"));
		driver.switchTo().frame(frame1);//to switch the driver control to a particular frame from entire page
		
		WebElement heading = driver.findElement(By.id("sampleHeading"));
		System.out.println(heading.getText());
		driver.switchTo().defaultContent();//bring back driver control to entire page
		
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HandlingFrames handlingFrame = new HandlingFrames();
		handlingFrame.intialiseBrowser();
		handlingFrame.verifyFrames();
		

	}

}
