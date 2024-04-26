package com.nexttech.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignupfbPOM {
	WebDriver driver;    // Global variable for WebDriber
	/*constructor is not a method but special type of method
    constructor name should be match with class name
    It has no return type*/
	
	public SignupfbPOM (WebDriver driver) {   //Local variable   
	    this.driver=driver;                  //global variable and local variable hand shaking, let's make a deal we working together
	    PageFactory.initElements(driver, this); //PageFactory here we keep our web elements, its from a library
	   }
	  @FindBy(xpath="//html/body/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/form/div[5]/a") // Full xpath as a locator or absolute xpath as a locator              
	  WebElement click_createbutton;   // I have to declare the name of web elements
	  public WebElement creatbutton(){   // I have to create the method of web elements
	  return click_createbutton;        // Its helps to return our web elements
	  }
	  
	  @FindBy(name="firstname")                    
	  WebElement edit_firstname;
	  public WebElement firstname(){
	  return edit_firstname;
	   
	  }
	  @FindBy(name="lastname")
	  WebElement edit_lastname;
	  public WebElement lastname(){
	  return edit_lastname;
	  
	  }
	  @FindBy(name="reg_email__")
      WebElement edit_email;
      public WebElement email(){
	  return edit_email;
      }
	  @FindBy(name="reg_email_confirmation__")
      WebElement edit_confirm;
      public WebElement confirmemail(){
	  return edit_confirm;

      }
      @FindBy(name="reg_passwd__")
	  WebElement edit_password;
	  public WebElement password(){
	  return edit_password;
	  
	  }
	  @FindBy(name="sex")
      WebElement click_gender;
      public WebElement gender(){
	  return click_gender; 
      }
	 
      @FindBy(id="month")
      public WebElement click_month;
      
      @FindBy(id="day")
      public WebElement click_day;
      
	  @FindBy(id="year")
	  public WebElement click_year;
	  
	  @FindBy(name="websubmit")
      WebElement click_signup;
      public WebElement signup(){
	  return click_signup; 
      }
	  
	  
	  
      }	  
	  
