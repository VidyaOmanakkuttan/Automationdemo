package testNGpckg;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class File_uploadPgm {
ChromeDriver driver;

@BeforeTest
public void launch()
{
	driver=new ChromeDriver();
	driver.get("https://www.ilovepdf.com/word_to_pdf");
}

@Test
public void robo() throws InterruptedException, AWTException
{
	driver.findElement(By.xpath("//*[@id=\"pickfiles\"]/span")).click();
	Thread.sleep(1000);
	fileupload("C:\\Users\\User\\Documents\\3rd bsc internal.docx"); //creating a method fileupload to perform upload actions
driver.findElement(By.xpath("//*[@id=\"processTask\"]")).click();
}

private void fileupload(String filepath) throws AWTException {
	StringSelection str=new StringSelection(filepath);
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
