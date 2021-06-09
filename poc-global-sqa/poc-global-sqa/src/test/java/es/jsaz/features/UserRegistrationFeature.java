package es.jsaz.features;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import es.jsaz.steps.IndexSteps;
import es.jsaz.steps.RegistrationSteps;
import net.thucydides.core.annotations.Steps;

public class UserRegistrationFeature {

	@Steps
	private IndexSteps indexSteps;

	@Steps
	private RegistrationSteps registrationSteps;

	@Given("^I open the global sqa page$")
	public void i_open_the_global_sqa_page() {
		indexSteps.openTheGlobalSqaPage();
	}

	@When("^I register a new user$")
	public void i_register_a_new_user() {
		indexSteps.clickRegistrationLoginLink();
		registrationSteps.registerNewUser();
	}

	@Then("^I should see feedback 'Registration successful'$")
	public void i_should_see_feedback_Registration_successful() {
		registrationSteps.newUserShouldBeRegistered();
	}

}
