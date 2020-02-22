package com.qait.TestNGSelenium;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
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
		@Test
		   @Parameters("myName")
		   public void parameterTest(String myName) {
		      System.out.println("Parameterized value is : " + myName);
		   }
		
		   @Test
		   public void testmessageone() {
		      System.out.println("Inside testmessageone");
		      String message = "Hi!" + "Goodmorning";
		      Assert.assertEquals(message, "Hi!Goodmorning");
		   }
		   
		   @Test
		   public void testmessagetwo() {
		      System.out.println("Inside testmessagetwo");
		      String message = "Hi!" + "morning";
		      Assert.assertEquals(message, "Hi!morning");
		   }
		   

		   @Test(dependsOnMethods = { "testmessageone","testmessagetwo" })
		   public void Testdepends() {
		      System.out.println("This is dependency test check");
		   }
		
		@Test
		public void testMethodsTwo() {
			long id = Thread.currentThread().getId();
			System.out.println("Simple test-method Two. Thread id is: " + id);
		}
		

		@AfterMethod
		public void afterMethod() {
			long id = Thread.currentThread().getId();
			System.out.println("After test-method. Thread id is: " + id);
		}
	}


