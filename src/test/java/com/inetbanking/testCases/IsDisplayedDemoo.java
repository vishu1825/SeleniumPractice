package com.inetbanking.testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayedDemoo {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://getbootstrap.com/docs/4.0/components/dropdowns/");
		WebElement ExamplesEle = driver.findElement(By.linkText("Examples"));		
		IsDisplayed(ExamplesEle);
		
		WebElement DocumentationEle = driver.findElement(By.linkText("Examples"));	
		IsDisplayed(DocumentationEle);

		driver.quit();
	}

	public static void IsDisplayed(WebElement element)
	{
		boolean flag = element.isDisplayed();
		System.out.println(flag);
		
		if(flag)
		{
			System.out.println("Examples element is displayed on web page ");
		}
		else 
		{
			System.out.println("Examples element is not  displayed on web page ");

		}
		
		

	}


	

}
