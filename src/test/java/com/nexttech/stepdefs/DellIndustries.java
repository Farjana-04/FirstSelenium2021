package com.nexttech.stepdefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.nexttech.pageobjectmodel.DellIndustriesPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DellIndustries {
	WebDriver driver;
	@Given("^User looks up at Dell homepage$")
	public void user_looks_up_at_Dell_homepage() throws Throwable {
		try {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS); 
			
	    driver.manage().window().maximize();
		    
	    driver.get("https://www.dell.com/en-us");  
	}
		catch(Exception e) {
		System.out.println("Something wrong");
		}
		}

	@When("^User pay a visit to the Solutions dropdown menu and where able to see Industries and able to click Healthcare & Life Sciences$")
	public void user_pay_a_visit_to_the_Solutions_dropdown_menu_and_where_able_to_see_Industries_and_able_to_click_Healthcare_Life_Sciences() throws Throwable {
		
		Actions act = new Actions (driver);
		DellIndustriesPOM industry = new DellIndustriesPOM(driver);
		act.moveToElement(industry.Solutions()).build().perform(); 
		WebDriverWait wait=new WebDriverWait(driver, 20);
	}

	@Then("^User switch to Solutions portfolio$")
	public void user_switch_to_Solutions_portfolio() throws Throwable {
		Actions act = new Actions (driver);
		DellIndustriesPOM industry = new DellIndustriesPOM(driver);
		act.moveToElement(industry.Industries()).build().perform();
		industry.Healthcare().click();
		WebDriverWait wait=new WebDriverWait(driver, 20); 
		//driver.close(); 
		//driver.quit(); 
	}
}
