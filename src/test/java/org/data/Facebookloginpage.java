package org.data;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebookloginpage extends Baseclass {
	

	public static void main(String[]args) throws InterruptedException {
		browserlaunch("http:/www.facebook.com");
		
		Facebook_login_pagepom a = new Facebook_login_pagepom();
		WebElement username = a.getUsername();
		username.sendKeys("hello");
		username.clear();
		username.sendKeys("hello@123");
		
		long Starttime = System.currentTimeMillis();
		System.out.println("StartTime:"+ Starttime);
		
		for (int i = 0; i <100; i++) {
			a.getUsername().getText();
			
			
		}
		
		long Endtime = System.currentTimeMillis();
		System.out.println("endTime:"+ Endtime);
		
		System.out.println("Timediff:"+(Endtime-Starttime));
		
		WebElement password = a.getPassword();
		password.sendKeys("pass");
		password.clear();
		password.sendKeys("pass@123");
		
		long Starttime1 = System.currentTimeMillis();
		System.out.println("StartTime:"+ Starttime1);
		
		for (int i = 0; i <100; i++) {
			a.getPassword().getText();
			
		}
		long Endtime1 = System.currentTimeMillis();
		System.out.println("endTime:"+ Endtime1);
		
		System.out.println("Timediff:"+(Endtime1-Starttime1));
		
		
	}
}
