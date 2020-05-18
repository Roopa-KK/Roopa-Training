package com.training.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SecondWeek 

{
private WebDriver driver; 
	
	public SecondWeek(WebDriver driver)
    {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}

	
	// 2nd week program
	
		//Test Case1
		
		//Clicking on 	Sessions categories list link
	 /*	@FindBy(xpath="//a[contains(text(),'Sessions categories list')]")
	  	private WebElement sessionCatList;
	 	
	 	public void clickSessionCatList()
	  	{
	  		this.sessionCatList.click();
	  	}
	 	
	   	// Session categories List page displayed msg
	  	@FindBy(xpath="//li[@class='active'][2]")
	  	private WebElement sessionCatListMsg;
		
	  	public void verifySessionCatListMsg()
	  	{
	  		if(this.sessionCatListMsg.getText().contains("Sessions categories list"))
				System.out.println("Sessions categories list page displayed");
			else
				System.out.println("Sessions categories list page not displayed");
	  	}
		
		
	     // Click on Training session list icon
	   	@FindBy(xpath="//img[@title='Training sessions list']")
	  	private WebElement trainingSessionList;
	   	
	   	public void clickTrainingSessionList()
	  	{
	  		this.trainingSessionList.click();
	  	}
	   	
	   	
	   	//Capturing Session list page msg displayed
	   	@FindBy(xpath="//li[@class='active']")
	   	private WebElement sessionListMsg;
	   	
	   	public void verifySessionListMsg()
		{		
			if(this.sessionListMsg.getText().contains("Session list"))
				System.out.println("List of Training sessions page displayed");
			else
				System.out.println("List of Training sessions page not displayed");
		}

	   	public void clickSubIcon(String name,String btn)
		{
			if(btn.equalsIgnoreCase("subscribe"))
			
			{
	    		//driver.findElement(By.xpath("//*[@title='"+name+"']/following::td[@aria-describedby='sessions_actions'][1]/a[2]")).click();
	    		driver.findElement(By.xpath("//*[@title='"+name+"']/following::td[@aria-describedby='sessions_actions'][1]/a/img[@title='Subscribe users to this session']")).click();
			}
			
			else if (btn.equalsIgnoreCase("edit"))
			{
	    		driver.findElement(By.xpath("//*[@title='"+name+"']/following::td[@aria-describedby='sessions_actions'][1]/a[1]")).click();

			}
			else if(btn.equalsIgnoreCase("add"))
			{
	    		driver.findElement(By.xpath("//*[@title='"+name+"']/following::td[@aria-describedby='sessions_actions'][1]/a[3]")).click();

			}
			else if(btn.equalsIgnoreCase("copy"))
			{
	    		driver.findElement(By.xpath("//*[@title='"+name+"']/following::td[@aria-describedby='sessions_actions'][1]/a[4]")).click();

			}
			else if(btn.equalsIgnoreCase("delete"))
			{
	    		driver.findElement(By.xpath("//*[@title='"+name+"']/following::td[@aria-describedby='sessions_actions'][1]/a[5]")).click();

			}
			else
			{
				System.out.println("Button does not exist");
		    }
		
		}
	 // Subscribe users to this session PAGE DISPLAYED MSG 
	  	@FindBy(xpath="//ul[@class='breadcrumb']")
	  	private WebElement subscribeUsersMsg;
	  	
	  	public void verifySubscribeMsg()
		  {		
			  if(this.subscribeUsersMsg.getText().contains("Session list"))
				  System.out.println("Subscribe users to this session page displayed");
			  else
				  System.out.println("Subscribe users to this session page not displayed");
		  }
	    
	  
	 // Entering name in the users list
	 	//@FindBy(id="user_to_add")
	 	@FindBy(css="input.form-control")
	 	
	 		
	  	//@FindBy(xpath="//input[@id='user_to_add']")
	  	private WebElement studentName;
	  	public void enterStudentName(String studentName)

		{
			this.studentName.click();
			this.studentName.sendKeys(studentName);
		}
		
	  	@FindBy(xpath="//div[@id='cke_1_contents']//iframe[@class='cke_wysiwyg_frame cke_reset']")
	  	private WebElement giveContextIFrame;
	  	
	  	public void entergiveContextIFrame(String giveContextIFrame)
	  	{
	  		this.giveContextIFrame.sendKeys(giveContextIFrame);
	  	}
	 
	 	//List of student name matching displayed
	 	@FindBy(xpath="//div[@class='select-list-ajax']/a")
	 	private WebElement studentMatchNames;
	  	 
	 	public void displayStudentmatchNames()
		{
	 		this.studentMatchNames.click();		
		}

	 	//validating Student name get added in List of users registered in this session : window
	 	
	 	@FindBy(xpath="//select[@id='destination_users']/option")
	 //	div then a then iterate and print 
	 	private WebElement studentNameAdded;
	 	
	 	public void getStudentNameAddedWindow()
	 	{
	 		if(this.studentNameAdded.getText().contains("N Sunil (Sunil) SUNIL"))
	 			System.out.println("Stdent name Sunil got added in the list of users registered window");
	 		else
	 			System.out.println("Student name does not added in the registered window");
	 		
	  	}
	 
	 	// click on subscribe users to this session button
	 //	@FindBy(css="input.form-control")
	 	//@FindBy(css="button.btn btn-success")
	 	@FindBy(xpath="//button[@class='btn btn-success']")
	 	private WebElement subUsersthisSessionBtn;
	 	
	 	 public void clickSubscribeUsersBtn()
	 	 {
	 		 this.subUsersthisSessionBtn.click();
	 	 }
	 	  
	 	 @FindBy(xpath="//a[contains(text(),'User list')]")
	     //"//a[contains(text(),'Sessions categories list')]")
	 	private WebElement userList;
	 	
	 	
	    /* NOT USING BELOW NOW    	    	
	    	
	    	//Some alert message coming clicking on close 
	      	@FindBy(xpath="//button[@class='close' and @data-dismiss='alert']")
	      	private WebElement adminPageAlertclose;
	      	
	      	public void closeAdminPageAlert()
	        {
	        	this.adminPageAlertclose.click();
	        }
	    	
	      //clicking on Subscribe this user Icon 
	      	@FindBy(xpath="//*[@class='ui-jqgrid-btable']/tbody[1]/tr/following::td[2]/a[1]")
	        private WebElement subscribeUserIcon;  	
	      
	      	NOT USING ABOVE NOW */
	 	
	 // Test Case 2 : To verify whether application allows admin to add career, promotion & add a session in career and promotions link
	 	
		   // 1. Click on Administration tab
		
		
	     //2. click on Careers and promotions link
	/*      @FindBy(xpath="//a[contains(text(),'Manage session fields')]")
	       public WebElement careersPromotionsLink;
	      
	      public void clickCareersPromotionsLink()
	      {
	    	  //this.careersPromotionsLink.click();
	    	  //driver.findElement(By.xpath("//a[contains(text(),'Careers and promotions')]")).click();
	    	  driver.navigate().to("http://elearning.upskills.in/main/admin/career_dashboard.php");
	    	  
	      }
	      
	      
	      
	      //Expected -Careers and promotions page should get displayed
	      
	       @FindBy(xpath="//li[@class='active'][3]")
	       private WebElement CareersPromotionPage;
	       
	       public void validateCareersPromotionPage()
	       {
	    	   if(this.CareersPromotionPage.getText().contains("Careers and promotions"))
	    			   System.out.println("Careers and promotions page displayed");
	    	   else
	    		   System.out.println("Careers and promotions page does not displayed");
	       }
	       
	       //3. click on careers icon
	         //Girish has written below for subscribe button follow same for careers one
	      // driver.findElement(By.xpath("//*[@title='"+name+"']/following::td[@aria-describedby='sessions_actions'][1]/a/img[@title='Subscribe users to this session']

	       //Career Icon =
	       //Promotion Icon = //*[@class='col-sm-12']/a/img[@title='Promotions']
	       //Back Icon = //*[@class='col-sm-12']/a/img[@title='Back to Administration']
	       
	     /*  @FindBy(xpath="//*[@class='col-sm-12']/a/img[@title='Careers']")
	       private WebElement careersIcon;
	       
	       public void clickCareersIcon()
	       {
	    	   this.careersIcon.click();
	       }
	      
	       //Roopa trying for all 3 icon together and call method 
	       
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
	       
	       
	       // Expected:careers page should get displayed
	       /* //li[contains(text(),'Careers')]
	        * 
	        */
	       @FindBy(xpath="//li[@class='active'][3]")
	       private WebElement careersPagedisplayed;
	       
	       public void displayedCareersPage()
	       {
	    	   if(this.careersPagedisplayed.getText().contains("Careers"))
	    			   System.out.println("Careers page displayed");
	    	   else 
	    		   System.out.println("Careers page not displayed");
	       }
	       
	       // 4. click on Add icon
	       // Back - //*[@class='actions']/a/img[@title='Back']"
	       @FindBy(xpath="//*[@class='actions']/a/img[@title='Add']")
	       private WebElement addIcon;
	       
	       public void clickAddIcon()
	       {
	    	   this.addIcon.click();
	       }
	       
	       //Add page should get displayed
	       @FindBy(xpath="//li[@class='active'][4]")
	       private WebElement careersAddPagedisplayed;
	       
	       public void displayedCareersAddPage()
	       {
	    	   if(this.careersAddPagedisplayed.getText().contains("Add"))
	    			   System.out.println("Careers Add page displayed");
	    	   else 
	    		   System.out.println("Careers Add page not displayed");
	       }
	       
	       //5. enter valid credentials in Name textbox
	        //css=input#career_name
	       
	       @FindBy(css="input#career_name")
	       private WebElement addNameCareerfield;
	       
	       public void enteraddNameCareerfield(String addNameCareerfield)
	       {
	    	   this.addNameCareerfield.sendKeys(addNameCareerfield);
	       }
	       
	       // 6. Click on Add button
	       @FindBy(css="button#career_submit")
	       private WebElement addCareerbutton;
	       
	       public void clickaddCareerbutton()
	       {
	    	   this.addCareerbutton.click();
	       }
	       
	       //Expected: Item added message with created career should get displayed
	       @FindBy(xpath="//div[@class='alert alert-success']")
	       private WebElement addedNamesuccessMsg;
	       
	       public void displayaddedNamesuccessMsg()
	       {
	    	   if(this.addedNamesuccessMsg.getText().contains("Item added"))
	    	   
	    		   System.out.println("Item Added Success page displayed");
	    		   else
	    			   System.out.println("Item added Success page not displayed");
	       }

	       
	       // Expected continues - career should get displayed
	       //@FindBy(xpath="//*[@id='careers']/tbody/tr/td[@title='AQ']")
	       @FindBy(xpath="//*[@id='careers']/tbody/tr/td[@title='addNameCareerfield']")
	       private WebElement createdCareerAddedInList;
	       
	       public void displaycreatedCareerAddedInList()
	       {
	    	  if(this.createdCareerAddedInList.getText().contains((CharSequence) addNameCareerfield))
	    	  {
	    		  System.out.println("created career is :" + addNameCareerfield );
	    	  }
	       }
	       
	       //7. click on Careers and promotions link
          // Can we use the same method which used to click in Admisnitation tab for Careers and Promotions link.Its taking same X path.
	       
	       //Expected we can use same method Careers and promotions page should get displayed
            // after above used check it
	       
	       
	     //  8. click on Promotions icon

	      //clickCareersPromotionsPageIcons(String icon) call this method in Tests.java and pass parameter Pramotions  
	       
	       //8 step expected - Promotions page should get displayed
           // same method use and change index to get msg dispalyed
            
            //9. click on Add icon
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
            
            //9th step expected == Add page should get displayed
             //same method use for displaying just change index
            
            //10. enter valid credentials in Name textbox
            @FindBy(css="input#name")
            private WebElement nameInPromotionPage;
            
            public void enternameInPromotionPage(String nameInPromotionPage)
            {
            	this.nameInPromotionPage.click();
            	this.nameInPromotionPage.sendKeys(nameInPromotionPage);
            }
            
            //Expected  entered credentials in Name textbox should get displayed

            //11. Click on Add button

          
	 }
	 	

	