package com.myStore.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {
	
	WebDriver driver;
	
	public loginPage(WebDriver rdriver){
		driver =rdriver;
		PageFactory.initElements(rdriver, this);
	}

	
	//create account objects
	@FindBy (xpath="//input[@name=\"email_create\"]")
	WebElement emailEnterBox;
	
	@FindBy (xpath="//button[@id=\"SubmitCreate\"]")
	WebElement emailSubmitButton;
	
	//already registered objects
	@FindBy( xpath="//input[@id=\"email\"]")
	WebElement registeredEmail;
	
	@FindBy( xpath="//input[@id=\"passwd\"]")
	WebElement registeredPassword;
	
	@FindBy( xpath="//button[@id=\"SubmitLogin\"]")
	WebElement signinButton;
	
	
	
	//Actions create account
	
	public void enterEmailId(String emailId) {
		emailEnterBox.sendKeys(emailId);
	}
	
	public void clickOnSubmit() {
		emailSubmitButton.click();
	}
	
	
	// already registered actions
	
	public void enterRegisteredEmail(String email) {
		registeredEmail.sendKeys(email);
	}
	
	public void enterRegisteredPassword(String pass) {
		registeredPassword.sendKeys(pass);
	}
	
	public void clickOnSignin() {
		signinButton.click();
	}
}
