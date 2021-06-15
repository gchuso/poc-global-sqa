package es.jsaz.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

public class SearchFilterPage extends PageObject {

	@FindBy(id = "input1")
	private WebElementFacade payeeText;

	@FindBy(id = "input2")
	private WebElementFacade accountSelect;

	@FindBy(xpath = "//table[@class='table table-striped table-bordered']")
	private WebElementFacade searchResultsTable;

	public void typePayee(String payee) {
		payeeText.type(payee);
	}

	public void selectAccount(String account) {
		accountSelect.selectByVisibleText(account);
	}

	public void shouldBeVisibleResult(String result) {
		shouldContainText(result);
	}

	public String getSearchResultsTable() {
		return searchResultsTable.getText();
	}

}
