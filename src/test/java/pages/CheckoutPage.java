package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage {
    private WebDriver driver;

    @FindBy(id = "inputName")
    private WebElement nameInput;

    @FindBy(id = "order-summary")
    private WebElement orderSummary;

    public CheckoutPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void fillShippingForm(String name, String address, String email) {
        nameInput.sendKeys(name);
        // Implementa otros campos
    }

    public boolean isOrderSummaryDisplayed() {
        return orderSummary.isDisplayed();
    }
}