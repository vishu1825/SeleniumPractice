package com.inetbanking.testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DimensionDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://getbootstrap.com/docs/4.0/components/dropdowns/");
		Dimension dim = driver.findElement(By.tagName("Img")).getSize();
		System.out.println("Image Height is"+ dim.getHeight());
		System.out.println("Image Width is"+ dim.getWidth());
		
		int PageHeight = driver.findElement(By.tagName("Body")).getSize().getHeight();
		System.out.println("Entire Page Height is" + PageHeight);
		
		int PageWidth = driver.findElement(By.tagName("Body")).getSize().getWidth();
		System.out.println("Entire Page Height is" + PageWidth);
		
		
		driver.quit();


		
	

		

	}

}
