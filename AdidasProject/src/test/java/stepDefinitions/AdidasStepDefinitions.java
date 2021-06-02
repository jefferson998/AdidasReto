package stepDefinitions;

import io.cucumber.java.en.*;
import driver.SeleniumWebDriver;
import net.thucydides.core.annotations.Steps;
import pages.AdidasPage;
import steps.AdidasSteps;

public class AdidasStepDefinitions {

    @Steps
    AdidasSteps adidasSteps = new AdidasSteps();

    @Given("^Me encuentro en la pagina de Adidas$")
    public void meEncuentroEnLaPaginaDeAdidas() {
        SeleniumWebDriver.ChromeWebDriver("https://www.adidas.co/");

    }

    @When("^Buscar un producto$")
    public void buscarUnProducto() {
        adidasSteps.buscarProductoEnAdidasPage();




    }

    @Then("^Ver el producto$")
    public void verElProducto() {
        SeleniumWebDriver.driver.close();


    }

}
