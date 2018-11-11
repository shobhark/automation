package com.datadriven.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.excel.utility.Xls_Reader;

public class ParameteriseTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\library\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//enter url
		driver.get("https://scgi.half.ebay.com/ws/eBayISAPI.dll?RegisterEnterinfo&usage=29436&ru");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
	
//		//data driven means driving the test data from excel files or other files
//		//data driven is also called parameterization
		
		Xls_Reader reader = new Xls_Reader("D:\\workspace\\dataProvider\\src\\main\\java\\com\\testdata\\RegTestdata_halfeBay.xlsx");
		int rowcnt = reader.getRowCount("RegTestData");
		System.out.println(rowcnt);
		reader.addColumn("RegTestData", "Status");
		
		for(int rowNum = 2; rowNum<=rowcnt; rowNum++)
		{
			System.out.println("=======================");
		String firstname = reader.getCellData("RegTestData", "firstname", rowNum);
		System.out.println(firstname);
		String lastname = reader.getCellData("RegTestData", "lastname", rowNum);
		System.out.println(lastname);
		
		String address1 = reader.getCellData("RegTestData", "address1", rowNum);
		System.out.println(address1);
		
		String address2 = reader.getCellData("RegTestData", "address2", rowNum);
		System.out.println(address2);
		
		String city = reader.getCellData("RegTestData", "city", rowNum);
		System.out.println(city);
		
		String state = reader.getCellData("RegTestData", "state", rowNum);
		System.out.println(state);
		
		String zipcode = reader.getCellData("RegTestData", "zipcode", rowNum);
		System.out.println(zipcode);
		
		String emailadress = reader.getCellData("RegTestData", "emailadress", rowNum);
		System.out.println(emailadress);
		
	
		
		//filling the webpage registration form
		driver.findElement(By.xpath("//input[@id='firstname']")).clear();
		driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys(firstname);
		
		driver.findElement(By.xpath("//input[@id='lastname']")).clear();
		driver.findElement(By.xpath("//input[@id='lastname']")).sendKeys(lastname);
		
		driver.findElement(By.xpath("//input[@id='address1']")).clear();
		driver.findElement(By.xpath("//input[@id='address1']")).sendKeys(address1);
		
		driver.findElement(By.xpath("//input[@id='address2']")).clear();
		driver.findElement(By.xpath("//input[@id='address2']")).sendKeys(address2);
		
		driver.findElement(By.xpath("//input[@id='city']")).clear();
		driver.findElement(By.xpath("//input[@id='city']")).sendKeys(city);
		
		new Select(driver.findElement(By.xpath("//select[@id='state']"))).selectByVisibleText(state);
		
		driver.findElement(By.xpath("//input[@id='zip']")).clear();
		driver.findElement(By.xpath("//input[@id='zip']")).sendKeys(zipcode);
		
		driver.findElement(By.xpath("//input[@id='email']")).clear();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(emailadress);
		
		driver.findElement(By.xpath("//input[@id='retype_email']")).clear();
		driver.findElement(By.xpath("//input[@id='retype_email']")).sendKeys(emailadress);
		
		
		//write the data into the cell
		reader.setCellData("RegTestData", "Status", rowNum, "pass");
		
		}

	}

}
