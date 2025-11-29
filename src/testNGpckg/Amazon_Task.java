package testNGpckg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Amazon_Task
{
ChromeDriver driver;


@BeforeTest
public void setup()
{
	driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
}

@Test
public void task()
{
	WebElement signin=driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]/a/span"));
	Actions act=new Actions(driver);
	act.moveToElement(signin);
	act.perform();
	WebElement account=driver.findElement(By.xpath("//*[@id=\"nav-al-your-account\"]/ul/li[1]/a/span"));
	account.click();
}
}
