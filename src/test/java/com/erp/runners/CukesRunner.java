package com.erp.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"json:target/cucumber.json",
                "html:target/default-html-reports",
                "rerun:target/rerun.txt"},
        features = "src/test/resources/features/",
        glue = "com/erp/step_definitions",
        dryRun = false,
<<<<<<< HEAD
        tags = "@while"
=======
        tags = "@website_modules"
>>>>>>> 46b6e435fd824a021db7982bcc5b0637c2567b25

        )
public class CukesRunner {
}
