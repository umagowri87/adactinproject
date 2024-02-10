package com.excel.readwrite;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import cucumber.api.java.it.E;

public class ExcelandMap {
	
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
			//String[] s= {"country","capital","india","newdelhi","England","London"};
			//int length=s.length;
			//int k=0;
			 Map<String, String> data = new TreeMap<String, String>();
		        data.put("COUNTRY", "CAPITAL");
		        data.put("India", "NewDelhi");
		        data.put("England", "London");
			Set<Entry<String, String>> es = data.entrySet();
		     //Iterator it=es.iterator();
			for(int i=0;i<=2;i++)
			{
				for(int j=0;j<=1;j++)
				{
					//excelWrite(s[k],i,j);
					//k++;
					Iterator<Entry<String, String>> it=es.iterator();
					//for(Entry e:entrySet)
					while(it.hasNext())
					{
						excelWrite(it.next(),i,j);
					}
					System.out.println("written");
				}
	
			}
		}



}
