package com.qa.crm.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.qa.crm.util.TestUtil;

public class TestBase {
	
	public static Properties prop;
	public static WebDriver driver;
	

	public TestBase()
	{
		try{
		prop = new Properties();
		FileInputStream fip = new FileInputStream("D:/workspace/freeCRMLogin/src/main/java/com/qa/crm/config/config.properties");
		prop.load(fip);
		}catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}catch(IOException e)
		{
			e.printStackTrace();
		}
	}
	
	public static void initialization()
	{
		String browsername =  prop.getProperty("browser");
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
		
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICITLY_WAIT, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
		
	}
	
	
}
