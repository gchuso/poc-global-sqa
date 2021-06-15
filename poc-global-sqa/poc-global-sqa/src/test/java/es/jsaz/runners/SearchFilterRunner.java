package es.jsaz.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(plugin = "pretty", features = "src/test/resources/features/searchFilter", glue = "es.jsaz.features")
public class SearchFilterRunner {

}
