package testNGpckg;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ScreenShotpgm {

	ChromeDriver driver;

	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("file:///D:/LUMINAR/selenium/alert%20handling.html");
		driver.manage().window().maximize();
	}
	@Test
	public void screenschot() throws IOException
	{
	File c=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileHandler.copy(c,new File ("D:\\LUMINAR\\selenium\\screenshot.png"));
		
		WebElement button=driver.findElement(By.xpath("/html/body/input[1]"));
		File buttonimg=button.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(buttonimg, new File("./screenshots/buttonimg.png") );
	}
}
