package com.guru.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.guru.qa.testBase.TestBase;

public class LoginPage extends TestBase{
	
	Homepage homepage;

//pageFactory
	
	@FindBy(xpath = "//img[@role = 'presentation']")
	WebElement logo;
	
	@FindBy(xpath = "//a[contains(text(),'Demo Site')]")
	WebElement title;
	
	@FindBy(xpath = "//h2[@class='barone']")
	WebElement header;
	
	@FindBy(xpath="//input[@name='uid']")
	WebElement userID;
	
	@FindBy(xpath = "//input[@name='password']")
	WebElement passwd;
	
	@FindBy(xpath="//input[@name='btnLogin']")
	WebElement logIN;

//initializing page factory with driver	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}

//pageLibrary

	public boolean verifyLogo()
	{
		return logo.isDisplayed();
	}
	public String verifyTitle()
	{
		return driver.getTitle();
	}
	
	public boolean verifyHeader()
	{
		return header.isDisplayed();
	}
	
	public Homepage verifyLogIN(String usn, String pwd)
	{
		userID.sendKeys(usn);
		passwd.sendKeys(pwd);
		logIN.click();
		
		return new Homepage();
	}
	
	
}
