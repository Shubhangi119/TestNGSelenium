package com.qait.TestNGSelenium;
 
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qait.TestNGSelenium.driverutil;


public class TestSelenium1 extends driverutil {
     
	@BeforeClass
	public static void setup() {
		driverutil.setup();
	}
	
	
	@Test
	public void methodtest1() {
		driver.get("https://google.com");
	}
	

	
	
}
