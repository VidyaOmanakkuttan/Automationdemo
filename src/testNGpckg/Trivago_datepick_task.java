package testNGpckg;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Trivago_datepick_task {
	ChromeDriver driver=new ChromeDriver();
	
	@BeforeTest
	public void launch()
	{
		driver.get("https://www.trivago.in/");
		driver.manage().window().maximize();
		
	
	}
	
	@Test
	public void datepick()
	{
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// click the date pick icon
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[2]/section[1]/div[2]/div/div/div/div/div/button[2]")).click();
		datepickerMethod("December 2025","12");     //call method
	}
	
	
	////time[@datetime="2025-12-12"]

	private void datepickerMethod(String expmonth, String expdate) {
		while(true)
		{
			String month=driver.findElement(By.xpath("//*[@id=\"overlay-root\"]/div/section/main/div/div/div/div[2]/div[2]/h3")).getText();
			System.out.println(month);
			if(month.equals(expmonth))     //if true stay on the page
			{
				WebElement dates=driver.findElement(By.xpath("time[@datetime=\"2025-12-12\"]"));
				dates.click();
				//break;
			}
			else                        
			{
				driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[2]/section[1]/div[2]/div/div/div/div/div[2]/div/div/div/div[1]/div/button[2]/span")).click();
			}
		}
		
//		WebElement dates=driver.findElement(By.xpath("time[@datetime=\"2025-12-12\"]"));
//		dates.click();
			
		
	}

}
