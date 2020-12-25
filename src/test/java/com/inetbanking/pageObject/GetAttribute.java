package com.inetbanking.pageObject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttribute {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		WebElement email = driver.findElement(By.name("email"));
		email.sendKeys("Vishu@gmail.com");
		email.sendKeys(Keys.CONTROL + "a");
		email.sendKeys(Keys.DELETE);
		email.sendKeys("Vishu");
		
		Thread.sleep(3000);

		
		String val = email.getAttribute("value");
		System.out.println("Entered text is: " + val);
		String val1 = email.getAttribute("placeholder");
		System.out.println("Entered text is: " + val1);
		int pageHeight = driver.findElement(By.tagName("body")).getSize().getHeight();
		System.out.println("Entire page height is " +pageHeight);

		driver.quit();

	}
}
