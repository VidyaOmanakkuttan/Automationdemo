package junitPgms;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeralaPropertySite
{

	ChromeDriver driver;
	
	
	@Before
	public void load()
	{
		driver=new ChromeDriver();
		driver.get("https://keralaproperty.in/member/login/");
		driver.manage().window().maximize();
	}
	
	@Test
	public void log()
	{
		driver.findElement(By.id("ulogin")).sendKeys("vidya@gmail.com");
		driver.findElement(By.id("upass")).sendKeys("abdc");
		driver.findElement(By.id("sub_logbtn")).click();
	}
	
	@After
	public void close()
	{
		
	}
	
	
}
