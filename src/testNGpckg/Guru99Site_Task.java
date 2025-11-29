package testNGpckg;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Guru99Site_Task 
{
ChromeDriver driver;
	
	@BeforeTest
	public void copypaste()
	{
		driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
	}
	
	@Test
	public void task() throws Exception
	{
		driver.getPageSource();
		WebElement rightclick=driver.findElement(By.xpath("//*[@id=\"authentication\"]/span"));
		WebElement edit=driver.findElement(By.xpath("//*[@id=\"authentication\"]/ul/li[1]"));
		Actions act=new Actions(driver);
		act.contextClick(rightclick);
		act.perform();
		edit.click();
		Thread.sleep(3000);
		Alert a=driver.switchTo().alert();
		a.accept();
		Thread.sleep(3000);
		WebElement doubleclick=driver.findElement(By.xpath("//*[@id=\"authentication\"]/button"));
		act.doubleClick(doubleclick);
		act.perform();
		Thread.sleep(3000);
		String alerttext=a.getText();
		System.out.println(alerttext);
		//Alert b=driver.switchTo().alert();
		a.accept();
	}
}
