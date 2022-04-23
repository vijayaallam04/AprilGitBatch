package com.tm.lib;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {
	public static String ReadRowData(String TCName) throws IOException{
		FileInputStream inputstream;
		XSSFWorkbook wb1;
		String strData=" ";
		try
		{
		File fl=new File("E:\\Testing masters\\Feb19_Automation_1\\TestData\\TestData.xlsx");
		inputstream=new FileInputStream(fl);
		wb1=new XSSFWorkbook(inputstream);
		XSSFSheet ws1=wb1.getSheet("Sheet1");
		int rowcount=ws1.getLastRowNum()+1;
		System.out.println("Row Count is:" +rowcount);
		
		for(int iRowIndex=1;iRowIndex<rowcount;iRowIndex++)
		{
			Row r1=ws1.getRow(iRowIndex);
			String ex1TCName=r1.getCell(1).getStringCellValue();
			if(TCName.equals(ex1TCName))
			{
				int col=2;
				
				while(true)
				{
				String cellval=r1.getCell(col).getStringCellValue();
				if(cellval.length()!=0)
				strData=strData+"&&&"+cellval;
				else
				break;
				
				col++;
			    }
			break;
		}
		}
		
		}
	
	
	catch(Exception e){
		
	}
		return strData;
	
	}//method
	


}//class


