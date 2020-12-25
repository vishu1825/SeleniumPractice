package PracticeSelenium;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Utility.TestUtil;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Vtiger_Lead_Test {
	
	public static WebDriver driver;
	
	@BeforeMethod
	public void setUp()
	{
		WebDriverManager.chromedriver().setup();
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("http://localhost:8888/index.php?action=Login&module=Users");
	/*	driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("manager");
		driver.findElement(By.id("submitButton")).click();
		driver.findElement(By.xpath("//td[contains(@class,'tabUnSelected')]/a[text()='Leads']")).click();
		driver.findElement(By.xpath("//img[contains(@title,'Create Lead')]")).click();
	*/	
	}
	
	@DataProvider
	public Iterator<Object[]> getTestData()
	{
		ArrayList<Object[]> testData = TestUtil.getDataFromExcel();
		return testData.iterator();
	}
	
	@Test(dataProvider="getTestData")
	public void leads_Vtiger(String FirstName, String LastName,String Company, String Mobile,String Email,
			String Street,String City,String LeadSource,String Industry )
	{
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("manager");
		driver.findElement(By.id("submitButton")).click();
		driver.findElement(By.xpath("//td[contains(@class,'tabUnSelected')]/a[text()='Leads']")).click();
		driver.findElement(By.xpath("//img[contains(@title,'Create Lead')]")).click();
		
		driver.findElement(By.name("firstname")).sendKeys(FirstName);
		driver.findElement(By.name("lastname")).sendKeys(LastName);
		driver.findElement(By.name("company")).sendKeys(Company);
		driver.findElement(By.id("mobile")).sendKeys(Mobile);
		driver.findElement(By.id("email")).sendKeys(Email);
		driver.findElement(By.id("noofemployees")).sendKeys(Street);
		driver.findElement(By.id("city")).sendKeys(City);
		Select select = new Select(driver.findElement(By.xpath("//select[@name='leadsource']")));
		select.selectByVisibleText(LeadSource);
		Select select1 = new Select(driver.findElement(By.xpath("//select[@name='industry']")));
		select1.selectByVisibleText(Industry);
		driver.findElement(By.name("button")).click();
		
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
}
