package com.qait.TestNGSelenium;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


public class driverutil {
	public static WebDriver driver;
	public static String driverpath = "driver/chromedriver.exe";
	public static WebDriverWait wait;	
	
	
	static public void setup() {
    	System.out.println("Inside the loop");
		System.setProperty("webdriver.chrome.driver", driverpath);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    	System.out.println("Outside the loop");

	}

}
