package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.LoginPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class LoginTests {

		private static WebDriver driver;
	private static String baseUrl;
	private static LoginPOM loginPOM;
	 	private static Properties properties;
	private static ScreenShot screenShot;

	
	@BeforeClass
	public static void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		loginPOM = new LoginPOM(driver); 
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(baseUrl);
	}

	
	@BeforeMethod
	public void setUp() throws Exception {
		
	}
	
    @AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		driver.quit(); 
	} 
	
	
	@Test(priority=1)
	// Test Case 1 : To verify whether application allows teacher to get log out from the application

	public void validLoginTest() 
	{
	loginPOM.sendUserName("kkboys254");
	loginPOM.sendPassword("kkboys@254");
    loginPOM.clickLoginBtn(); 
    loginPOM.verifyHomePage("Hello Roops Pujari and welcome");
	loginPOM.clickUserIcon();
	loginPOM.verifyUsermenu();	
	loginPOM.clickLogoutBtn();
	screenShot.captureScreenShot("First"); 

	}	
	
	
    @Test(priority=2)
     //Test Case 2 : To verify whether application allows admin to get login into application
	
	public void testCase2()
	{
		loginPOM.sendUserName("admin");
		loginPOM.sendPassword("admin@123");
		loginPOM.clickLoginBtn(); 
		loginPOM.verifyAdminmenu();
			
	}

	@Test(priority=3)
	// Test Case 3 : To verify whether application allows admin to change the password in Edit Profile page
	
	//SMALL NOTE : I have done the pre-Req steps also login into application. 
	
	public void testCase3()// throws InterruptedException
	{
		loginPOM.sendUserName("kkboys");
		loginPOM.sendPassword("roopa@1234");
		loginPOM.clickLoginBtn();
     	loginPOM.clickUserProfile();
		loginPOM.enterOldUserNm("roopa@1234");
		loginPOM.enterNewPass("roops@1234");
		loginPOM.enterConfirmPass("roops@1234");
		loginPOM.saveChangesBtn();
		loginPOM.verifySuccessMessage();
		
		// This is not in my test case I wanted to learn clicking Tab I did it.
		loginPOM.clickHomePage(); 
	}
	
}
