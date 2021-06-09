package es.jsaz.steps;

import es.jsaz.pages.IndexPage;
import net.thucydides.core.annotations.Step;

public class IndexSteps {

	private IndexPage indexPage;

	@Step
	public void openTheGlobalSqaPage() {
		indexPage.open();
	}

	@Step
	public void clickRegistrationLoginLink() {
		indexPage.clickRegistrationLoginLink();
	}

	@Step
	public void clickSimpleCalculatorLink() {
		indexPage.clickSimpleCalculatorLink();
	}

}
