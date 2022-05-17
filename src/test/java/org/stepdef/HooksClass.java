package org.stepdef;

import org.base.FunctionalLib;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class HooksClass extends FunctionalLib {

	@Before
	public void beforeScenario() {

		getDriver("chrome");
		launchUrl("https://www.facebook.com/");

	}

	@After
	public void afterScea(Scenario s) {
		if (s.isFailed()) {
			TakesScreenshot ts = (TakesScreenshot) driver;
			byte[] screenshotAs = ts.getScreenshotAs(OutputType.BYTES);
			// attaching the image to report
			s.embed(screenshotAs, "a.png");

		}
		driver.close();

	}

}
