package com.hrm.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.hrm.qa.base.TestBase;
import com.hrm.qa.pages.HomePage;
import com.hrm.qa.pages.LoginPage;

import junit.framework.Assert;

public class LoginPageTest extends TestBase{
	
	LoginPage loginPage;
	HomePage homePage;
	
	
	public LoginPageTest()
	{
		super();
	}


	@BeforeMethod
	public void setUP()
	{
		intitialization();
		loginPage = new LoginPage();
	}
	
	@Test(priority = 1)
	public void verifyPageTitleTest()
	{
		String title = loginPage.verifyTitle();
		Assert.assertEquals(title, "OrangeHRM", "Title is not matching");
	}
	
	@Test(priority = 2)
	public void verifyImage()
	{
		boolean flag=loginPage.verifyImage();
		Assert.assertTrue(flag);
	}
	@Test(priority = 3)
	public void verifyLogin()
	{
		homePage=loginPage.logIN(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
}
