package com.nexttech.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BestSellerPOM {
        WebDriver driver;//global variable
        //constructor is not a method but special type of method
        //constructor name should be match with classname
        //It has no return type
        
        public BestSellerPOM(WebDriver driver) {  //Local driver
        	this.driver = driver;
        	PageFactory.initElements(driver, this);
        }
        @FindBy(xpath="//a[@href=\"/gp/bestsellers/?ref_=nav_cs_bestsellers_8a080d3d7b55497ea1bdd97b7cff8b7b\"]")
        WebElement click_bestseller;
        public WebElement bestseller(){
			return click_bestseller; 
        
}
}