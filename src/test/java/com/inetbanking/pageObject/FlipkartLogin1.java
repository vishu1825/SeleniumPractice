package com.inetbanking.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FlipkartLogin1 {

	public static void main(String[] args) {
		
		    WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.flipkart.com/");
			driver.manage().window().maximize();
			driver.findElement(By.xpath("//div[@class='IiD88i _351hSN']/input[@type='text']")).sendKeys("9140268040");
			driver.findElement(By.xpath("//div[@class='IiD88i _351hSN']/input[@type='password']")).sendKeys("Vishu@1825");
			driver.findElement(By.xpath("//button[@type='submit']/span")).click();

		

	}

}
