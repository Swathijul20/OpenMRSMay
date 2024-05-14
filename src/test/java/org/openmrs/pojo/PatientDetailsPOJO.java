package org.openmrs.pojo;

import java.util.List;

import org.openmrs.utility.UtilityClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PatientDetailsPOJO extends UtilityClass{

	public PatientDetailsPOJO() {

		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="givenName")
	private WebElement givenName;
	
	@FindBy(name="familyName")
	private WebElement familyName;
	
	@FindBy(id="next-button")
	private WebElement nextButton;
	
	@FindBy(id="gender-field")
	private WebElement genderDropDown;
	
	@FindBy(name="birthdateDay")
	private WebElement birthDate;
	
	@FindBy(name="birthdateMonth")
	private WebElement birthMonth;
	
	@FindBy(name="birthdateYear")
	private WebElement birthYear;
	
	@FindBy(id="address1")
	private WebElement addressOne;
	
	@FindBy(id="address2")
	private WebElement addressTwo;
	
	@FindBy(id="cityVillage")
	private WebElement city;
	
	@FindBy(id="stateProvince")
	private WebElement state;
	
	@FindBy(id="country")
	private WebElement country;
	
	@FindBy(id="postalCode")
	private WebElement postalCode;
	
	@FindBy(name="phoneNumber")
	private WebElement phoneNumber;
	
	@FindBy(id="relationship_type")
	private WebElement relationship;
	
	@FindBy(xpath="//input[@placeholder='Person Name']")
	private WebElement personName;
	
	@FindBy(xpath="//div[@id='dataCanvas']//child::p")
	private List<WebElement> details;
	
	@FindBy(xpath="(//div[@class='gender-age col-auto']//child::span)[2]")
	private WebElement age;
	
	@FindBy(id="submit")
	private WebElement submit;

	public WebElement getGivenName() {
		return givenName;
	}

	public WebElement getFamilyName() {
		return familyName;
	}

	public WebElement getNextButton() {
		return nextButton;
	}

	public WebElement getGenderDropDown() {
		return genderDropDown;
	}

	public WebElement getBirthDate() {
		return birthDate;
	}

	public WebElement getBirthMonth() {
		return birthMonth;
	}

	public WebElement getBirthYear() {
		return birthYear;
	}

	public WebElement getAddressOne() {
		return addressOne;
	}

	public WebElement getAddressTwo() {
		return addressTwo;
	}

	public WebElement getCity() {
		return city;
	}

	public WebElement getState() {
		return state;
	}

	public WebElement getCountry() {
		return country;
	}

	public WebElement getPostalCode() {
		return postalCode;
	}

	public WebElement getPhoneNumber() {
		return phoneNumber;
	}

	public WebElement getRelationship() {
		return relationship;
	}

	public WebElement getPersonName() {
		return personName;
	}

	public List<WebElement> getDetails() {
		return details;
	}

	public WebElement getSubmit() {
		return submit;
	}

	public WebElement getAge() {
		return age;
	}
	
	
	
	
	
}
