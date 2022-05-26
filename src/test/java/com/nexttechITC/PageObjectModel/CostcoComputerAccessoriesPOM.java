package com.nexttechITC.PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CostcoComputerAccessoriesPOM {
	
	WebDriver driver;
	
	public CostcoComputerAccessoriesPOM (WebDriver driver) {
		this.driver= driver;
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="navigation-dropdown")
	WebElement hover_shop;
	public WebElement hover_shop() {
		return hover_shop;
		
	}
	
	
	@FindBy(xpath="//div[@id='level1-all-departments']//ul//li//a[text()='Computers']")
	WebElement hover_computers;
	public WebElement hover_computers() {
		return hover_computers;
		
	}
	
	
//	@FindBy(xpath="//div[@id='level2-all-departments']//ul//li//a[text()='Computer Accessories']")
//	WebElement click_ComputerAccessories;
//	public WebElement click_accessories() {
//		return click_ComputerAccessories;
//		
//		
//	}
	
	
	
	

}
