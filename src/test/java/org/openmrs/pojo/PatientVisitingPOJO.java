package org.openmrs.pojo;

import java.util.List;

import org.openmrs.utility.UtilityClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PatientVisitingPOJO extends UtilityClass {
	
	public PatientVisitingPOJO() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="(//div[@class='col-11 col-lg-10'])[1]")
	private WebElement startVisit;
	
	@FindBy(xpath="(//button[text()='Confirm'])[4]")
	private WebElement confirm;
	
	@FindBy(xpath="//a[text()=' Attachments']")
	private WebElement attachment;
	
	@FindBy(xpath="//div[text()='Click or drop a file here.']")
	private WebElement attachFile;
	
	@FindBy(xpath="//textarea[@placeholder='Enter a caption']")
	private WebElement caption;
	
	@FindBy(xpath="//button[text()='Upload file']")
	private WebElement uploadFile;
	
	@FindBy(xpath="(//ul[@id='breadcrumbs']//li//a)[2]")
	private WebElement profileRedirection;
	
	@FindBy(xpath="//i[@class='icon-file']")
	private WebElement fileDisplaying;
	
	@FindBy(xpath="//div[text()='Attachment Upload']")
	private List<WebElement> recentEntry;
	
	@FindBy(xpath="((//h3[text()='Current Visit Actions'])[2]//parent::ul//child::li)[1]")
	private WebElement endVisit;
	
	@FindBy(xpath="(//button[text()='Yes'])[2]")
	private WebElement yesButton;

	public WebElement getStartVisit() {
		return startVisit;
	}

	public WebElement getConfirm() {
		return confirm;
	}

	public WebElement getAttachment() {
		return attachment;
	}

	public WebElement getAttachFile() {
		return attachFile;
	}

	public WebElement getCaption() {
		return caption;
	}

	public WebElement getUploadFile() {
		return uploadFile;
	}

	public WebElement getProfileRedirection() {
		return profileRedirection;
	}

	public WebElement getFileDisplaying() {
		return fileDisplaying;
	}

	public List<WebElement> getRecentEntry() {
		return recentEntry;
	}

	public WebElement getEndVisit() {
		return endVisit;
	}

	public WebElement getYesButton() {
		return yesButton;
	}
	
	
	
}
