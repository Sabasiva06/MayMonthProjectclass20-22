package org.stepdef;

import java.util.List;
import java.util.Map;

import org.base.FunctionalLib;
import org.junit.Assert;
import org.locator.Login;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDef extends FunctionalLib {
	Login login;

	@Given("user is FB page on chrome browser")
	public void user_is_FB_page_on_chrome_browser() {


	}

	@When("user enters username and password")
	public void userEntersUsernameAndPassword(io.cucumber.datatable.DataTable dataTable) {

		List<Map<String, String>> asMaps = dataTable.asMaps();
		Map<String, String> map = asMaps.get(0);
		String username = map.get("user");
		String password = map.get("pass");

		login = new Login();
		WebElement txtUserName = login.getTxtUserName();
		typeText(txtUserName, username);

		WebElement txtPassword = login.getTxtPassword();
		typeText(txtPassword, password);
	}

	@When("user should click on login button")
	public void user_should_click_on_login_button() {
		WebElement btnLogin = login.getBtnLogin();
		Assert.assertTrue(false);
		btnLogin(btnLogin);
	}

	@Then("user need to verify home page is vissible or not")
	public void user_need_to_verify_home_page_is_vissible_or_not() {
		System.out.println("Invalid usernaem");
	}

}
