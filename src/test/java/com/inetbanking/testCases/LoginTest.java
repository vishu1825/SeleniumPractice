package com.inetbanking.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetbanking.pageObject.LoginPage;

public class LoginTest extends BaseClass {
	
	@Test
	public void loginTest() throws InterruptedException, IOException
	{

		logger.info("Url is opened");

		LoginPage lp=new LoginPage(driver);
		lp.setUserName(username);
		logger.info("Enter the username");
		lp.setPassword(password);
		logger.info("Enter the password");
		lp.clickSubmit();
		Thread.sleep(3000);
		
		if(driver.getTitle().equals("Guru99 Bank Manager HomePage"))
		{

			Assert.assertTrue(true);
			logger.info("Login Test Passed");
		}
		else
		{
			captureScreenshot(driver,"loginTest");
			Assert.assertTrue(false);
			logger.info("Login Test Failed");

		}
	}

}
