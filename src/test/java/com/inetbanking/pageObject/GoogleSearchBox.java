package com.inetbanking.pageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchBox {

	public static void main(String[] args) {
			
			System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");

			WebDriver driver = new ChromeDriver();

			driver.get("https://www.google.com/");
			
			driver.findElement(By.name("q")).sendKeys("testing");
			List<WebElement> suggestionList = driver.findElements(By.xpath("//ul[@role='listbox']//li//div[@class='sbl1']//span"));
			int suggestionListSize = suggestionList.size();
			System.out.println(suggestionListSize);
			
			for(int i=0;i<suggestionListSize;i++)
			{
				WebElement suggestionTexts = suggestionList.get(i);
				String suggestionTextvalue = suggestionTexts.getText();
				System.out.println(suggestionTextvalue);
				
			}
			


	}

}
