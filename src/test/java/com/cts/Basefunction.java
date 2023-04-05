package com.cts;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class Basefunction {

	public static void main(String[] args) throws IOException{
		
		Base b = new Base();
		b.browserlaunch("https://www.facebook.com/");
		
	
	String dataFromExcel = b.getDataFromExcel("C:\\Users\\DELL\\Desktop\\Exceldata\\src\\test\\java\\Excel\\Testdata.xlsx","Data",1,1);
		b.sendvalues(b.FindElementID("email"), dataFromExcel);
		b.sendvalues(b.FindElementID("pass"), "noel123");
	
		
	
		
		
		
		
		
		
		
		
		
		
		
		
        
		
		
	
		
	}

}
