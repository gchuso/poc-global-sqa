package es.jsaz.steps;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import es.jsaz.pages.LoginPage;
import es.jsaz.pages.RegisterPage;
import net.thucydides.core.annotations.Step;

public class RegistrationSteps {

	private LoginPage loginPage;
	private RegisterPage registerPage;

	@Step
	public void registerNewUser() {
		loginPage.shouldBeVisibleLoginTitle();
		loginPage.clickRegisterLink();

		registerPage.shouldBeVisibleRegisterTitle();
		registerPage.typeFirstName("FN1");
		registerPage.typeLastName("LN1");
		registerPage.typeUsername("U1");
		registerPage.typePassword("password1");

		registerPage.clickRegisterButton();
	}

	@Step
	public void newUserShouldBeRegistered() {
		String message = loginPage.getFeedbackInfo();
		assertThat("Registration successful", is(message));
	}

}
