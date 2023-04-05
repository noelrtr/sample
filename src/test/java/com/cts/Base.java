package com.cts;




import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	WebDriver driver;
	public void browserlaunch(String url) {
		WebDriverManager.chromedriver().setup();
		
		 ChromeOptions ops =new ChromeOptions();
		 ops.addArguments("--remote-allow-origins=*");
		 driver=new ChromeDriver(ops);
		
		 
		 driver.get(url);
		 driver.manage().window().maximize();
	}
		 
		 
		  public WebElement FindElementID(String id) {
			 WebElement element = driver.findElement(By.id(id));
			return element;
			 
			 
		 }
		  public void sendvalues(WebElement element,String data) {
			  element.sendKeys(data);
		  
		

		  }
	public String getDataFromExcel(String pathName,String sheetname,int rowno,int cellno) throws IOException {
		String cellData=null;
		File file = new File(pathName);
		FileInputStream inputstream= new FileInputStream(file);
		Workbook w =new XSSFWorkbook(inputstream);
		Sheet sheet = w.getSheet(sheetname);
		Row row = sheet.getRow(rowno);
		Cell cell = row.getCell(cellno);
		
		int cellType = cell.getCellType();
		if (cellType==1) {
		   cellData = cell.getStringCellValue();
			
		}
		if (cellType==0) {
			if (DateUtil.isCellDateFormatted(cell)) {
				Date dateCellValue = cell.getDateCellValue();
				SimpleDateFormat dateformat= new SimpleDateFormat("dd-mmm-yyyy");
				 cellData = dateformat.format(dateCellValue);
				
				
			}
			else {
				double numericCellValue = cell.getNumericCellValue();
				long l =(long) numericCellValue;
				cellData = String.valueOf(l);
			}
			
		}
		return cellData;
		
	
		
	}
}