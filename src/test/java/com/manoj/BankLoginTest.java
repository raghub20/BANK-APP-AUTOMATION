package com.manoj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class BankLoginTest {
	
	WebDriver driver;
	
	
	
	@Test
	public void customerLoginTest() {
		System.setProperty("webdriver.gecko.driver", "./resources/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("http://www.way2automation.com/angularjs-protractor/webtables/");
		driver.quit();
	}
	
	@Test
	public void invalildCustomerLoginTest() {
		System.setProperty("webdriver.gecko.driver", "./resources/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("http://www.way2automation.com/angularjs-protractor/webtables/");
		driver.quit();
	}
	
}
