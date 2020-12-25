package com.inetbanking.Utilities;

import java.io.FileInputStream;
import java.util.Properties;


public class Property_datas {
	
	public static String  test1(String path, String key) throws Exception
	{
		//1. create object for properties class 
		Properties p=new Properties();
		
		//2.specify the path of property file 
		p.load(new FileInputStream(path));
		
		//3. specify the key and fetch the 
		String value = p.getProperty(key);
		System.out.println(value);
		
		return value;
	}

}
