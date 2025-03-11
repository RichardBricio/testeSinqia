package steps;

import com.aventstack.extentreports.MediaEntityBuilder;
import common.utils.DriverUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.*;
import pages.HomePageAgiBank;

import java.sql.Driver;
import java.time.Duration;
import java.util.List;

public class StepDefinitions {
        static WebDriver driver;
        static WebDriverWait wait;
        HomePageAgiBank pageAgiBank;
        private static final Logger logger = LogManager.getLogger(StepDefinitions.class);

        public static WebDriver getDriver() {
            return driver;
        }

        @Given("Eu acesso o site AgiBank")
	    public void access_agiBank_page() throws Throwable {
            try{
                driver = DriverUtils.getDriver();                
                pageAgiBank = new HomePageAgiBank();
                driver.navigate().to("https://blog.agibank.com.br/");
                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
                driver.manage().window().maximize();
                logger.info("URL accessed successfully");
                Assert.assertTrue(true);
                DriverUtils.getExtentTest().pass("Access to the AgiBank homepage successfully completed", MediaEntityBuilder.createScreenCaptureFromPath(DriverUtils.getScreentShotExtentPath()).build());
            } catch (Exception ex) {
                DriverUtils.getExtentTest().fail(ex);
                throw ex;
            }
        }

        @Then("Eu valido a busca (VALIDA|INVALIDA) com as seguintes palavras:$")
        public void validate_search_with_words(String status, List<String> words) throws Exception{
            try{
                for (String palavra : words){
                    Thread.sleep(2000);
                    DriverUtils.waitAndClickElement(pageAgiBank.getLupaPesquisa());
                    DriverUtils.waitAndClickElement(pageAgiBank.getBarraPesquisa());
                    pageAgiBank.getBarraPesquisa().clear();

                    pageAgiBank.getBarraPesquisa().sendKeys(palavra);
                    Thread.sleep(2000);
                    pageAgiBank.getBarraPesquisa().sendKeys(Keys.ENTER);
                    Thread.sleep(3000);

                    try{
                        if ((status.equals("VALIDA")) && pageAgiBank.getComResultadoPesquisa().isDisplayed())
                            DriverUtils.getExtentTest().pass("Retornou resultado de busca com sucesso", MediaEntityBuilder.createScreenCaptureFromPath(DriverUtils.getScreentShotExtentPath()).build());
                        else if ((status.equals("INVALIDA")) && pageAgiBank.getSemResultadoPesquisa().isDisplayed())
                            DriverUtils.getExtentTest().pass("Não retornou resultado de busca com sucesso", MediaEntityBuilder.createScreenCaptureFromPath(DriverUtils.getScreentShotExtentPath()).build());
                    } catch (Exception ex) {
                        DriverUtils.getExtentTest().fail(status + ": Valor inserido no teste não respondeu conforme validade! " + ex, MediaEntityBuilder.createScreenCaptureFromPath(DriverUtils.getScreentShotExtentPath()).build());
                    }

                }
            } catch (Exception ex) {
                DriverUtils.getExtentTest().fail("Exception: " + ex, MediaEntityBuilder.createScreenCaptureFromPath(DriverUtils.getScreentShotExtentPath()).build());
                //throw ex;
            }
        }

}
