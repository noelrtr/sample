package org.tcs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Date {
		static WebDriver driver;
		public static void browserlaunch(String url) {
			WebDriverManager.chromedriver().setup();
			
			WebDriver driver = new ChromeDriver();
			driver.get(url);
			driver.manage().window().maximize();
			
		}
		
		public static  void Findelementid(WebElement element,String id) {
			WebElement username = driver.findElement(By.id(id));
		}
		public static  void Findelementname(WebElement element,String name) {
			WebElement username = driver.findElement(By.name(name));
		}
		
		public static void Sendvalues(WebElement element,String data) {
			element.sendKeys(data);
	}
}

