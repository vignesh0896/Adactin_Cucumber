package com.adactin.properties;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationManager {
	
	public static Properties p;
	
	public ConfigurationManager() throws IOException {
		
		File f = new File("C:\\Users\\VIGNESH\\eclipse-workspace\\Adactin_Cucumber\\src\\test\\java\\com\\adactin\\properties\\Adactin.properties");
		FileInputStream fis = new FileInputStream(f);
		p=new Properties();
		p.load(fis);
		

	}
	
	public String getbrowser() {
		String browser = p.getProperty("browser");
		return browser;

	}
	
	public String geturl() {
		String url = p.getProperty("url");
		return url;

	}

}
