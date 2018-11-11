package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class RightClickOnLink {

WebDriver driver;
Actions action;

@Test
public void actions()
{
	System.setProperty("webdriver.chrome.driver", "D:\\workspace\\orangeHRMapp\\drivers\\chromedriver.exe");
	driver = new ChromeDriver();
	
	driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
	
	WebElement elm = driver.findElement(By.xpath("//span[contains(text(),'right click me')]"));
	
	
	
	action = new Actions(driver);
	
	action.contextClick(elm).build().perform();
	
	WebElement copy = driver.findElement(By.xpath("//ul[@class='context-menu-list context-menu-root']/li[3]/span"));
	String copyTxt = copy.getText();
	System.out.println(copyTxt);
	
	copy.click();
	driver.switchTo().alert().accept();
}

}

