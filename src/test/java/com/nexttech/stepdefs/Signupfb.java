package com.nexttech.stepdefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.nexttech.pageobjectmodel.SignupfbPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Signupfb {
	WebDriver driver;
	
	@Given("^user visiting facebook home page and click Create New Account$")
	public void user_visiting_facebook_home_page_and_click_Create_New_Account() throws Throwable {
		try {
		// How to open browser
		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe"); 
		driver = new ChromeDriver();
		   //soft wait
		 driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		 //how to maximize the browser
		 driver.manage().window().maximize();
		 //how to open url  driver.get method
		 driver.get("https://www.facebook.com/");
		 SignupfbPOM create = new SignupfbPOM(driver);
		 create.creatbutton().click();
    }
		catch(Exception e) {
			System.out.println("Browser & URL is not working");
		}
	}

	@When("^user enter First name \"([^\"]*)\" and Last name \"([^\"]*)\"$")
	public void user_enter_First_name_and_Last_name(String arg1, String arg2) throws Throwable {
		try {
		SignupfbPOM name = new SignupfbPOM(driver);
		//name.creatbutton().click();
		name.firstname().sendKeys(arg1);
		name.lastname().sendKeys(arg2);
		
	}
		catch(Exception e) {
			System.out.println("Name field typing button is not working");
		}
		}
	@When("^user type valid email address \"([^\"]*)\", confirm email address \"([^\"]*)\" and New password \"([^\"]*)\"$")
	public void user_type_valid_email_address_confirm_email_address_and_New_password(String arg1, String arg2, String arg3) throws Throwable {
		try {
	    SignupfbPOM email= new SignupfbPOM(driver);
		email.email().sendKeys(arg1);
		email.confirmemail().sendKeys(arg2);
		email.password().sendKeys(arg3);
		}
		catch(Exception e) {
			System.out.println("Email is not typable");
		}
		}
	
    //@When("^user type valid email address \"([^\"]*)\" and New password \"([^\"]*)\"$")
	//public void user_type_valid_email_address_and_New_password(String arg1, String arg2) throws Throwable {
		
	    
	@Then("^user select dropdown Month and dropdown Day and dropdown Year$")
	public void user_select_dropdown_Month_and_dropdown_Day_and_dropdown_Year() throws Throwable {
        SignupfbPOM se1=new SignupfbPOM(driver);   //object for page object model
		
		Select dropdown =new Select (se1.click_month);
		dropdown.selectByIndex(7);
		
		Select dropdown1 =new Select (se1.click_day);
		dropdown1.selectByValue("8");
		
		Select dropdown2= new Select (se1.click_year);
		dropdown2.selectByVisibleText("1985");
	    
	}

	@Then("^user click Gender option and click sign up option$")
	public void user_click_Gender_option_and_click_sign_up_option() throws Throwable {
		SignupfbPOM gender = new SignupfbPOM(driver);
		gender.gender().click();
		gender.signup().click();
		WebDriverWait wait= new WebDriverWait(driver,20);
	}

	@Then("^user able to redirect Facebook Account$")
	public void user_able_to_redirect_Facebook_Account() throws Throwable {
		//Thread.sleep(5000); //It is a hard wait code
	   //how to close the window
		driver.close(); //To close the current window
		//driver.quit();  //To close the browser or all of window
	    
	}



}
