package com.selenium.project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Textbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "/Users/anbarasiannamalai/eclipse-workspace/MyFirstProject/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Edit.html");
		WebElement Emailaddress =driver.findElement(By.id("email"));
		//Enter Email address
		Emailaddress.sendKeys("test@gamil.com");
		//appending Text
		WebElement AppendBox =driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/input"));
		AppendBox.sendKeys("Test");
		//driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/input")).sendKeys("Test");
		
		//Getting the value from the text box
		WebElement GetTextbox = driver.findElement(By.name("username"));
		String value = GetTextbox.getAttribute("value");
		System.out.println(value);
		//Clearing value on the Textbox
		WebElement ClearBox =driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[4]/div/div/input"));
		ClearBox.clear();
		//Checking if the Text box is enabled or Disabled
		WebElement ConfirmDisableText =driver.findElement(By.xpath("//*[@id='contentblock']/section/div[5]/div/div/input"));
		boolean text1 =ConfirmDisableText.isEnabled();
		System.out.println(text1);
	}

}
