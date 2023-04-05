package org.data;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebElement;

public class ClassA extends Baseclass{
	@BeforeClass
	public static void tc_1() {
		browserlaunch("https://facebook.com");
		System.out.println("classA tc_1 @Beforeclass");
		
	}
	@AfterClass
	public static void tc_2() {
		browserclose();
		System.out.println("classA tc_2 @Afterclass");
	}
	@Before
	public void tc_3() {
		long startingtime = System.currentTimeMillis();
		System.out.println(startingtime);
		System.out.println("classA tc_3 @Before");
		
	}
	@After
	public void tc_4() {
		long endingtime = System.currentTimeMillis();
		System.out.println(endingtime);
		System.out.println("classA tc_4 @After");
	}
	@Test
	public void tc_5() {
		WebElement username = FindelementID("email");
		Sendvalues(username, "noel");
		WebElement password = FindElementID("pass");
		sendvalues(password, "noel@123");
		System.out.println("classA tc_5 @Test");
	}
	

}
