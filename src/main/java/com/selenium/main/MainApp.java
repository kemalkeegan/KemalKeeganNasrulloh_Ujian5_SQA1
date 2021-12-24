package com.selenium.main;

import java.io.File;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

import javax.lang.model.element.Element;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import com.selenium.dashboard.CreateAccount;
import com.selenium.dashboard.AddtoCart;
import com.selenium.dashboard.Checkout;
import com.selenium.driver.DriverSingleton;


public class MainApp {
  public static void main(String[] args) {
	WebDriver driver =  DriverSingleton.getInstance().getDriver();
	driver.get("http://automationpractice.com/index.php");
	
	CreateAccount account = new CreateAccount();
	
	
	account.SignIn();
	account.EmailAddress("kemalkeegann@email.com");
	account.RadioButton();
	account.PersonalInformation("Kemal", "Keegan", "kemalkeegann@email.com" , "112233");
	account.Days(11);
	account.Months(1);
	account.Years(22);
	account.Address("Coba-coba", "1039 S King St HI 96814","1525 Bernice St Honolulu", "Honolulu", "96814", "New Account", "18085940400", "080989999", "Home");
	account.istState(12);
	account.istCountry(1);
	account.Submit();
	
	AddtoCart cart = new AddtoCart();
	cart.Dresses();
	cart.ProductDress();
	cart.addCart();
	cart.Continue();
	cart.Tshirt();
	cart.ProductTshirt();
	cart.addCartTshirt();
	
	Checkout checkout = new Checkout();
	checkout.Summary();
	checkout.Address();
	checkout.Shipping();
	checkout.Payment();
	checkout.ConfirmOrder();
	
  }
}