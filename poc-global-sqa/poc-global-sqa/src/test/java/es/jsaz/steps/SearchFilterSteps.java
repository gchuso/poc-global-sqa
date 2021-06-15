package es.jsaz.steps;

import es.jsaz.pages.IndexPage;
import es.jsaz.pages.SearchFilterPage;
import net.thucydides.core.annotations.Step;

public class SearchFilterSteps {

	private IndexPage indexPage;
	private SearchFilterPage searchFilterPage;

	@Step
	public void navigateToSearchFilter() {
		indexPage.open();
		indexPage.clickSearchFilterLink();
	}

	@Step
	public void filterByPayee(String payee) {
		searchFilterPage.typePayee(payee);
	}

	@Step
	public void filterByAccount(String account) {
		searchFilterPage.selectAccount(account);
	}

	@Step
	public void shouldBeVisible(String result) {
		searchFilterPage.shouldBeVisibleResult(result);
	}

	public String getSearchResults() {
		return searchFilterPage.getSearchResultsTable();
	}

}
