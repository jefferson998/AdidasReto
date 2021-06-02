package runners;




import io.cucumber.junit.Cucumber;

import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin={"pretty", "html:target/cucumber"},
        features="src/test/resources/features/BuscadorAdidas.feature",
        glue="stepDefinitions",
        snippets= CucumberOptions.SnippetType.CAMELCASE,
        publish=true

)
public class BuscadorAdidasRunner {




}
