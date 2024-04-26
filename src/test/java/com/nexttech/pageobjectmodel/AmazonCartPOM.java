package com.nexttech.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonCartPOM {
	WebDriver driver;
	
	public AmazonCartPOM (WebDriver driver) {   //Local variable   
	    this.driver=driver;                  //global variable and local variable hand shaking, let's make a deal and work together
	    PageFactory.initElements(driver, this);
	}
	
	
	      @FindBy(xpath="//*[@id=\"twotabsearchtextbox\"]")
		  WebElement edit_searchbox;
		  public WebElement Search(){
		  return edit_searchbox;
		  }
		  @FindBy(id="nav-search-submit-button")
		  WebElement click_search;
		  public WebElement searchbutton(){
		  return click_search;
		  }
		  @FindBy(xpath="//img[@alt=\"Shesher Kabita ( Bengali Edition )\"]")
		  WebElement click_product;
		  public WebElement product(){
		  return click_product;
		  }
		  @FindBy(name="submit.add-to-cart")
		  WebElement click_cartoption;
		  public WebElement cartoption(){
		  return click_cartoption;
		  } 
		  @FindBy(id="nav-cart-count")
		  WebElement click_shoppingcart;
		  public WebElement cart(){
		  return click_shoppingcart;
		  
		  }  
		   
	    
	   
	   

}
