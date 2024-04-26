package com.nexttech.stepdefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.nexttech.pageobjectmodel.DemoOrangePOM;
import com.nexttech.pageobjectmodel.SignupfbPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DemoOrange {
	WebDriver driver;
	@Given("^User wants to visit OrangeHRM homepage$")
	public void user_wants_to_visit_OrangeHRM_homepage() throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("https://www.orangehrm.com/");
	driver.manage().window().maximize();
	    
	}

	@When("^User click on Get a Free Demo option$")
	public void user_click_on_Get_a_Free_Demo_option() throws Throwable {
		DemoOrangePOM demo=new DemoOrangePOM(driver);
		demo.getfreedemo().click();
	}

	@When("^User write First name \"([^\"]*)\" and Last name \"([^\"]*)\"$")
	public void user_write_First_name_and_Last_name(String arg1, String arg2) throws Throwable {
		DemoOrangePOM name = new DemoOrangePOM(driver);
		name.Firstname().sendKeys(arg1);
		name.Lastname().sendKeys(arg2);
	}
    @When("^User Type Email \"([^\"]*)\" and Phone Number \"([^\"]*)\"$")
    public void user_Type_Email_and_Phone_Number(String arg1, String arg2) throws Throwable {
    	DemoOrangePOM obj = new DemoOrangePOM(driver);
    	obj.Email().sendKeys(arg1);
    	obj.Contact().sendKeys(arg2);
}

	@When("^User will select Country name$")
	public void user_will_select_Country_name() throws Throwable {
		DemoOrangePOM count=new DemoOrangePOM(driver);   
		
		Select dropdown =new Select (count.Country());
		dropdown.selectByVisibleText("Bangladesh");    
	}

	@When("^User click on I am not a robot and Get a Free Demo option$")
	public void user_click_on_I_am_not_a_robot_and_Get_a_Free_Demo_option() throws Throwable {
		DemoOrangePOM robo = new DemoOrangePOM(driver);
		robo.Notrobot().click();
		robo.Request().click();
	}

	@Then("^User will able to visits Get a Free Demo page$")
	public void user_will_able_to_visits_Get_a_Free_Demo_page() throws Throwable {
	   // driver.quit();
	}



}
