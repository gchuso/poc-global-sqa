package es.jsaz.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

public class CalculatorPage extends PageObject {

	@FindBy(xpath = "//h1[text()='AngularJS calculator']")
	private WebElementFacade calculatorTitle;

	@FindBy(xpath = "//input[@ng-model='a']")
	private WebElementFacade aText;

	@FindBy(xpath = "//input[@ng-model='b']")
	private WebElementFacade bText;

	@FindBy(xpath = "//b[@class='result ng-binding']")
	private WebElementFacade result;

	@FindBy(xpath = "//select[@ng-model='operation']")
	private WebElementFacade operationSelect;

	public void shouldBeVisibleTitle() {
		shouldBeVisible(calculatorTitle);
	}

	public void typeA(String a) {
		aText.type(a);
	}

	public void typeB(String b) {
		bText.type(b);
	}

	public void selectOperation(String option) {
		operationSelect.selectByVisibleText(option);
	}

	public String getResult() {
		return result.getText();
	}

}
