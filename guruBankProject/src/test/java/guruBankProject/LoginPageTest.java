package guruBankProject;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.guru.qa.pages.Homepage;
import com.guru.qa.pages.LoginPage;
import com.guru.qa.testBase.TestBase;

public class LoginPageTest extends TestBase {
	LoginPage loginPage;
	Homepage homePage;
	
	public LoginPageTest()
	{
		super();
	}
	
	@BeforeMethod
	public void setUP()
	{
		initialization();
		loginPage = new LoginPage();
		homePage = new Homepage();
	}
	
	
	@Test(priority = 1)
	public void verifyLogoTest()
	{
		boolean flag = loginPage.verifyLogo();
		Assert.assertTrue(flag);
	}
	@Test(priority = 2)
	public void verifyTitle()
	{
		String title = loginPage.verifyTitle();
		Assert.assertEquals(title, "Guru99 Bank Home Page", "title is not matching");
		
	}
	
	@Test(priority = 3)
	public void verifyHeader()
	{
		Assert.assertTrue(loginPage.verifyHeader());
	}
	
	@Test(priority = 4)
	public void verifyLogIN()
	{
		homePage=loginPage.verifyLogIN(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@AfterMethod
	public void tearDOWN()
	{
		driver.quit();
	}
	
	
	
	
	
	
	
	
	
	
	

}
