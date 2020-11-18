package com.selenium.project;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserNavigation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "/Users/anbarasiannamalai/eclipse-workspace/MyFirstProject/chromedriver");
		WebDriver driver = new ChromeDriver();
		//Methods 
		//driver.get("http://www.leafground.com");
		driver.navigate().to("http://www.google.com"); 
		String title = driver.getTitle();
		driver.navigate().to("https://Amazon.com");
		//Navigates back to the previous uRL leafground.com
		driver.navigate().back();
		//Navigates back to the previous uRL Amazon.com
		driver.navigate().forward();
		//Below code refreshes the Browser
		driver.navigate().refresh();	
		System.out.println("*****************************************************************************");
		System.out.println("Browser title is: " +title);
		System.out.println(driver.getCurrentUrl());
		System.out.println("Intial Browser Size : "+driver.manage().window().getSize());
		// //Create object of Dimensions class
		Dimension Browsersize = new Dimension(400,600);
		//set the size of the browser
		driver.manage().window().setSize(Browsersize);
		System.out.println("Browser Size after setting new value : " +driver.manage().window().getSize());
		System.out.println("*****************************************************************************");
		//System.out.println(driver.getPageSource());

		//Driver.close closes the active browser
		driver.close();
		
	}

}
