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
import com.training.pom.SecondWeek;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class SecondWeekTests

{
	private static WebDriver driver;
	private static String baseUrl;
	private static LoginPOM loginPOM;
	private static Properties properties;
	private static ScreenShot screenShot;
	public static SecondWeek secondweek;

//	LoginPOM loginPOM = new LoginPOM
	
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
	
  /*  @AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		driver.quit(); 
	} */
    
    @Test(priority=1)
    public void testcase2() throws Exception
	{
		loginPOM.sendUserName("admin");
		loginPOM.sendPassword("admin@123");
//		loginPOM.clickLoginBtn(); 
			
	   loginPOM.verifyAdminmenu();
		Thread.sleep(5000);
		loginPOM.clickCareersPromotionsLink();
	    loginPOM.validateCareersPromotionPage();
	     loginPOM.clickCareersPromotionsPageIcons("Careers");
	    loginPOM.displayedCareersPage();
	    loginPOM.clickAddIcon();
	    loginPOM.displayedCareersAddPage();
	    loginPOM.enteraddNameCareerfield("KK");
	    loginPOM.clickaddCareerbutton();
	    loginPOM.displayaddedNamesuccessMsg();
	    loginPOM.displaycreatedCareerAddedInList("KK");
	    loginPOM.clickCareersPromotionsLink();
	    loginPOM.validateCareersPromotionPage();
	    loginPOM.clickCareersPromotionsPageIcons("Promotions");
	   loginPOM.clickPromotionsPageIcons("Add"); 
	   loginPOM.enternameInPromotionPage("KK1");
	   loginPOM.clickplusAddBtn();
	   loginPOM.displayaddedNamesuccessMsg();
	   loginPOM.displaycreatedPromotionAddedList("KK1");
	   loginPOM.clickPromotionsPageIcons("Add a training session");
	   loginPOM.entertrainingSessionName("KK Session");
	   loginPOM.clickcoachNameInTrainSession();
	   Thread.sleep(5000);
	   loginPOM.clickcoachNameSearchInTrainSession();
	   Thread.sleep(5000);
	   loginPOM.entercoachNameSearch("Manzoor");
	   Thread.sleep(5000);
	   loginPOM.clicknextStepBtn();
	   loginPOM.displayaddCoursesToThisSessionPage();
	   loginPOM.selectCourseListWindow();
	   loginPOM.clickAddCourseIcon();
	   loginPOM.clickNextStepBtnInCourceList();
	   loginPOM.displayUpdateSuccessfulMsg();
	   loginPOM.enterStudentName("Sunil");
	   loginPOM.displayStudentmatchNames();
	   loginPOM.getStudentNameAddedWindow();
	   loginPOM.clickFinishSessionCreationBtn();
	  
	} 
	
    @Test(priority=2)
    public void testcase3() throws Exception
	{
    	loginPOM.sendUserName("admin");
		loginPOM.sendPassword("admin@123");
//		loginPOM.clickLoginBtn(); 
			
	   loginPOM.verifyAdminmenu();
		Thread.sleep(5000);
		loginPOM.clickCreateACourseLink();
		loginPOM.displayCreateNewCoursePage();
		loginPOM.enterCourseTitle("Kajoll-Course");//courseTitle -Course Name -Roopa-Course
	    loginPOM.enterCourseCode("Kajoll254");
	    loginPOM.clearCourseTeacher();
	    loginPOM.enterCourceTeacherName("Roo");
	    loginPOM.selectCourseCategory();
	    loginPOM.selectcourseCategoryAnotherField("Proj");
	    loginPOM.selectCourseLanguage();
	    loginPOM.EntercourseLanguage("English");
	    loginPOM.clickPlusCreateCourseBtn();
	    loginPOM.displayCourseAddedMsg();
	    loginPOM.verifyAdminmenu();
		Thread.sleep(5000);
		loginPOM.clickClassesLink();
		loginPOM.displayClassesMsgpage();
		loginPOM.clickAllIconsInClassesPg("Add classes");
		screenShot.captureScreenShot("Selected user should be get highlighted");
		loginPOM.afterClickingAddPgDisplayed();
		loginPOM.enterUserGrpName("Kajoll-Class" );  //classesNameToAadd - Demo
		loginPOM.EnterUserGrpDescription("Kajoll-Class");//usergrpDesc = Demo
		loginPOM.clickgroupPermissionArrow();
		loginPOM.enterGroupPermissionDescription("Ope"); //grpPermission = OPE
		loginPOM.clickplusAddBtn();
		loginPOM.displayAddedClassessuccessMsg();
		loginPOM.displayCreatedClassesAddedInList("Kajoll-Class"); //classesNameToAadd -Demo
		loginPOM.clickDetailsColumnIconsClassesPg("Kajoll-Class","Subscribe users to class");//classesNameToAadd =Demo , clickBtn=Subscribe users to class
		loginPOM.displaySubscribeUsersToClassPg();
		loginPOM.selectUserOnPlatformWindow();
		screenShot.captureScreenShot("Selected user should be get highlighted");
		loginPOM.clickArrowAddright();
		screenShot.captureScreenShot("Selected user should be get highlighted");
		loginPOM.clickUsersRegInAnyGrp();
		loginPOM.clickSubUsersToClassBtn();
		loginPOM.clickDetailsColumnIconsClassesPg("Kajoll-Class","Subscribe class to courses");//classesNameToAadd =Demo , clickBtn=Subscribe class to courses
		loginPOM.displaysubscribeClassToCoursePg();
		loginPOM.selectCoursesOnPlatformWindow();
		
		/* tHIS BELOW Method I tried to call the created Course however its faling , I will try later AND for this and as of now will hardcode the value
		//loginPOM.courseTitleSelectWindow("HIJKL-Course");//courseTitle
		*/
		screenShot.captureScreenShot("selected courses should get highlighted in Courses on the platform");
		loginPOM.clickArrowAddright();
		loginPOM.clickSubUsersToClassBtn(); 
	
	} 
    
    @Test(priority=3)
    public void testcase4() throws Exception
	{
    	loginPOM.sendUserName("admin");
		loginPOM.sendPassword("admin@123");
//		loginPOM.clickLoginBtn(); 
			
	   loginPOM.verifyAdminmenu();
		Thread.sleep(5000);
		loginPOM.clickAddUserLink();
		loginPOM.displayAddUserPage();
		loginPOM.enterFirstNameToAddUser("Manzoor254");
		loginPOM.enterLastNameToAddUser("mehadi254");
		loginPOM.enterEmailToAddUser("manzoor@gmail.com");
		loginPOM.enterPhoneToAddUser("9876543210");
		loginPOM.enterLoginToAddUser("manzoor254");
		loginPOM.selectPswrdRadioBtn();
		loginPOM.enterPswrdTextBox("manzoor254");
		loginPOM.selectProfileListBox();
		loginPOM.selectProfileListBoxAnotherField("Stud");
		loginPOM.CreatedAddBtnToSaveUser();
		loginPOM.displayUserAddedPg();
		loginPOM.verifyAdminmenu();
		 loginPOM.clickClassesLink();
   		loginPOM.displayClassesMsgpage();
   		loginPOM.clickAllIconsInClassesPg("Add classes");
   		screenShot.captureScreenShot("Selected user should be get highlighted");
   		loginPOM.afterClickingAddPgDisplayed();
   		loginPOM.enterUserGrpName("Chinnu-Class" );  //classesNameToAadd - Demo
   		loginPOM.EnterUserGrpDescription("Chinnu-Class");//usergrpDesc = Demo
   		loginPOM.clickgroupPermissionArrow();
   		loginPOM.enterGroupPermissionDescription("Ope"); //grpPermission = OPE
   		loginPOM.clickplusAddBtn();
   		loginPOM.displayAddedClassessuccessMsg();
   		loginPOM.displayCreatedClassesAddedInList("Chinnu-Class"); //classesNameToAadd -Demo
   		loginPOM.clickDetailsColumnIconsClassesPg("Chinnu-Class","Subscribe users to class");//classesNameToAadd =Demo , clickBtn=Subscribe users to class
   		loginPOM.displaySubscribeUsersToClassPg();
   		loginPOM.selectUserOnPlatformWindow();
   		screenShot.captureScreenShot("Selected user should be get highlighted");
   		loginPOM.clickArrowAddright();
   		screenShot.captureScreenShot("Selected user should be get highlighted");
   		loginPOM.displaysubscribeClassToCoursePg();
 		loginPOM.selectCoursesOnPlatformWindow();
		
	}
    
	
}



