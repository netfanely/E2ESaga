package stepdefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.BaseTest;
import pages.HomePage;
import pages.ProductPage;
import pages.SearchPage;

public class SearchSteps {

    // 1. Declaración de variables con inicialización
    private WebDriver driver;
    private HomePage homePage;
    private SearchPage searchPage;
    private ProductPage productPage;

    // 2. Constructor para inicializar las dependencias
    public SearchSteps() {
        this.driver = BaseTest.getDriver(); // Obtiene el driver de BaseTest
        this.homePage = new HomePage(driver);
        this.searchPage = new SearchPage(driver);
        this.productPage = new ProductPage(driver);
    }

    @Given("El usuario está en la página de inicio de Falabella")
    public void navigateToHome() {
        driver.get("https://www.falabella.com.pe");
    }

    @When("Busca el producto {string}")
    public void searchProduct(String productName) {
        homePage.search(productName);
    }

    @And("Selecciona el primer resultado de búsqueda")
    public void selectFirstResult() {
        searchPage.selectFirstProduct();
    }

    @And("Agrega el producto al carrito")
    public void addToCart() {
        productPage.addToCart();
    }

    @Then("Debe aparecer un mensaje de confirmación")
    public void verifyConfirmationMessage() {
        Assert.assertTrue(productPage.isConfirmationMessageDisplayed(),
                "El mensaje de confirmación no se mostró");
    }
}