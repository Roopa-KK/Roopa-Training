package com.training.sanity.tests;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class LatercopythisandDeleteit {
	
	//From LoginTests.java copied below 
	@Test(priority=4)
	// For Practice working on extra test case. 
	public void testcase4()
	{
		//loginPOM.sendUserName("admin");
		//loginPOM.sendPassword("admin@123");
		//loginPOM.clickLoginBtn();
		//loginPOM.clickAdminTab();
		
	//	loginPOM.clickUserList();
	   // loginPOM.clickEditPencil();
		
	}

	
	  //From LoginPOM Copied 
	
	 // Extra test case doing for practice 
	//Test case - TO verify whether application allows admin to view details of user
	
     //Clicking on User List Link
	 @FindBy(linkText="user_list.php")
	  private WebElement userListLink;
	 
	 // Clicking on Edit Pencil Icon
	 @FindBy(xpath="//img[@title='Edit']")
	 private WebElement editPencilIcon;

  // Extra test case Method below 

/*public void clickAdminTab()
{
	this.adminMenu.click();
}

public void clickUserList()
{
	this.userListLink.click();
}


public void clickEditPencil() 
{
	this.editPencilIcon.click();
} */
	 
}
