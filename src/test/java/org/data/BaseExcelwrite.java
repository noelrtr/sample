package org.data;

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
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseExcelwrite {
	WebDriver driver;
	public void browserlaunch(String url) {
		WebDriverManager.chromedriver().setup();
		
		 ChromeOptions ops =new ChromeOptions();
		 ops.addArguments("--remote-allow-origins=*");
		 driver=new ChromeDriver(ops);
		
		 driver= new ChromeDriver();
		 driver.get(url);
		 driver.manage().window().maximize();
	}
	public String updateexcel(String pathName,String sheetname,int rowno,int cellno,String getvalue,String setvalue) throws IOException {
		File file = new File(pathName);
		FileInputStream input = new FileInputStream(file);
		Workbook w = new XSSFWorkbook(input);
		Sheet sheet = w.getSheet(sheetname);
		Row row = sheet.getRow(rowno);
		Cell cell = row.getCell(cellno);
		String cellValue = cell.getStringCellValue();
		if (cellValue.equals(getvalue)) {
			cell.setCellValue(setvalue);
			
		}
		FileOutputStream fin = new FileOutputStream(file);
		w.write(fin);
		System.out.println("completed");
		return cellValue;
	
		
	}

}
