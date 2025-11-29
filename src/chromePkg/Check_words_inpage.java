package chromePkg;

import org.openqa.selenium.chrome.ChromeDriver;

public class Check_words_inpage {

	public static void main(String[] args)
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/search");
		String pagescr=driver.getPageSource();                //getting complete datas of current page
		if(pagescr.contains("Gmail"))
		{
			System.out.println("text present");
		}
		else
		{
			System.out.println("text not present");
		}
		driver.close();

	}

}
