package com.inetbanking.testData;

import org.testng.annotations.Test;

import com.inetbanking.Utilities.ExcelLibrary;

public class WriteExcelTest {
	@Test
	public void WriteExcelTest1() throws Exception
	{
		//WriteExcel obj= new WriteExcel();
		//obj.writeExcel("Sheet2", "ram", 7, 1);
		ExcelLibrary obj= new ExcelLibrary();
		obj.readData("Sheet1", 2, 0);
		

	}
	

}
