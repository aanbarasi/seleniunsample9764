package com.selenium.project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "/Users/anbarasiannamalai/eclipse-workspace/MyFirstProject/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://twitter.com/");
		WebElement TwitterUsername = driver.findElement(By.name("session[username_or_email]"));
		TwitterUsername.sendKeys("fhdgfhd");
		WebElement TwitterPassword = driver.findElement(By.name("session[password]"));
		TwitterPassword.sendKeys("fhdgfhd");
		//driver.findElement(By.xpath("//span[contains(text(),'Log in'])[2]")
		//driver.findElement(By.xpath(	))
		//span[contains(text(),'The username')]
		WebElement Loginbutton =driver.findElement(By.xpath("(//span[contains(text(),'Log in')])[2]"));
		WebElement LoginError = driver.findElement(By.xpath("//span[contains(text(),'The username')]"));
		System.out.println("Login Error Messgae :"+LoginError);
		

	}

}
	