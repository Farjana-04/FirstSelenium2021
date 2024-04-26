package com.nexttech.stepdefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.nexttech.pageobjectmodel.NewOrangePOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class NewOrange {
	WebDriver driver;
	
	@Given("^User view OrangeHRM home page$")
	public void user_view_OrangeHRM_home_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.orangehrm.com/");
		driver.manage().window().maximize();  
	}

	@Given("^User will click Company dropdown menu and can see New Articles$")
	public void user_will_click_Company_dropdown_menu_and_can_see_New_Articles() throws Throwable {
		Actions New = new Actions(driver);
		NewOrangePOM art = new NewOrangePOM(driver);
		New.moveToElement(art.Company()).build().perform();
		art.Company().click();
		art.Newarticles().click();
	}

	@Then("^User will successfully view on New Articles$")
	public void user_will_successfully_view_on_New_Articles() throws Throwable {
	    
	}


}
