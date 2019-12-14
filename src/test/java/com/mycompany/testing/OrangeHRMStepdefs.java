package com.mycompany.testing;

import io.cucumber.java8.En;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import io.cucumber.core.cli.Main;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/Features"})
public class OrangeHRMStepdefs implements En {
    public OrangeHRMStepdefs() {
        Given("^Launch browser$", () -> {
        });
        When("^Open OrangeHRM home page$", () -> {
        });
        Then("^Check the logo$", () -> {
        });
        And("^close browser$", () -> {
        });
    }
}
