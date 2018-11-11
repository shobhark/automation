package com.qa.crm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.qa.crm.base.TestBase;

public class ContactsPage extends TestBase{
	
	//page factory or OR
	
	@FindBy(xpath = "//select[@name = 'title']")
	WebElement title;
	 
	@FindBy(xpath = "//input[@id ='first_name']")
	WebElement fname;
	
	
	@FindBy(xpath = "//input[@id ='surname']")
	WebElement lname;
	
	@FindBy(xpath = "//input[@name ='client_lookup']")
	WebElement company;
	
	@FindBy(xpath = "//legend[contains(text(),'Contact Information')]")
	WebElement contactinfolabl;
	
	@FindBy(xpath = "//input[@type='submit' and @value = 'Save']")
	WebElement save;
	
	
	//initialize pagefactory with driver
	
	public ContactsPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	//pagelibrary
	
	public boolean verifyContactsLabel()
	{
		return contactinfolabl.isDisplayed();
	}
	
	public String verifyTitle()
	{
		return driver.getTitle();
	}
	
	public void verifyNewContacts(String titl,String fnm, String lnm, String cmpny )
	{
		Select select = new Select(title);
		select.selectByVisibleText(titl);
		fname.sendKeys(fnm);
		lname.sendKeys(lnm);
		company.sendKeys(cmpny);
		save.click();
	}
	
}
