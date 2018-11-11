package com.qa.crm.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.crm.base.TestBase;
import com.qa.crm.pages.CompanyPage;
import com.qa.crm.pages.ContactsPage;
import com.qa.crm.pages.HomePage;
import com.qa.crm.pages.LoginPage;
import com.qa.crm.util.TestUtil;

public class HomePageTest extends TestBase{
	LoginPage loginPage;
	HomePage homePage;
	ContactsPage contactsPage;
	TestUtil testUtil;
	CompanyPage companyPage;
	
	public HomePageTest()
	{
		super();
	}
	
	@BeforeMethod
	public void setUP()
	{
		initialization();
		loginPage = new LoginPage();
		homePage = new HomePage();
		contactsPage = new ContactsPage();
		testUtil = new TestUtil();
		companyPage = new CompanyPage();
		homePage = loginPage.logIN(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@Test(enabled = false)
	public void verifyPageTitleTest()
	{
		String title = homePage.verifyTitle();
		Assert.assertEquals(title, "CRMPRO", "HomePage Title is not matching");
	}
	
	@Test(enabled = false)
	public void verifyUserlableTest()
	{
		TestUtil.switchToFrame();
		boolean flag = homePage.verifyUserLabe();
		Assert.assertTrue(flag);
	}
	
	@Test(enabled = false)
	public void verifyHomePageImgTest()
	{
		TestUtil.switchToFrame();
		boolean flag = homePage.verifyCrmLogo();	
		Assert.assertTrue(flag);
	}
	
	@Test(priority = 1)
	public void clickOnNewContactTest()
	{
		TestUtil.switchToFrame();
		contactsPage=homePage.clickContacts();
	}
	
	@Test(priority = 2)
	public void clickOnCompany()
	{
		TestUtil.switchToFrame();
		companyPage=homePage.clickCompany();
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}

}
