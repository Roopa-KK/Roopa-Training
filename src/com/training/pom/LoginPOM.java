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
	
	
	 	
	// METHODS
	
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
	
   
	
	
}

