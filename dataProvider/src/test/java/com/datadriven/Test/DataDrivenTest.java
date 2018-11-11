package com.datadriven.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.excel.utility.Xls_Reader;

public class DataDrivenTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//get data from excelfile
		Xls_Reader reader = new Xls_Reader("C:\\Users\\DELL\\Desktop\\RegTestdata_halfeBay.xlsx"); 
		String firstname = reader.getCellData("RegTestData", "firstname", 2);
		System.out.println(firstname);
		
		String lastname = reader.getCellData("RegTestData", "lastname", 2);
		System.out.println(lastname);
		
		String address1 = reader.getCellData("RegTestData", "address1", 2);
		System.out.println(address1);
		
		String address2 = reader.getCellData("RegTestData", "address2", 2);
		System.out.println(address2);
		
		String city = reader.getCellData("RegTestData", "city", 2);
		System.out.println(city);
		
		String state = reader.getCellData("RegTestData", "state", 2);
		System.out.println(state);
		
		String zipcode = reader.getCellData("RegTestData", "zipcode", 2);
		System.out.println(zipcode);
		
		String emailadress = reader.getCellData("RegTestData", "emailadress", 2);
		System.out.println(emailadress);
		
		System.setProperty("webdriver.chrome.driver", "D:\\library\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//enter url
		driver.get("https://scgi.half.ebay.com/ws/eBayISAPI.dll?RegisterEnterinfo&usage=29436&ru");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		
		//filling the webpage fprm
		driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys(firstname);
		driver.findElement(By.xpath("//input[@id='lastname']")).sendKeys(lastname);
		driver.findElement(By.xpath("//input[@id='address1']")).sendKeys(address1);
		driver.findElement(By.xpath("//input[@id='address2']")).sendKeys(address2);
		driver.findElement(By.xpath("//input[@id='city']")).sendKeys(city);
		new Select(driver.findElement(By.xpath("//select[@id='state']"))).selectByVisibleText(state);
		driver.findElement(By.xpath("//input[@id='zip']")).sendKeys(zipcode);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(emailadress);
		driver.findElement(By.xpath("//input[@id='retype_email']")).sendKeys(emailadress);
		
	

	}

}
