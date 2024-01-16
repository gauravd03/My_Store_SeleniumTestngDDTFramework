package com.myStore.testcases;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.myStore.pageobjects.AccountCreationDetails;
import com.myStore.pageobjects.IndexPage;
import com.myStore.pageobjects.MyAccount;
import com.myStore.pageobjects.loginPage;

import junit.framework.Assert;

public class TC1_MyAccount extends BaseClass {

	
	
	
	
	@Test(priority=1)
	public void verifyRegistrationAndLogin() {

		// index page action
		IndexPage indexPageobj = new IndexPage(super.driver);
		indexPageobj.clickOnSignIn();
		logger.info("clicked on sign in button");

		// myaccount page action
		loginPage login = new loginPage(super.driver);
		login.enterEmailId("sauravdrrtr@gmail.com");
		login.clickOnSubmit();
		logger.info("mail enterd and clicked on submit butoon");

		// account creation details action
		AccountCreationDetails accountCreationpg = new AccountCreationDetails(driver);
		accountCreationpg.selectMrGender();
		logger.info("gender selected");
		accountCreationpg.enterFirstName("Gaurav");
		logger.info("Firstname entered");
		accountCreationpg.enterLname("Dandekar");
		logger.info("lastname entered");
		accountCreationpg.enterPassword("Gaurav@123");
		logger.info("passsword enterd");
		accountCreationpg.clickOnRegister();
		logger.info("clicked on register ");

		// verification is user created acoount or not
		MyAccount myaccount = new MyAccount(driver);
		boolean verification = myaccount.isAccountLogin();
		myaccount.clickOnSignOut();

		Assert.assertEquals(verification, true);
	}

	@Test(priority=2)
	public void verifyLogin() {
		IndexPage pg = new IndexPage(driver);
		pg.clickOnSignIn();

		loginPage loginpg = new loginPage(driver);
		loginpg.enterRegisteredEmail("ggauraddsvdaan@gmail.com");
		loginpg.enterRegisteredPassword("Gaurav@123");
		loginpg.clickOnSignin();

		MyAccount myaccountpg = new MyAccount(driver);
		String user = myaccountpg.getUserName();
		if (user.equals("Gaurav Dandekar")) {
			logger.info("user verified");
			System.out.println("user verified");
			Assert.assertTrue(true);
		} else {
			logger.info("wrong user loggen in");
			System.out.println("Wrong login");
			Assert.assertFalse(false);
		}
		
		myaccountpg.clickOnSignOut();
		
	}

}
