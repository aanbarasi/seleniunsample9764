package com.selenium.project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "/Users/anbarasiannamalai/eclipse-workspace/MyFirstProject/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.nseindia.com/");
	String rowtext =driver.findElement(By.xpath("//*[@id='tab1_tableGainer']/table/tbody/tr[5]/td[3]")).getText();
		System.out.println(rowtext);
		//Retrieve the value by passing the Row and Column value
		int i=5,j=3;
		String rowval =driver.findElement(By.xpath("//*[@id='tab1_tableGainer']/table/tbody/tr["+(i)+"]/td["+(j)+"]")).getText();
		System.out.println(rowval);
	

}
}