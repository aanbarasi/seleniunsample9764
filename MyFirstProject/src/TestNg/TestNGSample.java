package TestNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNGSample {
	
	@Test
	public void Method1()
	{
	System.setProperty("webdriver.chrome.driver", "/Users/anbarasiannamalai/eclipse-workspace/MyFirstProject/chromedriver");
	WebDriver driver = new ChromeDriver();
	//Methods 
	//driver.get("http://www.leafground.com");
	driver.navigate().to("http://www.amazon.com");
	}
}
