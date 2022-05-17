package org.base;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class ReportingClasss {

	public static void generateJVMReport(String json) {

		// File Location
		File file = new File("C:\\Users\\sabas\\eclipse-workspace\\MaySampleCucumber\\target");

		// Configuration-->c
		Configuration configuration = new Configuration(file, "Sample Facebook Reprot");
		configuration.addClassifications("Browser Type", "Chrome");
		configuration.addClassifications("Browser Version", "100.02.45");
		configuration.addClassifications("Platform", "Win-11");
		configuration.addClassifications("Environment", "UAT");
		configuration.addClassifications("Sprint No", "20");

		List<String> li = new ArrayList<String>();
		li.add(json);

		ReportBuilder builder = new ReportBuilder(li, configuration);
		builder.generateReports();

	}

}
