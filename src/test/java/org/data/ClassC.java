package org.data;


import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebElement;

public class ClassC  extends Baseclass{
	
		@Test
		public void tc_1() {
			System.out.println("classC tc_1");
		}
		
		@Test
		public void tc_2() {
			browserlaunch("https://www.instagram.com/");
			WebElement name = FindElementName("username");
		    name.sendKeys("hello");
			String attribute = name.getAttribute("value");
			
			Assert.assertFalse(attribute.equals("noel"));
			Assert.assertTrue(attribute.equals("hello"));
			
			Assert.assertEquals( "ClassC tc_2", "hello", attribute);
		
	}
		
		@Test
		public void tc_3() {
			System.out.println("classC tc_3");
		}
			@Test
			public void tc_4() {
				System.out.println("classC tc_4");
			}

}
