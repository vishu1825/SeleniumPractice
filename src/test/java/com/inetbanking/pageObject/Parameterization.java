package com.inetbanking.pageObject;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class Parameterization {
	
	 WebDriver driver;
	
	@Test
	@Parameters({"browser","url","email","password"})
	public void FacebookLogin(String browserName,String Url,String emailField,String PasswordField)
	{
		if(browserName.equalsIgnoreCase("chrome"))
		{
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		driver =new ChromeDriver();
		}
		else if (browserName.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
			driver =new FirefoxDriver();

		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get(Url);
		driver.findElement(By.name("email")).sendKeys(emailField);
		driver.findElement(By.name("pass")).sendKeys(PasswordField);
		
		
	}

}
