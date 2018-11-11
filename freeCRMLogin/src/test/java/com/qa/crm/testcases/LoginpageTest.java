package com.qa.crm.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.crm.base.TestBase;
import com.qa.crm.pages.HomePage;
import com.qa.crm.pages.LoginPage;

public class LoginpageTest extends TestBase{
	LoginPage loginPage;
	HomePage homepage;
	
	
	
	public LoginpageTest()
	{
		super();
	}
	
	@BeforeMethod
	public void setUP()
	{
		initialization();
		loginPage = new LoginPage();
		
	}
	
	@Test(enabled = false)
	public void validateTitleTest()
	{
		String title = loginPage.verifyPageTitle();
		Assert.assertEquals(title, "#1 Free CRM software in the cloud for sales and service", "title is not matching");
	}

	
	@Test(enabled = false)
	public void validataCRMImageTest()
	{
		boolean flag = loginPage.verifyICRMlogoImage();
		Assert.assertTrue(flag);
	}
	
	
	@Test(priority=3)
	public void crmLogINTest()
	{
		homepage = loginPage.logIN(prop.getProperty("username"), prop.getProperty("password"));
	}
	
		
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}

}
