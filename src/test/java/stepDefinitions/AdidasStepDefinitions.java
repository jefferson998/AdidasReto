package stepDefinitions;

import io.cucumber.java.en.*;
import driver.SeleniumWebDriver;
import net.thucydides.core.annotations.Steps;
import pages.AdidasPage;
import steps.AdidasSteps;

public class AdidasStepDefinitions {

    @Steps
    AdidasSteps adidasSteps = new AdidasSteps();

    @Given("Me encuentro en la pagina de Adidas url (.*)")
    public void meEncuentroEnLaPaginaDeAdidas() {
        SeleniumWebDriver.ChromeWebDriver("https://www.adidas.co/");


    }

    @When("^Buscar un producto, ver y validar$")
    public void buscarUnProducto() {
        adidasSteps.buscarProductoEnAdidasPage();




    }

    @Then("^cerrar browser$")
    public void verElProducto() {
//        SeleniumWebDriver.driver.close();


    }

}
