package com.selenium.project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragaandDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "/Users/anbarasiannamalai/eclipse-workspace/MyFirstProject/chromedriver");
		WebDriver driver = new ChromeDriver();
		//Methods 
		//driver.get("http://www.leafground.com");
		driver.navigate().to("https://demoqa.com/droppable");
		Actions action = new Actions(driver);
		WebElement draggable =driver.findElement(By.xpath("//*[@id='draggable']"));
		WebElement Droppable =driver.findElement(By.xpath("//*[@id='droppable']"));
		action.dragAndDrop(draggable, Droppable).build().perform();
		WebElement Accepttab = driver.findElement(By.id("droppableExample-tab-accept"));
		WebElement acceptable =driver.findElement(By.id("acceptable"));
		WebElement Notacceptable =driver.findElement(By.id("notAcceptable"));
		Accepttab.click();
		Thread.sleep(3000);
		//action.dragAndDrop(acceptable, Droppable).build().perform();
		//Thread.sleep(3000);
		action.dragAndDrop(Notacceptable, Droppable).build().perform();
	}
	

}
