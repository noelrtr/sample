package org.data;

import org.junit.Ignore;
import org.junit.Test;

public class ClassB {
	@Test
	public void tc_1() {
		System.out.println("classB tc_1");
	}
	@Ignore
	@Test
	public void tc_2() {
		System.out.println("classB tc_2");
	
}
	@Ignore
	@Test
	public void tc_3() {
		System.out.println("classB tc_3");
	}
		@Test
		public void tc_4() {
			System.out.println("classB tc_4");
		}
		public void employeeloc() {
			System.out.println("OMR");
		}
}