package com.myStore.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IndexPage {
	WebDriver driver;
	
	public IndexPage(WebDriver rdriver){
		driver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	//WebElements
	
	@FindBy (xpath="//a[@class=\"login\"]")
	public WebElement signin;
	
	
	//Actions
	public void clickOnSignIn() {
		signin.click();
	}

}
