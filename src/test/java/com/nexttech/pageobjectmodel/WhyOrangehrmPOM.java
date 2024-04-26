package com.nexttech.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WhyOrangehrmPOM {
	WebDriver driver;
	
	public WhyOrangehrmPOM(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="/html/body/nav/div/div[2]/ul[1]/li[2]/a")
	WebElement click_why;
	public WebElement WhyOrangehrm() {
	return click_why;
	}
	@FindBy(xpath="/html/body/nav/div/div[2]/ul[1]/li[2]/div/div/div[2]/div/div[2]/p[3]/a")
    WebElement click_custom;
	public WebElement Customization() {
	return click_custom;	
	}
	@FindBy(xpath="/html/body/section[1]/div/div/div/div/div/a")
	WebElement click_contact;
	public WebElement Contactsale() {
	return click_contact;	
	}
}
