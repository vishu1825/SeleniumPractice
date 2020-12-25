package com.inetbanking.testData;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sorting_TreeSet {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[contains(@class,'_2KpZ6l _2doB4z')]")).click();
		List<WebElement> links = driver.findElements(By.xpath("//a"));
		int count = links.size();
		System.out.println("Total number of links present is :" +count);
		
		
		//Using TreeSet to print the link in Descending order
		
		/*TreeSet<String> ts= new TreeSet<String>(Collections.reverseOrder());
		
		for(WebElement wb:links)
		{
			String linkText = wb.getText();
			ts.add(linkText);
		}
		
		for(String str:ts)
		{
			System.out.println(str);
		}
         
*/		
		//Using TreeSet to print the link in Ascending order

		/*TreeSet<String> ts= new TreeSet<String>();
		
		for(WebElement wb:links)
		{
			String linkText = wb.getText();
			ts.add(linkText);
		}
		
		for(String str:ts)
		{
			System.out.println(str);
		}*/
		
		
		//Printing the links using ArrayList in ascending order 
		
		
		/*ArrayList<String> al= new ArrayList<String>();
		for(WebElement wb:links)
		{
			String linkText = wb.getText();
			al.add(linkText);
		}
		Collections.sort(al);
		
		for(String str:al)
		{
			System.out.println(str);
		}
		*/
		
		
		//Printing the links using ArrayList in Descending order 

		ArrayList<String> al= new ArrayList<String>();
		for(WebElement wb:links)
		{
			String linkText = wb.getText();
			al.add(linkText);
		}
		Collections.sort(al,Collections.reverseOrder());
		
		for(String str:al)
		{
			System.out.println(str);
		}

	
		driver.quit();

	}

}
