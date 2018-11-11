package com.qa.amazon.utility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.amazon.qa.base.TestBase;

public class TestUtil extends TestBase{
	
	public static long PAGE_LOAD_TIME = 30;
	public static long IMPLICITLY_WAIT = 30;
	
	public static void mouseOver(WebElement elm)
	{
		Actions action = new Actions(driver);
		action.moveToElement(elm).build().perform();
		}

}
