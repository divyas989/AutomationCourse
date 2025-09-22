package seleniumBasics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HandlingActions extends Base{
	
	public void verifyRighClick() {
		
		WebElement otherElm = driver.findElement(By.id("others"));
		Actions action =new Actions(driver);
		action.contextClick(otherElm).build().perform();
		}
	
	public void verifyMouseHover() {
		
		WebElement otherElm = driver.findElement(By.id("others"));
		Actions action =new Actions(driver);
		action.moveToElement(otherElm).build().perform();
		
		}
	
	public void verifyDragAndDrop() {
		
		driver.navigate().to("https://demoqa.com/droppable");
		WebElement dragMeElm = driver.findElement(By.id("draggable"));
		WebElement dropMeElm = driver.findElement(By.id("droppable"));
		Actions action =new Actions(driver);
		action.dragAndDrop(dragMeElm, dropMeElm).build().perform();
		
	}

	public void verifyKeyBoardAction() throws AWTException {
		
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_T);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_T);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HandlingActions handlingActions=new HandlingActions();
		handlingActions.intialiseBrowser();
		//handlingActions.verifyRighClick();
		//handlingActions.verifyMouseHover();
		//handlingActions.verifyDragAndDrop();
		try {
			handlingActions.verifyKeyBoardAction();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
