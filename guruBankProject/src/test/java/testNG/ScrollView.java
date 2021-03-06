package testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ScrollView {
	
	
	WebDriver driver;
	
	@Test
	public void scrollView() throws Throwable{
	
	System.setProperty("webdriver.chrome.driver", "D:\\workspace\\orangeHRMapp\\drivers\\chromedriver.exe");
	driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
//	driver.get("http://manos.malihu.gr/repository/custom-scrollbar/demo/examples/complete_examples.html");
//	
//	Thread.sleep(5000);
//	
//	JavascriptExecutor js = (JavascriptExecutor) driver;
//	
//	WebElement element = driver.findElement(By.xpath("(//div[@class='mCSB_container']/p[5])[3]"));
//	js.executeScript("arguments[0].scrollIntoView(true);", element);
//	
//	String text = element.getText();
//	System.out.println(text);
	
	driver.get("http://learn-automation.com");
	
	WebElement elem = driver.findElement(By.xpath("(//div[@class='fusion-post-content-container']/p[1])[9]"));
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
	
	js.executeScript("arguments[0].scrollIntoView(true);", elem);
	Thread.sleep(5000);
	Actions action = new Actions(driver);
	action.moveToElement(elem).click().build().perform();

	//elem.click();
	
	String text = elem.getText();
	System.out.println(text);
	

	
	
	
	}

}
