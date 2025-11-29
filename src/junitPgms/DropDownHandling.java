package junitPgms;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownHandling
{
ChromeDriver driver;

@Before
public void initial()
{
	driver=new ChromeDriver();
	driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	driver.manage().window().maximize();
	
}


@Test

public void check()

{
	//locate day drop down and create object for select class
	WebElement day=driver.findElement(By.xpath("/html/body/div[2]/div[2]/form/div/div[8]/select[1]"));
	Select days=new Select(day);    // import and give argument value 'day' inside () to get all details of day drop down
	
	days.selectByValue("05");
	
	//locate month drop down and create object for select class
	WebElement month=driver.findElement(By.xpath("//*[contains(@name,'DOB_Month')]"));
	Select months=new Select(month);
	
	months.selectByValue("04");
	
	//locate year drop down and create object for select class
		WebElement year=driver.findElement(By.xpath("/html/body/div[2]/div[2]/form/div/div[8]/select[3]"));
		Select years=new Select(year);
		
		years.selectByVisibleText("2007");
	
	
	
	
	
}
}
