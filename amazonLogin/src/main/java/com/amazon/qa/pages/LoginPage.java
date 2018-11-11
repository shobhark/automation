package com.amazon.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.qa.base.TestBase;
import com.qa.amazon.utility.TestUtil;

public class LoginPage extends TestBase{
	
		
	//page factory ie object Repository (OR)
	
	@FindBy(xpath = "//span[@class='nav-sprite nav-logo-base']")
	WebElement img;
	
	@FindBy(xpath = "//span[contains(text(),'Hello. Sign in')]")
	WebElement signIn;
	
	@FindBy(xpath = "//span[@class='nav-action-inner']")
	WebElement sigN;
	

	@FindBy(xpath = "//input[@id='ap_email']")
	WebElement user;
	
	@FindBy(xpath = "//input[@id='continue']")
	WebElement contn;
	
	@FindBy(xpath = "//input[@id='ap_password']")
	WebElement password;
	
	@FindBy(xpath = "//input[@id='signInSubmit']")
	WebElement lonIn;
	
	//initialize webelements with driver
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
//	page library or acitons on webelements or methods
	
	public String verifyPageTitle()
	{
		return driver.getTitle();
	}
	
	public boolean verifyImag()
	{
		return img.isDisplayed();
	}
	
	public HomePage verifyLogin(String usn, String passwd)
	{
		TestUtil.mouseOver(signIn);
		sigN.click();
		user.sendKeys(usn);
		contn.click();
		password.sendKeys(passwd);
		lonIn.click();
		
		return new HomePage();
	}
}
