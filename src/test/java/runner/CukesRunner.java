package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

// My loved code (git push origin HEAD --force) & (git reset --hard HEAD~1) ctrl shift and r
// clean install -e Goals in jenkins
@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "json:target/cucumber.json",
                "html:target/cucumber-report.html",
                "rerun:target/rerun.txt",
                "me.jvt.cucumber.report.PrettyReports:target/cucumber"
        },
        glue = "stepDefinitations",
        features = "src/test/resources",
        dryRun = false,
        tags = "@mail"

)
class CukesRunner {

}
