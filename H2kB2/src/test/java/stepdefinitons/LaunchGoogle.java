package stepdefinitons;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LaunchGoogle {
	
	WebDriver driver;
	@Given("^User is on the Hompage$")
	public void user_is_on_the_Hompage() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "/Users/anbarasiannamalai/eclipse-workspace/MyFirstProject/chromedriver");
		 driver = new ChromeDriver();
		driver.navigate().to("https://google.com/");
	    
	}

	@When("^The Search bar is displayed$")
	public void the_Search_bar_is_displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("q")).isDisplayed();
	    
	}

	@Then("^Enter Name$")
	public void enter_Name() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("q")).sendKeys("Hello" +Keys.ENTER);
	}
	

}
