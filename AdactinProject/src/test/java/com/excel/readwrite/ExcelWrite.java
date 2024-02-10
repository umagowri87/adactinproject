package com.excel.readwrite;

import java.io.File;
import java.io.FileInputStream;
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

public class ExcelWrite {
	
	private static Row row;

	//datadriven
		public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
			File f = new File("D:\\Excel.xlsx");
			FileInputStream fin = new FileInputStream(f);

			// .xlsx - XSSFWORKBOOK or .xls - HSSFWORKBOOK
			XSSFWorkbook wb = new XSSFWorkbook(fin);
			XSSFSheet sheet = wb.getSheet("Sheet1");
			XSSFRow row = sheet.getRow(5);
			if(row==null) {
				System.out.println("creating new row");
			row =sheet.createRow(5);
			}
			XSSFCell cell = row.getCell(5);
			if(cell==null) {
				System.out.println("creating cell");
				cell = row.createCell(5);
			}

			cell.setCellValue("hello");
			FileOutputStream fout= new FileOutputStream(f);
			wb.write(fout);
			wb.close();
			
	}

}
