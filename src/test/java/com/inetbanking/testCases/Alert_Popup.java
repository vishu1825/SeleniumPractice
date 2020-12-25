package com.inetbanking.testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Popup {

	public static void main(String[] args) throws InterruptedException {

		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		driver.findElement(By.name("cusid")).sendKeys("53920");
		driver.findElement(By.name("submit")).click();
		//Alert alert = driver.switchTo().alert();
	//	String alertMsg = alert.getText();
	//	System.out.println(alertMsg);
	//	alert.dismiss();
		
		 Alert alert1 = driver.switchTo().alert();
	        String alertMsg1 = alert1.getText();
			System.out.println(alertMsg1);
	     	alert1.accept();
		    driver.quit();
		
	}

}
