package junitPgms;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FBLoginDemo
{

	ChromeDriver driver;
	
	
	@Before
	public void load()
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
	}
	
	
	@Test
	public void credentials()
	{
		driver.findElement(By.id("email")).sendKeys("vidyaomanakuttan555@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("advfgtr");
		driver.findElement(By.name("login")).click();
	}
}
