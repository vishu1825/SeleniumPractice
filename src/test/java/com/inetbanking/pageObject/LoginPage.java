package com.inetbanking.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	 WebDriver driver;
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(name="uid")
	private WebElement unTxtBx;
	
	@FindBy(name="password")
	private WebElement pwdTxtBx;
	

	@FindBy(name="btnLogin")
	private WebElement lgnBtn;
	
	
	public void setUserName(String uname)
	{
		unTxtBx.sendKeys(uname);
	}

	
	public void setPassword(String pwd)
	{
		pwdTxtBx.sendKeys(pwd);	
	}
	
	public void clickSubmit()
	{
		lgnBtn.click();
	}
}
