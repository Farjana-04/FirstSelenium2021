package com.nexttech.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DellActionPOM {
	WebDriver driver;
	 public   DellActionPOM(WebDriver driver) {
	 this.driver=driver;
	 PageFactory.initElements(driver, this);
	 }
	 
	// @FindBy(xpath="/html/body/main/header/div[3]/nav/ul/li[2]/button")
	@FindBy(xpath="//*[@id=\"unified-masthead-navigation\"]/nav/ul/li[2]/a/span")
	 WebElement act_Solutions;
	 public WebElement Solutions() { 
	 return act_Solutions;
	  }
	
	 //@FindBy(xpath="/html/body/main/header/div[3]/nav/ul/li[2]/ul/li[1]/a")
	 
   //@FindBy(xpath="//*[@id=\"unified-masthead-navigation\"]/nav/ul/li[2]/ul/li[3]/a")   //all solution locator
  /* @FindBy(xpath="//*[@id=\"unified-masthead-navigation\"]/nav/ul/li[2]/ul/li[6]/a")     // Big Data locator
	 WebElement click_Big;
     public WebElement BigData() { 
     return click_Big;
   }*/
	 @FindBy(xpath="//*[@id=\"unified-masthead-navigation\"]/nav/ul/li[2]/ul/li[5]/a")
	 WebElement act_SmallBusiness;
	 public WebElement SmallBusiness() { 
	 return act_SmallBusiness;
	  }
	 @FindBy(xpath="//*[@id=\"unified-masthead-navigation\"]/nav/ul/li[2]/ul/li[5]/ul/li[5]/a")
	 WebElement act_Business;
	 public WebElement SmallSolutions() { 
	 return act_Business;
	  }

}
