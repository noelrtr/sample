package org.data;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class Facebook_login_pagepom extends Baseclass {
	
	public Facebook_login_pagepom() {
		PageFactory.initElements(driver, this);
	}
	@CacheLookup
	@FindBys({@FindBy(id="email"),@FindBy(xpath="//input[@id='email']")})
	private WebElement username;
	
	
	@FindAll({@FindBy(id="pass"),@FindBy(xpath="//input[@id='email']")})
	private WebElement password;

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	
	

}
