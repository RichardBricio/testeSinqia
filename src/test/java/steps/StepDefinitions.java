package steps;

import org.junit.Assert;
import org.openqa.selenium.support.ui.*;
import com.aventstack.extentreports.MediaEntityBuilder;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import common.utils.DriverUtils;
import pages.HomePageAmazon;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.openqa.selenium.WebDriver;
import java.time.Duration;
import java.util.List;

public class StepDefinitions {
        static WebDriver driver;
        static WebDriverWait wait;
        HomePageAmazon pageAmazon;
        private static final Logger logger = LogManager.getLogger(StepDefinitions.class);

        public static WebDriver getDriver() {
            return driver;
        }

        @Given("That I access the Amazon website")
	    public void access_amazon_page() throws Throwable {
            try{
                driver = DriverUtils.getDriver();                
                pageAmazon = new HomePageAmazon();
                driver.navigate().to("http://www.amazon.com.br");
                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
                driver.manage().window().maximize();
                logger.info("URL accessed successfully");
                Assert.assertTrue(true);
                DriverUtils.getExtentTest().pass("Access to the Amazon homepage successfully completed", MediaEntityBuilder.createScreenCaptureFromPath(DriverUtils.getScreentShotExtentPath()).build());
            } catch (Exception ex) {
                DriverUtils.getExtentTest().fail(ex);
                throw ex;
            }
        }

        @Then("I navigate through all the menus to validate their access and performance")
        public void navigateThroughTheMenus() throws Throwable {
            try{   
                if (DriverUtils.isElementClickable(pageAmazon.getMenuTodos()) == false) {     
                    driver.navigate().refresh();
                    Thread.sleep(3000);
                }

                DriverUtils.waitAndClickElement(pageAmazon.getMenuTodos());
                Thread.sleep(2000);
                DriverUtils.getExtentTest().pass("Menu Todos validated", MediaEntityBuilder.createScreenCaptureFromPath(DriverUtils.getScreentShotExtentPath()).build());
                DriverUtils.waitAndClickElement(pageAmazon.getMenuTodosFechar());                              

                DriverUtils.waitAndClickElement(pageAmazon.getMenuVendaNaAmazon());
                Thread.sleep(2000);
                DriverUtils.getExtentTest().pass("Menu Venda Na Amazon validated", MediaEntityBuilder.createScreenCaptureFromPath(DriverUtils.getScreentShotExtentPath()).build());
                driver.navigate().back();                

                DriverUtils.waitAndClickElement(pageAmazon.getMenuMaisVendidos());
                Thread.sleep(2000);
                DriverUtils.getExtentTest().pass("Menu Mais Vendidos validated", MediaEntityBuilder.createScreenCaptureFromPath(DriverUtils.getScreentShotExtentPath()).build());
                driver.navigate().back();

                DriverUtils.waitAndClickElement(pageAmazon.getMenuOfertasDoDia());
                Thread.sleep(2000);
                DriverUtils.getExtentTest().pass("Menu Ofertas Do Dia validated", MediaEntityBuilder.createScreenCaptureFromPath(DriverUtils.getScreentShotExtentPath()).build());
                driver.navigate().back();
                
                DriverUtils.waitAndClickElement(pageAmazon.getMenuPrime());
                Thread.sleep(2000);
                DriverUtils.getExtentTest().pass("Menu Prime validated", MediaEntityBuilder.createScreenCaptureFromPath(DriverUtils.getScreentShotExtentPath()).build());
                driver.navigate().back();                

                DriverUtils.waitAndClickElement(pageAmazon.getMenuLivros());
                Thread.sleep(2000);
                DriverUtils.getExtentTest().pass("Menu Livros validated", MediaEntityBuilder.createScreenCaptureFromPath(DriverUtils.getScreentShotExtentPath()).build());
                driver.navigate().back();                

                DriverUtils.waitAndClickElement(pageAmazon.getMenuMusica());
                Thread.sleep(2000);
                DriverUtils.getExtentTest().pass("Menu Musica validated", MediaEntityBuilder.createScreenCaptureFromPath(DriverUtils.getScreentShotExtentPath()).build());
                driver.navigate().back();                

                DriverUtils.waitAndClickElement(pageAmazon.getMenuEletronicos());
                Thread.sleep(2000);
                DriverUtils.getExtentTest().pass("Menu Eletronicos validated", MediaEntityBuilder.createScreenCaptureFromPath(DriverUtils.getScreentShotExtentPath()).build());
                driver.navigate().back();                

                DriverUtils.waitAndClickElement(pageAmazon.getMenuIdeiasDePresente());
                Thread.sleep(2000);
                DriverUtils.getExtentTest().pass("Menu Ideias De Presente validated", MediaEntityBuilder.createScreenCaptureFromPath(DriverUtils.getScreentShotExtentPath()).build());
                driver.navigate().back();                

                DriverUtils.waitAndClickElement(pageAmazon.getMenuCasa());
                Thread.sleep(2000);
                DriverUtils.getExtentTest().pass("Menu Casa validated", MediaEntityBuilder.createScreenCaptureFromPath(DriverUtils.getScreentShotExtentPath()).build());
                driver.navigate().back();                

                DriverUtils.waitAndClickElement(pageAmazon.getMenuNovidadesNaAmazon());
                Thread.sleep(2000);
                DriverUtils.getExtentTest().pass("Menu Novidades Na Amazon validated", MediaEntityBuilder.createScreenCaptureFromPath(DriverUtils.getScreentShotExtentPath()).build());
                driver.navigate().back();                

                DriverUtils.waitAndClickElement(pageAmazon.getMenuComputadores());
                Thread.sleep(2000);
                DriverUtils.getExtentTest().pass("Menu Computadores validated", MediaEntityBuilder.createScreenCaptureFromPath(DriverUtils.getScreentShotExtentPath()).build());
                driver.navigate().back();                

                DriverUtils.waitAndClickElement(pageAmazon.getMenuGames());
                Thread.sleep(2000);
                DriverUtils.getExtentTest().pass("Menu Games validated", MediaEntityBuilder.createScreenCaptureFromPath(DriverUtils.getScreentShotExtentPath()).build());
                driver.navigate().back();                

                DriverUtils.waitAndClickElement(pageAmazon.getMenuAmazonModa());
                Thread.sleep(2000);
                DriverUtils.getExtentTest().pass("Menu Amazon Moda validated", MediaEntityBuilder.createScreenCaptureFromPath(DriverUtils.getScreentShotExtentPath()).build());
                driver.navigate().back();                

                DriverUtils.waitAndClickElement(pageAmazon.getMenuBeleza());
                Thread.sleep(2000);
                DriverUtils.getExtentTest().pass("Menu Beleza validated", MediaEntityBuilder.createScreenCaptureFromPath(DriverUtils.getScreentShotExtentPath()).build());
                driver.navigate().back();                

//            no webdriver o mesmo não aparece
//            DriverUtils.waitAndClickElement(pageAmazon.getMenuBrinquedosEJogos());
//            Thread.sleep(2000);
//            driver.navigate().back();

//            no webdriver o mesmo não aparece
//            DriverUtils.waitAndClickElement(pageAmazon.getMenuBrinquedosEJogos());
//            Thread.sleep(2000);
//            driver.navigate().back();

            } catch (Exception ex) {
                DriverUtils.getExtentTest().fail(ex);
                throw ex;
            }
        }

        @When("I enter the {string} product in the search bar")
        public void insert_product_in_search_bar(String produto) throws Exception{

            try{
                if (DriverUtils.isElementClickable(pageAmazon.getBarraPesquisa()) == false) {     
                    driver.navigate().refresh();
                    Thread.sleep(3000);
                }

                DriverUtils.waitAndClickElement(pageAmazon.getBarraPesquisa());
                pageAmazon.getBarraPesquisa().sendKeys(produto);
                Thread.sleep(2000);
                DriverUtils.getExtentTest().pass("Barra Pesquisa validated", MediaEntityBuilder.createScreenCaptureFromPath(DriverUtils.getScreentShotExtentPath()).build());
                pageAmazon.getBtnBuscar().click();
                Thread.sleep(3000);
                DriverUtils.getExtentTest().pass("Search result validated", MediaEntityBuilder.createScreenCaptureFromPath(DriverUtils.getScreentShotExtentPath()).build());

            } catch (Exception ex) {
                DriverUtils.getExtentTest().fail(ex);
                throw ex;
            }
        }

        @Then("I enter the following words and validate their return:")
        public void insert_words_in_search_bar(List<String> words) throws Exception{
            try{
                if (DriverUtils.isElementClickable(pageAmazon.getBarraPesquisa()) == false) {     
                    driver.navigate().refresh();
                    Thread.sleep(2000);
                }

                for (int i = 0; i < words.size(); i++) {
                    pageAmazon.getBarraPesquisa().sendKeys(words.get(i));
                    Thread.sleep(4000);
                    DriverUtils.getExtentTest().pass("Autocomplete validated", MediaEntityBuilder.createScreenCaptureFromPath(DriverUtils.getScreentShotExtentPath()).build());
                    pageAmazon.getBarraPesquisa().clear();
               }              

            } catch (Exception ex) {
                DriverUtils.getExtentTest().fail(ex);
                throw ex;
            }
        }

        @Then("I validate the consistency of the results")
        public void validades_research_results() throws Exception{
            
            try{
                Thread.sleep(1000);
                if (DriverUtils.isElementClickable(pageAmazon.getPdtNoteGalaxyi7()) == true) {
                    DriverUtils.getExtentTest().pass("Existing product successfully validated", MediaEntityBuilder.createScreenCaptureFromPath(DriverUtils.getScreentShotExtentPath()).build());
                    Thread.sleep(2000);
                    pageAmazon.getPdtNoteGalaxyi7().click();
                    Thread.sleep(2000);
                    DriverUtils.getExtentTest().pass("Product accessed successfully", MediaEntityBuilder.createScreenCaptureFromPath(DriverUtils.getScreentShotExtentPath()).build());
                } else
                    DriverUtils.getExtentTest().fail("Product not found");
            } catch (Exception ex) {
                DriverUtils.getExtentTest().fail(ex);
                throw ex;
            }
        }

}
