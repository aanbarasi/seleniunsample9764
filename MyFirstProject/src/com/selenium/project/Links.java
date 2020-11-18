package com.selenium.project;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Links {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver","/Users/anbarasiannamalai/eclipse-workspace/Drivers/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.leafground.com/");
		driver.findElement(By.linkText("http://www.leafground.com/pages/Link.html"));
	}

}
