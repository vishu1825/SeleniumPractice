package com.inetbanking.testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.inetbanking.Utilities.Property_datas;

public class BaseTest2 {
	
	public WebDriver driver;
	
	@BeforeMethod
	public void OpenAppln() throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		driver=new ChromeDriver();
		
		String url = Property_datas.test1("./p2.properties","url");
		driver.get(url);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
	@AfterMethod
	public void CloseAppln()
	{
		driver.quit();
	}

}
