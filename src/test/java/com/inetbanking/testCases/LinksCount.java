package com.inetbanking.testCases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksCount {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://getbootstrap.com/docs/4.0/components/dropdowns/");

		List<WebElement> links = driver.findElements(By.tagName("a"));
		int total_size = links.size();
		System.out.println("Total no. of links is " + total_size);

		int hidden_Count = 0;
		int display_Count = 0;

		for (int i = 0; i < total_size; i++) {
			WebElement Links_specified = links.get(i);
			boolean flag = Links_specified.isDisplayed();

			if (flag) {
				display_Count++;
				String link_Text = Links_specified.getText();
				System.out.println("Link text at"  + i +  "Position is " + link_Text);
			}
			else{
				hidden_Count++;
			}
		}
		
		System.out.println("Total no. of Display link count is "+display_Count);
		System.out.println("Total no. of Hidden link count is "+hidden_Count++);
		
		driver.quit();


	}

}
