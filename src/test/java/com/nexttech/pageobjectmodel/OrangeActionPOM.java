package com.nexttech.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeActionPOM {
	WebDriver driver;
	public OrangeActionPOM(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//*[@id=\"header-navbar\"]/ul[1]/li[1]/a")
    WebElement act_platform;
	public WebElement platform() {
	return act_platform;	
	}
	@FindBy(xpath="//*[@id=\"header-navbar\"]/ul[1]/li[1]/div/div[1]/div[1]/div/div[1]/p[2]/a")
    WebElement click_management;
	public WebElement management() {
	return click_management;
	}
}
