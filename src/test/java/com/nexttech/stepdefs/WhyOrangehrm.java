package com.nexttech.stepdefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.nexttech.pageobjectmodel.WhyOrangehrmPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class WhyOrangehrm {
	WebDriver driver;
	@Given("^user enter orangehrm homepage$")
	public void user_enter_orangehrm_homepage() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.orangehrm.com/");
		driver.manage().window().maximize();  
	}
    @When("^user hover over on Why OrangeHRM option$")
	public void user_hover_over_on_Why_OrangeHRM_option() throws Throwable {
    	WhyOrangehrmPOM why = new WhyOrangehrmPOM(driver); 
    	why.WhyOrangehrm().click();
	}

	@Then("^user able click on the Customization$")
	public void user_able_click_on_the_Customization() throws Throwable {
		WhyOrangehrmPOM custom = new WhyOrangehrmPOM(driver);
		custom.Customization().click();
	}

	@Then("^User can click on contact sales button$")
	public void user_can_click_on_contact_sales_button() throws Throwable {
		WhyOrangehrmPOM sales = new WhyOrangehrmPOM(driver);
		sales.Contactsale().click();
		
		Thread.sleep(5000);
		driver.quit();
	}


}
