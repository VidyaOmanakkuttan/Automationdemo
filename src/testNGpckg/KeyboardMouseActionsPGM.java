package testNGpckg;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class KeyboardMouseActionsPGM {
	ChromeDriver driver;
	
	@BeforeTest
	public void copypaste()
	{
		driver=new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	}
	
	@Test
	public void keyboardActions()
	{
		WebElement fullname=driver.findElement(By.xpath("//input[@type='text']"));
		fullname.sendKeys("vidya");
		WebElement id=driver.findElement(By.xpath("//input[contains(@name,'login')]"));
		Actions act=new Actions(driver);           //creating object for actions class and passing driver arguments
		
		act.keyDown(fullname,Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL);
		act.keyDown(fullname,Keys.CONTROL).sendKeys("C").keyUp(Keys.CONTROL);
		act.keyDown(id,Keys.CONTROL).sendKeys("V").keyUp(Keys.CONTROL);
		act.perform();
	}
	

}
