package TestNg;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AllAnnotations {
	@Test(priority = 2)
	public void Method()
	{
		System.out.println("My First Method");
	}

	@Test(priority = 1)
	public void Method1()
	{
		System.out.println("My second Method");
	}
	
	@BeforeMethod
	public void BeforeMethod1()
	{
		System.out.println("My Before Method");
	}
	@AfterMethod
	public void AfterMethod1()
	{
		System.out.println("My After Method");
	}
	
	@BeforeClass
	
	public void Beforeclass()
	{
		System.out.println("Before  class");
	}
	
@AfterClass
	
	public void Afterclass()
	{
		System.out.println("After After class");
	}
}
