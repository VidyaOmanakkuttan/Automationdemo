package junitPgms;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class KeralaPropertyLogin_validation {
 
	ChromeDriver driver;
	
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://keralaproperty.in/");	
		
	}
	
	@Test
	public void login() throws Exception
	{
		driver.findElement(By.xpath("//a[@class=\"login\"]")).click();
		driver.findElement(By.xpath("//input[@id=\"ulogin\"]")).sendKeys("vidyaomanakuttan555@gmail.com");
		driver.findElement(By.xpath("//input[@id=\"upass\"]")).sendKeys("myself");
		driver.findElement(By.xpath("//input[@id=\"sub_logbtn\"]")).click();
		Thread.sleep(4000);
		String url=driver.getCurrentUrl();
		String loginurl="https://keralaproperty.in/member/myhome/";
		if(url.equals(loginurl))
		{
			System.out.println("successfully logged in");
		}
		else
		{
			System.out.println("error");
		}
		
		System.out.println("page title: "+driver.getTitle());
		WebElement logo=driver.findElement(By.xpath("/html/body/header/div[2]/div/a[1]/img"));
		if(logo.isDisplayed())
		{
			System.out.println("logo is displayed");
			
		}
		else
		{
			System.out.println("logo is not present");
		}
		
		WebElement drop=driver.findElement(By.xpath("//a[@class=\"dropdown-toggle\"]"));
		Select ob=new Select(drop);
		ob.selectByVisibleText("Ernakulam");
	}
	
}
