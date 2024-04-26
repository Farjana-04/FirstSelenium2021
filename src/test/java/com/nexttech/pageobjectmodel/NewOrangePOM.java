package com.nexttech.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewOrangePOM {
WebDriver driver;
public NewOrangePOM(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="/html/body/nav/div/div[2]/ul[1]/li[4]/a")
    WebElement act_company;
	public WebElement Company() {
	return act_company;	
	}
	@FindBy(xpath="/html/body/nav/div/div[2]/ul[1]/li[4]/ul/div/div/div/p[4]/a")
    WebElement click_articles;
	public WebElement Newarticles() {
	return click_articles;
	}
}
