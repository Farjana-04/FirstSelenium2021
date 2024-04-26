package com.nexttech.stepdefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.nexttech.pageobjectmodel.AmazonSearchPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class AmazonSearch {
	WebDriver driver;
	
	@Given("^user visit amazon home page$")
	public void user_visit_amazon_home_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS); 
				
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		//Thread sleep (5000);
      
		
	}

	@Given("^user search by \"([^\"]*)\"$")
	public void user_search_by(String arg1) throws Throwable {
		AmazonSearchPOM  AS= new AmazonSearchPOM (driver);
		AS.Search().sendKeys(arg1);
		WebDriverWait wait=new WebDriverWait(driver, 20);
	}

	@Then("^user click on search button$")
	public void user_click_on_search_button() throws Throwable {
		AmazonSearchPOM  AS= new AmazonSearchPOM (driver);
		AS.searchbutton().click();
		WebDriverWait wait=new WebDriverWait(driver, 20);
	}


	}


