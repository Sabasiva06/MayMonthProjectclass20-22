package org.runner;

import org.base.ReportingClasss;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "src\\test\\resources\\Login.feature" }, glue = {
		"org.stepdef" }, monochrome = true, dryRun = false, plugin = { "pretty",
				"html:C:\\Users\\sabas\\eclipse-workspace\\MaySampleCucumber\\target",
				"json:C:\\Users\\sabas\\eclipse-workspace\\MaySampleCucumber\\target\\sample.json",
				"junit:C:\\Users\\sabas\\eclipse-workspace\\MaySampleCucumber\\target\\sample.xml" }, snippets = SnippetType.CAMELCASE, strict = true)
public class TestRunner {

	@AfterClass
	public static void afterClass() {

		ReportingClasss.generateJVMReport("C:\\\\Users\\\\sabas\\\\eclipse-workspace\\\\MaySampleCucumber\\\\target\\\\sample.json");
	}

}
