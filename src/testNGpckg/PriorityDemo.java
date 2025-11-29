package testNGpckg;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PriorityDemo
{
	private static final String groups = null;

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
	
	@Test(priority=2)
	public void test1()
	{
		System.out.println("test 1");
	}
	@Test                             //by default this will be executed first as no priority is given
	public void test2()
	{
		System.out.println("test 2");
	}
	@Test(priority=0,groups="smoke")
	public void test3()
	{
		System.out.println("test 3");
	}
	@Test(priority=1)
	public void test4()
	{
		System.out.println("test 4");
	}
	@Test(groups={"smoke","sanity"})
	public void test5()
	{
		System.out.println("test 5");
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
