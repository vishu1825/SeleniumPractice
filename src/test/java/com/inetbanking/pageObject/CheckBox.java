package com.inetbanking.pageObject;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Code to select all the check boxes
public class CheckBox {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://demo.guru99.com/test/radio.html");
		driver.manage().window().maximize();
		List<WebElement> checkBoxes = driver.findElements(By.xpath("//*[@type='checkbox']"));
		System.out.println(checkBoxes.size());
		for (int i = 0; i < checkBoxes.size(); i++) {
			checkBoxes.get(i).click();

			if (checkBoxes.get(i).isSelected()) {
				System.out.println(i + " checkBox is selected ");
			} else {
				System.out.println(i + " checkBox is not selected ");

			}
		}
       driver.quit();
	}

}
