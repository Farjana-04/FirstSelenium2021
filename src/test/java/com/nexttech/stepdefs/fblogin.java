package com.nexttech.stepdefs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.nexttech.pageobjectmodel.fbloginPOM;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class fblogin {
	
	WebDriver driver; 
	

	@Given("^user visit fblogin page$")
	public void user_visit_fblogin_page() throws Throwable {
		//How to open chrome browser
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		//How to open URL
		driver.get("https://www.facebook.com/"); 
		driver.manage().window().maximize();
	}

	@When("^user use \"([^\"]*)\" email address$")
	public void user_use_email_address(String arg1) throws Throwable {
		//We need access webElements from PageObjectsmodel
		//We can get WebElements by creating object
		fbloginPOM email = new fbloginPOM(driver);       //Create object for Constructor class
		email.email().sendKeys(arg1);                    //By object name, call method
	}

	@When("^user use \"([^\"]*)\" password$")
	public void user_use_password(String arg2) throws Throwable {
		fbloginPOM pass = new fbloginPOM(driver);
		pass.password().sendKeys(arg2);
	}

	@Then("^user should able to click on login$")
	public void user_should_able_to_click_on_login() throws Throwable {
	  fbloginPOM login = new fbloginPOM(driver);
	  login.login().click();
	  
	}
	    
	}




