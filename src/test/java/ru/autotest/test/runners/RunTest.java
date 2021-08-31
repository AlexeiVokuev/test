package ru.autotest.test.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/features",
        glue = "ru.autotest.test.steps",
        tags = "@runme",
        dryRun = false
)
public class RunTest {
}