package com.inetbanking.Utilities;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.google.common.io.Files;

public class Generic_Screenshot {
	

	public static String photo(WebDriver driver, String tcName)throws Exception
	{
		String photo="./screenshots/";
		Date d=new Date();
		String d1=d.toString();
		String date =d1.replaceAll(":", "-");
		TakesScreenshot ts= (TakesScreenshot)driver;
		File src= ts.getScreenshotAs(OutputType.FILE);
		File dst=new File(photo+date+tcName+".jpeg");
		String path=dst.getAbsolutePath();
		Files.copy(src,dst);
		
        try
	     {
	    	Files.copy(src, dst); 
	     }
 
	     
	     catch(IOException e)
	     {
	    	 e.printStackTrace();
	     }


				return path;
	}

}
