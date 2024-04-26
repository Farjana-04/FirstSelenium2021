package com.nexttech.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DellSmallBusinessPOM {
	WebDriver driver;
	 
	 public DellSmallBusinessPOM(WebDriver driver) {
	 
		 this.driver=driver;
		 PageFactory.initElements(driver, this);
	 }
	 
	
	  @FindBy(xpath="//*[@id=\"unified-masthead-navigation\"]/nav/ul/li[2]/a/span")
	  WebElement act_Solutions;
	  public WebElement Solutions() { 
	  return act_Solutions;
	  }

	
	   @FindBy(xpath="//*[@id=\"unified-masthead-navigation\"]/nav/ul/li[2]/ul/li[5]/a")
	   WebElement click_SmallBusiness;
	   public WebElement SmallBusiness() { 
	   return click_SmallBusiness;
	   }
	   
	   @FindBy(xpath="//*[@id=\"unified-masthead-navigation\"]/nav/ul/li[2]/ul/li[5]/ul/li[3]/a")
	   WebElement click_Business;
	   public WebElement Business() { 
	   return click_Business;
	   }
}
