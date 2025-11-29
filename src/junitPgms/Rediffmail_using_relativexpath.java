package junitPgms;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rediffmail_using_relativexpath
{
ChromeDriver driver;

@Before
public void load()
{
	driver=new ChromeDriver();
	driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	driver.manage().window().maximize();
}

@Test
public void startTest()
{
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("vidya rakesh");
	
	// xpath using contains to resolve changing locator values
	
	driver.findElement(By.xpath("//input[contains(@name,'login')]")).sendKeys("vidya22");
	driver.findElement(By.xpath("//input[contains(@name,'btnchkavail')]")).click();
}




}
