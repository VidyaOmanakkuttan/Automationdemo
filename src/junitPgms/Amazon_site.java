package junitPgms;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_site 
{

	ChromeDriver driver;
	
	@Before
	
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
	}
	
	@Test
	public void check()
	{
		
		driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[2]/div/form/div[2]/div[1]/input")).sendKeys("mobiles");
		driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[2]/div/form/div[3]/div/span/input")).click();
		driver.findElement(By.xpath("/html/body/div[1]/header/div/div[4]/div[2]/div[2]/div/ul/li[6]/div/a")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[3]/div[4]/div/div/div/div[2]/div/div/div/div/div[2]/div/ol/li[1]/div/div/a/div[1]")).click();
		//driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[5]/div[1]/div[4]/div/div[1]/div/div[1]/div/div/div[2]/div/div[2]/div/form/div/div/div[40]/div[1]/span/span/span/input")).click();
		
		
		
	}
	
}
