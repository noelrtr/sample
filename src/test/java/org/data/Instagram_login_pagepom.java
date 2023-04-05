package org.data;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Instagram_login_pagepom extends Baseclass {
	
	public Instagram_login_pagepom() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(name="username")
	private WebElement username;
	
	@FindBy(name="password")
	private WebElement password;

	public WebElement getUserName() {
		return username;
	}

	public WebElement getPassWord() {
		return password;
	}

}
