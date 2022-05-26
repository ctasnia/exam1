package com.nexttechITC.Stepdefs;

import java.awt.Desktop.Action;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.nexttechITC.PageObjectModel.CostcoComputerAccessoriesPOM;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CostcoComputerAccessoriesStepdefs {
	
	WebDriver driver;
	
	
	@Given("^user goes to Costco url$")
	public void user_visits_Costco_homepage() throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		driver.get("https://www.costco.ca/");
		
		
	}
	
	@When("^user hovers over Shop and hovers over Computers$")
	public void user_hovers_over_Shop_and_hovers_over_Computers() throws Throwable {
	   Actions hover= new Actions(driver);
	   
	   CostcoComputerAccessoriesPOM CCA= new CostcoComputerAccessoriesPOM(driver);
	   
	  hover.moveToElement(CCA.hover_shop()).build().perform();
	  
	 // Actions hover2= new Actions(driver);
	  
	  Thread.sleep(1500);
	  
	  //hover2.moveToElement(CCA.hover_computers()).click().build().perform();
	  
	  CCA.hover_computers().click();
	  
	  
	  Thread.sleep(1500);
	}

	@When("^user clicks Computer Accessories$")
	public void user_clicks_Computer_Accessories() throws Throwable {
		
//		Actions hover= new Actions(driver);
//		CostcoComputerAccessoriesPOM CCA= new CostcoComputerAccessoriesPOM(driver);
//		
//		hover.moveToElement(CCA.click_accessories()).click().build().perform();
//		
//		Thread.sleep(2000);
	}

	@Then("^user will be redirected successfully$")
	public void user_will_be_redirected_successfully() throws Throwable {
	    
	}


}
