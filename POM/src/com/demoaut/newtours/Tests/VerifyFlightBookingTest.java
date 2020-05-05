package com.demoaut.newtours.Tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.demoaut.newtours.Pages.BookFlight;
import com.demoaut.newtours.Pages.FlightConfirmation;
import com.demoaut.newtours.Pages.FlightFinder;
import com.demoaut.newtours.Pages.Login;
import com.demoaut.newtours.Pages.SelectFlight;

public class VerifyFlightBookingTest extends Base {

	

	

	@Test
	public void verifyFlghtBooking() {
		Login lg = new Login(driver);
		FlightFinder ff = new FlightFinder(driver);
		SelectFlight sf = new SelectFlight(driver);
		BookFlight bf = new BookFlight(driver);
		FlightConfirmation fc = new FlightConfirmation(driver);


		lg.applicationLogin("mercury", "mercury");	
		ff.findFlight();
		sf.selectFlights();
		bf.purchaseTicket("John", "Smith", "356458965745");
		
		String actualMsg = fc.confirmationText();
		String expectedMsg = "Your itinerary has been booked!";
		Assert.assertEquals(actualMsg, expectedMsg);

	}

	

}
