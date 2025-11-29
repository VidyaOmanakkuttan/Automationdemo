package junitPgms;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemo
{
	ChromeDriver driver;

	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("file:///C:/Users/User/Desktop/LUMINAR/selenium/alert%20handling.html");
	}
	@Test
	public void check() throws Exception
	{
		driver.findElement(By.xpath("/html/body/input[1]")).click();
		Alert a=driver.switchTo().alert();
		String alerttext=a.getText();
		System.out.println(alerttext);
		
	    Thread.sleep(3000);         // for delay
	    
		a.accept();    //to accept the pop up............a.dismiss() also used
		
		driver.findElement(By.xpath("/html/body/input[2]")).sendKeys("vidya");
		driver.findElement(By.xpath("/html/body/input[3]")).sendKeys("rakesh");
		driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
	}
}
