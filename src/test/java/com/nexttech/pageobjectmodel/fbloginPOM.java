package com.nexttech.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class fbloginPOM {
	
	WebDriver driver;     //WebDriver is my interface and it helps us to go inside the Internet
	                      //driver is a global variable
	
	/*Constructor is not a method but special type of method.
	  Constructor name should be match with class name
	  It has no return type.
	*/
	//Constructor works like a agreement between global variable and local variable
	 
	  public fbloginPOM (WebDriver driver) {   //Local variable   
	    this.driver=driver;                  //global variable and local variable hand shaking, let's make a deal we working together
	    PageFactory.initElements(driver, this);
	   }
	  
	  @FindBy(name="email")                    // xpath as a Locators
	  WebElement edit_emailoption;
	  public WebElement email(){
	  return edit_emailoption;
	   
	  }
	  @FindBy(id="pass")
	  WebElement edit_passwordoption;
	  public WebElement password(){
	  return edit_passwordoption;
	  
	  }
	  @FindBy(name="login")
      WebElement click_login;
      public WebElement login(){
	  return click_login; 

}
}