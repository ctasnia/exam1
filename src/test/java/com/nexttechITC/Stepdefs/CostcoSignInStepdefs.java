package com.nexttechITC.Stepdefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.nexttechITC.PageObjectModel.CostcoSignInPOM;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CostcoSignInStepdefs {
	
	WebDriver driver;
	
	@Given("^user visit Costco home page$")
	public void user_visit_Costco_home_page() throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		driver.get("https://www.costco.ca/");
	    
	}
	
	@When("^user clicks on sign in/register$")
	public void user_clicks_on_sign_in_register() throws Throwable {
		CostcoSignInPOM costco = new CostcoSignInPOM (driver);
		costco.SignIn().click();
	}
	
	@When("^user type valid \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_type_valid_and(String arg1, String arg2) throws Throwable {
		CostcoSignInPOM Costco1 = new CostcoSignInPOM (driver);
		Costco1.emailadd().sendKeys(arg1);
		Costco1.password().sendKeys(arg2);
		
		System.out.println(arg1);
		
		Thread.sleep(5000);
	}

	

	@When("^user clicks on Sign In button$")
	public void user_clicks_on_Sign_In_button() throws Throwable {
		CostcoSignInPOM costco2 = new CostcoSignInPOM (driver);
		costco2.SignInButton().click();
	}

	@Then("^user will be able to sign in successfully$")
	public void user_will_be_able_to_sign_in_successfully() throws Throwable {
	    
	}

}
