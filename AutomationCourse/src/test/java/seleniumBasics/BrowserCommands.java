package seleniumBasics;

public class BrowserCommands extends Base{
	
	public void verifyBrowserCommands(){
		
		String title = driver.getTitle();
		System.out.println(title);
		String url = driver.getCurrentUrl();
		System.out.println(url);
		String handleId = driver.getWindowHandle();
		System.out.println(handleId);
		String source = driver.getPageSource();
		System.out.println(source);
		
	}
	
	public void verifyNavigation() {
		
		driver.navigate().to("https://www.flipkart.com/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BrowserCommands browser = new BrowserCommands();
		browser.intialiseBrowser();
		//browser.verifyBrowserCommands();
		browser.verifyNavigation();
		

	}

}
