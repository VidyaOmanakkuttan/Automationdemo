package junitPgms;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathPgmFacebook 
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
		driver.findElement(By.xpath("html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[1]/input")).sendKeys("vidyaomanakuttan555@gmail.com");
		driver.findElement(By.xpath("html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[2]/div/input")).sendKeys("advfgtr");
		driver.findElement(By.name("login")).click();
	}
}
