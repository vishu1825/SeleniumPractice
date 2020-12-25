package com.inetbanking.testData;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProviders {

    @Test(dataProvider="Login")
    public void login(String username, String password)
    {
		WebDriverManager.chromedriver().setup();
	     WebDriver driver=new ChromeDriver(); 
	     driver.manage().window().maximize();
	     driver.get("http://localhost:8888/index.php?action=Login&module=Users");
	     driver.findElement(By.name("user_name")).sendKeys(username);
	     driver.findElement(By.name("user_password")).sendKeys(password);
	}
      @DataProvider(name="Login")
    public Object[][] getLoginData()
    {
    	Object[][] data= new Object[3][2];
    	data[0][0]="admin";
    	data[0][1]="Manager";
    	data[1][0]="admin";
    	data[1][1]="Manager";
    	data[2][0]="admin";
    	data[2][1]="Manager";
		return data;
    }
}
