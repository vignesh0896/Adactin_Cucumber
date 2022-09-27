package com.adactin.properties;

import java.io.IOException;

public  class FileReaderManager {
	private FileReaderManager() {
		// TODO Auto-generated constructor stub
	}
	
	public static FileReaderManager getinstance() {
		FileReaderManager fr=new FileReaderManager();
		return fr;

	}
	
		
	public ConfigurationManager getinstanceCR() throws IOException {
		
		ConfigurationManager reader = new ConfigurationManager();
		return reader;
		
		

	}
	

}
