package testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragAndDrop {
	
	WebDriver driver;
	
	@Test
	public void dragAnDrop()
	{
		
		System.setProperty("webdriver.chrome.driver", "D:\\workspace\\orangeHRMapp\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://jqueryui.com/droppable/");
		driver.switchTo().frame(0);
		WebElement srcElm = driver.findElement(By.xpath("//div[@class='ui-widget-content ui-draggable ui-draggable-handle']"));
		WebElement targetElm = driver.findElement(By.xpath("//div[@class='ui-widget-header ui-droppable']"));
		
		
		Actions action = new Actions(driver);
		action.clickAndHold(srcElm).moveToElement(targetElm).release().build().perform();
	}

}
