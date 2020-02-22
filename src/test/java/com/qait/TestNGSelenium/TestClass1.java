package com.qait.TestNGSelenium;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestClass1 {
	
		@BeforeMethod
		public void beforeMethod() {
			long id = Thread.currentThread().getId();
			System.out.println("Before test-method. Thread id is: " + id);
		}

		@Test
		public void testMethodsOne() {
			long id = Thread.currentThread().getId();
			System.out.println("Simple test-method One. Thread id is: " + id);
		}

		
	}


