package com.inetbanking.testCases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("u_0_2")).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement F_name = driver.findElement(By.name("firstname"));
		js.executeScript("arguments[0].value='Vishwajeet'", F_name);

		WebElement ele = driver.findElement(By.xpath("//select[@id='day']"));
		Select sel =new Select(ele);
		boolean flag = sel.isMultiple();
		if(flag)
		{
			System.out.println("Dropdown is multi selected");
		}
		else
		{
			System.out.println("Dropdown is single selected");
		}
		List<WebElement> options = sel.getOptions();
		int count = options.size();
		System.out.println("Total number of options "+count);
		
		//for (int i=0;i<count;i++)
	//	{
		//	WebElement option = options.get(i);
		//	String optiontext = option.getText();
		//	System.out.println(optiontext);
		//}
		for(WebElement text:options)
		{
			String optiontext=text.getText();
			System.out.println(optiontext);

		}
		sel.selectByIndex(0);
		System.out.println("DropDown Selected");
		
		driver.quit();

	}

}
