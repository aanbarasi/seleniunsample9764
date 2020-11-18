package com.selenium.project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "/Users/anbarasiannamalai/eclipse-workspace/MyFirstProject/chromedriver");
		WebDriver driver = new ChromeDriver();
		//Methods 
		//driver.get("http://www.leafground.com");
		driver.navigate().to("http://www.leafground.com"); 
		String title = driver.getTitle();
		System.out.println("Browser title is" +title);
		System.out.println(driver.getPageSource());
		System.out.println(driver.getCurrentUrl());
		driver.navigate().to("https://Amazon.com");
		//Navigates back to the previous uRL leafground.com
		driver.navigate().back();
		//Navigates back to the previous uRL Amazon.com
		driver.navigate().forward();
		//Below code refreshes the Browser
		driver.navigate().refresh();	
		//Driver.close closes the active browser
		//driver.close();
		driver.navigate().to("http://www.google.com"); 
		driver.findElement(By.xpath("//*[@name='q']")).sendKeys("Anbu");
	}

}
