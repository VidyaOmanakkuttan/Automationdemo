package junitPgms;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Responsecodepgm_facebook
{
	ChromeDriver driver;
	@Before

	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}
	
	@Test
	public void links() throws Exception
	{
		List<WebElement> li=driver.findElements(By.tagName("a"));
		int count=li.size();          //total number of links
		for(WebElement element:li)
		{
			String link=element.getAttribute("href");       //fetching links in href attribute
			verifylink(link);              //creating a method to perform response code check in those links
		}
			
		}

	private void verifylink(String link) throws Exception 
	{
		URI ob=new URI(link);     //add throws
	HttpURLConnection con=(HttpURLConnection)ob.toURL().openConnection();   //import
	int responsecode=con.getResponseCode();
	
	
	if(responsecode==200)
	{
		System.out.println(link+"-------->link is successfull link");
	}
	else if(responsecode==404)
	{
		System.out.println(link+"--------->link is a broken link");
	}
	else
	{
		System.out.println(link+"--------->Other links");
	}
		
	}
		
	
	}
