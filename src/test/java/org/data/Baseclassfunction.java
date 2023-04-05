package org.data;

import java.awt.AWTException;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;

public class Baseclassfunction {

	public static void main(String[] args) throws IOException, AWTException {
		
		Baseclass b = new Baseclass();
		//b.browserlaunch("http://www.traininginchennai.in/");
		
//		WebElement username = b.FindElementID("email");
//		WebElement password = b.FindElementID("pass");
//		WebElement click = b.FindElementName("login");
//		
//		b.Sendvalues(username, "Noel");
//		b.Sendvalues(password, "noel@123");
//		b.clickbutton(click);
		
		//Actions==========================
//		b.browserlaunch("http://greenstech.in/selenium-course-content.html");
//	   b.Findelementaction("//div[@title='Courses']");
//	   b.findelementaction2("//span[text()='Oracle (48)']");
//	    //get text=================
//	    WebElement textprint1 = b.textprint("//h1[@title='Selenium Training in Chennai']");	
//		String text = textprint1.getText();
//			System.out.println(text);
//		//Alert===============================
//			b.browserlaunch("https://www.google.com/");
//			b.Rightclick("//a[text()='Gmail']");
//			b.browserlaunch("https://demo.automationtesting.in/Alerts.html");
//			b.Windowalart("//button[@onclick='alertbox()']");
//			Thread.sleep(1000);
//			b.Confirmalert("(//a[@class='analystic'])[2]");
//			b.Confirmalarat2("//button[@onclick='confirmbox()']");
		//Dropdown===================================	
//			b.browserlaunch("https://demo.automationtesting.in/Register.html");
//			//b.Dropdown("Skills");
//			b.Dropdown1("Skills");
//			b.Dropdown2("Skills");
		//Checkbox==================================
//			WebElement findelementname2 = b.Findelementname2("checkbox1");
//			b.Btnclick(findelementname2);
	////  Basic sendkeys================================		
//			BaseClass b=new BaseClass();
//			b.browserlaunch("https://www.facebook.com/login/");
//			WebElement username = b.FindelementID("email");
//			WebElement password = b.Findelementname("pass");
//		    WebElement click = b.Findelementname("login");	
//			
//		b.sendvalues(username, "noel");
//		b.sendvalues(password, "noel@123");
//		b.Findelementclick(click);
		
		//Window Handling=======================================
	// b.browserlaunch("https://www.amazon.in/");
//		WebElement productname = b.WindowsHandling("twotabsearchtextbox");
//		b.Sendkeys1(productname, "oppo");
//		b.Search("nav-search-submit-button");
//		b.WindowsHandling1("(//span[contains(text(),'OPPO A31')])[1]");
//		WebElement windowHandle2 = b.WindowHandle2("add-to-cart-button");
//		windowHandle2.click();
//		
//		b.browserlaunch("https://www.amazon.in/");
//		//b.maximize();
//		
	b.browserlaunch("https://www.facebook.com/");
	b.javascriprtclick("login");
	
//		b.navigateback();
//		
//		b.browserlaunch("https://www.amazon.in/");
//		b.scrolldown("//h2[text()='Today’s Deals']");
//		
		//b.javascriprtsndkey(b.FindElementID("email"), "noel");
		
		//b.dragAndDropOptions(b.Findelementaction("//a[text()=' BANK ']"), b.FindelementID("bank"));
//		b.browserlaunch("https://www.amazon.in/");
//        b.screenshot("F:\\noel\\screenshot\\amazon.png");
//		
//	b.browserlaunch("https://netbanking.hdfcbank.com/netbanking/");
//	WebElement frame = b.Frame("//input[@name='fldLoginUserId']", "login_page");
//	b.sendvalue(frame,"anand" );
		
//		b.browserlaunch("https://demo.guru99.com/test/web-table-element.php");
//        
//       b.allrowdata("//table[@class='dataTable']", "tr", "td");
//	
		
		
		
		
		}

	

	}


