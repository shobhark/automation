package com.qa.crm.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.crm.base.TestBase;
import com.qa.crm.pages.ContactsPage;
import com.qa.crm.pages.HomePage;
import com.qa.crm.pages.LoginPage;
import com.qa.crm.util.TestUtil;

public class ContactsPageTest extends TestBase{
	LoginPage loginPage;
	HomePage homePage;
	ContactsPage contactsPage;
	TestUtil testUtil;
	public ContactsPageTest()
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
		homePage=loginPage.logIN(prop.getProperty("username"), prop.getProperty("password"));
		TestUtil.switchToFrame();
		contactsPage=homePage.clickContacts();
	
	}
	
	@Test(priority = 1)
	public void verifyContactsLabelTest()
	{
		Assert.assertTrue(contactsPage.verifyContactsLabel());
		
	}
	
	@Test(priority = 2)
	public void CreateNewContactsTest()
	{
		contactsPage.verifyNewContacts("Mr.", "Ektha", "Sharma", "Ebay");
	}
	
	@AfterMethod
	public void teatDown()
	{
		driver.quit();
	}

}
