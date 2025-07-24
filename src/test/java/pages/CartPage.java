package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CartPage {
    private WebDriver driver;

    @FindBy(css = ".cart-item")
    private List<WebElement> cartItems;

    @FindBy(css = ".cart-icon") // Ejemplo: botón para abrir el carrito
    private WebElement cartButton;

    @FindBy(id = "continueToCheckout")
    private WebElement checkoutButton;

    public CartPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public int getItemsCount() {
        return cartItems.size(); // Retorna la cantidad de items en el carrito
    }

    // Método requerido por CartSteps.goToCart()
    public void open() {
        cartButton.click(); // Simula clic en el ícono del carrito
    }

}