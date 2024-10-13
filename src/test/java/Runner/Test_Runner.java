package Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src\\test\\java\\Features\\Automation.feature"},
        glue={"Step","Hooks"},
        tags = "@TestCase10",
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        plugin = {"pretty"}
)

public class Test_Runner {
}
