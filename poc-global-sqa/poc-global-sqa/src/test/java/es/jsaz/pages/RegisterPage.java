package es.jsaz.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

public class RegisterPage extends PageObject {

	@FindBy(xpath = "//h2[text()='Register']")
	private WebElementFacade registerTitle;

	@FindBy(id = "firstName")
	private WebElementFacade firstNameText;

	@FindBy(name = "lastName")
	private WebElementFacade lastNameText;

	@FindBy(id = "username")
	private WebElementFacade usernameText;

	@FindBy(id = "password")
	private WebElementFacade passwordText;

	@FindBy(xpath = "//button[text()='Register']")
	private WebElementFacade registerButton;

	public void shouldBeVisibleRegisterTitle() {
		shouldBeVisible(registerTitle);
	}

	public void typeFirstName(String firstName) {
		firstNameText.type(firstName);
	}

	public void typeLastName(String lastName) {
		lastNameText.type(lastName);
	}

	public void typeUsername(String username) {
		usernameText.type(username);
	}

	public void typePassword(String password) {
		passwordText.type(password);
	}

	public void clickRegisterButton() {
		registerButton.click();
	}

}
