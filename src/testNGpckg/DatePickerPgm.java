package testNGpckg;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DatePickerPgm {
	
	ChromeDriver driver;
	
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Datepicker.html");
		driver.manage().window().maximize();
		
	}
	
	@Test
	public void datepick()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		// click the date pick icon
		driver.findElement(By.xpath("/html/body/section/div[1]/div/div/form/div[2]/div[2]/img")).click();
		datepickerMethod("December 2025","12");     //call method
	}

	public void datepickerMethod(String expmonth,String expdate) {
		
	while(true)
	{
		String month=driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div")).getText();
		if(month.equals(expmonth))     //if true stay on the page
		{
			break;
		}
		else                         //else check for next calendar page
		{
			driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[2]")).click();
		}
	}
	List<WebElement> dates=driver.findElements(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr/td/a"));
	for(WebElement d:dates)
	{
		String datetext=d.getText();        //extract the date text from the list
		if(datetext.equals(expdate))       //compare
		{
			d.click();
			break;
		}
	}
		
	}

}
