package com.hrm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrm.qa.base.TestBase;

public class LoginPage extends TestBase{
	
	//page factory
	
	@FindBy(xpath = "//div[@id='divLogo']/img")
	WebElement img;
	
	@FindBy(xpath ="//input[@id='txtUsername']")
	WebElement user;
	
	@FindBy(xpath = "//input[@id='txtPassword']")
	WebElement password;
	
	@FindBy(xpath = "//input[@id='btnLogin']")
	WebElement login;

	@FindBy(xpath = "//div[@id='content']/div/span")
	WebElement unpw;
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public String verifyTitle()
	{
		return driver.getTitle();
	}
	
	public boolean verifyImage()
	{
		return img.isDisplayed();
	}
	
	public HomePage logIN(String usn, String pwd)
	{
		user.sendKeys(usn);
		password.sendKeys(pwd);
		login.click();
		
		return new HomePage();
	}

}
