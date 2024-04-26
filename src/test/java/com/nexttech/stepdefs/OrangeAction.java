package com.nexttech.stepdefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.nexttech.pageobjectmodel.OrangeActionPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class OrangeAction {
	WebDriver driver;
	@Given("^User lands Orangehrm Homepage$")
	public void user_lands_Orangehrm_Homepage() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.orangehrm.com/");
		driver.manage().window().maximize();
	    
	}

	@When("^User goes to platform dropdown menu and see employee management and click it$")
	public void user_goes_to_platform_dropdown_menu_and_see_employee_management_and_click_it() throws Throwable {
		Actions orange = new Actions(driver);
		OrangeActionPOM obj = new OrangeActionPOM(driver);
	    orange.moveToElement(obj.platform()).build().perform();
	    obj.platform().click();
	    obj.management().click();
	}

	@Then("^User able to redirect platform profile$")
	public void user_able_to_redirect_platform_profile() throws Throwable {
		//driver.quit();
	   
	}



}
