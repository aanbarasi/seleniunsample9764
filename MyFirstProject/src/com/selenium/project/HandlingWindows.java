package com.selenium.project;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/anbarasiannamalai/eclipse-workspace/MyFirstProject/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Window.html");
		String Oldwindow = driver.getWindowHandle();
		WebElement HomePage = driver.findElement(By.id("home"));
		HomePage.click();
		Set<String> mutlipleWindow =driver.getWindowHandles();
		for (String newwindow : mutlipleWindow) 
		{
			driver.switchTo().window(newwindow);
			
		}
	WebElement Editbtn = driver.findElement(By.xpath("//*[@id=\'post-153\']/div[2]/div/ul/li[1]/a/img"));
	Editbtn.click();
	
	
	}
	

}
