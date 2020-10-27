package co.com.projectwongrest.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src\\test\\resources\\features\\user_management.feature",
        glue = "co.com.projectwongrest.stepdefinitions",
        snippets = SnippetType.CAMELCASE,
        dryRun = false
)

public class UserManagementRunner {
}
