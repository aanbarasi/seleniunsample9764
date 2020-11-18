package com.selenium.project;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class DropDown {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		//http://leafground.com/pages/Dropdown.html
		System.setProperty("webdriver.chrome.driver", "/Users/anbarasiannamalai/eclipse-workspace/MyFirstProject/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Dropdown.html");
		WebElement Dropdown1 = driver.findElement(By.id("dropdown1"));
		Select selectdrop = new Select(Dropdown1);
		selectdrop.selectByIndex(1);
		//Thread.sleep(3000);
		//selectdrop.selectByValue("4");
		//selectdrop.selectByVisibleText("Appium");
		List<WebElement> listoptions =selectdrop.getOptions();
		int size = listoptions.size();
		System.out.println("NUmber of list in the dropdown"+  size);
		Dropdown1.sendKeys("Loadrunner");
		
		WebElement mutlislectbox = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[6]/select"));
		Select multislect = new Select(mutlislectbox);
		multislect.selectByValue("1");
		multislect.selectByValue("2");
		

		//driver.quit();

	}
}
