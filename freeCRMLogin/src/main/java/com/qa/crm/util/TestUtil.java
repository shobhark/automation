package com.qa.crm.util;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.qa.crm.base.TestBase;

public class TestUtil extends TestBase{
	
	public static long PAGE_LOAD_TIMEOUT = 40;
	public static long IMPLICITLY_WAIT = 40;

	public static void switchToFrame()
	{
		driver.switchTo().frame("mainpanel");
	}

	public static void mouseOver(WebElement elm)
	{
		Actions action = new Actions(driver);
		action.moveToElement(elm).build().perform();
		
	}

}

