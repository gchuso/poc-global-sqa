package es.jsaz.features;

import static org.junit.Assert.assertThat;

import org.hamcrest.CoreMatchers;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import es.jsaz.steps.SearchFilterSteps;
import net.thucydides.core.annotations.Steps;

public class SearchFilterFeature {

	@Steps
	private SearchFilterSteps searchFilterSteps;

	@Given("^I open the Search filter page$")
	public void i_open_the_Search_filter_page() {
		searchFilterSteps.navigateToSearchFilter();
	}

	@When("^I search by payee '(.*)'$")
	public void i_search_by_payee_House(String payee) {
		searchFilterSteps.filterByPayee(payee);
	}

	@And("^I search by account '(.*)'$")
	public void i_search_by_account_Cash(String account) {
		searchFilterSteps.filterByAccount(account);
	}

	@Then("^I should see search results '(.*)'$")
	public void i_should_see_search_results(String result) {
		searchFilterSteps.shouldBeVisible(result);
	}

	@And("^I should not see search results '(.*)'$")
	public void i_should_not_see_search_results(String result) {
		String searchResults = searchFilterSteps.getSearchResults();
		assertThat(result, CoreMatchers.is("1 Cash EXPENDITURE HouseRent 1000"));
	}

}
