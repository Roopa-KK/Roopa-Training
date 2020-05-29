package com.training.pom;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class LoginPOM {
	private static final String SELECT_ORIGIN = "select#origin";

	private WebDriver driver; 
	
	public LoginPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	
	// User Name field
	@FindBy(id="login")
	private WebElement userName;
	
	// Password Field
	@FindBy(id="password")
	private WebElement password;
	
	// Login Button
	@FindBy(id="form-login_submitAuth")
	private WebElement loginBtn;
	
	// xpath to capture Welcome message after loged in
	@FindBy(xpath="//article[@id='homepage-course']")
	private WebElement txtMsg;
	
	// xpath for UserIcon dropdown
	@FindBy(className="dropdown-toggle")
	private WebElement userIcon;
	
	// xpath for Inbox option in User Icon dropdown
	@FindBy(xpath="//a[@title='Inbox']")
	private WebElement InboxBtn;
	
	//xpath for My Ceritficate option in User Icon dropdown
	@FindBy(xpath="//a[@title='My certificates']")
	private WebElement MycertiBtn;
	
	// xpath for Administration Tab
	@FindBy(xpath="//a[@title='Administration']")
	private WebElement adminMenu;
	
	// Logout Button
	@FindBy(id="logout_button")
	private WebElement logoutBtn;
     
	// xPath for HomePage tab
	@FindBy(xpath="//a[@title='Homepage']")
	private WebElement homePageTab;
	
	// path for Profile Edit
	@FindBy(linkText="Edit profile")
	private WebElement userProfile;
	
	// locator for  Old Pass
	@FindBy(id="profile_password0")
	private WebElement oldUserName;
	
	// Xpath for New Pass
	@FindBy(xpath="//input[@id='password1']")
	private WebElement newPass;
	
	// xpath for new Pass confirmation  
	@FindBy(xpath="//input[@id='profile_password2']")
	private WebElement confirmPass;
	
	// xpath for savechanges button
	@FindBy(xpath="//button[@id='profile_apply_change']")
	private WebElement savechanges;
	
	// xpath to capture test mesage after changes saved
	@FindBy(xpath="//div[@class='alert alert-info']")
	private WebElement successMessage;
	
	
	//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	//Week 3 COmplex 
	// Test Case 1- ELTC_076
	//TO verify whether application allows multiple user to get registered as Teacher
	
	//Step1 : Click on Sign Up! link
	@FindBy(xpath="//a[contains(text(),'Sign up!')]")
	private WebElement signUpLink;
	
	//Expected : Registration page should get displayed
	@FindBy(xpath="//li[@class='active']")
	private WebElement registrationPage;
	
	
	
	//Step2 :Enter valid credential in First name textbox
	@FindBy(xpath="//input[@id='registration_firstname']")
	private WebElement regFirstName;
	
	//Expected : entered credential should be get displayed in First name textbox

 
	//Step3 : Enter valid credential in Last name textbox
	@FindBy(xpath="//input[@id='registration_lastname']")
	private WebElement regLastName;
	
	
	//Expected : entered credential should be get displayed in Last name textbox

	

	// Step 4 :Enter valid credential in e-mail textbox
	@FindBy(xpath="//input[@id='registration_email']")
	private WebElement regemail;
	
	//Expected : entered credential should be get displayed in e-mail textbox
	  


	//Step5 : Enter valid credential in username textbox
	@FindBy(xpath="//input[@id='username']")
	private WebElement regUserName;
	
	//Expected :entered credential should be get displayed in username textbox


	//Step6 : Enter valid credential in pass textbox
	@FindBy(xpath="//input[@id='pass1']")
	private WebElement regPass1;
	
	//Expected : entered credential should be get displayed in pass textbox


	//Step7 : Enter valid credential in confirm password textbox
	@FindBy(xpath="//input[@id='pass2']")
	private WebElement regPass2;
	
	//Expected : entered credential should be get displayed in confirm password textbox
	 


	//Step8 : Enter valid credential in phone textbox
	@FindBy(xpath="//input[@id='registration_phone']")
	private WebElement regPhoneTextBox;
	
	//Expected :entered credential should be get displayed in phone textbox

	

	//Step9 : Selected Valid credentials from Language list box
	@FindBy(xpath="//div[@class='filter-option-inner']")
	private WebElement regLanguageSelect;
	
	@FindBy(xpath="//div[@class='bs-searchbox']//input[@class='form-control']")
	private WebElement regLanguageSelectSearch;
	
   //Expected : Selected language should get displayed in Language list box
	

	//Step 10 : Click Teacher radio button in Profile
	@FindBy(xpath="//input[@class='register-profile'][@value='1']")
	private WebElement regProfileRadioBtn;
	
	//Teacher radio button in Profile should get selected


	//Step11 : Click on Register button
	@FindBy(xpath="//button[@id='registration_submit']")
	private WebElement registerBtn;
	
	
	/*Expected : "Dear ,  Your personal settings have been registered.
                An email has been sent to help you remember your login and password.
                Message should get displayed" */
	
	@FindBy(xpath="//li[@class='active']")
	private WebElement regConfirmationPage;
	
	// TestCase2 - Capturing Error message 
	@FindBy(xpath="//div[@class='alert alert-warning']")
	private WebElement errorMsg;

	
	//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	//TC2-ELTC_077

    //TO verify whether application displays error message upon entering invalid details while getting registered as Teacher

   // Same steps need to follow just have to change the excel sheet
	
	//*******************************************************************
	
	// TC03 -ELTC_078
	//To verify whether registered Teacher details stored in database



	
	// METHODS
	
	// Sign Up Link
	
	public void clickSignUpLink()
	{
		this.signUpLink.click();
	}
	
	public void verifyRegistrationPage()
	{
		if(this.registrationPage.getText().contains("Registration"))
				System.out.println("Registration Page Displayed");
		else
			System.out.println("Registration Page not Displayed");
	}
	
	public void enterregFirstName(String regFirstName)
	{
		this.regFirstName.sendKeys(regFirstName);
	}
	
	public void enterregLastName(String regLastName)
	{
		this.regLastName.sendKeys(regLastName);
	}
	
	public void enterregemail(String regemail)
	{
		this.regemail.sendKeys(regemail);
	}
	
	public void enterregUserName(String regUserName)
	{
		this.regUserName.sendKeys(regUserName);
	}
	
	public void enterregPass1(String regPass1)
	{
		this.regPass1.sendKeys(regPass1);
	}
	
	public void enterregPass2(String regPass2)
	{
		this.regPass2.sendKeys(regPass2);
	}
	
	public void enterregPhoneTextBox(String regPhoneTextBox)
	{
		this.regPhoneTextBox.sendKeys(regPhoneTextBox);
	}
	
	public void clickregLanguageSelect()
    {
    	this.regLanguageSelect.click();
    }
 
    public void clickregLanguageSelectSearch()
    {
    	this.regLanguageSelectSearch.click();
    	//this.coachNameInTrainSession.sendKeys(fourCharEnter);
    }
  
    public void enterRegLanguage(String language) throws Exception
    {
    	this.regLanguageSelectSearch.click();
    	Thread.sleep(4000);
    	this.regLanguageSelectSearch.sendKeys(language);
    	Thread.sleep(4000);
    	this.regLanguageSelectSearch.sendKeys(Keys.ENTER);
    }


    public void clickregProfileRadioBtn()
    {
    	this.regProfileRadioBtn.click();
    }
	
	public void clickregisterBtn()
	{
		this.registerBtn.click();
	}
	
	public void verifyRegConfirmationPage()
	{
		if(this.regConfirmationPage.getText().contains("Registration"))
			System.out.println("Registration confirmation page displayed");
		else
			System.out.println("Registration confirmation page not displayed");
		
	}
	
	public void verifyErrorMsg()
	{
		if(this.errorMsg.getText().contains("This login is already in use"))
		System.out.println("Error message displayed");
		else
			System.out.println("Error message not displayed");
	}
//+++++++++++++++++++++++++++++++++++++++++++++++++++	
	// User Name field
	public void sendUserName(String userName)
	{
		this.userName.clear();
		this.userName.sendKeys(userName);
	}
	
	
	// Password Field
	public void sendPassword(String password)
	{
		this.password.clear();
		this.password.sendKeys(password);
		this.password.sendKeys(Keys.ENTER);
	}
	
	
	// Login Button Click
	public void clickLoginBtn()
	{
		this.loginBtn.click();
	}
	
	// Hello welcome message displayed page .Capturing the message and printing in the console. 
	public void verifyHomePage(String txtval)
	{		
		if(this.txtMsg.getText().contains(txtval))
			System.out.println("Welcome message displayed");
		else
			System.out.println("Welcome message did not display");
		
	}
	
	// Clicking on User Icon on the top corner
	public void clickUserIcon()
	{
		this.userIcon.click();
	}
	
	// OPtions from the User Icon dropdown are printing in the console.
	public void verifyUsermenu()
	{		
		if(this.InboxBtn.getText().contains("Inbox"))
			System.out.println("Inbox link displayed");
		else
			System.out.println("Inbox link didnot display");
		if(this.MycertiBtn.getText().contains("certificates"))
			System.out.println("My Certificates link displayed");
		else
			System.out.println("My Certificates link didnot display");
		if(this.logoutBtn.getText().contains("Logout"))
			System.out.println("Logout link displayed");
		else
			System.out.println("Logout link didnot display");
		
	}
	
	// clicking Logout from the user icon dropdown 
	public void clickLogoutBtn()
	{
		this.logoutBtn.click();
	}
	
	// Administration menu
	public void verifyAdminmenu()
	{		
		if(this.adminMenu.getText().contains("Administration"))
			System.out.println("Administration menu displayed");
		else
			System.out.println("Administration menu didnot display");
	}
	
	//Homepage Tab
	public void clickHomePage()
	{
		this.homePageTab.click();
	}
	
	 // Clicking User Profile
	public void clickUserProfile()
	{
		this.userProfile.click();
	}
	
	// Entering Old Password
	public void enterOldUserNm(String oldUserName)
	{
		this.oldUserName.sendKeys(oldUserName);
	}
	
	// entering new password 
	public void enterNewPass(String newPass)
	{
		this.newPass.sendKeys(newPass);
		
	}
	
	//Confirming new password
	public void enterConfirmPass(String confirmPass)
	{
		this.confirmPass.sendKeys(confirmPass);
	}
	
	// clicking on savechanges button
	public void saveChangesBtn()
	{
		this.savechanges.click();
	}
	
	// Capturing message after saved changes successfully and priting in console
	public void verifySuccessMessage()
	{		
		if(this.successMessage.getText().contains("Your new profile has been saved"))
			System.out.println("Profile message displayed");
		else
			System.out.println("Profile message didnot display");
	}
	
  
 //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++	
 // Test Case 2 : To verify whether application allows admin to add career, promotion & add a session in career and promotions link
 	
	   // Step1. Click on Administration tab => Used above previous test case method
	
	
	//WebElement
	  //Step2 Expected -Careers and promotions page should get displayed
    
    @FindBy(xpath="//li[@class='active'][3]")
    private WebElement CareersPromotionPage;
    
    //Step3 Expected = careers page should get displayed
    @FindBy(xpath="//li[@class='active'][3]")
    private WebElement careersPagedisplayed;
 
    // Step4. click on Add icon
    @FindBy(xpath="//*[@class='actions']/a/img[@title='Add']")
    private WebElement addIcon;
    
  //Step 4 Expected : Add page should get displayed
    @FindBy(xpath="//li[@class='active'][4]")
    private WebElement careersAddPagedisplayed;

    //Step5.enter valid credentials in Name textbox
     @FindBy(css="input#career_name")
     private WebElement addNameCareerfield;

    // Step6. Click on Add button
     @FindBy(css="button#career_submit")
     private WebElement addCareerbutton;
     
     //Step6 Expected: Item Added message with created career should get displayed
     @FindBy(xpath="//div[@class='alert alert-success']")
     private WebElement addedNamesuccessMsg;
     
   //Step6 Expecte COntinued - with created career should get displayed

     @FindBy(xpath="//*[@id='careers']/tbody/tr/td[@title='addNameCareerfield']")
     private WebElement createdCareerAddedInList;
     
   //Step8 expected - Promotions page should get displayed
     @FindBy(xpath="//*[@class='breadcrumb']/li[3]")
     private WebElement promotionsPageDisplayed;
     
     //9th step expected == Add page should get displayed
     @FindBy(xpath="//*[@class='breadcrumb']/li[4]")
     private WebElement addPageDisplayed;
     
   //Step10. enter valid credentials in Name textbox
     @FindBy(css="input#name")
     private WebElement nameInPromotionPage;
     
   //Step11. Click on Add button
     @FindBy(css="button#usergroup_submit")
     private WebElement plusAddBtn;


  //Step11 Expected : Item added message with created career should get displayed
     //Item added using above method ie displayaddedNamesuccessMsg() AND created career should get displayed is below
     
    // @FindBy(xpath="//*[@id='promotions']/tbody/tr/td[@title='Dev for Developing']")
       @FindBy(xpath="//*[@id='promotions']/tbody/tr/td[@title='nameInPromotionPage']")
       private WebElement createdPromotionAddedInList;
   


   //12. Click on Add a training session icon.Already created method ie clickPromotionsPageIcons()
     
    //Expected check the msg method to display
   
     @FindBy(xpath="//*[@class='breadcrumb']/li[2]")
     private WebElement addATrainingSessionPage;
  
  // Step 13. Enter valid credentials in Session name textbox
      @FindBy(css="input#add_session_name")
      public WebElement trainingSessionName;
  

    //missing step in test case - enter Coach name
      
        @FindBy(css="span.select2-selection__arrow")
        private WebElement coachNameInTrainSession;
  

      //continue above filed only with search field
        
        @FindBy(xpath="//*[@class='select2-selection select2-selection--single']") //Dropdown click
        public WebElement coachNameSearchInTrainSession;
  

   @FindBy(xpath="//*[@class='select2-search__field']")
        private WebElement coachNameSearch;

        //Step14. Click on Next step button
       @FindBy(css="button#add_session_submit")
       private WebElement nextStepBtn;


     //Step14 Expected : Add courses to this session (session name) page should get displayed
        @FindBy(xpath="//*[@class='breadcrumb']/li[3]")
        private WebElement addCoursesToThisSessionPage;
  

   //   Step 16. click on > button 
          @FindBy(xpath="//button[@name='add_course']")
          private WebElement addCourseIcon;
  

               
         // Step 17. click on Next step button
          @FindBy(xpath="//button[@name='next']")
          private WebElement nextStepBtnInCourceList;
    

      //Step17 Expected : Update Successfull msg and ubscribe users to this session name page displayed
          @FindBy(xpath="///div[@class='alert alert-info']")
          private WebElement updateSuccessfulMsg;
    

     // Step18. enter student name in Portal users list
        	//@FindBy(id="user_to_add")
        //@FindBy(xpath="//input[@id='user_to_add']")
       	    @FindBy(css="input.form-control")
        	private WebElement studentName;
    

   	//Step18 and 19th Expected : List of student name matching displayed
       	@FindBy(xpath="//div[@class='select-list-ajax']/a")
       	private WebElement studentMatchNames;
    

       	//Step 19th Expected : validating Student name get added in List of users registered in this session : window
       	
       	@FindBy(xpath="//select[@id='destination_users']/option")
       	   //css=select#destination_users
       
       	private WebElement studentNameAdded;
    
   	 // Step20. click on Finish session creation button
          @FindBy(xpath="//button[@class='btn btn-success']")     
          private WebElement finishSessionCreationBtn;
    

      //Step2 Expected :Add a new course page should get displayed
        
          @FindBy(xpath="//ul[@class='breadcrumb']/li[3]")
         	private WebElement createNewCoursePage;
    
      //Step3:Enter valid credential in Title textbox
          @FindBy(css="input#update_course_title")
          private WebElement courseTitle;
    

      //Step4 :Enter valid credential in  code textbox
           @FindBy(css="input#visual_code")
          private WebElement courseCode;
    

      //Step5 :Select Valid credentials in Teacher list box
        				
     //Clear the field
          @FindBy(css="span.select2-selection__clear")
          private WebElement courseTeacher;
   

    //Enter Teacher Name
          @FindBy(xpath="//input[@placeholder='Please select an option']")
          private WebElement courceTeacherName;  
   

   //Step6. Select Valid credentials from Category list box
          @FindBy(xpath="//div[contains(text(),'()')]")
           public WebElement courseCategory;
       

   //Continue above field only with search field
          //@FindBy(xpath="//div[@class='dropdown bootstrap-select form-control dropup open']//input[@class='form-control']")
          //@FindBy(xpath="//div[@class='bs-searchbox']")
          @FindBy(xpath="//*[@id='update_course']/fieldset/div[3]/div[1]/div/div/div[1] /input")
          private WebElement courseCategoryAnotherField;
       

   //Step7:7. Select Valid credentials from Language list box

        //*[@id="update_course"]/fieldset/div[7]/div[1]/div/button/div/div/div
        //*[@id="update_course"]/fieldset/div[7]/div[1]
          @FindBy(xpath="//*[@id='update_course']/fieldset/div[7]/div[1]")
          private WebElement courseLanguageClick;


@FindBy(xpath="//*[@id='update_course']/fieldset/div[7]/div[1]/div/div/div[1]/input")
    		   private WebElement courseLanguageEnter;
          //8. Click on Create a course button
          @FindBy(css="button#update_course_submit")
          private WebElement plusCreateCourseBtn;
     

   //8: Expected -Course should get created & should be get displayed in course list
          @FindBy(xpath="//ul[@class='breadcrumb']/li[2]")
          private WebElement courseAddedMsg;
       

//10. Expected :List of classes should get displayed
            
        	  @FindBy(xpath="//ul[@class='breadcrumb']")
              private WebElement classesMsgpage;
            

   //11.Expected  Add page should get displayed
               @FindBy(xpath="//ul[@class='breadcrumb']/li[2]")
               private WebElement afterClickAddPg;
           

    //12. Enter valid credentials in Name textbox
               @FindBy(css="input#usergroup_name")
               private WebElement userGrpName;
           

   // 13. Enter valid credentials in Description textbox
               @FindBy(xpath="//textarea[@id='usergroup_description']")
               private WebElement userGrpDescription;
           

  //  14. Select valid credentials in Group permissions list box
				
               //Clear/click dropdown the field
                    @FindBy(xpath="//span[@class='bs-caret']//span[@class='caret']")
                    private WebElement groupPermissionArrow;
            

      //Enter group description
                    @FindBy(xpath="//div[@class='bs-searchbox']//input[@class='form-control']")
                    private WebElement groupPermissionDescription;  
           

       //15 Expected :Item added message should get displayed & classes should get displayed classes list
                    @FindBy(css="div.alert.alert-success")
                    private WebElement addedClassessuccessMsg;
           

         @FindBy(xpath="//*[@id='usergroups']/tbody/tr/td[@title='classesNameToAadd']")
                  //*[@id='usergroups']/tbody/tr/td[@title='fsdfsdfd']
                    private WebElement createdClassesAddedInList;
           

  //16 Expected :Subscribe users to class: demo page should get displayed
                    
                    @FindBy(xpath="//ul[@class='breadcrumb']/li[3]")
                    private WebElement subscribeUsersToClassPg;
                  

        //18. Click on --> icon 
                      @FindBy(css="em.fa.fa-arrow-right")
                      private WebElement arrowClickAdd;
            

        //19. Click on Subscribe Users in any class button
                      
                      @FindBy(css="input#user_with_any_group_id")
                      private WebElement usersRegInAnyGrp;
            

 //MISSING STEP IN TEST CASES==> Click on Subscribe class to courses icon of class
                      @FindBy(css="button.btn.btn-primary")
                      private WebElement subUsersToClassBtn;
                 

     //20 Expected demo(class name): Subscribe class to courses page should get displayed
                    
                      @FindBy(xpath="//ul[@class='breadcrumb']/li[3]")
                      private WebElement subscribeClassToCoursePg;
                 


//2 Expected: Add a user page should get displayed
                      @FindBy(xpath="//ul[@class='breadcrumb']/li[3]")
                      private WebElement addUserPage;
                    


  //3. Enter valid credential in First name textbox
 
                      @FindBy(xpath="//*[@id='firstname']")
                       private WebElement firstNameToAddUser;  
 

  //4.Enter valid credential in Last name textbox
                      @FindBy(xpath="//*[@id='lastname']")
                      private WebElement lastNameToAddUser;
                    

  //5. Enter valid credential in e-mail textbox
                      @FindBy(xpath="//*[@id='email']")
                      private WebElement emailToAddUser;
                    

  //6. Enter valid credential in phone textbox
                      @FindBy(xpath="//*[@id='phone']")
                      private WebElement phoneToAddUser;
                    

  //7. Enter valid credential in Login textbox
                      @FindBy(xpath="//*[@id='username']")
                      private WebElement loginToAddUser;
                    

  //9. Enter valid credential in password textbox
                         @FindBy(xpath="//input[@id='password']")
                         private WebElement pswrdTextBox;
                    

//10. Select Valid credentials from profile list box
                    @FindBy(xpath="//div[contains(text(),'Learner')]") 
                    public WebElement profileListBox;
                     

             @FindBy(xpath="//*[@id='user_add']/fieldset/div[10]/div[1]/div/div/div[1]/input")
                        private WebElement profileListBoxAnotherField;
           

          //11. Click on Add button
                      @FindBy(xpath="//button[@name='submit']")
                      private WebElement addBtnToSaveUser;
           

                      //11 Expected = "The user has been added: manzoor message should get displayed &
                     // user should be get added into user list"
                      
                      @FindBy(xpath="//ul[@class='breadcrumb']/li[2]")
                      private WebElement userAddedPg;


	//METHODS
	//Step2. click on Careers and promotions link
	public void clickCareersPromotionsLink()
    {
  	  driver.navigate().to("http://elearning.upskills.in/main/admin/career_dashboard.php");
    }
	
	 public void validateCareersPromotionPage()
     {
  	   if(this.CareersPromotionPage.getText().contains("Careers and promotions"))
  			   System.out.println("Careers and promotions page displayed");
  	   else
  		   System.out.println("Careers and promotions page does not displayed");
     }
	
	 // Step3 - Used this below Methos for Clicking on Career Icon 
     //Click on Add button -Its related to 3 Icons so I have taken in one Method and will passthe paramenter as per requirement
     public void clickCareersPromotionsPageIcons(String icon)
     {
  	   if(icon.equalsIgnoreCase("Back to Administration"))
  	   {
  		   driver.findElement(By.xpath("//*[@class='col-sm-12']/a/img[@title='Back to Administration']")).click();
  	   }
  	   else if(icon.equalsIgnoreCase("Careers"))
  	   {
  		   driver.findElement(By.xpath("//*[@class='col-sm-12']/a/img[@title='Careers']")).click();
  	   }
  	   else if(icon.equalsIgnoreCase("Promotions"))
  	   {
  		   driver.findElement(By.xpath("//*[@class='col-sm-12']/a/img[@title='Promotions']")).click();
  	   }
  	   
  	   else
  	   {
  		   System.out.println("Icons does not exist");
         }
     }
	
	    public void displayedCareersPage()
       {
    	   if(this.careersPagedisplayed.getText().contains("Careers"))
    			   System.out.println("Careers page displayed");
    	   else 
    		   System.out.println("Careers page not displayed");
       }
       
         
       public void clickAddIcon()
       {
    	   this.addIcon.click();
       }
       
          
       public void displayedCareersAddPage()
       {
    	   if(this.careersAddPagedisplayed.getText().contains("Add"))
    			   System.out.println("Careers Add page displayed");
    	   else 
    		   System.out.println("Careers Add page not displayed");
       }
       
              
       public void enteraddNameCareerfield(String addNameCareerfield)
       {
    	   this.addNameCareerfield.sendKeys(addNameCareerfield);
    	   // Step5 Expected : below 4 lines added to display entered name
    	   if(this.addNameCareerfield.getText().contains("addNameCareerfield"))
    	      System.out.println("Entered Valid credentials displayed in Name textbox");
    		   else
    			   System.out.print("Entered name is not displayed");
    	   
       }
      
        
    public void clickaddCareerbutton()
    {
 	   this.addCareerbutton.click();
    }
    
     
    public void displayaddedNamesuccessMsg()
    {
 	   if(this.addedNamesuccessMsg.getText().contains("Item added"))
 	   
 		   System.out.println("Item Added Success page displayed");
 		   else
 			   System.out.println("Item added Success page not displayed");
    }

    public void displaycreatedCareerAddedInList(String addNameCareerfield) throws Exception
    {
    	Thread.sleep(3000);
    	String value = driver.findElement(By.xpath("//table[@id='careers']/tbody[1]/tr/td[@title='"+addNameCareerfield+"']")).getText();
    	//String value1 = driver.findElement(By.xpath("//table[@id='careers']/tbody[1]/tr/td[@title='"+addNameCareerfield+"']")).getAttribute("title");

    	System.out.println(value);
    	//System.out.println(value1);
     }
    
    //Step7. click on Careers and promotions link
      //Used the same above methos ie clickCareersPromotionsLink();
    
    //Step7 Expected Careers and promotions page should get displayed
     //Used above same Method ie validateCareersPromotionPage()
    
    
   //Step 8. click on Promotions icon
   //clickCareersPromotionsPageIcons(String icon) call this method passthe parameter as Promotions  
  
     public void displayPromotionsPageDisplayed()
     {
     if(this.promotionsPageDisplayed.getText().contains("Promotions"))
   	   
		   System.out.println("Item Added Success page displayed");
		   else
			   System.out.println("Item added Success page not displayed");
     }
     
     
     //Step 9. click on Add icon
    //Write only one method for Promotions page all Icons
    
     public void clickPromotionsPageIcons(String icon1)
     {
     	 if(icon1.equalsIgnoreCase("Back"))
     	{
     		driver.findElement(By.xpath("//*[@class='actions']/a/img[@title='Back']")).click();
     	}
     	 else if(icon1.equalsIgnoreCase("Add"))
     	{
     		driver.findElement(By.xpath("//*[@class='actions']/a/img[@title='Add']")).click();
     	}
     	 else if(icon1.equalsIgnoreCase("Add a training session"))
     	{
     		driver.findElement(By.xpath("//*[@class='actions']/a/img[@title='Add a training session']")).click();
     	}
     	else
     	{
     		System.out.println("Icons are not exists");
     	}
     }
     
     public void displayAddPageDisplayed()
     {
     if(this.addPageDisplayed.getText().contains("Add"))
   	   
		   System.out.println("Item Added Success page displayed");
		   else
			   System.out.println("Item added Success page not displayed");
     }
     
 
     public void enternameInPromotionPage(String nameInPromotionPage)
     {
     	this.nameInPromotionPage.click();
     	this.nameInPromotionPage.sendKeys(nameInPromotionPage);
     }
     
    
     
     public void clickplusAddBtn()
     {
    	 this.plusAddBtn.click();
     }
   
     public void displaycreatedPromotionAddedList(String nameInPromotionPage) throws Exception
     {
    	 
    	 Thread.sleep(3000);
    	 
    	String nameProm = driver.findElement(By.xpath("//*[@id='promotions']/tbody/tr/td[@title='"+nameInPromotionPage+"']")).getText();
    	System.out.println(nameProm);                                            
     }
     
       public void displayaddATrainingSessionPage()
     {
     if(this.addATrainingSessionPage.getText().contains("Add a training session"))
   	   
		   System.out.println("Add a Training Session page displayed");
		   else
			   System.out.println("Add a Training Session page not displayed");
     }
     
      
      public void entertrainingSessionName(String trainingSessionName)
      {
    	 this.trainingSessionName.click();
    	 this.trainingSessionName.sendKeys(trainingSessionName);
      }
       
        
        public void clickcoachNameInTrainSession()
        {
        	this.coachNameInTrainSession.click();
        }
     
        public void clickcoachNameSearchInTrainSession()
        {
        	this.coachNameSearchInTrainSession.click();
        	//this.coachNameInTrainSession.sendKeys(fourCharEnter);
        }
      
        public void entercoachNameSearch(String fourCharEnter) throws Exception
        {
        	trainingSessionName.sendKeys(Keys.TAB);
        	Thread.sleep(4000);
        	trainingSessionName.sendKeys(Keys.ENTER);
        	Thread.sleep(4000);
        	this.coachNameSearchInTrainSession.click();
        	Thread.sleep(4000);
        	this.coachNameSearch.click();
        	this.coachNameSearch.sendKeys(fourCharEnter);
        	Thread.sleep(4000);
        	this.coachNameSearch.sendKeys(Keys.ENTER);
        }
  
       public void clicknextStepBtn()
       {
    	   this.nextStepBtn.click();
       }
       
        
        public void displayaddCoursesToThisSessionPage()
        {
        	if(this.addCoursesToThisSessionPage.getText().contains("Add courses to this session"))
        	
          System.out.println("Add courses to this session name page displayed");
        		
        	else
        		      System.out.println("Add courses to this session (session name) page not displayed");
        
        }
        
       // Step 15. select course in course list window 
         public void selectCourseListWindow()
         {
         
         WebElement courseListWindow = driver.findElement(By.xpath("//select[@id='origin']"));
          
          Select sel = new Select(courseListWindow);
          boolean isDrodownMult = sel.isMultiple();
          System.out.println(isDrodownMult);
          sel.selectByValue("4");
          //sel.selectByVisibleText("Rahul (RAHUL)");
         
         }
          
          
          public void clickAddCourseIcon()
          {
        	  this.addCourseIcon.click();
          }
          
          
          public void clickNextStepBtnInCourceList()
          {
        	  this.nextStepBtnInCourceList.click();
          }

          
          public void displayUpdateSuccessfulMsg()
          {
          	if(this.addCoursesToThisSessionPage.getText().contains("Update successful"))
          	
            System.out.println("Update Successfull message and ubscribe users to this session name page displayed");
          		
          	else
            System.out.println("ubscribe users to this session page not displayed");
          
          }
          
        	
       	    public void enterStudentName(String studentName)

      	{
      		this.studentName.click();
      		this.studentName.sendKeys(studentName);
      	}
      	
       
        	 
       	public void displayStudentmatchNames()
      	{
       		this.studentMatchNames.click();		
      	}
       	
       	
       	public void getStudentNameAddedWindow()
       	{
       		if(this.studentNameAdded.getText().contains("N Sunil (Sunil) SUNIL"))
       			System.out.println("Stdent name Sunil got added in the list of users registered window");
       		else
       			System.out.println("Student name does not added in the registered window");
       		
        	}

          
          public void clickFinishSessionCreationBtn()
          {
        	  this.finishSessionCreationBtn.click();
          }
          
          
          
   //*******************************************************************************************************
          
          // ELTC_059===> TC03 - To verify whether application allows admin to create course & subscribe user to course in classes section
          
         // Step1. Click on Administration tab ==Used from Testcase2 in LoginPOM.
                
         //Step2. Click on Create a Course link
              
          public void clickCreateACourseLink()
          {
        	  driver.navigate().to("http://elearning.upskills.in/main/admin/course_add.php");
          }
          
          
          public void displayCreateNewCoursePage()
         	{
         		if(this.createNewCoursePage.getText().contains("Create a course"))
         			System.out.println("Add a new course page is displayed");
         		else
         			System.out.println("Add a new course page not displayed");
         		
          	}
          
          
          public void enterCourseTitle(String courseTitle)
          {
        	  this.courseTitle.sendKeys(courseTitle);
          }
          
           public void enterCourseCode(String courseCode)
          {
        	  this.courseCode.sendKeys(courseCode);
          }
       
          
          public void clearCourseTeacher()
          {
        	  this.courseTeacher.click();
          }
          
          public void enterCourceTeacherName(String teacherName) throws Exception
        	{
      		  this.courceTeacherName.click();
        	  Thread.sleep(4000);
        	  this.courceTeacherName.sendKeys(teacherName);
        	  Thread.sleep(4000);
        	  this.courceTeacherName.sendKeys(Keys.ENTER);
          }
          
          
          public void selectCourseCategory() throws Exception
          {
        	this.courseCategory.click();
        	Thread.sleep(4000);
         }
        	
          
          public void selectcourseCategoryAnotherField(String categoryName) throws Exception
          {
          	 this.courseCategoryAnotherField.click();
        	 this.courseCategoryAnotherField.sendKeys(categoryName);
             Thread.sleep(5000);
          	this.courseCategoryAnotherField.sendKeys(Keys.ENTER);
      
          }

                 
          public void selectCourseLanguage() throws Exception
          {
        	this.courseLanguageClick.click();
        	Thread.sleep(4000);
        	//this.courseLanguage.sendKeys(languageName);
        	//Thread.sleep(4000);
        	//this.courseLanguage.sendKeys(Keys.ENTER);
           }
          
       
       public void EntercourseLanguage(String languageName) throws Exception
       {
    	   this.courseLanguageEnter.click();
    	   Thread.sleep(4000);
    	   this.courseLanguageEnter.sendKeys(languageName);
    	   Thread.sleep(4000);
       }
          
          public void clickPlusCreateCourseBtn() throws Exception
          {
        	  this.plusCreateCourseBtn.click();
        	  Thread.sleep(8000);
          }
          
          
          public void displayCourseAddedMsg()
          {
        	  if(this.courseAddedMsg.getText().contains("Course list"))
        	  System.out.println("Course Added message page displayed");
        	  else
        		  System.out.println("Course Added message page not displayed");
       	  }
          
           // 9. Click on Administration tab
          //use the same method 
          
          //10. Click on Classes link
          
        	  public void clickClassesLink()
          {
        	  driver.navigate().to("http://elearning.upskills.in/main/admin/usergroups.php");
          }
        	  
        	  
              public void displayClassesMsgpage()
              {
            	  if(this.classesMsgpage.getText().contains("Classes"))
            	  System.out.println("List of classes message page displayed");
            	  else
            		  System.out.println("List of classes message page not displayed");
           	  }

              //11. click on Add classes icon
           
               public void clickAllIconsInClassesPg(String icon2)
               {
               	 if(icon2.equalsIgnoreCase("Back to Administration"))
               	{
               		driver.findElement(By.xpath("//*[@class='actions']/a/img[@title='Back to Administration']")).click();
               	}
               	 else if(icon2.equalsIgnoreCase("Add classes"))
               	{
               		driver.findElement(By.xpath("//*[@class='actions']/a/img[@title='Add classes']")).click();
               	}
               	 else if(icon2.equalsIgnoreCase("Import"))
               	{
               		driver.findElement(By.xpath("//*[@class='actions']/a/img[@title='Import']")).click();
               	}
               	else if(icon2.equalsIgnoreCase("Export"))
               	{
               		driver.findElement(By.xpath("//*[@class='actions']/a/img[@title='Export']")).click();
               	}
               	else
               	{
               		System.out.println("Icons are not exists");
               	}
               }

               
               public void afterClickingAddPgDisplayed()
               {
             	  if(this.afterClickAddPg.getText().contains("Add"))
             	  System.out.println("Add page displayed");
             	  else
             		  System.out.println("Add page not displayed");
            	  }
               
               
               public void enterUserGrpName(String classesNameToAadd)
               {
            	   this.userGrpName.sendKeys(classesNameToAadd);
               }

               
               public void EnterUserGrpDescription(String usergrpDesc)
               {
            	   this.userGrpDescription.sendKeys(usergrpDesc);
               }

                   
                    public void clickgroupPermissionArrow()
                    {
                  	  this.groupPermissionArrow.click();
                    }
                    
                    public void enterGroupPermissionDescription(String grpPermission) throws Exception
                	{
                	  this.groupPermissionDescription.click();
                  	  Thread.sleep(4000);
                  	  this.groupPermissionDescription.sendKeys(grpPermission);
                  	  Thread.sleep(4000);
                  	  this.groupPermissionDescription.sendKeys(Keys.ENTER);
                  }
                    
                   //15. Click on Add button
                     //Use this same above method and call to run clickplusAddBtn()
                 
                    
                    public void displayAddedClassessuccessMsg()
                    {
                 	   if(this.addedClassessuccessMsg.getText().contains("Item added"))
                 	   
                 		   System.out.println("Item Added Success page displayed");
                 		   else
                 			   System.out.println("Item added Success page not displayed");
                    }
                    
                    
                    public void displayCreatedClassesAddedInList(String classesNameToAadd) throws Exception
                    {
                    	Thread.sleep(3000);
                    	String namePrint = driver.findElement(By.xpath("//table[@id='usergroups']/tbody[1]/tr/td[@title='"+classesNameToAadd+"']")).getText();
                    
                    	System.out.println(namePrint);                                      
                    	
                     }

                   // 16. click on Subscribe users to class icon
                  //*[@title='kkboys Classes']/following::td[@aria-describedby='usergroups_actions'][1]/a/img[@title='Subscribe users to class']
                    
                    public void clickDetailsColumnIconsClassesPg(String classesNameToAadd,String clickBtn)
            		{
            			if(clickBtn.equalsIgnoreCase("Subscribe users to class"))
            			
            			{
            				//*[@title='kkboys Classes']/following::td[@aria-describedby='usergroups_actions'][1]/a/img[@title='Subscribe users to class']
            	    		driver.findElement(By.xpath("//*[@title='"+classesNameToAadd+"']/following::td[@aria-describedby='usergroups_actions'][1]/a/img[@title='Subscribe users to class']")).click();
            			}                                          
            			
            			else if (clickBtn.equalsIgnoreCase("Subscribe class to courses"))
            			{
            	    		driver.findElement(By.xpath("//*[@title='"+classesNameToAadd+"']/following::td[@aria-describedby='usergroups_actions'][1]/a/img[@title='Subscribe class to courses']")).click();

            			}
            			else if(clickBtn.equalsIgnoreCase("Subscribe class to sessions"))
            			{
            	    		driver.findElement(By.xpath("//*[@title='"+classesNameToAadd+"']/following::td[@aria-describedby='usergroups_actions'][1]/a/img[@title='Subscribe class to sessions']")).click();

            			}
            			else if(clickBtn.equalsIgnoreCase("Edit"))
            			{
            	    		driver.findElement(By.xpath("//*[@title='"+classesNameToAadd+"']/following::td[@aria-describedby='usergroups_actions'][1]/a/img[@title='Edit']")).click();

            			}
            			else if(clickBtn.equalsIgnoreCase("Delete"))
            			{
            	    		driver.findElement(By.xpath("//*[@title='"+classesNameToAadd+"']/following::td[@aria-describedby='usergroups_actions'][1]/a/img[@title='Delete']")).click();
            	    		
            			}
            			else
            			{
            				System.out.println("Button does not exist");
            		    }
            		
            		}  
              
                    
                    public void displaySubscribeUsersToClassPg()
                    {
                 	   if(this.subscribeUsersToClassPg.getText().contains("Subscribe users to class"))
                 	   
                 		   System.out.println("Subscribe users to class page displayed");
                 		   else
                 			   System.out.println("Subscribe users to class page not displayed");
                    }
                    
                     //17. select users in Users on platform window
                    public void selectUserOnPlatformWindow()
                    {
                    
                    WebElement userPlatformWindow = driver.findElement(By.xpath("//select[@id='elements_not_in']"));
                     
                     Select sel = new Select(userPlatformWindow);
                     boolean isDrodown = sel.isMultiple();
                     System.out.println(isDrodown);
                     sel.selectByValue("346");
                     sel.selectByVisibleText("Roops Pujari (kkboys254)  - KKBOYS254");
               
                    }
                                             
                    //17 Expected :Selected user should be get highlighted
                    //screenShot.captureScreenShot("Selected user should be get highlighted");

                      
                      public void clickArrowAddright()
                      {
                    	  this.arrowClickAdd.click();
                      }

                     //18 Expected selected users should be get displayed in Users in group : window
                    //screenShot.captureScreenShot("Selected user should be get highlighted");

                      
                      public void clickUsersRegInAnyGrp()
                      {
                    	  this.usersRegInAnyGrp.click();
                      }
                      		
                        public void clickSubUsersToClassBtn()
                      {
                    	  this.subUsersToClassBtn.click();
                      }
         
                      //20. Click on Subscribe class to courses icon of class
                      //use above Method clickDetailsColumnIconsClassesPg() and pass parameter as Subscribe class to courses

                       public void displaysubscribeClassToCoursePg()
                      {
                   	   if(this.subscribeClassToCoursePg.getText().contains("Subscribe class to courses"))
                   	   
                   		   System.out.println("Subscribe class to courses page displayed");
                   		   else
                   			   System.out.println("Subscribe class to courses page not displayed");
                      }
                      
                  
                      //21. Select Course name to subscribe in Courses on the platform. : window
                      public void selectCoursesOnPlatformWindow()
                      {
                      
                      WebElement coursesPlatformWindow = driver.findElement(By.xpath("//select[@id='elements_not_in']"));
                       
                       Select sel = new Select(coursesPlatformWindow);
                       boolean isDrodownMulti = sel.isMultiple();
                       System.out.println(isDrodownMulti);
                       sel.selectByVisibleText("HIJKLM-Course (HIJKLM254)");
                      }
                      
                      public void courseTitleSelectWindow(String courseTitle)
                      {
                    	// WebElement courseTitleSelect = driver.findElement(By.xpath("//*[@id='elements_not_in']//option[@value='479']"));
                           // WebElement courseTitleSelect = driver.findElement(By.xpath("//*[@id='elements_not_in']//option[contains(text(),'HIJ-Course (HIJ254)')]"));
                           WebElement courseTitleSelect = driver.findElement(By.xpath("//*[@id='elements_not_in']//option[contains(text(),'"+courseTitle+"')']"));
                           Select selCourse = new Select(courseTitleSelect) ;
                           selCourse.selectByVisibleText("courseTitleSelect");
                          // sel.selectByVisibleText("courseTitleSelect");
                      }
                 
                       //21 Expected :selected courses should get highlighted in Courses on the platform. : window
                     //Take Method to print screen shots 
                       

                    //  22. Click on --> icon 
                       //Take above Methos ==> Methos ==> clickArrowAddright()

                     // 23. click on Subscribe class to Courses button
                     // use this Method = clickSubUsersToClassBtn()
                      
                      
                      
 //***************************************************************************************************************
   //TC4 - ELTC_060
       //To verify whether application allows admin to create user & subscribe user to class in classes section
                      
                     // 1. Click on Administration tab
                        // uSE BEFORE mETHOD ONLY FOR Admin Tab
                      
                      //2. Click on Add a user link

                      public void clickAddUserLink()
                      {
                    	  driver.navigate().to("http://elearning.upskills.in/main/admin/user_add.php");
                      }
                      
                      
                      public void displayAddUserPage()
                      {
                               
                   	   if(this.addUserPage.getText().contains("Add a user"))
                   	   
                   		   System.out.println("Add a user page displayed");
                   		   else
                   			   System.out.println("Add a user page not displayed");
                      }
                      
                                         
                      public void enterFirstNameToAddUser(String firstName)
                      {
                  	      this.firstNameToAddUser.sendKeys(firstName);
                      }
                      
                      
                      public void enterLastNameToAddUser(String lastname)
                      {
                    	  this.lastNameToAddUser.sendKeys(lastname);
                      }
                      
                      
                      public void enterEmailToAddUser(String emailID)
                      {
                    	  this.emailToAddUser.sendKeys(emailID);
                      }

                      
                      public void enterPhoneToAddUser(String phoneNumber)
                      {
                    	  this.phoneToAddUser.sendKeys(phoneNumber);
                      }
                      
                      
                      public void enterLoginToAddUser(String loginName)
                      {
                    	  this.loginToAddUser.sendKeys(loginName);
                      }
                      
                    // 8. Click on Enter password radio button
                      
                      public void selectPswrdRadioBtn()
                      {
                    	List <WebElement> pswrdRadioBtn = driver.findElements(By.xpath("//input[@id='qf_30122f']"));
                    	boolean isSelectedRadio;
                    	
                    	isSelectedRadio = pswrdRadioBtn.get(0).isSelected();
                    	System.out.println(isSelectedRadio);
                    	
                    	if(isSelectedRadio == false)
                    	{
                    		pswrdRadioBtn.get(0).click();
                    	}
                      }
            
                      public void enterPswrdTextBox(String pswrdText)
                         {
                        	 this.pswrdTextBox.sendKeys(pswrdText);
                         }
               
                        public void selectProfileListBox() throws Exception
                        {
                      	this.profileListBox.click();
                      	Thread.sleep(4000);
                        }
                      	
                        
                        public void selectProfileListBoxAnotherField(String profileList) throws Exception
                        {
                        	 this.profileListBoxAnotherField.click();
                      	    this.profileListBoxAnotherField.sendKeys(profileList);
                            Thread.sleep(5000);
                        	this.profileListBoxAnotherField.sendKeys(Keys.ENTER);
                       }

                      public void CreatedAddBtnToSaveUser()
                      {
                    	  this.addBtnToSaveUser.click();
                      }
                         
                      
                      public void displayUserAddedPg()
                      {
                               
                   	   if(this.userAddedPg.getText().contains("User list"))
                   	   
                   		   System.out.println("The user has been added page displayed");
                   		   else
                   			   System.out.println("The user has been added page not displayed");
                      }
                      
                      // 12. Click on Administration tab
                     // loginPOM.verifyAdminmenu();

                      //13. Click on Classes link
                   // loginPOM.clickClassesLink();
                                           
                      //13 Expected : List of classes should get displayed
                      
              		//loginPOM.displayClassesMsgpage();
                      
                     // 14. click on Add classes icon
              		//loginPOM.clickAllIconsInClassesPg("Add classes");
                      
                     //From 12th to 26th I have used the created previously Methods 
           
                      
  //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
  //  3rd WEEK Assignment 
                      
                      
                   
    }

          
   


