package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPOM {
	private WebDriver driver; 
	
	public LoginPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
/*  Already there
 * 	@FindBy(id="login")
	private WebElement userName; 
	
	@FindBy(id="password")
	private WebElement password;
	
	@FindBy(id="formLogin_submitAuth")
	private WebElement loginBtn; 
	
		
/*	public void sendUserName(String userName) {
		this.userName.clear();
		this.userName.sendKeys(userName);
	}
	
	public void sendPassword(String password) {
		this.password.clear(); 
		this.password.sendKeys(password); 
	}
	
	public void clickLoginBtn() {
		this.loginBtn.click(); 
	}
	*/
	
	
	// Roopa writing for 1st Week  3 test cases below 
	
	// Test Case 1
	@FindBy(id="login")
	private WebElement userName;
	
	@FindBy(id="password")
	private WebElement password;
	
	@FindBy(id="form-login_submitAuth")
	private WebElement loginBtn;
	
	@FindBy(xpath="//article[@id='homepage-course']")
	private WebElement txtMsg;
	
	@FindBy(className="dropdown-toggle")
	private WebElement userIcon;
	
	@FindBy(xpath="//a[@title='Inbox']")
	private WebElement InboxBtn;
	
	@FindBy(xpath="//a[@title='My certificates']")
	private WebElement MycertiBtn;
	
	@FindBy(xpath="//a[@title='Administration']")
	private WebElement adminMenu;
	
	@FindBy(id="logout_button")
	private WebElement logoutBtn;
     
	@FindBy(xpath="//a[@title='Homepage']")
	private WebElement homePageTab;
	
	@FindBy(linkText="Edit profile")
	private WebElement userProfile;
	
	@FindBy(id="profile_password0")
	private WebElement oldUserName;
	
	@FindBy(xpath="//input[@id='password1']")
	private WebElement newPass;
	
	@FindBy(xpath="//input[@id='profile_password2']")
	private WebElement confirmPass;
	
	@FindBy(xpath="//button[@id='profile_apply_change']")
	private WebElement savechanges;
	
	@FindBy(xpath="//div[@class='alert alert-info']")
	private WebElement successMessage;
	
	// Extra test case doing for practice 
	//Test case - TO verify whether application allows admin to view details of user
	
	
	
	
	// METHODS
	public void sendUserName(String userName)
	{
		this.userName.clear();
		this.userName.sendKeys(userName);
	}
	
	public void sendPassword(String password)
	{
		this.password.clear();
		this.password.sendKeys(password);
	}
	
	public void clickLoginBtn()
	{
		this.loginBtn.click();
	}
	
	public void verifyHomePage(String txtval)
	{		
		if(this.txtMsg.getText().contains(txtval))
			System.out.println("Welcome message displayed");
		else
			System.out.println("Welcome message did not display");
		
	}
	
	public void clickUserIcon()
	{
		this.userIcon.click();
	}
	
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
	
	public void verifyAdminmenu()
	{		
		if(this.adminMenu.getText().contains("Administration"))
			System.out.println("Administration menu displayed");
		else
			System.out.println("Administration menu didnot display");
	}
	public void clickLogoutBtn()
	{
		this.logoutBtn.click();
	}
	
	public void clickHomePage()
	{
		this.homePageTab.click();
	}
	
			
	public void clickUserProfile()
	{
		this.userProfile.click();
	}
	
	public void enterOldUserNm(String oldUserName)
	{
		this.oldUserName.sendKeys(oldUserName);
	}
	
	public void enterNewPass(String newPass)
	{
		this.newPass.sendKeys(newPass);
		
	}
	
	public void enterConfirmPass(String confirmPass)
	{
		this.confirmPass.sendKeys(confirmPass);
	}
	
	public void saveChangesBtn()
	{
		this.savechanges.click();
	}
	
	public void verifySuccessMessage()
	{		
		if(this.successMessage.getText().contains("Your new profile has been saved"))
			System.out.println("Profile message displayed");
		else
			System.out.println("Profile message didnot display");
	}
	
	// Extra test case Method below 
	
	public void clickAdminTab()
	{
		this.adminMenu.click();
	}
}

