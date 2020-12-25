package com.inetbanking.Utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentManager {
	
	public static ExtentHtmlReporter htmlreporter;
	public static ExtentReports extent;
	public static ExtentTest test;
	
	public static void setExtent()
	{
		htmlreporter=new ExtentHtmlReporter(System.getProperty("user.dir")+"test-output/ExtentReports"+"MyReports.html");
		htmlreporter.loadXMLConfig(System.getProperty("user.dir")+"/extent-config.xml");
		
		extent=new ExtentReports();
		extent.attachReporter(htmlreporter);
		
		extent.setSystemInfo("HostName", "Local Host");
		extent.setSystemInfo("TesterName", "Vishwajeet");
		extent.setSystemInfo("OS", "Windows 10");
		extent.setSystemInfo("ProjectName", "My Store Project");

	}
	
	public static void EndReport()
	{
		extent.flush();
	}

}
