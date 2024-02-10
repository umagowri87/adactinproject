package com.excel.readwrite;

import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.google.common.collect.Table.Cell;

public class Create_newExcelSheet {
	
	
	public static void main(String[] args)
    {
        //Blank workbook
        XSSFWorkbook workbook = new XSSFWorkbook();
         
        //Create a blank sheet
        XSSFSheet sheet = workbook.createSheet("Country Data");
          
        //This data needs to be written (Object[])
        Map<String, Object[]> data = new TreeMap<String, Object[]>();
        data.put("1", new Object[] {"COUNTRY", "CAPITAL","State"});
        data.put("2", new Object[] {"India", "NewDelhi"});
        data.put("3", new Object[] {"England", "London"});
                 
        //Iterate over data and write to sheet
        Set<String> keyset = data.keySet();
        
       //
        
        //List<String> li= new ArrayList<String>(keyset);
        //for(int i=0;i<li.size())
        //{
        //	int value=Integer.parseInt(l);
        	//System.out.println(li.get(value));
        //}
        int rownum = 0;
        for (String key : keyset)
        {
            XSSFRow row = sheet.createRow(rownum++);
            Object [] objArr = data.get(key);
            int cellnum = 0;
            for (Object obj : objArr)
            {
               XSSFCell cell = row.createCell(cellnum++);
               if(obj instanceof String)
                    cell.setCellValue((String)obj);
                else if(obj instanceof Integer)
                    cell.setCellValue((Integer)obj);
            }
        }
        try
        {
            //Write the workbook in file system
            FileOutputStream out = new FileOutputStream(new File(System.getProperty("user.dir") + "\\sr.xlsx"));
            workbook.write(out);
            out.close();
            System.out.println("written successfully on disk.");
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}


