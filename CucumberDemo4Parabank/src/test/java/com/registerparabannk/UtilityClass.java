package com.registerparabannk;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class UtilityClass {
	String url;
	String firstname;
	String lastname;
	String address;
	String city;
	String state;
	String zipcode;
	String phone;
	String ssn;
	String username;
	String password;
	String confirmpassword;
	
	public UtilityClass(){
		data();
	}
	
	public void data() {
		File file = new File("src/test/resources/registerdata.properties");
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
		firstname = prop.getProperty("firstname");
		lastname = prop.getProperty("lastname");
		address = prop.getProperty("address");
		city = prop.getProperty("city");
		state = prop.getProperty("state");
		zipcode = prop.getProperty("zipcode");
		phone = prop.getProperty("phone");
		ssn = prop.getProperty("ssn");
		username = prop.getProperty("username");		
		password = prop.getProperty("password");
		confirmpassword = prop.getProperty("confirmpassword");
	}

}
