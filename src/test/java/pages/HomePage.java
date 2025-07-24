package pages;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    private WebDriver driver;
    private static final String BASE_URL = "https://www.falabella.com.pe/falabella-pe";

    @FindBy(id = "testId-SearchBar-Input")
    private WebElement searchInput;

    @FindBy(className = "SearchBar-module_searchBtnIcon__2L2s0")
    private WebElement searchButton;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void search(String productName) {
        searchInput.sendKeys(productName);
        searchButton.click();
    }

    public void navigateToHome() {
        driver.get(BASE_URL);
    }
}