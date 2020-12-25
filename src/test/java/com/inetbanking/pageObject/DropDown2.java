package com.inetbanking.pageObject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown2 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("u_0_2")).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement F_name = driver.findElement(By.name("firstname"));
		js.executeScript("arguments[0].value='Vishwajeet'", F_name);
		List actualList= new ArrayList();

		WebElement ele = driver.findElement(By.xpath("//select[@id='day']"));
		Select sel= new Select(ele);
		List<WebElement> dayOption = sel.getOptions();
		
		for(WebElement day:dayOption)
		{
		String dayEle = day.getText();
		  actualList.add(dayEle);
		}
		//Collections.sort(actualList);
		System.out.println(actualList);
		driver.quit();
	}

}
