package es.jsaz.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("https://www.globalsqa.com/angularjs-protractor-practice-site/")
public class IndexPage extends PageObject {

	@FindBy(linkText = "RegistrationLogin")
	private WebElementFacade registrationLoginLink;

	@FindBy(linkText = "Simple Calculator")
	private WebElementFacade simpleCalculatorLink;

	public void clickRegistrationLoginLink() {
		registrationLoginLink.click();
	}

	public void clickSimpleCalculatorLink() {
		simpleCalculatorLink.click();
	}

}
