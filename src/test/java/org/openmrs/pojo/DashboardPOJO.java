package org.openmrs.pojo;

import org.openmrs.utility.UtilityClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPOJO extends UtilityClass {
	
	public DashboardPOJO() {

		PageFactory.initElements(driver, this);
	}
	
	@FindBy(tagName="h4")
	private WebElement loggedInMsg;
	
	@FindBy(xpath="//i[@class='icon-user']")
	private WebElement Register;

	
	public WebElement getLoggedInMsg() {
		return loggedInMsg;
	}

	public WebElement getRegister() {
		return Register;
	}
	
	

}
