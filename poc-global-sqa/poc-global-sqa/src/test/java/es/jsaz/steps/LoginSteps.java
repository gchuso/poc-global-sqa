package es.jsaz.steps;

import static org.junit.Assert.assertThat;

import org.hamcrest.CoreMatchers;

import es.jsaz.pages.LoginPage;
import net.thucydides.core.annotations.Step;

public class LoginSteps {

	private LoginPage loginPage;

	@Step
	public void typeInvalidCredentials() {
		loginPage.typeUsername("aaa");
		loginPage.typePassword("aaa");
	}

	@Step
	public void clickLoginLink() {
		loginPage.clickLoginButton();
	}

	@Step
	public void shouldBeVisibleErrorFeedback(String string) {
		String message = loginPage.getFeedbackError();
		assertThat("Username or password is incorrect", CoreMatchers.is(message));
	}

}
