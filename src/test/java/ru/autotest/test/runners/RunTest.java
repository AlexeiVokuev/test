package ru.autotest.test.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/features",
        glue = "ru.autotest.test.steps",
        tags = "@runme",
        dryRun = false,
        strict = false
)
public class RunTest {
}