package com.myStore.utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class Config {
	Properties prop;
	
	String path="C:\\Users\\gdandekar\\Desktop\\Java training\\java learn\\eclipslearn\\MyStoreFrameWorkDevelopment1\\Configuration\\config.properties";

	
	public Config(){
		try {
		prop=new Properties();
		
			FileInputStream fis=new FileInputStream(path);
			prop.load(fis);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		
		public String getBaseUrl(){
			String urll=prop.getProperty("baseurl");
			return urll;
		}
		
		public String getBrowser() {
			return prop.getProperty("browser");
		}
	}

