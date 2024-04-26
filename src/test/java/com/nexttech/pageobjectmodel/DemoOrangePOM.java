package com.nexttech.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoOrangePOM {
	WebDriver driver;
	public DemoOrangePOM(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//*[@id=\"header-navbar\"]/ul[3]/li[2]/a")
	WebElement click_getdemo;
	public WebElement getfreedemo() {
	return click_getdemo;	
	}
	@FindBy(xpath="//input[@name=\"FirstName\"]")
    WebElement type_name;
	public WebElement Firstname() { 
	return type_name;	
	}
	@FindBy(xpath="//input[@name=\"LastName\"]")
    WebElement type_last;
	public WebElement Lastname() { 
	return type_last;	
	}
	@FindBy(xpath="//input[@name=\"Email\"]")
    WebElement type_email;
	public WebElement Email () { 
	return type_email;	
	}
	@FindBy(xpath="//input[@name=\"Contact\"]")
    WebElement type_phone;
	public WebElement Contact() { 
	return type_phone;	
	}
	@FindBy(xpath="//*[@id=\"Form_submitForm_Country\"]")
	WebElement Select_Country;
    public WebElement Country() {
    return Select_Country;	
    }
		
	@FindBy(xpath="//*[@id=\"recaptcha-anchor\"]/div[4]")
    WebElement click_robot;
	public WebElement Notrobot() { 
	return click_robot;	
	}
	@FindBy(name="action_request")
    WebElement click_free;
	public WebElement Request() { 
	return click_free;	
	}
	
}
