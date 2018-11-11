package openBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class Chrome {
	WebDriver driver;

	@Test
	public void openBrowser()
	{
			
		System.setProperty("webdriver.chrome.driver", "D:\\library\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("http://selenium4testing.com/");
		
		driver.get("https://www.freecrm.com");
			
	}
	
}
