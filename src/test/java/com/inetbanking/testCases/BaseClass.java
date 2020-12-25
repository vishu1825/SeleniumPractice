package com.inetbanking.testCases;

import java.io.File;
import java.io.IOException;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.google.common.io.Files;
import com.inetbanking.Utilities.ReadConfig;

public class BaseClass {

	ReadConfig readConfig = new ReadConfig();
	public String baseUrl = readConfig.getApplicationURL();
	public String username = readConfig.getUsername();
	public String password = readConfig.getPasssword();
	public static WebDriver driver;
	public static Logger logger;

	@Parameters("browser")
	@BeforeMethod
	public void setup(String br) {
		
		logger = Logger.getLogger("ebanking");
		PropertyConfigurator.configure("Log4j.properties");

		if (br.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", readConfig.getChromepath());
			driver = new ChromeDriver();
			
		} else if (br.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", readConfig.getFirefoxpath());
			driver = new FirefoxDriver();
			
		} else if (br.equals("ie")) {
			System.setProperty("webdriver.ie.driver", readConfig.getIepath());
			driver = new InternetExplorerDriver();
		}
		driver.manage().window().maximize();
		driver.get(baseUrl);
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	public static void captureScreenshot(WebDriver driver,String tname) throws IOException
	{
		TakesScreenshot ts= (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("./"+"/Screenshots/" + tname + ".png");
		Files.copy(src,dest);
		System.out.println("Screenshot Taken");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
