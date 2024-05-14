package org.openmrs.utility;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class UtilityClass {

	public static WebDriver driver;

	public static void launchBrowser(String browserName) {

		if (browserName.equals("Chrome")) {
			driver = new ChromeDriver();
		} else if (browserName.equals("Edge")) {
			driver = new EdgeDriver();
		} else if (browserName.equals("Firefox")) {
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
	}

	public static void launchUrl(String url) {

		driver.get(url);
	}

	public static void passText(String data, WebElement element) {

		element.sendKeys(data);
	}

	public static void clickElement(WebElement element) {

		element.click();
	}
	
	public static void selectValueInDd(WebElement element, String value) {

		Select s = new Select(element);
		s.selectByValue(value);
	}
	
	public static void selectUsingIndex(WebElement element, int index) {

		Select s = new Select(element);
		s.selectByIndex(index);
	}
	
	public static void takeScreenshot(String imgName) throws IOException {

		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Users\\Dell\\Downloads\\OpenMRS\\Screenshots" + imgName + ".png");
		FileUtils.copyFile(src, des);  
	}
	
	public static void paste() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);

	}

}
