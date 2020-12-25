package com.inetbanking.testData;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

public class FileDownloadPopupInFireFox {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
		FirefoxProfile profile =new FirefoxProfile();
		profile.setPreference("browser.helperApps.neverAsk.saveToDisk","application/zip");
		profile.setPreference("browser.download.manager.showWhenStarting",false);
		FirefoxOptions options = new FirefoxOptions();
		options.setProfile(profile);
		WebDriver driver = new FirefoxDriver(options);
		driver.get("https://selenium.dev/downloads/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.findElement(By.partialLinkText("32 bit Windows IE")).click();
	    
	    

	}

}
