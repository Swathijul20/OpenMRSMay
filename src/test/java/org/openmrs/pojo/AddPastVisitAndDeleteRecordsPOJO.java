package org.openmrs.pojo;

import org.openmrs.utility.UtilityClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddPastVisitAndDeleteRecordsPOJO extends UtilityClass{
	
	public AddPastVisitAndDeleteRecordsPOJO() {

		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//div[@class='col-11 col-lg-10'])[2]")
	private WebElement addPastVisit;
	
	@FindBy(xpath="((//td[@class='day active'])[1]//parent::tr//following-sibling::tr//child::td[@class='day disabled'])[1]")
	private WebElement futureDate;
	
	@FindBy(xpath="(//div[@class='col-11 col-lg-10'])[8]")
	private WebElement deletePatient;
	
	@FindBy(id="delete-reason")
	private WebElement reason;
	
	@FindBy(xpath="(//button[text()='Confirm'])[4]")
	private WebElement continueBtn;
	
	@FindBy(id="patient-search")
	private WebElement patientSearch;
	
	

	@FindBy(tagName="h2")
	private WebElement patientRecordPage;

	
	public WebElement getPatientRecordPage() {
		return patientRecordPage;
	}

	public WebElement getContinueBtn() {
		return continueBtn;
	}

	public WebElement getDeletePatient() {
		return deletePatient;
	}

	public WebElement getReason() {
		return reason;
	}

	public WebElement getAddPastVisit() {
		return addPastVisit;
	}
	
	public WebElement getPatientSearch() {
		return patientSearch;
	}

	public WebElement getFutureDate() {
		return futureDate;
	}
	
	
	
}
