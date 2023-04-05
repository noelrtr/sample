package org.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.format.CellFormatType;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class Excelread {

	public static void main(String[] args) throws IOException {
		
		//to mention the path of Excel file
		File file = new File("C:\\Users\\DELL\\Desktop\\Exceldata\\src\\test\\java\\Excel\\Testdata.xlsx");
		
		//to read each cell-->object-->Predefined class-->File inputstream
		FileInputStream fin = new FileInputStream(file);
		
		//to mention what type of excel file
		Workbook w = new XSSFWorkbook(fin);
		
		//to get the sheet
		Sheet sheet = w.getSheet("Data");
		
		//to get the row
		Row row = sheet.getRow(1);
		
		//to get the cell
		Cell cell = row.getCell(1);
		System.out.println(cell);
		
		//to know physically present row
		int numberOfRows = sheet.getPhysicalNumberOfRows();
		System.out.println(numberOfRows);
		
		//to know physically present cells
	    int numberOfCells = row.getPhysicalNumberOfCells();
	    System.out.println(numberOfCells);
	    
	    //to print single row data
	    Row row2 = sheet.getRow(2);
	    for (int i = 0; i < row2.getPhysicalNumberOfCells(); i++) {
	    	Cell cell2 = row.getCell(i);
	    	System.out.println(cell2);
	    
			
		}
	    //to print all the row data
	    for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
	    	Row row3 = sheet.getRow(i);
	    	for (int j = 0; j < row3.getPhysicalNumberOfCells(); j++) {
	    		Cell c = row3.getCell(j);
	    		
	    		int cellType = c.getCellType();
	    		
	    		
	    		if (cellType==1) {
	    			String stringCellValue = c.getStringCellValue();
	    			System.out.println(stringCellValue);
	    		}	
	    			if (cellType==0) {
	    				if (DateUtil.isCellDateFormatted(c)) {
	    					Date dateCellValue = c.getDateCellValue();
	    					SimpleDateFormat dateformat=new SimpleDateFormat("dd-MMM-yyyy");
	    					String format = dateformat.format(dateCellValue);
	    					System.out.println(format);
							
						}
	    				else {
							
	    				double numericCellValue = c.getNumericCellValue();
	    				long l =(long) numericCellValue;
	    				System.out.println(l);
	    				}
	    				
						
					}
					
				}
	    		
					
				}
	    		
	    		
			}
				
			
	    
			
		}
	    
			
		
	   
 	
			
		
	    
	    
	    	
			
		
	    
			
		
	     
			
		
	    	
	    	
			
		
	    
		
		

	


