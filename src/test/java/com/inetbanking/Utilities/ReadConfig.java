package com.inetbanking.Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	
	Properties prop;
	public ReadConfig()
	{
		File file =new File("./Configuration/config.properties");
		try {
			FileInputStream fis=new FileInputStream(file);
			prop=new Properties();
			prop.load(fis);
			} catch (Exception e) {
				System.out.println("Exception is "+e.getMessage());
			}
			
	}
	public String getApplicationURL()
	{
		String url = prop.getProperty("baseUrl");
		return url;
	}
	
	public String getUsername()
	{
		String username = prop.getProperty("username");
		return username;
	}
	
	public String getPasssword()
	{
		String password = prop.getProperty("password");
		return password;

	}
	
	public String getChromepath()
	{
		String chromepath = prop.getProperty("chromepath");
		return chromepath;
	}
	
	public String getFirefoxpath()
	{
		String firefoxpath = prop.getProperty("firefoxpath");
		return firefoxpath;
	}
	
	public String getIepath()
	{
		String iepath = prop.getProperty("iepath");
		return iepath;
	}

	
}
