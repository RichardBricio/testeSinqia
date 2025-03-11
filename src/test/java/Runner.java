import common.hooks.Hooks;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.AfterClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.testng.annotations.AfterTest;

import java.io.IOException;

@RunWith(Cucumber.class)
//@CucumberOptions(features = {"src/main/resources/features/AutocompleteSearchBar.feature"}, glue = "steps")
//@CucumberOptions(features = {"src/main/resources/features/SearchAccessSearchBar.feature"}, glue = "steps")
@CucumberOptions(features = {"src/main/resources/features"}, glue = "steps")
public class Runner extends AbstractTestNGCucumberTests {
    private static final Logger logger = LogManager.getLogger(Runner.class);

    @Test
    public void main() throws IOException {
        logger.info("----- TEST EXECUTION INITIATED THROUGH THE DEVOPS RUNNER - JUNIT -----");
    }

    @AfterTest
    public static void tearDown() throws IOException, InterruptedException {
        Hooks.tearDown();
    }

    @AfterClass
    public static void afterClassCore() throws IOException, InterruptedException {
        Hooks.tearDown();
    }

}