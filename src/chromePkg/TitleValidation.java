package chromePkg;

import org.openqa.selenium.chrome.ChromeDriver;

public class TitleValidation {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/search");
		
		String actualTitle= driver.getTitle();
		String expTitle="Google";
		if (expTitle.equals(actualTitle))
		{
			System.out.println("Title case pass");
		}
		else
		{
			System.out.println("Title case failed");
		}
		driver.close();

	}

}
