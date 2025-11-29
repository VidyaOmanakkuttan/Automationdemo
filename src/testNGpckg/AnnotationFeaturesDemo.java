package testNGpckg;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationFeaturesDemo
{
	@BeforeTest
	public void setup()
	{
		System.out.println("browser opening");
	}
	
	@BeforeMethod
	public void urlopen()
	{
		System.out.println("url loading");
	}
	
	@Test(priority=2,invocationCount=3)       //repeatsb the test for 3 times
	public void test1()
	{
		System.out.println("test 1");
	}
	@Test(groups="smoke")                             //by default this will be executed first as no priority is given
	public void test2()
	{
		System.out.println("test 2");
	}
	@Test(priority=0,enabled=false)    //test not executed unless given true
	public void test3()
	{
		System.out.println("test 3");
	}
	@Test(priority=1,groups= {"smoke","sanity"})
	//@Test(priority=1,dependsonmethod "test2")......>   test 4 only executes when test 2 is executed
	
	public void test4()
	{
		System.out.println("test 4");
	}
	
	@AfterMethod
	public void teardown()
	{
		System.out.println("report generation");
	}
	
	@AfterTest
	public void close()
	{
		System.out.println("browser closing");
	}
}
