package com.excel.readwrite;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExcelRead {

	public static String excelRead(int row, int cell) throws IOException {

		
		File f = new File("D:\\Excel1.xlsx");
		
		FileInputStream fin = new FileInputStream(f);

		// .xlsx - XSSFWORKBOOK or .xls - HSSFWORKBOOK
		Workbook wb = new XSSFWorkbook(fin);
		
		Sheet sheet = wb.getSheet("Sheet1");
		Cell c = sheet.getRow(row).getCell(cell);
		CellType cellType = c.getCellType();
		String cellValue = null;
		if (cellType.equals(CellType.STRING)) {
			cellValue = c.getStringCellValue();
		} else if (cellType.equals(CellType.NUMERIC)) {
			double numericCellValue = c.getNumericCellValue();
			long l = (long) numericCellValue;
			cellValue = String.valueOf(l);
		}
		
		System.out.println(cellValue);
		wb.close();
	    fin.close();
		return cellValue;

	}
	
	public static void excelWrite(String value,int row_num,int column_num) throws IOException {
		File f = new File("D:\\Excel1.xlsx");
		FileInputStream fin = new FileInputStream(f);

		// .xlsx - XSSFWORKBOOK or .xls - HSSFWORKBOOK
		XSSFWorkbook wb = new XSSFWorkbook(fin);
		XSSFSheet sheet = wb.getSheet("Sheet1");
		XSSFRow row = sheet.getRow(row_num);
		if(row==null) {
			System.out.println("creating new row");
		row =sheet.createRow(row_num);
		}
		XSSFCell cell = row.getCell(column_num);
		if(cell==null) {
			System.out.println("creating cell");
			cell = row.createCell(column_num);
		}

		cell.setCellValue(value);
		FileOutputStream fout= new FileOutputStream(f);
		wb.write(fout);
		wb.close();
		
}


	public static void main(String[] args) throws IOException {
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "\\src\\test\\java\\com\\driver\\seventysix\\chromedriver.exe");
		driver = new ChromeDriver();
		for(int i=0;i<=4;i++)
		{
			int j=0;
		driver.get(excelRead(i,j));
		WebElement element1 = driver.findElement(By.xpath("//span[@id='productTitle' and @class='a-size-large']"));
		String text = element1.getText();
		j++;
		excelWrite(text,i,j);
		System.out.println("written");
		
		}

		
	}

}
