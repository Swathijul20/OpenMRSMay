package org.openmrs.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.jvm.JvmReport;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(features="src\\test\\resources",
                 glue="org.stepdefinition",
                 monochrome=true,
                 dryRun=false,
                 plugin= {"html:target\\Html Report",
                		 "junit:target\\Junit Report\\Jureport.xml", 
                		 "json:target\\Json Report\\Jsonreport.json"})
public class TestRunnerClass {
	
	@AfterClass
	public static void reportForJvm() {

		JvmReport.toGenerateJvmReport("C:\\Users\\Dell\\Downloads\\OpenMRS\\target\\Json Report\\Jsonreport.json");
	}

}
