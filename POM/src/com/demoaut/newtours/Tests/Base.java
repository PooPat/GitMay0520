package com.demoaut.newtours.Tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Base {
	
WebDriver driver;
	
	@BeforeClass
	public void openApplication() {
		System.setProperty("webdriver,chrome,driver", "chromedriver.exe");
		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://newtours.demoaut.com/");
	}
	
	@AfterClass
	public void closeApplication() {
		driver.close();
	}

}
