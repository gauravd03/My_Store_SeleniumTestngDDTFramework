package com.myStore.testcases;

import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.myStore.utilities.Config;

public class BaseClass {
	BaseClass() {
	}

	// object created to read data from properties file
	Config readConfig = new Config();

	String url = readConfig.getBaseUrl();
	String browser = readConfig.getBrowser();
	public static WebDriver driver;
	public static Logger logger;

	@BeforeClass
	public void setup() {

		/// code for opening broser
		switch (browser.toLowerCase()) {

		case "chrome":
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			break;
		case "firefox":
			driver = new FirefoxDriver();
			break;
		default:
			driver = null;
			break;
		}

		// Adding implicitly wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));

		// for loggin setup
		logger = LogManager.getLogger("MyStoreFrameworkDevelopment1");
		driver.get(url);

	}

	@AfterClass
	public void tearDown() {
		//driver.close();
		//driver.quit();
	}

}
