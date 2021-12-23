package AvatoonAvatarMaker.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "html:target/default-html-reports"
        },
        glue = "AvatoonAvatarMaker/step_defs",
        features = "src/test/resources/features",
        tags = "@all",
        dryRun = false
)
public class MyRunner {

}
