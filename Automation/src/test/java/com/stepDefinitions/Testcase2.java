package com.stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.runner.BaseClass;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Testcase2 extends BaseClass {
	public static WebDriver wait;
	
	
    @When("^I click on Transfer Funds button$")
	public void i_click_on_Transfer_Funds_button() throws Throwable {
		
		driver.findElement(By.cssSelector("a[href='/bank/transfer.jsp']")).click();
	}
		
	@When("^I select (\\d+) Corporate’ account as From Account$")
	public void i_select_Corporate_account_as_From_Account(int arg1) throws Throwable {
		
		driver.findElement(By.cssSelector("#fromAccount"));   
		Select dropdown = new Select(driver.findElement(By.cssSelector("#fromAccount")));
		dropdown.selectByValue("800000");
	}

	@When("^I select (\\d+) Checking’ account as To Account$")
	public void i_select_Checking_account_as_To_Account(int arg1) throws Throwable {
		driver.findElement(By.cssSelector("#toAccount"));
		Select dropdown2 = new Select(driver.findElement(By.cssSelector("#toAccount")));
		dropdown2.selectByValue("800001"); 
	}

	@When("^I Enter ‘(\\d+)’ into ‘Amount to Transfer’ text box$")
	public void i_Enter_into_Amount_to_Transfer_text_box(int arg1) throws Throwable {
		driver.findElement(By.cssSelector("#transferAmount")).sendKeys("1000");
	}

	@When("^I click on ‘Transfer Money’ button$")
	public void i_click_on_Transfer_Money_button() throws Throwable {
		driver.findElement(By.cssSelector("#transfer")).click();
	}


	@Then("^I should ‘Verify the Success Message’\\.$")
	public void i_should_Verify_the_Success_Message() throws Throwable {
	String expectedMessage = "1000.0 was successfully transferred from Account 800000 into Account 800001";
	String actualMessage = 	driver.findElement(By.cssSelector("span[align='center'] span")).getText();
	Assert.assertTrue(actualMessage.contains(expectedMessage));
	
	}

	@When("^I click on ‘Sign Off’ button$")
	public void i_click_on_Sign_Off_button() throws Throwable {
		driver.findElement(By.linkText("Sign Off")).click();
	}

	@Then("^I should able to see the http://altoromutual\\.com:(\\d+)/index\\.jsp page$")
	public void i_should_able_to_see_the_http_altoromutual_com_index_jsp_page(int arg1) throws Throwable {
	    Assert.assertEquals("http://altoromutual.com:8080/index.jsp", driver.getCurrentUrl());
	}


		

	

}
