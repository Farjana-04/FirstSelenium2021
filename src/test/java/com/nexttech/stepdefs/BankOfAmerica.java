package com.nexttech.stepdefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.nexttech.pageobjectmodel.BankOfAmericaPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BankOfAmerica {
	
	WebDriver driver;
	
	@Given("^user lands on Bank of America homepage$")
	public void user_lands_on_Bank_of_America_homepage() throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		//System.setProperty("WebDriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.bankofamerica.com/");
		driver.manage().window().maximize();
	    
	}

	@When("^user click on credit cards option$")
	public void user_click_on_credit_cards_option() throws Throwable {
		BankOfAmericaPOM credit=new BankOfAmericaPOM(driver);
	    credit.creditcards().click();
	}

	@When("^user able to click cash back credit card option$")
	public void user_able_to_click_cash_back_credit_card_option() throws Throwable {
		BankOfAmericaPOM cash = new BankOfAmericaPOM(driver);
		cash.cashback().click();
	    
	}

	@Then("^user can see what is inside the cash back credit cards option$")
	public void user_can_see_what_is_inside_the_cash_back_credit_cards_option() throws Throwable {
		driver.close();
		//driver.quit();
	   
	}


}
