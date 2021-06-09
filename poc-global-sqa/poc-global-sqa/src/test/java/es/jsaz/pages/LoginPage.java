package es.jsaz.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

public class LoginPage extends PageObject {

	@FindBy(xpath = "//h2[text()='Login']")
	private WebElementFacade loginTitle;

	@FindBy(linkText = "Register")
	private WebElementFacade registerLink;

	@FindBy(xpath = "//div[@class='ng-binding ng-scope alert alert-success']")
	private WebElementFacade feedbackInfo;

	@FindBy(xpath = "//div[@class='ng-binding ng-scope alert alert-danger']")
	private WebElementFacade feedbackError;

	@FindBy(id = "username")
	private WebElementFacade usernameText;

	@FindBy(id = "password")
	private WebElementFacade passwordText;

	@FindBy(xpath = "//button[text()='Login']")
	private WebElementFacade loginButton;

	public void shouldBeVisibleLoginTitle() {
		shouldBeVisible(loginTitle);
	}

	public void clickRegisterLink() {
		registerLink.click();
	}

	public String getFeedbackInfo() {
		return feedbackInfo.getText();
	}

	public String getFeedbackError() {
		return feedbackError.getText();
	}

	public void typeUsername(String username) {
		usernameText.type(username);
	}

	public void typePassword(String password) {
		passwordText.type(password);
	}

	public void clickLoginButton() {
		loginButton.click();
	}

}
