package testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScrollPage {
	
	
	WebDriver driver;
	@Test
	public void scrollDown() throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "D:\\workspace\\orangeHRMapp\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("http://jqueryui.com");
		
		Thread.sleep(5000);
		
		((JavascriptExecutor) driver).executeScript("scroll(0,800)");
		
		Thread.sleep(5000);
		
		((JavascriptExecutor) driver).executeScript("scroll(800,0)");
	
	}
	
	
	

}
