package com.tm.testcases;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelData {
public static void main(String[] args) throws IOException {
		
		String TCName="TC02";
		FileInputStream inputstream=null;
		XSSFWorkbook wb1=null;
		boolean bTag=false;
		try{ 
			String username;
			String password;
			File fl=new File("E:/jkl.xlsx");
			inputstream=new FileInputStream(fl);
			wb1=new XSSFWorkbook(inputstream);
			bTag=true;
			XSSFSheet ws1=wb1.getSheet("sheet1");
			int rowcount=ws1.getLastRowNum()+1;
			System.out.println("Row Count is:" +rowcount);
			for(int iRowIndex=1;iRowIndex<rowcount;iRowIndex++)
			{
				Row r1=ws1.getRow(iRowIndex);
				String ex1TCName=r1.getCell(0).getStringCellValue();
				if(TCName.equals(ex1TCName))
				{
					username=r1.getCell(1).getStringCellValue();
					password=r1.getCell(2).getStringCellValue();
					System.out.println(username+" : "+password);
					break;
					}
			}
		}
		catch(IOException ie){
		System.out.println("'file not found or unable to read/write data...");	
		}
		catch(Exception e){
			System.out.println("unknown Exception");
		}
		finally{
			if(bTag)
			{
				wb1.close();
				inputstream.close();
			}
		}
		

	}

}



