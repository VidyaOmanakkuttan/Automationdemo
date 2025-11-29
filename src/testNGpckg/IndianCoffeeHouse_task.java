package testNGpckg;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class IndianCoffeeHouse_task {
	ChromeDriver driver;
	
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.indiancoffeehouse.com/");
		driver.manage().window().maximize();
	}
	
	@Test
	public void coffeehouse() throws InterruptedException
	{
		WebElement logo=driver.findElement(By.xpath("/html/body/section[1]/div/div/div/div/a/img"));
		if(logo.isDisplayed())
		{
			System.out.println("Logo is present");
		}
		else
		{
			System.out.println("Logo is not present");
		}
		WebElement whoweare=driver.findElement(By.xpath("/html/body/section[1]/div/div/div/nav/ul/li[2]/a"));
		whoweare.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/section[1]/div/div/div/nav/ul/li[2]/ul/li[1]/a")).click();
		Thread.sleep(2000);
		System.out.println( "title of about us page: "+ driver.getTitle());
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,900)", "");
		driver.findElement(By.xpath("/html/body/footer/div/div/div[2]/a[7]/li")).click();
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("vidya");
		driver.findElement(By.xpath("//input[@placeholder='Phone']")).sendKeys("9048601303");
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("vidya@gmail.com");
		
	}
	
	@AfterTest
	public void close()
	{
		driver.close();
	}

}
