package com.selenium.project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IDlocator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		

		System.setProperty("webdriver.chrome.driver", "/Users/anbarasiannamalai/eclipse-workspace/MyFirstProject/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://amazon.com");
		//driver.findElement(By.id("email")).sendKeys("aanba.annamalai@gmail.com");
		//driver.findElement(By.className("nav-input")).click();
		//driver.findElement(By.className("nav-input")).sendKeys("toys",Keys.ENTER);
		//driver.findElement(By.linkText("Shop all costumes")).click();
		driver.findElement(By.partialLinkText("all costumes")).click();
		System.out.println(driver.findElement(By.cssSelector("h2")).getText());
}
}
