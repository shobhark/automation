package myntraLogin;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.qa.base.TestBase;
//import com.amazon.qa.pages.HomePage;
import com.qa.amazon.utility.TestUtil;

public class MLoginPage extends TestBase{
	
	//pagefactory or webelements
	@FindBy(xpath = "//a[@class='myntraweb-sprite desktop-logo sprites-logo']")
	WebElement myntraLogo;
	
	@FindBy(xpath="//span[@class='myntraweb-sprite desktop-iconUser sprites-user']")
	WebElement user;
	
	@FindBy(xpath = "//a[contains(text(),'login')]")
	WebElement logIN;
	
	@FindBy(xpath = "//input[@name='email']")
	WebElement email;
	
	@FindBy(xpath = "//input[@name='password']")
	WebElement passwd;
	
	@FindBy(xpath = "//button[@class='login-login-button']")
	WebElement logIN1;
	
	//initializing webelements with driver
	
	public MLoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	//methods or actions on webelements
	
	public String verifyPageTitle()
	{
		return driver.getTitle();
	}
	
	public boolean verifymyntraLogo()
	{
		return myntraLogo.isDisplayed();
	}
	
	public MhomePage verifymyntraLogIN(String un, String pwd)
	{
		TestUtil.mouseOver(user);
		logIN.click();
		
		email.sendKeys(un);
		passwd.sendKeys(pwd);
		logIN1.click();
		
		return new MhomePage();
		
		
	}
	
}
