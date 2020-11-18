package com.selenium.project;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoolgewithFirefix {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
//System.setProperty(webdriver.gecko.driver", "/Users/anbarasiannamalai/eclipse-workspace/MyFirstProject/Drivers/geckodriver");"
System.setProperty("webdriver.gecko.driver","/Users/anbarasiannamalai/eclipse-workspace/Drivers/geckodriver");
WebDriver driver = new FirefoxDriver();
driver.get("https://google.com");
driver.findElement(By.name("q")).sendKeys("Hello" +Keys.ENTER);
//driver1.findElement(By.id("aa")).sendKeys(new String[]{"xx"});
	}
}
	