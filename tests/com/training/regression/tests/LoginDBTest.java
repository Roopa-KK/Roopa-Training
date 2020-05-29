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
import com.training.generics.GenericMethods;
import com.training.generics.ScreenShot;
import com.training.pom.LoginPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class LoginDBTest {
	private WebDriver driver;
	private String baseUrl;
	private LoginPOM loginPOM;
	private static Properties properties;
	private ScreenShot screenShot;
	private GenericMethods genericMethods; 
	
	
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
		genericMethods = new GenericMethods(driver); 
		// open the browser
		driver.get(baseUrl);
	}

	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		driver.quit();
	}


	@Test(dataProvider = "db-inputs", dataProviderClass = LoginDataProviders.class)
	//public void loginDBTest(String userName, String password)
	
	public void loginDBTest(String regFirstName, String regLastName, String regemail, String regUserName, String regPass1, String regPass2, String regPhoneTextBox, String language) throws Exception
	{
		// for demonstration 
//		genericMethods.getElement("login", "id"); 
		/*System.out.println("Username/n" +userName);
		System.out.println("password/n" +password);
		loginPOM.sendUserName(userName);
		
		
		loginPOM.sendPassword(password);
		loginPOM.clickLoginBtn(); */
		
		//genericMethods.getElement("TestCase3", "id"); 
		
		/*System.out.println("FirstName/n" +regFirstName);
		System.out.println("LastName/n" +regLastName);
		System.out.println("email/n" +regemail);
		System.out.println("UserName" +regUserName);
		System.out.println("Password" +regPass1);
		System.out.println("ConfirmPassword" +regPass2);
		System.out.println("PhoneNumber" +regPhoneTextBox);
		System.out.println("Language" +language); */
		
				
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
		loginPOM.verifyErrorMsg();

		//screenShot.captureScreenShot(userName);

	}

}