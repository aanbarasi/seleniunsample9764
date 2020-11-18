package com.selenium.project;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "/Users/anbarasiannamalai/eclipse-workspace/MyFirstProject/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Alert.html");
		WebElement Alertbox = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[1]/div/div/button"));
		Alertbox.click();
		Alert alertpopup = driver.switchTo().alert();
		Thread.sleep(3000);
		alertpopup.accept();
		WebElement Confirmpopup = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/button"));
		Confirmpopup.click();
		Alert Confirmalert= driver.switchTo().alert();
		Thread.sleep(3000);
		System.out.println(Confirmalert.getText());
		Confirmalert.dismiss();
		WebElement Promptpopup = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/div/div/button"));
		Promptpopup.click();
		Alert PromptAlert = driver.switchTo().alert();
		Thread.sleep(3000);
		PromptAlert.sendKeys("Hello");
		Thread.sleep(10000);
		PromptAlert.accept();
	}

}
  