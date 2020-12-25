package com.inetbanking.testCases;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://demo.guru99.com/popup.php");
		driver.findElement(By.xpath("//a[text()='Click Here']")).click();
		
		String Main_Window = driver.getWindowHandle();
		
		Set<String> s1 = driver.getWindowHandles();
		Iterator<String> itr = s1.iterator();
		while(itr.hasNext())
		{
			String Child_Window = itr.next();
			if(!Main_Window.equalsIgnoreCase(Child_Window))
			{
				System.out.println(Child_Window);

				driver.switchTo().window(Child_Window);
				driver.findElement(By.name("emailid"))
                .sendKeys("gaurav.3n@gmail.com");                			
                
                driver.findElement(By.name("btnLogin")).click();
                driver.close();
			}
			
		}
		driver.switchTo().window(Main_Window);
		System.out.println(Main_Window);
		
		

	}

}
