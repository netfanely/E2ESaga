package stepdefinitions;

import io.cucumber.java.en.*;
import org.testng.Assert;
import pages.BaseTest;
import pages.CheckoutPage;

public class CheckoutSteps {
    private CheckoutPage checkoutPage;

    public CheckoutSteps() {
        this.checkoutPage = new CheckoutPage(BaseTest.getDriver());
    }

    @When("Completa los datos de envío")
    public void fillShippingDetails() {
        checkoutPage.fillShippingForm("Nombre", "Dirección", "test@test.com");
    }

    @Then("Debe ver el resumen de la compra")
    public void verifyOrderSummary() {
        Assert.assertTrue(checkoutPage.isOrderSummaryDisplayed());
    }
}