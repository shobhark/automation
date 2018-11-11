package com.qa.crm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.crm.base.TestBase;
import com.qa.crm.util.TestUtil;

public class HomePage extends TestBase{
	
	
	//pageFactory or objectRepository
	@FindBy(xpath="//td[contains(text(),'User: Rani kasu')]")
	WebElement user;
	
	@FindBy(xpath="//td[contains(text(),'CRMPRO')]")
	WebElement crmLogo;
	
	@FindBy(xpath = "//a[contains(text(),'Contacts')]")
	WebElement contacts;
	
	@FindBy(xpath="//a[contains(text(),'New Contact')]")
	WebElement newContact;
	
	@FindBy(xpath="//a[@title = 'Companies']")
	WebElement company;
	
	@FindBy(xpath = "//a[@title='New Company']")
	WebElement newCompany;
	
	//	initialize page factory with driver
	
	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	//page library or actions on web elements	
	
	public String verifyTitle()
	{
		return driver.getTitle();
	}
	
	public boolean verifyUserLabe()
	{
		return user.isDisplayed();
	}
	
	public boolean verifyCrmLogo()
	{
		return crmLogo.isDisplayed();
	}
	
	public ContactsPage clickContacts()
	{
		TestUtil.mouseOver(contacts);
		newContact.click();
		
		return new ContactsPage();
				
	}
	
	public CompanyPage clickCompany()
	{
		TestUtil.mouseOver(company);
		newCompany.click();
		return new CompanyPage();
	}

}
