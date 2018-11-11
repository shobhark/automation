package com.hrm.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	
	
	public TestBase()
	{
		prop = new Properties();
		try{
		FileInputStream fip = new FileInputStream("D:\\workspace\\orangeHRMapp\\src\\main\\java\\config.properties");
		prop.load(fip);
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	
	}


	public void intitialization() {
		
		String browsername = prop.getProperty("browser");
		
		if(browsername.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "D:\\workspace\\orangeHRMapp\\drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(browsername.equals("ie"))
		{
			System.setProperty("webdriver.ie.driver", "D:\\workspace\\orangeHRMapp\\drivers\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
		
		else if(browsername.equals("firefox"))
		{
			System.setProperty("webdriver.chrome.driver", "D:\\workspace\\orangeHRMapp\\drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get(prop.getProperty("url"));
			
	}
	
	
	

}
