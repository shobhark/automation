package bootStarp;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class HandleBootStrap {

	
	public static void main(String[] args) {
	
	WebDriver driver;
	
	System.setProperty("webdriver.chrome.driver", "D:\\workspace\\orangeHRMapp\\drivers\\chromedriver.exe");
	driver = new ChromeDriver(); //launch the chrome browser
	
	driver.manage().window().maximize();    //to maximize window
	driver.manage().deleteAllCookies();   //delete all cookies  
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	
	driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");  //enter URL
	
	driver.findElement(By.xpath("//button[@class='multiselect dropdown-toggle btn btn-default']")).click();
	
	//driver.findElement(By.xpath("//ul[contains(@class,'multiselect-container dropdown-menu')]//li//a//label//input[@value='csharp']")).click();
	List<WebElement> lst= driver.findElements(By.xpath("//ul[contains(@class,'multiselect-container dropdown-menu')]//li//a//label"));
	
	for(int i =0;i<lst.size();i++)
	{
		System.out.println(lst.get(i).getText());
//		if(lst.get(i).getText().equals("Angular"))
//		{
			
		boolean flag=lst.get(i).isSelected();
		if(!flag)
		{
			lst.get(i).click();
		}
			
//		}
	}
	
	
	}

}
