package com.stepDefinitions;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.runner.BaseClass;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class Testcase1 extends BaseClass {
	
	public static WebDriver wait;
	
	
	@Given("^I am in Login page$")
	public void i_am_in_Login_page() throws Throwable {
	   
		Assert.assertEquals("http://altoromutual.com:8080/login.jsp", driver.getCurrentUrl());
	}

	@Then("^I should see the home page\\.$")
	public void i_should_see_the_home_page() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver,5);
		wait.until(ExpectedConditions.urlContains("http://altoromutual.com:8080/index.jsp"));
		Assert.assertEquals("http://altoromutual.com:8080/index.jsp", driver.getCurrentUrl());
	}
			
		@When("^I should able to click on ‘Sign in’ button$")
		public void i_should_able_to_click_on_Sign_in_button() throws Throwable {
		
			driver.findElement(By.cssSelector("#LoginLink")).click();
			driver.findElement(By.cssSelector("#uid")).sendKeys("Admin");
			driver.findElement(By.cssSelector("#passw")).sendKeys("Admin");
			driver.findElement(By.cssSelector("input[name='btnSubmit']")).click();
		}
       
		@When("^I click on ‘View Account Summary’$")
		public void i_click_on_View_Account_Summary() throws Throwable {
			WebDriverWait wait = new WebDriverWait(driver,5);
			wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#MenuHyperLink1")));
			driver.findElement(By.cssSelector("#MenuHyperLink1")).click();
		  
		}

		@When("^I should able to Select ‘(\\d+) Checking from the drop down$")
		public void i_should_able_to_Select_Checking_from_the_drop_down(int arg1) throws Throwable {
			Select dropdown = new Select(driver.findElement(By.cssSelector("#listAccounts"))); 
			dropdown.selectByValue("800001");
		}

		@When("^I click on ‘Go’ button\\.$")
		public void i_click_on_Go_button() throws Throwable {
			driver.findElement(By.cssSelector("#btnGetAccount")).click();
		    
		}

		@When("^I click on ‘Sign off’ button$")
		public void i_click_on_Sign_off_button() throws Throwable {
			driver.findElement(By.linkText("Sign Off")).click();  
		}

}  



	
	


