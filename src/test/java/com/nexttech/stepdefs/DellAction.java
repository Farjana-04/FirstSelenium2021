package com.nexttech.stepdefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.nexttech.pageobjectmodel.DellActionPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DellAction {
	WebDriver driver;
	@Given("^user visits Dell homepage$")
	public void user_visits_Dell_homepage() throws Throwable {
	  
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		   //soft wait
		 driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
				     
	    //how to maximize the browser
		 driver.manage().window().maximize();
						 
		//how to open url  driver.get method
		 driver.get("https://www.dell.com/en-us");

	}

	@When("^user go to Solutions dropdown menu and able to see View All Solutions$")
	public void user_go_to_Solutions_dropdown_menu_and_able_to_see_View_All_Solutions() throws Throwable {
		//object of actions
		Actions act =new Actions (driver);
		DellActionPOM  obj =new DellActionPOM (driver);
		//declear the object
		act.moveToElement(obj.Solutions()).build().perform(); //Taking action from one window to another window
		// obj.AllSolutions().click();   //For view all solutions
		//obj.BigData().click();         //Wants to see Big Data option
		obj.SmallBusiness().click();
		act.moveToElement(obj.SmallBusiness()).build().perform();  // want to go small business to Small business solutions window
		obj.SmallSolutions().click();
		
		//heard wait
		 Thread.sleep(5000);
	    
	}

	@Then("^user redirects to solution portfolio$")
	public void user_redirects_to_solution_portfolio() throws Throwable {
	 //how to close the window
		//driver.close(); //close for current window
		driver.quit();    //quit for all window
	}

}
