package com.demoaut.newtours.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class FlightFinder {
	
	@FindBy(css="body > div > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(4) > td > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(5) > td > form > table > tbody > tr:nth-child(9) > td:nth-child(2) > font > font > input[type=radio]:nth-child(2)")
	 private WebElement busClss;
	
	@FindBy(name="airline")
	private WebElement aLine;
	
	@FindBy(name="findFlights")
	private WebElement submit;
	
	@FindBy(linkText="SIGN-OFF")
	private WebElement signoff;
	
	public FlightFinder(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	 
	
	public void findFlight() {
		busClss.click();
		
		Select dd = new Select(aLine);
		dd.selectByIndex(1);
		submit.click();
	}
	
	public Boolean signoffLinkPresent() {
		Boolean signOffPresent = signoff.isDisplayed();
		return signOffPresent;
	}

}
