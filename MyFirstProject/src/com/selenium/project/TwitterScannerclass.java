package com.selenium.project;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TwitterScannerclass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "/Users/anbarasiannamalai/eclipse-workspace/MyFirstProject/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://twitter.com/login");
		Scanner obj = new Scanner(System.in);
		//Get Username from User
		System.out.println("Enter your Username:");
		String Username =obj.next();
		//Get Password  from User
		System.out.println("Enter your Password:");
		String Password =obj.next();
	
		WebElement TwitterUsename=driver.findElement(By.name("session[username_or_email]"));
		//Enter UserName given by the user
		TwitterUsename.sendKeys(Username);
		WebElement TwitterPassword =driver.findElement(By.name("session[password]"));
		//Enter Password given by the user
		TwitterPassword.sendKeys("Password");
		WebElement Loginbutton =driver.findElement(By.xpath("(//span[contains(text(),'Log in')])[2]"));
        //Click Login Button
		Loginbutton.click();
		Thread.sleep(4000);
		//Get the Error message from the Login Page
		String LoginError = driver.findElement(By.xpath("//span[contains(text(),'The username')]")).getText();
		System.out.println("Login Error Messgae :" +LoginError);
		driver.close();
		
	}

}
