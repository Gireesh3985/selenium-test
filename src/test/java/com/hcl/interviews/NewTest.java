package com.hcl.interviews;

import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;		
import org.openqa.selenium.firefox.FirefoxDriver;		
import org.testng.Assert;		
import org.testng.annotations.Test;	
import org.testng.annotations.BeforeTest;	
import org.testng.annotations.AfterTest;		
public class NewTest {		
	    private WebDriver driver;		
		@Test				
		public void testEasy() {	
			driver.get("http://54.255.203.220:8080/spring-mvc-showcase");  
			String title = driver.getTitle();				 
			Assert.assertTrue(title.contains("spring-mvc-showcase")); 		
		}	
		@BeforeTest
		public void beforeTest() {
		    System.setProperty("webdriver.gecko.driver","/home/ubuntu/geckodriver");
		    driver = new FirefoxDriver();  
		}		
		@AfterTest
		public void afterTest() {
			driver.quit();			
		}		
}
