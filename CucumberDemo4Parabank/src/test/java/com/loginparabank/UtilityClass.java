package com.loginparabank;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class UtilityClass {
	String url;
	String username;
	String password;
	
	public UtilityClass(){
		data();
	}
	
	public void data() {
		File file = new File("C:\\Users\\lsethuraj\\eclipse-workspace\\CucumberDemo4Parabank\\src\\test\\resources\\logindata.properties");
		FileInputStream fio =null;
		try {
			fio = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		Properties prop = new Properties();
		try {
			prop.load(fio);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		url = prop.getProperty("url");
		username = prop.getProperty("username");
	    password = prop.getProperty("password");
	}

}
