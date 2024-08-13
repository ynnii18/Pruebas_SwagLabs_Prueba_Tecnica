package com.testing.moviles.app.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        features = {"src/test/resources/features/SuccessfulLogin.feature"},
        glue = "com.testing.moviles.app.stepsdefinition",
        tags = "@Login"
)
public class SuccessfulLoginRunner {
}
