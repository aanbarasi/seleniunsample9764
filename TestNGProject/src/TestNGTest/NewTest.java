package TestNGTest;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest {
	
  @Test
  public void Mytest() {
	  System.out.println("At test");
  }
  @BeforeTest
  public void beforeTest() {
	 
	  System.out.println("Before test");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("After test");
  }

  
  @Test
  public void Mysecondtest() {
	  System.out.println("Second test");
  }
}
