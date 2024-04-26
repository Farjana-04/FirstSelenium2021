package com.nexttech.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DellIndustriesPOM {
	WebDriver driver; 
    /*
    * Constructor is not a method but a special type of method * 1. Constructor shouldn't have any return type.
    * 2. Constructor Name and Class Name should be the same. 
    */
	public DellIndustriesPOM(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements( driver,this);
	}
	 
	
	 @FindBy (xpath="//*[@id=\"unified-masthead-navigation\"]/nav/ul/li[2]/a/span")// locator 
	   
	   WebElement act_Solutions; 
	   public WebElement Solutions() { 
		return act_Solutions; 
		   
	   }
	   
	   @FindBy (xpath="//*[@id=\"unified-masthead-navigation\"]/nav/ul/li[2]/ul/li[4]/a")
		
		WebElement act_Industries; 
	   public WebElement Industries() {
		return act_Industries; 
		
	   }
	
	   @FindBy (xpath="//*[@id=\"unified-masthead-navigation\"]/nav/ul/li[2]/ul/li[4]/ul/li[4]/a") 
	   
	   WebElement Click_Healthcare ; 
	   public WebElement Healthcare() {
		return Click_Healthcare; 
	   }
	   
}
