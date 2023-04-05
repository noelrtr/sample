package org.data;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public  class Baseclass {
	static WebDriver driver;
	//1
	public static void browserlaunch(String url) {
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions ops =new ChromeOptions();
		 ops.addArguments("--remote-allow-origins=*");
		 
		
		 driver= new ChromeDriver(ops);
		 driver.get(url);
		 driver.manage().window().maximize();
		
		
	}
	public static void browserclose() {
		
	}
	//2
	public static WebElement FindElementID(String id) {
		WebElement elementid = driver.findElement(By.id(id));
		return elementid;
		
	}
	//3
	public static void Sendvalues(WebElement element,String data) {
		element.sendKeys(data);
	}
	//4
   public static void clickbutton(WebElement element) {
	   element.click();
   }
   //5
   public static WebElement FindElementName(String name) {
		WebElement elementid = driver.findElement(By.name(name));
		return elementid;
   

}
 // 6 Actions==================================
 	public WebElement Findelementaction(String url) {
 		Actions action =new Actions(driver);
 		WebElement move = driver.findElement(By.xpath(url));
 		action.moveToElement(move).perform();
 	return move;
 	}
 	//26
 	public WebElement findelementaction2(String url) {
 		Actions action =new Actions(driver);
 		WebElement move2 = driver.findElement(By.xpath(url));
        action.moveToElement(move2).perform();
		return move2;
 	}
 	//7 drag and drop
 	public void dragAndDropOptions(WebElement source, WebElement destination) {

		Actions action = new Actions(driver);
		action.dragAndDrop(source, destination).perform();
	
 	}
 	//8 gettextmethod========
 	public WebElement textprint(String url) {
 		WebElement element = driver.findElement(By.xpath(url));
 		
		return element;
		
 		
 	}
 	//9
 	 public void contextclick(String url) {
 		Actions action=new Actions(driver);
 			  WebElement elementRclick = driver.findElement(By.xpath(url));
 	     action.contextClick(elementRclick).perform();
 	 }
 	// 10 Alert===
 	public WebElement simplealert(String url) {
 		WebElement element = driver.findElement(By.xpath(url));
 		element.click();
 		driver.switchTo().alert().accept();
		return element;
 	}
 	//11
 	public WebElement confirmalert(String url) {
 		WebElement element1 = driver.findElement(By.xpath(url));
 		element1.click();
		return element1;
 		
 	}
 	//12
 	public  WebElement Confirmalarat2(String url) {
		WebElement elementclick2 = driver.findElement(By.xpath(url));
       elementclick2.click();
       driver.switchTo().alert().accept();
       return elementclick2;
 	
 	}
 // 13 Dropdown_Selectbyindex========================
 	  public  WebElement Dropdown(String id,String value) {
 		WebElement selectskill = driver.findElement(By.id(id));
      Select select=new Select(selectskill);
      select.selectByIndex(4);
      return selectskill;
 	}
 	  //14 Dropdown_Selectbyvalue==============
 	  public WebElement Dropdown1(String id) {
 		WebElement selectskill1 = driver.findElement(By.id(id));
     Select select =new Select(selectskill1);
     select.selectByValue("Android");
 	return selectskill1;
 	  }
 	  //28
 	 public void deSelectAll(WebElement element) {
 		Select select = new Select(element);
 		select.deselectAll();
 	}
 	  //15 Dropdown_getOPtions================
 	  public  WebElement Dropdown2(String id) {
 		WebElement selecttext = driver.findElement(By.id(id));
        Select select =new Select(selecttext);
        List<WebElement> options = select.getOptions();	
 	  int size = options.size();
 	  System.out.println(size);
 	 
		
	
 	  return selecttext;
 	 	   
	}
 	 	  
 	  // 16 checkbutton=========================
 	  public void Btnclick(WebElement element) {
 		element.click();
 	}
 	  public WebElement Findelementname2(String id) {
 			WebElement elementname = driver.findElement(By.id(id));
 		return elementname;
 		}
 	  
 	//Basic Send keys passing into web page.==============
   public WebElement FindelementID(String id) {
 	WebElement elementid = driver.findElement(By.id(id));
     return elementid;
 }
   //25
 	public WebElement Findelementname(String name) {
 		WebElement elementname = driver.findElement(By.name(name));
 	return elementname;
 	}
 	public void Findelementclick(WebElement element) {
 		element.click();

 	}
 	public void sendvalues(WebElement element, String data) {
 		element.sendKeys(data);
 		}
 		//17 windows Handling============================
 		 public WebElement WindowsHandling(String id) {
 				WebElement elementid = driver.findElement(By.id(id));
 			    return elementid;
 		 }
 		public void Sendkeys1(WebElement element, String product) {
 		element.sendKeys(product);
 	   
 		}
 		//18
 		public void Search(String id, String name) {
 		WebElement enter = driver.findElement(By.id(id));
 	  enter.click();
 		}
 		//19
 		 public void WindowsHandling1(String id) {
 				WebElement findElement = driver.findElement(By.xpath(id));
 			    findElement.click();
 		 }
 		 //20
 		 public WebElement WindowHandle2(String id) {
 			String parent = driver.getWindowHandle();
 	        Set<String> allwindow = driver.getWindowHandles();
 		List<String> li=new ArrayList<String>();
 		li.addAll(allwindow);
 		 String child = li.get(1);
 		 driver.switchTo().window(child);
 		 WebElement Addcart = driver.findElement(By.id(id));
 		 return Addcart;
 		 }
 		 //21 maximize
 		 public void maximize() {
 			 driver.manage().window().maximize();
 		 }
 		 
 		 //22 navigate
 		 public void navigate(String url) {
 			 driver.navigate().to(url);
 			 
 		 }
 		 //23
 		 public void navigateback() {
 			 driver.navigate().back();
 		 }
 		 //24
 		 public void javascriprtsndkey(WebElement element,String txtname) {
 			 JavascriptExecutor executor= (JavascriptExecutor) driver;
 			 executor.executeScript("arguments[0].setAttribute('value', 'noel')",element);
				
 		 }
 		 //27
 		 public void scrollup(String xpath) {
 			 WebElement title = driver.findElement(By.xpath(xpath));
 			JavascriptExecutor executor= (JavascriptExecutor) driver;
 			executor.executeScript("arguments[0].scrollIntoView(true)",title);
			
 			 
 		 }
 		 //29
 		 public void scrolldown(String xpath) {
 			 WebElement title = driver.findElement(By.xpath(xpath));
  			JavascriptExecutor executor= (JavascriptExecutor) driver;
  			executor.executeScript("arguments[0].ScrollIntoView(false)",title);
 			
 		 }
 		 //30
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
 					java.util.Date dateCellValue = cell.getDateCellValue();
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
 		//31
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
 		//32

 		public String createDataFromExcel(String pathName, String sheet, int rowNo, int cellNo) throws IOException {
 				String cellData = null;
 				File file = new File(pathName);
 		
 				Workbook workbook = new XSSFWorkbook();
 				Sheet sheet1 = workbook.getSheet(sheet);
 		
 				Row row = sheet1.getRow(rowNo);
 		
 				Cell cell = row.getCell(cellNo);
 		
 				cell.setCellValue("String");
 		
 				FileOutputStream outputStream = new FileOutputStream(file);
 		
 				workbook.write(outputStream);
 		
 				System.out.println(cell);
 		
 				return cellData;
 			}
 		//34
 		public void screenshot(String destination) throws IOException {
 			
 			TakesScreenshot screenshot = (TakesScreenshot) driver;
 			File sourc= screenshot.getScreenshotAs(OutputType.FILE);
 			File dest = new File(destination);
 			FileUtils.copyFile(sourc, dest);
 		}
 		//35
 		public WebElement Frame(String xpath,String value) {
 			driver.switchTo().frame(value);
 			WebElement element = driver.findElement(By.xpath(xpath));
			return element;
 		}
 			public void sendvalue(WebElement element,String Data) {
 				element.sendKeys(Data);
 			}
 			//36
 			public void table(String xpath,String tagname) {
 				WebElement table = driver.findElement(By.xpath(xpath));
 				List<WebElement> row = table.findElements(By.tagName(tagname));
 				int size = row.size();
 				System.out.println(size);
 			}
 			//37
 			public void table1(String xpath,String tagname) {
 				WebElement table = driver.findElement(By.xpath(xpath));
 				List<WebElement> col = table.findElements(By.tagName(tagname));
 				int size = col.size();
 				System.out.println(size);
 			}
 			//38
 			public void table2(String xpath,String tagname) {
 				WebElement table = driver.findElement(By.xpath(xpath));
 				List<WebElement> data = table.findElements(By.tagName(tagname));
 				int size = data.size();
 				System.out.println(size);
 			}
 			//39
 			public void onerowdata(String xpath,String tagname,int value) {
 				WebElement table = driver.findElement(By.xpath(xpath));
 				List<WebElement> row = table.findElements(By.tagName(tagname));
 				WebElement element = row.get(value);
 				
 				System.out.println(element.getText());
 			}
 			//40
 			public void rowdata(String xpath,String tagname) {
 				WebElement table = driver.findElement(By.xpath(xpath));
 				List<WebElement> row = table.findElements(By.tagName(tagname));
 				for (int i = 0; i < row.size(); i++) {
 					System.out.println(row.get(i).getText());
					
				}
 				
					
				}
 			//41
 			public void data(String xpath,String tagname,int value,String tag2) {
 				WebElement table = driver.findElement(By.xpath(xpath));
 				List<WebElement> data = table.findElements(By.tagName(tagname));
 				WebElement row1 = data.get(value);
 				List<WebElement> row1data = row1.findElements(By.tagName(tag2));
 				for (int i = 0; i < row1data.size(); i++) {
 					WebElement element = row1data.get(i);
 					System.out.println(element.getText());
					
				}
 				
					
				}
 			
 			
 			//42
 			public void allrowdata(String xpath,String tagname,String tag) {
 				WebElement table = driver.findElement(By.xpath(xpath));
 				List<WebElement> row = table.findElements(By.tagName(tagname));
 				for (int i = 0; i < row.size(); i++) {
 					List<WebElement> finalrow = row.get(i).findElements(By.tagName(tag));
 				for (int j = 0; j < finalrow.size(); j++) {
 					WebElement element = finalrow.get(j);
 					System.out.println(element.getText());
					
				}
					
 				}
 			
 			 	
 			 	}
 				//44
 					  public void doubleclick(String id) {
 						  WebElement user = driver.findElement(By.id(id));
 						  user.sendKeys("noel");
 					 
 						  Actions action = new Actions(driver);
 						  action.doubleClick(user).perform();
 					  }
 					  //45
 					 public void deSelectbyindex(WebElement element) {
 				 		Select select = new Select(element);
 				 		select.deselectByIndex(0);
 					 }
 					 //43
 					public void deSelectbyvalue(WebElement element) {
 				 		Select select = new Select(element);
 				 		select.deselectByValue("Android");
 					}
 					//45
 					
 	 				public void pressReleaseKey(int vkShift) throws AWTException {
 	 					  
 	 					  Robot robot = new Robot();
 	 					  for (int i = 1; i <=3; i++) {
 	 						  robot.keyPress(KeyEvent.VK_TAB);
 	 						  robot.keyRelease(KeyEvent.VK_TAB);
 	 						  robot.keyPress(KeyEvent.VK_SHIFT);
 	 						  robot.keyPress(KeyEvent.VK_A);
 	 						  robot.keyRelease(KeyEvent.VK_A);
 	 						  robot.keyRelease(KeyEvent.VK_SHIFT);
 	 						  
 	 					  }		  
 	 				}
 	 			//46
 	 				public WebElement findElementByClassname(String AttributeValue) {
 	 					WebElement element = driver.findElement(By.className(AttributeValue));
 	 					return element;

 	 				
 	 				 }
 	 				 //47
 	 				 public int add(int a,int b) {
 	 					 int c = a+b;
 	 					 System.out.println(c);
						return c;
 	 				 }
 	 				 //48
 	 				public void isMultiple(WebElement element) {
 	 					Select select = new Select(element);
 	 					select.isMultiple();
 	 				}
 	 				//49
 	 				public void navigateRefresh() {
 	 					driver.navigate().refresh();
 	 				}
 	 				 	 				
 	 			//50
	 				 public void javascriprtclick(String name) {
	 					 WebElement login = driver.findElement(By.name(name));
	 				 
	 		 			 JavascriptExecutor executor= (JavascriptExecutor) driver;
	 		 			 executor.executeScript("arguments[0].click()",login);
	 		 		
	 						
}
 					  
 				
}					  
 			

 				
 				

 				
			
 				
 		
 		
 		
 	
		

 			
 			
 		
			
			
 			


 		

 		 
			
 			 
 			 
 		 
 		 
 	
 		 
 		
 		 
 		 

 		 
 		 
 		 
 		 
 	
 	
