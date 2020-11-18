package com.selenium.project;


import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Buttons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "/Users/anbarasiannamalai/eclipse-workspace/MyFirstProject/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Button.html");
		//get button position
		WebElement Positionbutton =driver.findElement(By.id("position"));
		Point xypoint = Positionbutton.getLocation();
		int xposition = xypoint.getX();
		int yposition = xypoint.getY();
		
		System.out.println("X position is"+ xposition);
		System.out.println("Y position is"+ yposition);
		//Get Button color
		WebElement btncolor = driver.findElement(By.id("color"));
	    String color =btncolor.getCssValue("background-color");
	    System.out.println(color);
	    //Get Button Size
	    WebElement btnsize =driver.findElement(By.id("Size"));
	    int BHieght = btnsize.getSize().getHeight();
	    int Bwidth = btnsize.getSize().getWidth();
	    
	    System.out.println("button height"+BHieght+"width is"+Bwidth);
	    
	    //Click on Home Button
	    
	    WebElement Homebutton = driver.findElement(By.id("home"));
	    Homebutton.click();
		
	}

}
