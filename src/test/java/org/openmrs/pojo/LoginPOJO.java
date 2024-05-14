package org.openmrs.pojo;

import org.openmrs.utility.UtilityClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPOJO extends UtilityClass{
	
	public LoginPOJO() {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="username")
	private WebElement userName;
	
	@FindBy(id="password")
	private WebElement password;
	
	@FindBy(xpath="//li[text()='Registration Desk']")
	private WebElement regDesk;
	
	@FindBy(id="loginButton")
	private WebElement login;

	public WebElement getUserName() {
		return userName;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getRegDesk() {
		return regDesk;
	}

	public WebElement getLogin() {
		return login;
	}
	
}
