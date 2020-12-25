package com.inetbanking.Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcel {
	
	public void writeExcel(String sheetName,String cellValue, int row , int col) throws Exception  
	{
		String excelPath ="D:\\workspace\\INetBanking\\TestData\\Copy of Copy of Untitled Spreadsheet.xlsx";
		 File file =new File(excelPath);
		 FileInputStream fis = new FileInputStream(file);//to read the excel file
		 XSSFWorkbook wb= new XSSFWorkbook(fis);//to read xlsx file format 
		 XSSFSheet sheet=wb.getSheet(sheetName);
		 sheet.getRow(row).createCell(col).setCellValue(cellValue);
		 FileOutputStream fos= new FileOutputStream(new File(excelPath));
		 wb.write(fos);//write the data into excel file
		 wb.close();


	
	}

}
