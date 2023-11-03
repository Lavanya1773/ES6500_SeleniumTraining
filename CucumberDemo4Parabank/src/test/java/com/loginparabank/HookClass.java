package com.loginparabank;

import com.registerparabannk.HelperClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HookClass {
	@Before
	public static void setUp() {
		HelperClass.setUpDriver();
	}
	
	@After
	public static void  tearDown() {
		HelperClass.tearDown();
	}

}
