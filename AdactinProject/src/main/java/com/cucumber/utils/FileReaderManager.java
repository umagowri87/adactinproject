package com.cucumber.utils;

import java.io.FileNotFoundException;

public class FileReaderManager {
	
	public static ConfigReader cr;
	public static FileReaderManager  frm = new FileReaderManager();
	
	public ConfigReader getConfigReader() throws Exception
	{
		if(cr==null)
		{
			cr=new ConfigReader();
		}
		return cr;
	}
	
	private FileReaderManager() {
		
	}

}
