package com.nexttech.stepdefs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Bestbuy {
	WebDriver driver;
	
	@Given("^user visits Bestbuy homepage$")
	public void user_visits_Bestbuy_homepage() throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Driver\\chromedriver.exe");
		
		//System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		 driver = new ChromeDriver();
		 
		 driver.get("https://www.Bestbuy.com/");
	}

	@Then("^user should be able to redirect the Bestbuy Page$")
	public void user_should_be_able_to_redirect_the_Bestbuy_Page() throws Throwable {
	    
	}


}
