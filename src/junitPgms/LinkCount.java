package junitPgms;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkCount {
	ChromeDriver driver;
	
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}
	
	@Test
	public void links()
	{
		List<WebElement> li=driver.findElements(By.tagName("a"));
		int count=li.size();
	System.out.println("Number of links: "+count)	;
	
	
	for(WebElement element:li)
	{
		String link=element.getAttribute("href");              //fetching links in href attribute
		String linkname=element.getText();                     //fetching link text in that tagname
		System.out.println(link+"-------------->"+linkname);
		System.out.println();
	}
	}
	
	@After
	public void close()
	{
		driver.close();
	}
	

}
