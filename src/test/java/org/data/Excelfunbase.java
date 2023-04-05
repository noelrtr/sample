package org.data;

import java.io.IOException;

public class Excelfunbase {

	public static void main(String[] args) throws IOException {
		
		BaseExcelwrite b = new BaseExcelwrite();
		
		String updateexcel = b.updateexcel("C:\\Users\\DELL\\Desktop\\Exceldata\\src\\test\\java\\Excel\\Testdata.xlsx", "Data", 0, 0, "Siva", "java");
		

	}

}
