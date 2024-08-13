package com.testing.moviles.app.runners;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@CucumberOptions(
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        features = {"src/test/resources/features/BuySucceful.feature"},
        tags = "@Compra",
        glue = "com.testing.moviles.app.stepsdefinition"
)
@RunWith(CucumberWithSerenity.class)
public class BuySuccefulRunner {
}

