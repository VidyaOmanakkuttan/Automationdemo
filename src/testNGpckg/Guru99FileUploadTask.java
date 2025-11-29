package testNGpckg;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Guru99FileUploadTask
{
	ChromeDriver driver;

	@BeforeTest
	public void launch()
	{
		driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/upload/");
		driver.manage().window().maximize();
	}
	
	@Test
	public void upload() throws InterruptedException, AWTException
	{
		WebElement key=driver.findElement(By.xpath("//*[@id=\"uploadfile_0\"]"));
		Thread.sleep(1000);
		Actions act=new Actions(driver); 
		act.moveToElement(key).click();
		act.perform();
		fileUpload("C:\\Users\\User\\Documents\\3rd bsc internal.docx");   //calling method
		
		driver.findElement(By.xpath("//*[@id=\"terms\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"submitbutton\"]")).click();
	}

	private void fileUpload(String fileupload) throws AWTException
	{
		StringSelection str=new StringSelection(fileupload);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
		Robot robo=new Robot();
		robo.keyPress(KeyEvent.VK_CONTROL);
		robo.keyPress(KeyEvent.VK_V);
		robo.keyRelease(KeyEvent.VK_V);
		robo.keyRelease(KeyEvent.VK_CONTROL);
		
		robo.delay(2000);
	    robo.keyPress(KeyEvent.VK_ENTER);
	    robo.keyRelease(KeyEvent.VK_ENTER);
	    robo.delay(2000);
	}
}
