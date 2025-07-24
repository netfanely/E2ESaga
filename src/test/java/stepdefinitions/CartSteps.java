package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.CartPage;

import static org.junit.Assert.assertEquals;

public class CartSteps {
    private WebDriver driver;
    private CartPage cartPage;

    // Inyecta el driver y la página (si usas Dependency Injection)
    public CartSteps(WebDriver driver) {
        this.driver = driver;
        this.cartPage = new CartPage(driver);
    }

    @When("Accede al carrito de compras")
    public void goToCart() {
        cartPage.open(); // Ahora el método existe
    }

    @Then("El carrito debe mostrar {int} items")
    public void verifyItems(int expectedCount) {
        assertEquals(expectedCount, cartPage.getItemsCount()); // Usa assertEquals de JUnit/TestNG
    }
}