package com.stepDefinitions;

import org.openqa.selenium.chrome.ChromeDriver;

import com.runner.BaseClass;

import cucumber.api.java.Before;

public class Hooks extends BaseClass{
	
	@Before 
	public void start()throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "C:/Selenium/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://altoromutual.com:8080/login.jsp");
		driver.manage().window().maximize();
		
	    }
	//@After
 
///	driver.close();
}
