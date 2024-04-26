package com.nexttech.stepdefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.nexttech.pageobjectmodel.AmazonCartPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AmazonCart {
	WebDriver driver;
	
	@Given("^User visit Amazon Homepage$")
	public void user_visit_Amazon_Homepage() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS); 
		//How to open URL
		driver.get("https://www.amazon.com/"); 	
		driver.manage().window().maximize();
		Thread.sleep(10000);
	}

	@Given("^User type Productname \"([^\"]*)\"$")
	public void user_type_Productname(String arg1) throws Throwable {
		AmazonCartPOM search= new AmazonCartPOM(driver);
		search.Search().sendKeys(arg1);
		//WebDriverWait wait=new WebDriverWait(driver, 20);	
		Thread.sleep(10000);
	}

	@Given("^User click on search button$")
	public void user_click_on_search_button() throws Throwable {
		AmazonCartPOM button=new AmazonCartPOM(driver);
		button.searchbutton().click();
	   //WebDriverWait wait=new WebDriverWait(driver, 20);
		Thread.sleep(10000);
	}

	@When("^User click on a product$")
	public void user_click_on_a_product() throws Throwable {
		AmazonCartPOM pro=new AmazonCartPOM(driver);
		pro.product().click();
		//WebDriverWait wait=new WebDriverWait(driver, 20);
		Thread.sleep(10000);
	}

	@When("^Click add to cart$")
	public void click_add_to_cart() throws Throwable {
		AmazonCartPOM click=new AmazonCartPOM(driver);
		click.cartoption().click();
		//WebDriverWait wait=new WebDriverWait(driver, 20);
		Thread.sleep(10000);
	}

	@Then("^User will find the product in shopping cart$")
	public void user_will_find_the_product_in_shopping_cart() throws Throwable {
		AmazonCartPOM shop = new AmazonCartPOM(driver);
		shop.cart().click();
		//WebDriverWait wait=new WebDriverWait(driver, 20);
	   Thread.sleep(10000);
	}



}
