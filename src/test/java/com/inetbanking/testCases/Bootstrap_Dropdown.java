package com.inetbanking.testCases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bootstrap_Dropdown {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.w3schools.com/bootstrap/bootstrap_dropdowns.asp");
		driver.manage().window().maximize();
		WebElement drpdown = driver.findElement(By.id("menu1"));
		drpdown.click();
		List<WebElement> ele = driver.findElements(By.xpath("//ul[@class='dropdown-menu test']"));
		
		
		for(WebElement DrpText:ele)
		{
			String Text = DrpText.getText();
			System.out.println(Text);
			if(Text.contains("JavaScript"))
			{
				DrpText.click();
			}
		}
		
		 //System.out.println("Size of DropDown is" + size_Drpdown);

		driver.quit();
	}

}
