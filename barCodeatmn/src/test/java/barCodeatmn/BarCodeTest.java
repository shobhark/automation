package barCodeatmn;


import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.google.zxing.BinaryBitmap;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.common.HybridBinarizer;

public class BarCodeTest {
	
	WebDriver driver;
	@Test
	public void barCodeTest() throws IOException, Throwable
	{
		System.setProperty("webdriver.chrome.driver", "D:\\workspace\\orangeHRMapp\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		
		//driver.get("https://barcode.tec-it.com/");
		driver.get("https://barcode.tec-it.com/en/Code128?data=hi%20this%20is%20Shobha%20here");
		String barCodeURL = driver.findElement(By.tagName("img")).getAttribute("src");
		
		System.out.println(barCodeURL);
		
		URL url = new URL(barCodeURL);
		
		BufferedImage bfimg=ImageIO.read(url);
		
		BufferedImageLuminanceSource luminanceSource = new BufferedImageLuminanceSource(bfimg);
		BinaryBitmap binaryBitmap = new BinaryBitmap(new HybridBinarizer(luminanceSource));
		Result result = new MultiFormatReader().decode(binaryBitmap);
		
		System.out.println(result.getText());
	}

}
