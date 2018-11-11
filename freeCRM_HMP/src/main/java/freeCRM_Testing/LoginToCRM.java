package freeCRM_Testing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginToCRM {

		WebDriver driver;
		String credentials;
		String credentialInfo;
		
		@BeforeMethod
		public void setUP()
		{
		System.setProperty("webdriver.chrome.driver", "D:/library/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.freecrm.com/");
		}
		
		@Test(priority=1)
		public void logInWithAdminTest()
		{
		String credentials = CRM_HashMap.getUserLoginInfo().get("admin");
		String [] credentialInfo = credentials.split("_");
		
		driver.findElement(By.name("username")).sendKeys(credentialInfo[0]);
		driver.findElement(By.name("password")).sendKeys(credentialInfo[1]);
		
		WebElement logInBtn=driver.findElement(By.xpath("//input[@type='submit']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		 js.executeScript("arguments[0].click();", logInBtn);
		 
		 driver.switchTo().frame("mainpanel");
		 driver.findElement(By.xpath("//a[contains(text(),'Calendar')]")).click();
		 
		 
		Select select = new Select(driver.findElement(By.xpath("//select[@name='slctMonth']")));
		select.selectByVisibleText(CRM_HashMap.monthMap().get(10));
		
		}
		
		@Test(priority=2)
		public void logInWithCustomer()
		{
			String credentials=CRM_HashMap.getUserLoginInfo().get("customer");
			String[] credentialInfo=credentials.split("_");
			
			driver.findElement(By.name("username")).sendKeys(credentialInfo[0]);
			driver.findElement(By.name("password")).sendKeys(credentialInfo[1]);
			
			WebElement logInBtn=driver.findElement(By.xpath("//input[@type='submit']"));
			JavascriptExecutor js = (JavascriptExecutor)driver;
			 js.executeScript("arguments[0].click();", logInBtn);
			 
			 driver.switchTo().frame("mainpanel");
			 driver.findElement(By.xpath("//a[contains(text(),'Calendar')]")).click();
			 
			 
			Select select = new Select(driver.findElement(By.xpath("//select[@name='slctMonth']")));
			select.selectByVisibleText(CRM_HashMap.monthMap().get(9));
		}
		
		@AfterMethod
		public void tearDown()
		{
			driver.quit();
		}
	}

	

