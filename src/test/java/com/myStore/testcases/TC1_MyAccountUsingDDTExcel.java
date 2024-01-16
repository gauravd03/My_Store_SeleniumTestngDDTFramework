package com.myStore.testcases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.myStore.pageobjects.AccountCreationDetails;
import com.myStore.pageobjects.IndexPage;
import com.myStore.pageobjects.MyAccount;
import com.myStore.pageobjects.loginPage;
import com.myStore.utilities.ReadExcelData;

import junit.framework.Assert;

public class TC1_MyAccountUsingDDTExcel extends BaseClass {

	
	
	
	
	@Test(priority=1)
	public void verifyRegistrationAndLogin() {

		// index page action
		IndexPage indexPageobj = new IndexPage(super.driver);
		indexPageobj.clickOnSignIn();
		logger.info("clicked on sign in button");

		// myaccount page action
		loginPage login = new loginPage(super.driver);
		login.enterEmailId("ggauradddsvdaan@gmail.com");
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

	
	@Test( priority=2 ,dataProvider="LoginDataProvider")
	public void verifyLogin(String Email, String Password , String ExpectedName) {
		IndexPage pg = new IndexPage(driver);
		pg.clickOnSignIn();
		logger.info("clicked on sign button for verifying user  ");
		

		loginPage loginpg = new loginPage(driver);
		loginpg.enterRegisteredEmail(Email);
		logger.info("Email entered ");
		loginpg.enterRegisteredPassword(Password);
		logger.info("password entered ");
		loginpg.clickOnSignin();
		logger.info("clicked on sign in button for verifying user account ");

		MyAccount myaccountpg = new MyAccount(driver);
		String user = myaccountpg.getUserName();
		if (user.equals(ExpectedName)) {
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
	
	

	@DataProvider(name = "LoginDataProvider")
	public String[][] LoginDataProvider()
	{
		//System.out.println(System.getProperty("user.dir"));
		String fileName = "C:\\Users\\gdandekar\\OneDrive - Expleo France\\MyStoreTestData - Copy.xlsx";
		logger.info("File found");

		int ttlRows = ReadExcelData.getRowCount(fileName, "LoginTestData");
		int ttlColumns = ReadExcelData.getColCount(fileName, "LoginTestData");
		

		String data[][]=new String[ttlRows-1][ttlColumns];

		for(int i=1;i<ttlRows;i++)//rows =1,2
		{
			for(int j=0;j<ttlColumns;j++)//col=0, 1,2
			{

				data[i-1][j]=ReadExcelData.getCellValue(fileName,"LoginTestData", i,j);
			}

		}
		return data;
	}

}










