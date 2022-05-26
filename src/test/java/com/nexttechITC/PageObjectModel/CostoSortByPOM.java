package com.nexttechITC.PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CostoSortByPOM {
	WebDriver driver;
	
	public CostoSortByPOM (WebDriver driver) {
         this.driver= driver;
		
		PageFactory.initElements(driver, this);
	}
	

	@FindBy(id="search-field")
	WebElement type_searchbox;
	public WebElement costcosearch() {
		return type_searchbox;
		
	}
	
	@FindBy(xpath="//i[@automation-id=\'searchWidgetButton\']")
	WebElement click_searchbutton;
	public WebElement CostcoSearchButton() {
		return click_searchbutton;
		
	}
	
	
	@FindBy(id="sort_by")
	public WebElement click_sort_by_dropdown;	
	
   }




