import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductPageLogic {

    By discountLabel = By.xpath("//app-label[@class='main-gallery__label ng-star-inserted']");


    private WebDriver driver;
    private WebDriverWait wait;

    public ProductPageLogic(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public void discountLabelDisplayed() {
        driver.findElement(discountLabel).isDisplayed();
    }
}
