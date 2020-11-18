package com.selenium.project;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkboxexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/anbarasiannamalai/eclipse-workspace/MyFirstProject/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.seleniumeasy.com/test/basic-checkbox-demo.html");
		WebElement SingleCheckbox =driver.findElement(By.id("isAgeSelected"));
		System.out.println(SingleCheckbox.isSelected());
		SingleCheckbox.click();
		List<WebElement> Multiplecheckbox = driver.findElements(By.cssSelector("input.cb1-element"));
		for(int i=0; i <  Multiplecheckbox.size(); i++)
		{
			String Multicheck = Multiplecheckbox.get(i).getAttribute("value");
			if (Multicheck.equalsIgnoreCase("Option 3"))
					{
				Multiplecheckbox.get(i).click();
				break;
					}
			
			
		}
		
		
	}

}
