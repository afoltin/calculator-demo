package com.mobiquity.calculator.test;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        // packages to search for steps
        glue = {
                "com.mobiquityinc.mobit.steps"
        },

        // locations where to search for .feature files
        features = {
                "classpath:features"
        },

        // run everything that is not tagged with @ignore
        tags = {
                "~@ignore"
        },

        // put the test results to this json file
        // todo: pass a path that is not dependent on the current directory
        plugin = {
                "pretty",
                "json:calculator-test/target/cucumber/cucumber-results.json"
        }
)
public final class IntegrationTests { }
