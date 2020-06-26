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
     //tags = "@website_modules"
        tags = "@wip123"
)
=======
        tags = "@wip"

        )
>>>>>>> 6b40196ce9d4945399fc308565d675ef55ad435b
public class CukesRunner {
}