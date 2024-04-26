package com.nexttech.stepdefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.nexttech.pageobjectmodel.DellSmallBusinessPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DellSmallBusiness {
WebDriver driver;
	
	@Given("^User will visit Dell WebPage$")
	public void user_will_visit_Dell_WebPage() throws Throwable {
	   
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		   
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.dell.com/en-us");
	    driver.manage().window().maximize();
		
	}

	@When("^User will click the dropdown solutions and see small business$")
	public void user_will_click_the_dropdown_solutions_and_see_small_business() throws Throwable {
	    
		
		Actions act =new Actions (driver);
		DellSmallBusinessPOM  obj =new DellSmallBusinessPOM (driver);
		act.moveToElement(obj.Solutions()).build().perform();
		act.moveToElement(obj.SmallBusiness()).build().perform();
	}

	@Then("^User will able to click the small business solutions$")
	public void user_will_able_to_click_the_small_business_solutions() throws Throwable {
	   
		DellSmallBusinessPOM obj =new DellSmallBusinessPOM (driver);
		obj.Business().click();
		 
	    Thread.sleep(2000);
		
	//	driver.close();
	//	driver.quit();
		
		
	}


}
