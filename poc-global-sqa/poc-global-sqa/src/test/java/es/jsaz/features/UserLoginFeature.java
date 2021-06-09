package es.jsaz.features;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import es.jsaz.steps.IndexSteps;
import es.jsaz.steps.LoginSteps;
import net.thucydides.core.annotations.Steps;

public class UserLoginFeature {

	@Steps
	private IndexSteps indexSteps;

	@Steps
	private LoginSteps loginSteps;

	@Given("^I open login page$")
	public void i_open_login_page() {
		indexSteps.openTheGlobalSqaPage();
	}

	@When("^I type invalid credentials$")
	public void i_type_invalid_credentials() {
		indexSteps.clickRegistrationLoginLink();
		loginSteps.typeInvalidCredentials();
		loginSteps.clickLoginLink();
	}

	@Then("^I should see the feedback 'Username or password is incorrect'$")
	public void i_should_see_the_feedback_Username_or_password_is_incorrect() {
		loginSteps.shouldBeVisibleErrorFeedback("Username or password is incorrect");
	}

}
