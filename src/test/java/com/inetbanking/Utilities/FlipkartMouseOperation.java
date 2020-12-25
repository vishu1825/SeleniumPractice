package com.inetbanking.Utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipkartMouseOperation {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		WebElement searchTextBx=driver.findElement(By.name("q"));
		Actions act= new Actions(driver);
		act.sendKeys(searchTextBx, "realme x2").perform();
		
		act.sendKeys(Keys.ARROW_DOWN).perform();

		act.sendKeys(Keys.ARROW_DOWN).perform();
		//act.sendKeys(Keys.ARROW_DOWN).perform();

		act.sendKeys(Keys.ENTER).perform();
		
		



		

	}

}
