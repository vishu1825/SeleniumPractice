package com.inetbanking.Utilities;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MaxPriceFromWebTable {

	public static void main(String[] args) throws ParseException {
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa");
		List<WebElement> rows = driver.findElements(By.xpath("//div[@id='leftcontainer']//table/tbody/tr"));
	    List<WebElement> cols = driver.findElements(By.xpath("//div[@id='leftcontainer']//table/tbody/tr[1]/td"));
		System.out.println("No.of Columns :"+cols.size());
		System.out.println("No.of Rows :"+rows.size());
		
		String firstPart="//div[@id='leftcontainer']//table/tbody/tr[";
		String secondPart="]/td[4]";
		List<Integer> al=new ArrayList<Integer>();
		
		for(int i=1;i<=rows.size();i++)
		{
			String finalPart=firstPart+i+secondPart;
			String price = driver.findElement(By.xpath(finalPart)).getText();
			System.out.println(price);
			NumberFormat numberFormat = NumberFormat.getNumberInstance();
			Number num = numberFormat.parse(price);
			price=num.toString();
			Double dPrice = Double.parseDouble(price);
			int intPrice = dPrice.intValue();
			al.add(intPrice);
			
			
		}
		Collections.sort(al);
		System.out.println("************************************************************************");
		System.out.println("Minimum value is" +al.get(0));
		System.out.println("Maximum value is " +al.get(al.size()-1));
		
		driver.quit();


	}

}
