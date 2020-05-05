package com.demoaut.newtours.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookFlight {
	//giving credentials to book a flight
	
	@FindBy(name="passFirst0")
	private WebElement firstName;
	
	
    @FindBy(name="passLast0")
    private WebElement lastName;
    
    
    @FindBy(name="creditnumber")
    private WebElement ccNum;
    
    @FindBy(name="buyFlights")
    private WebElement bookFlight;
    
    public BookFlight(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	 
    
    public void purchaseTicket(String passfirstName, String passlastName, String creditCardNum) {
    	firstName.sendKeys("passfirstName");
    	lastName.sendKeys("passlastName");
    	ccNum.sendKeys("creditCardNum");
    	bookFlight.click();
    }

}