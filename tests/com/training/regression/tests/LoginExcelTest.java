package com.training.regression.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.training.bean.LoginBean;
import com.training.dao.ELearningDAO;
import com.training.dataproviders.LoginDataProviders;
import com.training.generics.ScreenShot;
import com.training.pom.LoginPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class LoginExcelTest {
	private WebDriver driver;
	private String baseUrl;
	private LoginPOM loginPOM;
	private static Properties properties;
	private ScreenShot screenShot;

	@BeforeClass
	public static void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
	}

	@BeforeMethod
	public void setUp() throws Exception {
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		loginPOM = new LoginPOM(driver);
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver);
		// open the browser
		driver.get(baseUrl);
	}

	@AfterMethod
	public void tearDown() throws Exception
	{
 	driver.quit();
  	}

	//"xls-inputs"
	//"excel-inputs"
	
	@Test(dataProvider = "excel-inputs", dataProviderClass = LoginDataProviders.class)
	public void loginExcelTest(String regFirstName, String regLastName, String regemail, String regUserName, String regPass1, String regPass2, String regPhoneTextBox, String language) throws Exception
	{
		/*System.out.println("FirstName/n" +fName);
		System.out.println("LastName/n" +lName);
		System.out.println("Email/n" +email);
		System.out.println("Username/n" +userName);
		System.out.println("password/n" +password);
		System.out.println("Confirm Password/n" +confpassword);
		System.out.println("Phone/n" +phone);
		System.out.println("Language/n" +language);
						
		loginPOM.sendUserName(userName);
		loginPOM.sendPassword(password);
		loginPOM.clickLoginBtn();
		screenShot.captureScreenShot(userName); */
		
		// Roopa's Week 3rd Starts
		// Test case1 --Valid data 
		
		loginPOM.clickSignUpLink();
		loginPOM.verifyRegistrationPage();
		loginPOM.enterregFirstName(regFirstName);
		loginPOM.enterregLastName(regLastName);
		loginPOM.enterregemail(regemail);
		loginPOM.enterregUserName(regUserName);
		loginPOM.enterregPass1(regPass1);
		loginPOM.enterregPass2(regPass2);
		loginPOM.enterregPhoneTextBox(regPhoneTextBox);
		loginPOM.clickregLanguageSelect();
		loginPOM.clickregLanguageSelectSearch();
		loginPOM.enterRegLanguage(language);
		loginPOM.clickregProfileRadioBtn();
		loginPOM.clickregisterBtn();
		Thread.sleep(1000);
		loginPOM.verifyRegConfirmationPage();
	
	}
	
	//@Test(dataProvider = "excel-inputs1", dataProviderClass = LoginDataProviders.class)
	public void loginExcelInvalidTest(String regFirstName, String regLastName, String regemail, String regUserName, String regPass1, String regPass2, String regPhoneTextBox, String language) throws Exception
	{	
		
		loginPOM.clickSignUpLink();
		loginPOM.verifyRegistrationPage();
		loginPOM.enterregFirstName(regFirstName);
		loginPOM.enterregLastName(regLastName);
		loginPOM.enterregemail(regemail);
		loginPOM.enterregUserName(regUserName);
		loginPOM.enterregPass1(regPass1);
		loginPOM.enterregPass2(regPass2);
		loginPOM.enterregPhoneTextBox(regPhoneTextBox);
		loginPOM.clickregLanguageSelect();
		loginPOM.clickregLanguageSelectSearch();
		loginPOM.enterRegLanguage(language);
		loginPOM.clickregProfileRadioBtn();
		loginPOM.clickregisterBtn();	
		Thread.sleep(1000);
		loginPOM.verifyErrorMsg();
		
		
		
	}
	
}