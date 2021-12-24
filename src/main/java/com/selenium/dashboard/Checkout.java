package com.selenium.dashboard;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.selenium.driver.DriverSingleton;

public class Checkout {
private WebDriver driver;
	
	public Checkout() {
		this.driver  = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (css = "#center_column > p.cart_navigation.clearfix > a.button.btn.btn-default.standard-checkout.button-medium")
	private WebElement buttonProceedtocheckout1;
	
	@FindBy (css = "#center_column > form > p > button")
	private WebElement buttonProceedtocheckout2;
	
	@FindBy (css = "#form > div > p.checkbox > label")
	private WebElement buttonTerms;
	
	@FindBy (css = "#form > p > button")
	private WebElement buttonProceedtocheckout3;
	
	@FindBy (css = "#HOOK_PAYMENT > div > div > p > a")
	private List<WebElement> buttonPayment;
	
	@FindBy (css = "#cart_navigation > button")
	private WebElement buttonCheck;
	
	@FindBy (css = "#center_column > div > p > strong")
	private WebElement txtSuccess;
	
	
	public void Summary() {
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,700)");
		buttonProceedtocheckout1.click();
	}
	
	public void Address() {
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,700)");
		buttonProceedtocheckout2.click();
	}
	
	public void Shipping() {
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,400)");
		buttonTerms.click();
		buttonProceedtocheckout3.click();
	}
	
	public void Payment() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,400)");
		buttonPayment.get(0).click();
	}
	
	public void ConfirmOrder() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,300)");
		buttonCheck.click();
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		js.executeScript("window.scrollBy(0,300)");
	}
}
