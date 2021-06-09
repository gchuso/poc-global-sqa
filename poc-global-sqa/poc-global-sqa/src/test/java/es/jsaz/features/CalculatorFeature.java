package es.jsaz.features;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import es.jsaz.steps.CalculatorSteps;
import es.jsaz.steps.IndexSteps;
import net.thucydides.core.annotations.Steps;

public class CalculatorFeature {

	@Steps
	private IndexSteps indexSteps;

	@Steps
	private CalculatorSteps calculatorSteps;

	@Given("^I open calculator page$")
	public void i_open_calculator_page() {
		indexSteps.openTheGlobalSqaPage();
		indexSteps.clickSimpleCalculatorLink();
	}

	@When("^I type a value '(\\d+)'$")
	public void i_type_a_value(int a) {
		calculatorSteps.typeA(a);
	}

	@When("^I type b value '(\\d+)'$")
	public void i_type_b_value(int b) {
		calculatorSteps.typeB(b);
	}

	@When("^I select operation '(.*)'$")
	public void i_select_operation(String operation) {
		calculatorSteps.selectOperation(operation);
	}

	@Then("^I should see '(.*)'$")
	public void i_should_see(String result) {
		calculatorSteps.shouldSee(result);
	}

}
