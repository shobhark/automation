package bootStarp;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Driver;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.http.HttpConnection;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	
	public static void main(String[] args) throws MalformedURLException, IOException {
		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver", "D:\\workspace\\orangeHRMapp\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.freecrm.com/index.html");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		
		//find all broken links
		List<WebElement> linkslist= driver.findElements(By.tagName("a"));
		linkslist.addAll(driver.findElements(By.tagName("img")));
		
		System.out.println("total number of links available in webpage  "+linkslist.size());
		
		List<WebElement> activeLists = new ArrayList<WebElement>();
		
		for(int i=0;i<linkslist.size();i++)
		{
//			exclude all the links and images in which no href value or doen't have any href
			if(linkslist.get(i).getAttribute("href") != null)
			{
				activeLists.add(linkslist.get(i));
			}
		}
		System.out.println("size of active links and images  "+activeLists.size());
		
		System.out.println("no.of broken links or images are  " +(linkslist.size()-activeLists.size()));
		
		
//		check the url with HTTPconnection api
		for(int j=0;j<activeLists.size();j++)
		{
		HttpURLConnection connection = (HttpURLConnection) new URL(activeLists.get(j).getAttribute("href")).openConnection();
		connection.connect();
		String response = connection.getResponseMessage();
		connection.disconnect();
		System.out.println(activeLists.get(j).getAttribute("href") +"------------>"+response);
		}
		
	}

}
