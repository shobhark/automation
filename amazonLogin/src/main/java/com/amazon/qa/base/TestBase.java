package com.amazon.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.qa.amazon.utility.TestUtil;

public class TestBase {
	
	public Properties prop;
	public static WebDriver driver;
	
	public TestBase()
	{
		try{
		prop = new Properties();
		FileInputStream fip = new FileInputStream("D:/workspace/amazonLogin/src/main/java/com/amazon/qa/config/config.properties");
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
	
	public void initialization()
	{
		String browsername = prop.getProperty("browser");
			
		if(browsername.equals("chrome"))
		{
			
			System.setProperty("webdriver.chrome.driver", "D:/library/chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(browsername.equals("ie"))
		{
			System.setProperty("webdriver.ie.driver", "D:/library/IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
		
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIME, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICITLY_WAIT, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get(prop.getProperty("urll"));
		
	}
	
	

}
