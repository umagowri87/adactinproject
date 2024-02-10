package com.excel.readwrite;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelpractice {
	private static Row row;
	
	public static void excelWrite(String value,int row_num,int column_num) throws IOException {
		File f = new File("C:\\Users\\chezhian\\Desktop\\New folder (2)\\Book1.xlsx");
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


	//datadriven
		public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
			String[] s= {"country","capital","india","newdelhi","England","London"};
			int length=s.length;
			int k=0;
			System.out.println(length);
			for(int i=0;i<=2;i++)
			{
				for(int j=0;j<=1;j++)
				{
					excelWrite(s[k],i,j);
					k++;
					System.out.println("written");
				}
	
			}
		}

}
