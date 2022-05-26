package com.nexttechITC.PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CostcoSignInPOM {
	WebDriver driver;
	
	public CostcoSignInPOM (WebDriver driver) {
		
		this.driver= driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(id="header_sign_in")
	WebElement Click_Sign_In;
	public WebElement SignIn() {
		return Click_Sign_In;
	}
	
	@FindBy(id="signInName")
	WebElement Type_email_address;
	public WebElement emailadd() {
		return Type_email_address;
		
	}
	
	@FindBy(name="Password")
	WebElement Type_password;
	public WebElement password() {
		return Type_password;
		
	}
	
	@FindBy(id="next")
	WebElement Click_SignIn_Button;
	public WebElement SignInButton() {
		return Click_SignIn_Button;
		
	}
	
	
	
	
	
	
	
	
	
	
	

}
