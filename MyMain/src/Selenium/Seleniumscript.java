package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniumscript {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "/Users/anbarasiannamalai/eclipse-workspace/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
}
}