package com.demoaut.newtours.Tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.demoaut.newtours.Pages.Login;
import com.demoaut.newtours.Pages.SignOn;

public class VerifyInvalidLoginTest extends Base {



	
		@Test
		public void verifyInvalidLogin() {
			Login lp = new Login(driver);
            SignOn so = new SignOn(driver);
            

			lp.applicationLogin("mercury", "pass111");
			String actualMsg = so.getMsg();
			String expectedMsg = "Welcome back to Mercury Tours! Enter your user information to access the member-only areas of this site. If you don't have a log-in, please fill out the registration form.";
			Assert.assertEquals(actualMsg, expectedMsg);
		

		}

		

	}
