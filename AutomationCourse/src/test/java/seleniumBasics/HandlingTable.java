package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingTable extends Base{
	
	public void verifyTable() {
		
		driver.navigate().to("https://money.rediff.com/indices/nse");
		WebElement elementTable = driver.findElement(By.id("dataTable"));
		//System.out.println(elementTable.getText());
		WebElement row = driver.findElement(By.xpath("//table[@id='dataTable']/thead/tr[1]"));
		System.out.println(row.getText());
		
		WebElement firstRow= driver.findElement(By.xpath("//table[@id='dataTable']/tbody/tr[1]"));
		System.out.println(firstRow.getText());
	}
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HandlingTable handlingTable = new HandlingTable();
		handlingTable.intialiseBrowser();
		handlingTable.verifyTable();

	}

}
