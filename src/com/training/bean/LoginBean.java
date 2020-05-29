package com.training.bean;

// Nayan created
public class LoginBean {
	private String regFirstName;
	private String regLastName;
	private String regemail;
	private String regUserName;
	private String regPass1;
	private String regPass2;
	private String regPhoneTextBox;
	private String language;
	
	//private String userName;
	//private String password;

	public LoginBean() {
	}

	public LoginBean(String regFirstName, String regLastName, String regemail, String regUserName, String regPass1, String regPass2, String regPhoneTextBox, String language) {
		super();
		this.regFirstName = regFirstName;
		this.regLastName = regLastName;
		this.regemail = regemail;
		this.regUserName = regUserName;
		this.regPass1 = regPass1;
		this.regPass2 = regPass2;
		this.regPhoneTextBox = regPhoneTextBox;
		this.language = language;
	}

	public String getFirstName() {
		return regFirstName;
	}

	public void setFirstName(String regFirstName) {
		this.regFirstName = regFirstName;
	}
	
	public String getLastName() {
		return regLastName;
	}

	public void setLastName(String regLastName) {
		this.regLastName = regLastName;
	}
	
	public String getEmail() {
		return regemail;
	}

	public void setEmail(String regemail) {
		this.regemail = regemail;
	}
	
	public String getUserName() {
		return regUserName;
	}

	public void setUserName(String regUserName) {
		this.regUserName = regUserName;
	}

	public String getPhone() {
		return regPhoneTextBox;
	}

	public void setPhone(String regPhoneTextBox) {
		this.regPhoneTextBox = regPhoneTextBox;
	}

	public String getPassword2() {
		return regPass2;
	}

	public void setPassword2(String regPass2) {
		this.regPass2 = regPass2;
	}
	
	public String getPassword() {
		return regPass1;
	}

	public void setPassword(String regPass1) {
		this.regPass1 = regPass1;
	}
	
	public String getlanguage() {
		return language;
	}

	public void setlanguage(String language) {
		this.language = language;
	}
	@Override
	public String toString() {
		return "LoginBean [userName=" + regUserName + ", password=" + regPass1 + "]";
	}

}
