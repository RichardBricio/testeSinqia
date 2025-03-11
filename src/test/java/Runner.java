import common.hooks.Hooks;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.AfterClass;
import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.runner.RunWith;

import java.io.IOException;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/main/resources/features"}, glue = "steps")
public class Runner extends AbstractTestNGCucumberTests {
    private static final Logger logger = LogManager.getLogger(Runner.class);

    @Test
    public void main() throws IOException {
        logger.info("----- EXECUÇÃO DE TESTE INICIADA ATRAVÉS DO DEVOPS RUNNER - JUNIT -----");
    }

    @AfterAll
    public static void tearDown() throws IOException, InterruptedException {
        Hooks.tearDown();
    }

    @AfterClass
    public static void afterClassCore() throws IOException, InterruptedException {
        Hooks.tearDown();
    }

}