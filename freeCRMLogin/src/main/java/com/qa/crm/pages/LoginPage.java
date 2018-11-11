package com.qa.crm.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.gargoylesoftware.htmlunit.WebWindow;
import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;
import com.qa.crm.base.TestBase;

public class LoginPage extends TestBase{
	
	HomePage homePage;
	
	//page factory-----OR(Object repository)
	
	@FindBy(name = "username")
	WebElement username;
	
	@FindBy(name = "password")
	WebElement password;
	
	@FindBy(xpath = "//input[@class='btn btn-small']")
	WebElement loginBtn;
	
	@FindBy(xpath = "(//img[contains(@class,'img-responsive')])[1]")
	WebElement crmLogo;
	
	@FindBy(xpath ="//ul[@class='nav navbar-nav navbar-right']//li[2]//a")
	WebElement signUp;
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
				
	}
	
	public String verifyPageTitle()
	{
		return driver.getTitle();
	}
	
	public boolean verifyICRMlogoImage()
	{
		return crmLogo.isDisplayed();
	}
	
	
	
	public HomePage logIN(String usn, String pwd)
	{
		username.sendKeys(usn);
		password.sendKeys(pwd);
		loginBtn.click();
		
		return new HomePage();
	}
}
