package com.myStore.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccount {
	
	WebDriver driver;
	
	public MyAccount(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(xpath="//a[@title=\"View my customer account\"]")
	WebElement userAccount;
	
	@FindBy (xpath="//a[text()='Sign out']")
	WebElement signOut;
	
	//Page Actions
	public boolean isAccountLogin() {
		return userAccount.isDisplayed();
	}
	
	public void clickOnSignOut() {
		signOut.click();
	}
	
	public String getUserName() {
		return userAccount.getText();
	}
	
	
	
	
	
	
	
	

}
