package com.myStore.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountCreationDetails {

	WebDriver driver;

	public AccountCreationDetails(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// object repository
	@FindBy(xpath = "//input[@id=\"id_gender1\"]")
	WebElement mrGender;

	@FindBy(xpath = "//input[@id=\"id_gender2\"]")
	WebElement mrsGender;

	@FindBy(xpath = "//input[@id=\"customer_firstname\"]")
	WebElement firstName;

	@FindBy(xpath = "//input[@id=\"customer_lastname\"]")
	WebElement lastName;

	@FindBy(xpath = "//input[@id=\"passwd\"]")
	WebElement password;

	@FindBy(xpath = "//span[text()='Register']")
	WebElement registerButton;

	// page Actions
	public void selectMrGender() {
		mrGender.click();
	}

	public void enterFirstName(String FName) {
		firstName.sendKeys(FName);
	}

	public void enterLname(String Lname) {
		lastName.sendKeys(Lname);
	}

	public void enterPassword(String pass) {
		password.sendKeys(pass);
	}

	public void clickOnRegister() {
		registerButton.click();
	}

}
