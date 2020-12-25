package com.inetbanking.testData;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddingCookies {

	public static void main(String[] args) {
  
		//An HTTP cookie is a small piece of data stored on the user's computer by the web browser while browsing a website.
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.guru99.com/firefox-profile-selenium-webdriver.html");
		Cookie name= new Cookie("My Cookie","123456789123");
		driver.manage().addCookie(name);
		//driver.manage().deleteAllCookies();used to delete all the cookies
		//driver.manage().deleteCookieNamed(name);used to delete particular cookies

		Set<Cookie> cookiesList =  driver.manage().getCookies();
		for(Cookie getcookies :cookiesList) {
		    System.out.println(getcookies );
		}
		
	}

}
