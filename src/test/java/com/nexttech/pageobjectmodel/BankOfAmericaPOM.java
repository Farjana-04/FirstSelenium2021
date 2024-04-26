package com.nexttech.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BankOfAmericaPOM {
	WebDriver driver;
	public BankOfAmericaPOM(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
	}
	 @FindBy(xpath="//*[@id=\"navCreditCards\"]/span[3]")
	 WebElement click_creditcards;
	 public WebElement creditcards(){
	 return click_creditcards;	 
	 }
	 @FindBy(id="cashRewardsCards")
	 WebElement click_cashback;
	 public WebElement cashback() {
	 return click_cashback;	 
	 }
	
	
	

}
