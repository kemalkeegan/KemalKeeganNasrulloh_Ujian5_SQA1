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

public class AddtoCart {
private WebDriver driver;
	
	public AddtoCart() {
		this.driver  = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (css="#block_top_menu > ul > li:nth-child(2) > a")
	private WebElement buttonDresses;
	
	@FindBy (css = "#center_column > ul > li > div > div.right-block > h5 > a")
	private List<WebElement> buttonAddDress;
	
	@FindBy (css = "#add_to_cart > button")
	private WebElement buttonAddCart;
	
	@FindBy (css = "#layer_cart > div.clearfix > div.layer_cart_cart.col-xs-12.col-md-6 > div.button-container > span")
	private WebElement buttonContinue;
	
	@FindBy (css = "#block_top_menu > ul > li:nth-child(3) > a")
	private WebElement buttonTshirt;
		
	@FindBy (css = "#center_column > ul > li > div > div.right-block > h5 > a")
	private List<WebElement> buttonAddTshirt;
	
	@FindBy (css = "#add_to_cart > button")
	private WebElement buttonAddCartTshirt;
	
	public void Dresses() {
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		buttonDresses.click();
	}
	
	public void ProductDress() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1500)");
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		buttonAddDress.get(3).click();
	}
	
	public void addCart() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		buttonAddCart.click();
	}
	
	public void Continue() {
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,-500)");
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		buttonContinue.click();
	}
	
	public void Tshirt() {
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		buttonTshirt.click();
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
	public void ProductTshirt() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		buttonAddTshirt.get(0).click();
	}
	
	public void addCartTshirt() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,300)");
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		buttonAddCartTshirt.submit();
	}
}
