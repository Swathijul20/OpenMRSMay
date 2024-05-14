package org.jvm;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JvmReport {
	
	public static void toGenerateJvmReport(String jsonReportPath) {

		File f = new File("src\\test\\resources\\JVM Reports");
		
		Configuration c = new Configuration(f, "Open MRS");
		c.addClassifications("Browser", "Edge");
		c.addClassifications("Browser Version", "124.0.2478.51");
		c.addClassifications("Platform", "Windows");
		c.addClassifications("Platform Version", "11");
		
		List<String> l = new ArrayList<String>();
		l.add(jsonReportPath);
		
		ReportBuilder r = new ReportBuilder(l, c);
		r.generateReports();
	}

}
