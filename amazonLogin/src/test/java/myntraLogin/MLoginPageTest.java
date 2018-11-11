package myntraLogin;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.amazon.qa.base.TestBase;

public class MLoginPageTest extends TestBase{
	
	MLoginPage mLoginPage;
	MhomePage mHomePage;
	
	public MLoginPageTest()
	{
		super();
	}

	@BeforeMethod
	public void setUP()
	{
		initialization();
		mLoginPage = new MLoginPage();
	}
	
	@Test(priority=1)
	public void verifyPageTitle()
	{
		String title = mLoginPage.verifyPageTitle();
		Assert.assertEquals(title, "Login", "Title is not matched");
	}
	@Test(priority=2)
	public void verifyLogo()
	{
		boolean flag = mLoginPage.verifymyntraLogo();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=3)
	public void verifyLogIn()
	{
		mHomePage=mLoginPage.verifymyntraLogIN(prop.getProperty("user"), prop.getProperty("passwd"));
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.quit();
	}
	
}
