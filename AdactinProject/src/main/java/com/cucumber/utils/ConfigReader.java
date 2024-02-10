package com.cucumber.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ConfigReader {
	
	public Properties pr= new Properties();
	
	public ConfigReader() throws Exception {
			
	
	try {
			File propfile= new File(System.getProperty("user.dir") + "\\src\\test\\resource\\com\\selenium\\properties\\Configuration.properties");	
			FileInputStream fis = new FileInputStream(propfile);
			pr.load(fis);
		} catch (Exception e) {
	
			e.printStackTrace();
			throw new Exception();
	
		}
	}
	
	public String getBrowsername() throws Exception
	{
		String browser = pr.getProperty("BrowserName");
		if(browser==null) {
			throw new Exception("Enter a valid browser name");
		}
		return browser;
	}
	
	public String getUrl() throws Exception
	{
		String url = pr.getProperty("Url");
		if(url==null) {
			throw new Exception("Enter valid URL");
		}
		return url;
	}
	
	
	
	
}
