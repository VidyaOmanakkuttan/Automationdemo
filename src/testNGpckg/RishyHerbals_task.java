package testNGpckg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class RishyHerbals_task
{
	ChromeDriver driver;


	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://rishiherbalindia.linker.store/");
		driver.manage().window().maximize();
	}
	
	@Parameters({"email","pass"})
	@Test
	public void parameterisation(String email,String pass) throws InterruptedException
	{
		WebElement acc=driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[1]/a/span"));
		
		acc.click();
		Thread.sleep(2000);
		WebElement reg=driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[1]/ul/li[4]/a"));
		reg.click();
		Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"ls-signup-overlay-v1\"]/div/div/div[2]/form/div[1]/input")).sendKeys(email);
	driver.findElement(By.xpath("//*[@id=\"ls-signup-overlay-v1\"]/div/div/div[2]/form/div[2]/input")).sendKeys(pass);
	driver.findElement(By.xpath("//*[@id=\"ls-signup-overlay-v1\"]/div/div/div[2]/form/div[3]/label/input")).click();
	driver.findElement(By.xpath("//*[@id=\"ls-signup-overlay-v1\"]/div/div/div[2]/form/button")).click();
	
		
		
	}
}
