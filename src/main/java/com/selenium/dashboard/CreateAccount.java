package com.selenium.dashboard;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.selenium.driver.DriverSingleton;

public class CreateAccount {
private WebDriver driver;
	
	public CreateAccount() {
		this.driver  = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css ="#header > div.nav > div > div > nav > div.header_user_info > a")
	private WebElement btnSignin;
	
	@FindBy(id = "email_create")
	private WebElement txtEmailAddress;

	@FindBy(id ="SubmitCreate")
	private WebElement btnCreate_an_account;
	
	//Personal Information
	@FindBy(css ="#account-creation_form > div > div.clearfix > div > label")
	private List<WebElement> RadioButton;
	
	@FindBy(id = "customer_firstname")
	private WebElement txtFirstname;
	
	@FindBy(id = "customer_lastname")
	private WebElement txtLastname;
	
	@FindBy(id = "email")
	private WebElement txtEmail;
	
	@FindBy(id = "passwd")
	private WebElement txtPassword;
	
	@FindBy(id = "uniform-days")
	private WebElement txtDays;
	
	@FindBy(id = "uniform-months")
	private WebElement txtMonths;
	
	@FindBy(id = "uniform-years")
	private WebElement txtYears;
	
	@FindBy(id = "newsletter")
	private WebElement btnNewsletter;
	
	@FindBy(id = "optin")
	private WebElement btnoptin;
	
	//Address
	@FindBy(id = "firstName")
	private WebElement Firstname;
	
	@FindBy(id = "lastName")
	private WebElement Lastname;
	
	@FindBy(id = "company")
	private WebElement Company;
	
	@FindBy(id = "address1")
	private WebElement Address1;
	
	@FindBy(id = "address2")
	private WebElement Address2;
	
	@FindBy(id = "city")
	private WebElement City;
	
	@FindBy(id = "uniform-id_state")
	private WebElement State;
	
	@FindBy(id = "postcode")
	private WebElement Postcode;
	
	@FindBy(id = "uniform-id_country")
	private WebElement Country;
	
	@FindBy(id = "other")
	private WebElement AdditionalInfo;
	
	@FindBy(id = "phone")
	private WebElement HomePhone;
	
	@FindBy(id = "phone_mobile")
	private WebElement PhoneMobile;
	
	@FindBy(id = "alias")
	private WebElement Alias;
	
	@FindBy(id = "submitAccount")
	private WebElement btnSubmitAccount;
	
//	@FindBy(id = "email")
//	private WebElement testEmail;
//	
//	@FindBy(id = "passwd")
//	private WebElement testPassword;
//	
//	@FindBy(id = "SubmitLogin")
//	private WebElement btnSubmitLogin;
	
	public void SignIn() {
		btnSignin.click();
//		testEmail.sendKeys("kemal@email.com");
//		testPassword.sendKeys("112233");
//		btnSubmitLogin.click();
	}
	
	public void EmailAddress(String email_create) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,200)");
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(txtEmailAddress));
		txtEmailAddress.sendKeys(email_create);
		btnCreate_an_account.click();
	}

	public void RadioButton() {
		RadioButton.get(0).click();
	}
	
	public void PersonalInformation(String customer_firstname,String customer_lastname, String email, String passwd) {
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		txtFirstname.sendKeys(customer_firstname);
		txtLastname.sendKeys(customer_lastname);
		txtEmail.clear();
		txtEmail.sendKeys(email);
		txtPassword.sendKeys(passwd);	
		//autosroll ke element tertentu
		btnNewsletter.click();
		btnoptin.click();
	}
	
	public void Days(int selection) {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(txtDays));
		txtDays.click();
		
		this.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		List<Keys> lstSequance = new ArrayList<Keys>();
		for(int i = 0; i< selection; i++) {
			lstSequance.add(Keys.DOWN);
		}
		lstSequance.add(Keys.ENTER);
		CharSequence[] cs = lstSequance.toArray(new CharSequence[lstSequance.size()]);
		Actions keyDown = new Actions(driver); keyDown.sendKeys(Keys.chord(cs)).perform();
	}
	
	public void Months(int selection) {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(txtMonths));
		txtMonths.click();
		
		this.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		List<Keys> lstSequance = new ArrayList<Keys>();
		for(int i = 0; i< selection; i++) {
			lstSequance.add(Keys.DOWN);
		}
		lstSequance.add(Keys.ENTER);
		CharSequence[] cs = lstSequance.toArray(new CharSequence[lstSequance.size()]);
		Actions keyDown = new Actions(driver); keyDown.sendKeys(Keys.chord(cs)).perform();
	}
	
	public void Years(int selection) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,200)");
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(txtYears));
		txtYears.click();
		this.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		List<Keys> lstSequance = new ArrayList<Keys>();
		for(int i = 0; i< selection; i++) {
			lstSequance.add(Keys.DOWN);
		}
		lstSequance.add(Keys.ENTER);
		CharSequence[] cs = lstSequance.toArray(new CharSequence[lstSequance.size()]);
		Actions keyDown = new Actions(driver); keyDown.sendKeys(Keys.chord(cs)).perform();
	}
	
	public void Address(String company, String address1,String address2, String city, String postcode, String other, String phone, String phone_mobile, String alias ) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebDriverWait wait = new WebDriverWait(driver, 40);
		wait.until(ExpectedConditions.elementToBeClickable(Company));
		Company.sendKeys(company);
		Address1.sendKeys(address1);
		Address2.sendKeys(address2);
		City.sendKeys(city);
		Postcode.sendKeys(postcode);
		AdditionalInfo.sendKeys(other);
		HomePhone.sendKeys(phone);
		PhoneMobile.sendKeys(phone_mobile);
		Alias.clear();
		Alias.sendKeys(alias);
	}
	
	public void istState(int selection) {
		JavascriptExecutor js = (JavascriptExecutor) driver;

		WebDriverWait wait = new WebDriverWait(driver, 40);
		wait.until(ExpectedConditions.elementToBeClickable(State));
		State.click();
		this.driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		List<Keys> lstSequance = new ArrayList<Keys>();
		for(int i = 0; i< selection; i++) {
			lstSequance.add(Keys.DOWN);
		}
		lstSequance.add(Keys.ENTER);
		CharSequence[] cs = lstSequance.toArray(new CharSequence[lstSequance.size()]);
		Actions keyDown = new Actions(driver); keyDown.sendKeys(Keys.chord(cs)).perform();
	}
	
	public void istCountry(int selection) {
		JavascriptExecutor js = (JavascriptExecutor) driver;

		WebDriverWait wait = new WebDriverWait(driver, 40);
		wait.until(ExpectedConditions.elementToBeClickable(Country));
		Country.click();
		this.driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		List<Keys> lstSequance = new ArrayList<Keys>();
		for(int i = 0; i< selection; i++) {
			lstSequance.add(Keys.DOWN);
		}
		lstSequance.add(Keys.ENTER);
		CharSequence[] cs = lstSequance.toArray(new CharSequence[lstSequance.size()]);
		Actions keyDown = new Actions(driver); keyDown.sendKeys(Keys.chord(cs)).perform();
	}
	
	public void Submit() {
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		JavascriptExecutor js = (JavascriptExecutor) driver;
		btnSubmitAccount.click();
		
	}
	

	
}
