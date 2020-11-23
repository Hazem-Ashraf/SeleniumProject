package com.google.selenium.tets;

import static org.testng.Assert.fail;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UserRegistration extends PageBase {

	public UserRegistration(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(xpath = "//input[@name='firstname']")
	WebElement firstnametxt;
	
	@FindBy(xpath = "//input[@name='lastname']")
	WebElement lastnametxt;
	
	@FindBy(xpath = "//input[@name='phone']")
	WebElement phonetxt;
	
	@FindBy(xpath = "//input[@name='email']")
	WebElement emailtxt;
	
	@FindBy(xpath = "//input[@name='password']")
	WebElement passwordtxt;
	
	@FindBy(xpath = "//input[@name='confirmpassword']")
	WebElement confirmpasswordtxt;
	
	@FindBy(xpath = "//button[@class='signupbtn btn_full btn btn-success btn-block btn-lg']")
	WebElement signup;
	
	@FindBy(xpath = "//input[@name='username']")
	WebElement emaillogintxt;
	
	@FindBy(xpath = "//input[@name='password']")
	WebElement passwordlogintxt;
	
	@FindBy(xpath = "//button[@class='btn btn-primary btn-lg btn-block loginbtn']")
	WebElement loginbutton;
	
	public void userReg (String firstname , String lastname , String phone , String email , String password  ) {
	
		WebDriverWait wait = new WebDriverWait(driver, 10);
		try {
			wait.until(ExpectedConditions.visibilityOf(firstnametxt));
		} catch (Exception e) {
			fail();
		}
		firstnametxt.sendKeys(firstname);
		try {
			wait.until(ExpectedConditions.visibilityOf(lastnametxt));
		} catch (Exception e) {
			fail();
		}
		
		lastnametxt.sendKeys(lastname);
		try {
			wait.until(ExpectedConditions.visibilityOf(phonetxt));
		} catch (Exception e) {
			fail();
		}
		phonetxt.sendKeys(phone);
		
		try {
			wait.until(ExpectedConditions.visibilityOf(emailtxt));
		} catch (Exception e) {
			fail();
		}
		emailtxt.sendKeys(email);
		
		passwordtxt.sendKeys(password);
		confirmpasswordtxt.sendKeys(password);
		signup.click();
	}
	
	public void UserLoginn (String Emaillogin , String passwordlogin) {
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		try {
			wait.until(ExpectedConditions.visibilityOf(emaillogintxt));
		} catch (Exception e) {
			fail();
		}
		emaillogintxt.sendKeys(Emaillogin);
		passwordlogintxt.sendKeys(passwordlogin);
		loginbutton.click();
		
	}

}
