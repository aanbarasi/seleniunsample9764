package com.selenium.project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "/Users/anbarasiannamalai/eclipse-workspace/MyFirstProject/chromedriver");
WebDriver driver= new ChromeDriver();
driver.navigate().to("http://www.leafground.com/pages/radio.html");
//Finding the Element with CSS selector tag.classname[attribute =value"]
WebElement Radiobtn = driver.findElement(By.cssSelector("input.myradio[value='1']"));
Radiobtn.click();
//WebElement Radiobtn2 =driver.findElement(arg0)//Have questions how to identify the element which has same name and different value.
		
	}

}
