package com.demoaut.newtours.Tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.demoaut.newtours.Pages.FlightFinder;
import com.demoaut.newtours.Pages.Login;

public class VerifyValidLoginTest extends Base {

	
	
	
	@Test
	public void verifyValidLogin() {
		Login lp = new Login(driver);
		FlightFinder ff = new FlightFinder(driver);
		
		
		
		
		lp.applicationLogin("mercury", "mercury");
		Boolean signOffLinkVisible = ff.signoffLinkPresent();
		Assert.assertTrue(signOffLinkVisible);
	}
	
	

}
