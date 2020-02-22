package com.qait.TestNGSelenium;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestSelenium2 extends driverutil {
    
	@BeforeClass
	public static void setup() {
		driverutil.setup();
	}
	
	
	@Test
	public void methodtest2() {
		driver.get("https://www.gmail.com");
	}
}
