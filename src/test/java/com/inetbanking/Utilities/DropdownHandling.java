package com.inetbanking.Utilities;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownHandling {

	public static void main(String[] args) {
            
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("u_0_2")).click();
		WebElement drpdown = driver.findElement(By.xpath("//select[@id='day']"));
		List<WebElement> alloptions = drpdown.findElements(By.tagName("option"));
		int count = alloptions.size();
		for(int i=0;i<count;i++)
		{
			WebElement option = alloptions.get(i);
			String optionText = option.getText();
			System.out.println(optionText);
			option.click();
		
		}
		

	}

}
