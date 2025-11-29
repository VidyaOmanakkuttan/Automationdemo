package testNGpckg;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AmazonWindowHandle_task {
	
	ChromeDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
	}
	
	@Test
	public void mobiles() throws InterruptedException
	{
		driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("mobiles");
		driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
		String parentwindow=driver.getWindowHandle();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,650)", "");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@id=\"4ffb158d-996d-48a9-9c6d-1bd92bfe118f\"]/div/div/div/div/span/div/div/div/div[2]/div/div/div[1]/a/h2")).click();
		Set<String> newwindow=driver.getWindowHandles();
		
		for(String handle:newwindow)
		{
			if(!handle.equalsIgnoreCase(parentwindow))
			{
				driver.switchTo().window(handle);
				JavascriptExecutor jss=(JavascriptExecutor)driver;
				js.executeScript("window.scrollBy(0,250)", "");
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click();
				Thread.sleep(2000);
				driver.close();
				
			}
			driver.switchTo().window(parentwindow);
		}
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//*[@id=\"nav-cart-count-container\"]/span[2]")).click();
	}

}
