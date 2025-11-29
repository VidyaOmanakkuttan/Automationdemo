package testNGpckg;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class datadriven2 
{
ChromeDriver driver;
	
	
	@BeforeTest
	public void launch() throws IOException
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		}
	
	@Test
	public void test() throws IOException
	{
		driver.get("https://www.facebook.com/");
		//locating and getting the excel file from pc
		FileInputStream file=new FileInputStream("C:\\Users\\User\\Desktop\\luminar task.xlsx");
		
		//fetching the workbook and sheet to be accessed 
		XSSFWorkbook wb=new XSSFWorkbook(file);
		XSSFSheet sht=wb.getSheet("Sheet1");
		int rowcount=sht.getLastRowNum();   //upto the row we use
		
		for(int i=1;i<=rowcount;i++)
		{
			String username=sht.getRow(i).getCell(0).getStringCellValue();
			System.out.println("username: "+username);
			String password=sht.getRow(i).getCell(1).getStringCellValue();
			System.out.println("password:  "+password);
			driver.findElement(By.name("email")).clear();
			driver.findElement(By.name("email")).sendKeys(username);
			driver.findElement(By.name("pass")).clear();
			driver.findElement(By.name("pass")).sendKeys(password);
			driver.findElement(By.name("login")).click();
			
			
			
		}
		
		
		
		
	}
}
