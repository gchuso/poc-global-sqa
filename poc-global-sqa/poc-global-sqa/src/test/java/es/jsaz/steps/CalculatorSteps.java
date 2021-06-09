package es.jsaz.steps;

import static org.junit.Assert.assertThat;

import org.hamcrest.CoreMatchers;

import es.jsaz.pages.CalculatorPage;
import net.thucydides.core.annotations.Step;

public class CalculatorSteps {

	private CalculatorPage calculatorPage;

	@Step
	public void typeA(int a) {
		calculatorPage.typeA(String.valueOf(a));
	}

	@Step
	public void typeB(int b) {
		calculatorPage.typeB(String.valueOf(b));
	}

	@Step
	public void shouldSee(String result) {
		String resultText = calculatorPage.getResult();
		assertThat(result, CoreMatchers.is(resultText));
	}

	@Step
	public void selectOperation(String operation) {
		calculatorPage.selectOperation(operation);
	}

}
