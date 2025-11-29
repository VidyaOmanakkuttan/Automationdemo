package chromePkg;

import org.openqa.selenium.chrome.ChromeDriver;

public class Basic_pgm {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();      //import chromedriver method
		driver.get("https://www.google.com/search");        //loading website
		driver.manage().window().maximize();          //maximize site
		//driver.close();        //close the window
		//driver.quit();         //close all sessions

	}

}
