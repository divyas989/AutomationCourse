package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropDown extends Base {
	
	public void verifyDropdown() {
		driver.navigate().to("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		WebElement selectLang = driver.findElement(By.id("dropdowm-menu-1"));
		Select select = new Select(selectLang);
		//select.selectByIndex(1);
		//select.selectByValue("python");
		select.selectByVisibleText("SQL");
	}
	
	public void verifyCheckbox() {
		
		driver.navigate().to("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		WebElement checkOption = driver.findElement(By.xpath("//input[@value='option-1']"));
		checkOption.click();
		
	}
	
	public void verifyRadiobtn() {
		driver.navigate().to("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		WebElement radioBtn =driver.findElement(By.xpath("//input[@value='purple']"));
		radioBtn.click();
		System.out.println(radioBtn.isSelected()); //isSelected verified here
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HandlingDropDown handlingdropdown = new HandlingDropDown();
		handlingdropdown.intialiseBrowser();
		//handlingdropdown.verifyDropdown();
		//handlingdropdown.verifyCheckbox();
		handlingdropdown.verifyRadiobtn();
	}

}
