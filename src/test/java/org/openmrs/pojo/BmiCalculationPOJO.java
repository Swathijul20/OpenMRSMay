package org.openmrs.pojo;

import java.util.List;

import org.openmrs.utility.UtilityClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BmiCalculationPOJO extends UtilityClass{
	
	public BmiCalculationPOJO() {

		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//h3[text()='General Actions']//parent::ul//child::div)[3]")
	private WebElement startVis;
	
	@FindBy(xpath="(//button[text()='Confirm'])[4]")
	private WebElement confirm;
	
	@FindBy(xpath="//a[text()=' Capture Vitals']")
	private WebElement captureVitals;
	
	@FindBy(xpath="//span[@id='height']//input")
	private WebElement height;
	
	@FindBy(xpath="//button[@id='next-button']")
	private WebElement nextButton;
	
	@FindBy(xpath="//span[@id='weight']//input")
	private WebElement weight;
	
	@FindBy(xpath="//span[@id='calculated-bmi']")
	private WebElement bmiCalculated;
	
	@FindBy(xpath="//span[@id='temperature']//input")
	private WebElement temprature;
	
	@FindBy(xpath="//span[@id='heart_rate']//input")
	private WebElement pulse;
	
	@FindBy(xpath="//span[@id='respiratory_rate']//input")
	private WebElement respirary;
	
	@FindBy(xpath="//span[@id='bp_systolic']//input")
	private WebElement fromBloodPressure;
	
	@FindBy(xpath="//span[@id='bp_diastolic']//input")
	private WebElement toBloodPressure;
	
	@FindBy(xpath="//span[@id='o2_sat']//input")
	private WebElement o2Level;
	
	@FindBy(xpath="//a[@id='save-form']")
	private WebElement saveForm;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement save;
	
	@FindBy(xpath="//a[text()=' End Visit']")
	private WebElement endVisit;
	
	@FindBy(xpath="(//button[text()='Yes'])[3]")
	private WebElement yes;

	@FindBy(xpath="(//ul[@id='breadcrumbs']//a)[2]")
	private WebElement redirect;
	
	@FindBy(xpath="//span[@id='height']//span[@class='value']")
	private WebElement verifyHeight;
	
	@FindBy(xpath="//span[@id='weight']//span[@class='value']")
	private WebElement verifyWeight;
	
	@FindBy(xpath="//div[text()='Vitals']")
	private WebElement verifyVitals;
	
	@FindBy(xpath="(//div[@class='col-11 col-lg-10'])[3]")//(//*[@class='col-11 col-lg-10'])[3]
	private WebElement mergeVisit;
	
	@FindBy(xpath="//input[@type='checkbox']")
	private List<WebElement> enableMergeCheckbox;
	
	@FindBy(xpath="//input[@id='mergeVisitsBtn']")
	private WebElement merge;
	
	@FindBy(xpath="//input[@type='button']")
	private WebElement returnToDetailsPage;
	
	@FindBy(xpath="//div[text()='Vitals, Attachment Upload']")
	private List<WebElement> vitalAttachmentUploaded;
	
	@FindBy(xpath="//div[@id='coreapps-fr7027']//li")
	private List<WebElement> verifyEntry;
	
	 
	
	public List<WebElement> getVitalAttachmentUploaded() {
		return vitalAttachmentUploaded;
	}

	public List<WebElement> getVerifyEntry() {
		return verifyEntry;
	}

	public WebElement getReturnToDetailsPage() {
		return returnToDetailsPage;
	}

	public WebElement getMerge() {
		return merge;
	}

	public List<WebElement> getEnableMergeCheckbox() {
		return enableMergeCheckbox;
	}

	public WebElement getMergeVisit() {
		return mergeVisit;
	}

	public WebElement getVerifyVitals() {
		return verifyVitals;
	}

	public WebElement getVerifyHeight() {
		return verifyHeight;
	}

	public WebElement getVerifyWeight() {
		return verifyWeight;
	}

	public WebElement getRedirect() {
		return redirect;
	}

	public WebElement getYes() {
		return yes;
	}

	public WebElement getEndVisit() {
		return endVisit;
	}

	public WebElement getSaveForm() {
		return saveForm;
	}

	public WebElement getSave() {
		return save;
	}

	public WebElement getO2Level() {
		return o2Level;
	}

	public WebElement getFromBloodPressure() {
		return fromBloodPressure;
	}

	public WebElement getToBloodPressure() {
		return toBloodPressure;
	}

	public WebElement getRespirary() {
		return respirary;
	}

	public WebElement getStartVis() {
		return startVis;
	}

	public WebElement getConfirm() {
		return confirm;
	}

	public WebElement getCaptureVitals() {
		return captureVitals;
	}

	public WebElement getHeight() {
		return height;
	}

	public WebElement getNextButton() {
		return nextButton;
	}

	public WebElement getWeight() {
		return weight;
	}

	public WebElement getBmiCalculated() {
		return bmiCalculated;
	}

	public WebElement getTemprature() {
		return temprature;
	}

	public WebElement getPulse() {
		return pulse;
	}
	
	
	

} 
