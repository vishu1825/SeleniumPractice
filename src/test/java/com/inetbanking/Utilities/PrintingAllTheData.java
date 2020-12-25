package com.inetbanking.Utilities;

import java.util.List;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PrintingAllTheData {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa");
		List<WebElement> rows = driver.findElements(By.xpath("//div[@id='leftcontainer']//table/tbody/tr"));
	    List<WebElement> cols = driver.findElements(By.xpath("//div[@id='leftcontainer']//table/tbody/tr[1]/td"));
		System.out.println("No.of Columns :"+cols.size());
		System.out.println("No.of Rows :"+rows.size());
		String firstPart="//div[@id='leftcontainer']//table/tbody/tr[";
		String secondPart="]/td[";
		String thirdPart="]";
		
		//TreeSet<String> ts= new TreeSet<String>();
		
	    for(int i=1;i<=rows.size();i++)	
		{
			for(int j=1;j<=cols.size();j++)
			{
				String finalPart=firstPart+i+secondPart+j+thirdPart;
				String text = driver.findElement(By.xpath(finalPart)).getText();
				//ts.add(text);
				System.out.print(text+" | ");
			}
		
		   System.out.println();
			
		
		
		
		}
	}

}
