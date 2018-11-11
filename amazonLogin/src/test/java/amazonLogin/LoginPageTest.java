package amazonLogin;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.amazon.qa.base.TestBase;
import com.amazon.qa.pages.HomePage;
import com.amazon.qa.pages.LoginPage;
import com.qa.amazon.utility.TestUtil;

import junit.framework.Assert;

public class LoginPageTest extends TestBase{
	
	LoginPage loginPage;
	TestUtil testUtil;
	HomePage homePage;
	
	
	
	public LoginPageTest()
	{
		super();
	}
	
	@BeforeMethod
	public void setUP()
	{
		initialization();
		loginPage = new LoginPage();
		homePage = new HomePage();
	}
	
	@Test(enabled = false)
	public void verifyTitleTest()
	{
		String title = loginPage.verifyPageTitle();
		Assert.assertEquals(title, "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in", "Title is not matching");
	}
	
	@Test(enabled = false)
	public void verifyImgTest()
	{
		Assert.assertTrue(loginPage.verifyImag());
	}
	
	@Test(priority=1)
	public void verifyLogINTest()
	{
		homePage=loginPage.verifyLogin(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
}
