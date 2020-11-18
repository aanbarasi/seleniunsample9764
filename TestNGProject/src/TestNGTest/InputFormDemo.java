package TestNGTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class InputFormDemo {

	WebDriver driver;
	
	 @BeforeTest
	  public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", "/Users/anbarasiannamalai/eclipse-workspace/MyFirstProject/chromedriver");
		 driver = new ChromeDriver();
	  }

	 @Test
	  public void Inputvalues1() {
	 }
	 
  @Test
  public void Inputvalues() {
	  
	//Navigate to the Input Form URL
		driver.navigate().to("https://www.seleniumeasy.com/test/input-form-demo.html");
		 System.out.println("Intial Browser Size : "+driver.manage().window().getSize());
			// //Create object of Dimensions class
			Dimension Browsersize = new Dimension(400,600);
			//set the size of the browser
			driver.manage().window().setSize(Browsersize);
			System.out.println("Browser Size after setting new value : " +driver.manage().window().getSize());
			//Find all the WebElements 
			WebElement FirstName = driver.findElement(By.xpath("//*[@name='first_name']"));
			WebElement LastName = driver.findElement(By.xpath("//*[@name='last_name']"));
			WebElement EmailAddress = driver.findElement(By.xpath("//*[@name='email']"));
			WebElement PhoneNumber =driver.findElement(By.xpath("//*[@name='phone']"));
			WebElement Address = driver.findElement(By.xpath("//*[@name='address']"));
			WebElement City = driver.findElement((By.xpath("//*[@name='city']")));
			WebElement State =driver.findElement(By.xpath("//*[@name='state']"));
			WebElement Zipcode =driver.findElement(By.xpath("//*[@name='zip']"));
			WebElement DomainName =driver.findElement(By.xpath("//*[@name='website']"));
			WebElement ProjectDescription =driver.findElement(By.xpath("//*[@name='comment']"));
			//Enter First Name
			FirstName.sendKeys("Anbarasi");
			//Enter Last Name
			LastName.sendKeys("Annamalai");
			//Enter Email Address
			EmailAddress.sendKeys("test123@gmail.com");
			//Enter Phone Number
			PhoneNumber.sendKeys("234-567-1000");
			//Enter Street Address
			Address.sendKeys("First Main Street");
			//Enter City
			City.sendKeys("Lansdale");
			//Select State
			Select Statedropdown = new Select(State);
			Statedropdown.selectByVisibleText("Pennsylvania");
			//Enter ZipCode
			Zipcode.sendKeys("19440");
			//Enter WebSite/Domain
			DomainName.sendKeys("dotcom");
			//Get the list of Radio Buttons and Store in List
			List<WebElement> HostingRadioBtn =driver.findElements(By.name("hosting"));
			
		   // finding the number of Radio buttons
	        for(int i=0; i <  HostingRadioBtn.size(); i++) // starts the loop from first Radio button to the last one
	       {
	        String Radioval = HostingRadioBtn.get(i).getAttribute("value");
	        // Radio button name stored to the string variable, using 'Value' attribute
	        	 if (Radioval.equalsIgnoreCase("Yes")) 
	        	 {
	        		// selecting the Radio button if its value is same as that we are looking for
	        		 HostingRadioBtn.get(i).click();
	        	 }
	       }
	        //Enter Project Description
	        ProjectDescription.sendKeys("Customer Details");
			
  }
  @BeforeMethod
  public void beforeMethod() {
	 
  }

  @AfterMethod
  public void afterMethod() {
  }

 
  @AfterTest
  public void afterTest() {
	  
	  driver.close();
  }

}
