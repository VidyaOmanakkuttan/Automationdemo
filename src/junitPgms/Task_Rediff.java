package junitPgms;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task_Rediff 
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
		List<WebElement> li=driver.findElements(By.tagName("a"));
		int count=li.size();
		if(count==30)
		{
	System.out.println("Number of links are 30");	
		}
		else
		{
			System.out.println("Number of links are not equal to 30");		
		}
		
		WebElement text=driver.findElement(By.xpath("/html/body/div[2]/div[2]/form/div/div[1]/h2"));
		String s1=text.getText();
		String s2="create a rediffmail account";
		if(s1.equalsIgnoreCase(s2))
		{
			System.out.println(s1+"text is Present");
		}
		else
		{
			System.out.println("text is not Present");
		}
	
	
	
	}
}
