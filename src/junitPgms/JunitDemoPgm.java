package junitPgms;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class JunitDemoPgm
{
ChromeDriver driver;



@Before                                 //things to do before test
public void setup()
{
	driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	driver.manage().window().maximize();
	
}


@Test
public void testing()
{
System.out.println("test activities");
String actualtitle= driver.getTitle();                        //getting title to be checked and storing it to a variable
System.out.println("actual title is: "+actualtitle);

String expected="Google";               //expected title name for comparison
if(actualtitle.equalsIgnoreCase(expected))                              //testing title name
{
	System.out.println("Actual title is same as expected");
}
else
{
	System.out.println("Test Fails for title");
}
}


@After
public void aftertest()
{
	//driver.close();
}

}
