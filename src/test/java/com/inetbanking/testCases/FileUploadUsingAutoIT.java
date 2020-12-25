package com.inetbanking.testCases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUploadUsingAutoIT {

	public static void main(String[] args) throws Exception {

		WebDriverManager.firefoxdriver().setup();

		//System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		//driver.get("https://opensource-demo.orangehrmlive.com/index.php/pim/addEmployee");
		//driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		//driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		//driver.findElement(By.name("Submit")).click();

		//WebElement ele = driver.findElement(By.xpath("//b[text()='PIM']"));
		//Actions act= new Actions(driver);
		//act.moveToElement(ele).perform();
		//driver.findElement(By.xpath("//a[text()='Add Employee']")).click();
		//driver.findElement(By.id("photofile")).click();
		 driver.findElement(By.id("imagesrc")).click();
		Thread.sleep(3000);
		//JavascriptExecutor js= (JavascriptExecutor)driver;
		//  js.executeScript("arguments[0].click()",btn );
		
		Runtime.getRuntime().exec("C://Users//vishw//OneDrive//Desktop//FileUploadD1.exe");
		
		


		
	}

}
												