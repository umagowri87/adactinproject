package com.excel.readwrite;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {
	public static void main(String[] args) throws IOException {

		File f = new File("D:\\Excel.xlsx");
		FileInputStream fin = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fin);
		Sheet sheet = wb.getSheet("Sheet1");
		
		int physicalNumberOfRows = sheet.getPhysicalNumberOfRows();
		
		for(int i=0;i<physicalNumberOfRows;i++)
		{
			Row row = sheet.getRow(i);
			
			for(int j=0;j<row.getPhysicalNumberOfCells();j++)
			{
				
				Cell cell = row.getCell(j);
				CellType cellType = cell.getCellType();
				String cellValue=null;
				if (cellType.equals(CellType.STRING)) {
					cellValue = cell.getStringCellValue();
				}else if (cellType.equals(CellType.NUMERIC)) {
					double numericCellValue = cell.getNumericCellValue();
					long l = (long) numericCellValue;
					cellValue = String.valueOf(l);
				}
				System.out.println(cellValue);
				
				
			}		
				
			}
		}

	}

