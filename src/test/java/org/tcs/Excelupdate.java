package org.tcs;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelupdate {

	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\DELL\\Desktop\\Exceldata\\src\\test\\java\\Excel\\Testdata1.xlsx");
		
		FileInputStream fin = new FileInputStream(file);
		
		Workbook w = new XSSFWorkbook(fin);
		
		//to get the sheet
		Sheet sheet = w.getSheet("Update");
		
		//to get the row
		Row row = sheet.getRow(1);
		
		//to get the cell
		Cell cell = row.getCell(2);
		
		String cellValue = cell.getStringCellValue();
		if (cellValue.equals("Selenium")) {
			
			cell.setCellValue("Framework");
			
		}
		FileOutputStream outputstream = new FileOutputStream(file);
		
		w.write(outputstream);
		
		
		
		System.out.println("EXcel update completed");
		
		

	}

}
