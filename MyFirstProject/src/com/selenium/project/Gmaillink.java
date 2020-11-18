package com.selenium.project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmaillink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "/Users/anbarasiannamalai/eclipse-workspace/MyFirstProject/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://google.com/");
		String link1= driver.findElement(By.linkText("Gmail")).getAttribute("href");
		System.out.println(link1);
		driver.findElement(By.linkText("Gmail")).click();
	}

}
