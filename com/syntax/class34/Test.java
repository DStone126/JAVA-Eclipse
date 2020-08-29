package com.syntax.class34;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
	
	
	public class Test{ 
		
		public static String url = "http://166.62.36.207/humanresources/symfony/web/index.php/auth/login";
		 public static void main(String[] args) throws Throwable {
			 
				String employe = System.getProperty("user.dir") + "/testdata/Employee.xlsx";
				FileInputStream f = new FileInputStream(employe);
				
				Workbook workbook = new XSSFWorkbook(f);
				
				Sheet sheet = workbook.getSheet("Empl");
				
				
				List<Map<String, String>> ListE=new ArrayList<>();
				
				int rows = sheet.getPhysicalNumberOfRows();
				
				int cols = sheet.getRow(0).getPhysicalNumberOfCells();
				
				
				for(int r=1; r<rows; r++) {
				Map<String, String>maps=new LinkedHashMap<>();
					
				for(int c=0; c<cols; c++) {
						
						String key=sheet.getRow(r).getCell(0).toString();
					
						String value=sheet.getRow(r).getCell(c).toString();
						
						maps.put(key, value);
				}
				
					ListE.add(maps);
					
				}
				
				
		
			 System.setProperty("webdriver.chrome.driver","/Users/denysbabasiuk/eclipse-workspace/Selenium/drivers/chromedriver");
			
			WebDriver driver = new ChromeDriver();
			driver.get(url);
			
			driver.manage().window().maximize();
			
			for (Map<String, String> map : ListE) {
				
				Set<String> username1 = map.keySet();
				
				for (String username : username1) {
					
					String password = map.get(username);
			
				driver.findElement(By.id("txtUsername")).sendKeys(username);
				
				driver.findElement(By.id("txtPassword")).sendKeys(password);
				
				driver.findElement(By.id("btnLogin")).click();
				
				WebElement Text = driver.findElement(By.id("welcome"));
				String Text1 = Text.getText();
				
				System.out.println(Text1);
				
				WebElement logOut= driver.findElement(By.xpath("//a[@id='welcome']"));
				WebElement logOut2 = driver.findElement(By.xpath("//a[@href='/humanresources/symfony/web/index.php/auth/logout']"));
				Thread.sleep(3000);
				
				
				logOut.click();
				Thread.sleep(3000);
				logOut2.click();
				}
				
				
			}
	}
		 }
	

