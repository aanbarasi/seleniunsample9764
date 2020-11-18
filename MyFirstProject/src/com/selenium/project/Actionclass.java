package com.selenium.project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "/Users/anbarasiannamalai/eclipse-workspace/MyFirstProject/chromedriver");
		WebDriver driver = new ChromeDriver();
		//Methods 
		//driver.get("http://www.leafground.com");
		driver.navigate().to("http://www.amazon.com"); 
		Actions action = new Actions(driver);
		WebElement Accountlink =driver.findElement(By.xpath("//*[@id='nav-link-accountList']"));
		//action.moveToElement(Accountlink).build().perform();
		WebElement recommendations=driver.findElement(By.xpath("//*[text()=‘Your Recommendations’]"));
		action.moveToElement(Accountlink).contextClick(recommendations).build().perform();
		
	}

}
	