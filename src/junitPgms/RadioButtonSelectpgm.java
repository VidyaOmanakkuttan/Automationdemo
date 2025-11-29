package junitPgms;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonSelectpgm 
{
	ChromeDriver driver;

	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	}
	
	@Test
	public void check()
	{
		WebElement gender=driver.findElement(By.xpath("//input[contains(@value,'m')]"));
		if(gender.isSelected())
		{
			System.out.println("radio button is selected");
		}
	}
}
