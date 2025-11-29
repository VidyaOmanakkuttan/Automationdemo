package testNGpckg;

import java.net.HttpURLConnection;
import java.net.URI;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Santamonica_responsecode {
	ChromeDriver driver;
	@BeforeTest

	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://santamonicaedu.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
	}
	
	@Test
	public void links() throws Exception 
	{
		String link = "https://santamonicaedu.in/";
		
		driver.findElement(By.xpath("//*[@id=\"launchevent\"]/div/div/div[1]/button/span")).click();
		
		List<WebElement> li=driver.findElements(By.tagName("a"));
		int count=li.size();          //total number of links
		System.out.println("Total links: "+count);
		for(WebElement element:li)
		{
			
			String linklist=element.getAttribute("href");       //fetching links in href attribute
			verifylink(linklist);    //creating a method to perform response code check in those links
		}}


	public void verifylink(String linklist) throws Exception 
	{
		URI ob=new URI(linklist);     //add throws
	HttpURLConnection con=(HttpURLConnection)ob.toURL().openConnection();   //import
	int responsecode=con.getResponseCode();	
	if(responsecode==200)
	{
		
		System.out.println(linklist+"-------->link is successfull link");
		
	}
	
	else if(responsecode==404)
	{
		
		System.out.println(linklist+"--------->link is a broken link");
		
	}
	else
	{
		
		System.out.println(linklist+"--------->Other links");
	
	}	
	}}
//@AfterTest
//public void close()
//{
//	driver.close();
//}}
