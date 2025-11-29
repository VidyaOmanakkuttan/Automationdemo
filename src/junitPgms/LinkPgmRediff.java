package junitPgms;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkPgmRediff {
ChromeDriver driver;
	
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	}
	
	
	@Test
	public void test()
	{
		WebElement button=driver.findElement(By.xpath("/html/body/div[2]/div[2]/form/div/div[4]/input"));
		
		System.out.println(button.getAttribute("value"));  // text is inside the attribute 'value'
		
	}
}
