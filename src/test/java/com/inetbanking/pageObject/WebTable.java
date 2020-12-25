package com.inetbanking.pageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().deleteAllCookies();
		//driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://demo.guru99.com/test/web-table-element.php");
		
		List<WebElement> Rows = driver.findElements(By.xpath("//div[@id='leftcontainer']/table//tr"));
		System.out.println("Total no.of rows :"+Rows.size());
		
		String before_Xpath="//div[@id='leftcontainer']/table//tr[";
		String after_Xpath= "]";
		
		
		//div[@id='leftcontainer']//tbody//a
		
		for(int i=2;i<=Rows.size();i++)
		{

			String actual_Xpath=before_Xpath+i+after_Xpath;////div[@id='leftcontainer']/table//tr[i]
			WebElement element = driver.findElement(By.xpath(actual_Xpath));
			System.out.println(element.getText());
		}
			List<WebElement> companyName = driver.findElements(By.xpath("//div[@id='leftcontainer']//tbody//a[1]"));
			if(((WebElement) companyName).getText().equals("Hero MotoCorp"))
			{
				System.out.println("Company Name"+((WebElement) companyName).getText());
			}

	
       driver.quit();
	}

	}


