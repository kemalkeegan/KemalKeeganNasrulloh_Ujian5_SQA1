package com.selenium.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox implements DriverStrategy {

	public WebDriver setStrategy() {
		System.setProperty("webdriver.gecko.driver", "X:/geckodriver/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		return driver;
	}

}
