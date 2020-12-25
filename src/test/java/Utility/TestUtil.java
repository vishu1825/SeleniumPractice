package Utility;

import java.util.ArrayList;

public class TestUtil {

	public static Xls_Reader reader;

	public static ArrayList<Object[]> getDataFromExcel() {
		ArrayList<Object[]> myData = new ArrayList<Object[]>();
		try {
			reader = new Xls_Reader("D:/workspace/INetBanking/TestData/ExcelData_Vtiger.xlsx");
		} catch (Exception e) {
			e.printStackTrace();
		}
		for (int rowNum = 2; rowNum <= reader.getRowCount("Sheet1"); rowNum++) {
			String FirstName = reader.getCellData("Sheet1", "FirstName", rowNum);
			String LastName = reader.getCellData("Sheet1", "LastName", rowNum);
			String Company = reader.getCellData("Sheet1", "Company", rowNum);
			String Mobile = reader.getCellData("Sheet1", "Mobile", rowNum);
			String Email = reader.getCellData("Sheet1", "Email", rowNum);
			String Street = reader.getCellData("Sheet1", "Street", rowNum);
			String City = reader.getCellData("Sheet1", "City", rowNum);
			String LeadSource = reader.getCellData("Sheet1", "LeadSource", rowNum);
			String Industry = reader.getCellData("Sheet1", "Industry", rowNum);

			Object ob[] = { FirstName, LastName, Company, Mobile, Email, Street, City, LeadSource, Industry };
			myData.add(ob);
		}
		return myData;
	}

}
