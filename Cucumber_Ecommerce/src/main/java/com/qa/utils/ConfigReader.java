package com.qa.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader 
{
	private Properties prop;
	
	public Properties init_prop()
	{
		prop= new Properties();
		try {
			FileInputStream fi = new FileInputStream("./src/main/resources/cofig/config.properties");
		   prop.load(fi);
		} 
		catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return prop;
		}
}
