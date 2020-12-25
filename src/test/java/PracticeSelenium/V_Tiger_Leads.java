package PracticeSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import Utility.Xls_Reader;
import io.github.bonigarcia.wdm.WebDriverManager;

public class V_Tiger_Leads {
	
	@Test
	public void loginTest()
	{
		Xls_Reader reader=new Xls_Reader("D:/workspace/INetBanking/TestData/ExcelData_Vtiger.xlsx");
		int rowCount = reader.getRowCount("Sheet1");
		for (int rowNum=2;rowNum<=rowCount;rowNum++){
		String firstName=reader.getCellData("Sheet1", "FirstName", rowNum);
		System.out.println(firstName);
		String lastName=reader.getCellData("Sheet1", "LastName", rowNum);
		System.out.println(lastName);
		String company=reader.getCellData("Sheet1", "Company", rowNum);
		System.out.println(company);
		 String Mobile = reader.getCellData("Sheet1", "Mobile", rowNum);
		System.out.println(Mobile);
		String Email=reader.getCellData("Sheet1", "Email", rowNum);
		System.out.println(Email);
		String Street=reader.getCellData("Sheet1", "Street", rowNum);
		System.out.println(Street);
		String City=reader.getCellData("Sheet1", "City", rowNum);
		System.out.println(City);
		String LeadSource=reader.getCellData("Sheet1", "LeadSource", rowNum);
		System.out.println(LeadSource);
		String Industry=reader.getCellData("Sheet1", "Industry", rowNum);
		System.out.println(Industry);
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("http://localhost:8888/index.php?action=Login&module=Users");
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("manager");
		driver.findElement(By.id("submitButton")).click();
		driver.findElement(By.xpath("//td[contains(@class,'tabUnSelected')]/a[text()='Leads']")).click();
		driver.findElement(By.xpath("//img[contains(@title,'Create Lead')]")).click();
		
		driver.findElement(By.name("firstname")).sendKeys(firstName);
		driver.findElement(By.name("lastname")).sendKeys(lastName);
		driver.findElement(By.name("company")).sendKeys(company);
		driver.findElement(By.id("mobile")).sendKeys(Mobile);
		Select select = new Select(driver.findElement(By.xpath("//select[@name='leadsource']")));
		select.selectByVisibleText(LeadSource);
		Select select1 = new Select(driver.findElement(By.xpath("//select[@name='industry']")));
		select1.selectByVisibleText(Industry);
		

		}

		

		
		
	










	}

}
