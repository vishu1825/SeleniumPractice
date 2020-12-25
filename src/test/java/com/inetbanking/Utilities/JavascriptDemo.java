package com.inetbanking.Utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptDemo {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.istqb.in/#");
		JavascriptExecutor js= (JavascriptExecutor)driver;
		//js.executeScript("window.scrollBy(0,300)");
		//Thread.sleep(3000);
		//driver.quit();
		//js.executeScript("window.scrollBy(0,400)");
		WebElement homeEle = driver.findElement(By.xpath("//div[contains(@id,'sppb-addon')]//a[text()='Home']"));
		js.executeScript("arguments[0].scrollIntoView(true);",homeEle);
		System.out.println(homeEle.getText());


		

	}

}
