package org.data;

import org.openqa.selenium.WebElement;

public class Instagramloginpage extends Baseclass {
	
	public static void main(String[] args) throws InterruptedException {
		
		browserlaunch("https://www.instagram.com/");
		
		Instagram_login_pagepom a = new Instagram_login_pagepom();
		WebElement username = a.getUserName();
		username.sendKeys("hello");
		
		Thread.sleep(1000);
		WebElement password = a.getPassWord();
		password.sendKeys("hello@12");
		
		driver.navigate().refresh();
		Thread.sleep(1000);
		
		username.sendKeys("hii");
		
		
		
	}

}
