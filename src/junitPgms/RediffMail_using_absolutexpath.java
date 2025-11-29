package junitPgms;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class RediffMail_using_absolutexpath
{
ChromeDriver driver;

@Before
public void setup()
{
	driver=new ChromeDriver();
	driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
}

@Test
public void credentials()
{
	driver.findElement(By.xpath("html/body/div[2]/div[2]/form/div/div[3]/div/input")).sendKeys("vidya");
	driver.findElement(By.xpath("html/body/div[2]/div[2]/form/div/div[4]/input")).click();
	
}
	
	
}
