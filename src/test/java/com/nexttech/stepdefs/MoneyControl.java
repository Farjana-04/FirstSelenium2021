package com.nexttech.stepdefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MoneyControl {
	WebDriver driver;
	
	
	@Given("^User try to lands Money control home page\\.$")
	public void user_try_to_lands_Money_control_home_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		//System.setProperty("WebDriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.moneycontrol.com");
		driver.manage().window().maximize();
		// Scroll down and click on "View more" Under Stock Action > Top Gainers
		JavascriptExecutor jse= (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,450", ""); //Scroll up
		Thread.sleep(3000);
		jse.executeScript("window.scrollBy(450,0", ""); // Scroll down    
	}
	
		
	@When("^Click on the corresponding Company name$")
	public void click_on_the_corresponding_Company_name() throws Throwable {
	    
	}

	@Then("^User can verify Money control page$")
	public void user_can_verify_Money_control_page() throws Throwable {
		
		driver.close();
	   
	}

}
