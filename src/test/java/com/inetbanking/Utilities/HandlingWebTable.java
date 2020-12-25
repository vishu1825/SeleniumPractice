package com.inetbanking.Utilities;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingWebTable {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://demo.guru99.com/test/web-table-element.php");
		List<WebElement> rows = driver.findElements(By.xpath("//div[@id='leftcontainer']//table/tbody/tr"));
	    List<WebElement> cols = driver.findElements(By.xpath("//div[@id='leftcontainer']//table/tbody/tr[1]/td"));
		System.out.println("No.of Columns :"+cols.size());
		System.out.println("No.of Rows :"+rows.size());
		
		String beforeXpath="//div[@id='leftcontainer']//table/tbody/tr[";
		String afterXpath="]/td[1]";
		
		for(int i=1;i<=rows.size();i++)
		{
			String actualXpath=beforeXpath+i+afterXpath;
			String compText = driver.findElement(By.xpath(actualXpath)).getText();
			System.out.println(compText);
			
		}
		String beforeXpath2="//div[@id='leftcontainer']//table/tbody/tr[";
		String afterXpath2="]/td[3]";
		
		for(int i=1;i<=rows.size();i++)
		{
			String actualXpath2=beforeXpath2+i+afterXpath2;
			String compText2 = driver.findElement(By.xpath(actualXpath2)).getText();
			System.out.println(compText2);
			
		}
		//String datavalue = driver.findElement(By.xpath("//a[contains(text(),'Deepak Fertilisers')]/parent::*/following-sibling::td[3]")).getText();
		//System.out.println(datavalue);
		driver.quit();
		
		
		

	}

}
