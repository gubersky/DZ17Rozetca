import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchPageLogic {

    By btnCheck = By.xpath("//a[@data-id='Rozetka']");
    By setPricePick = By.xpath("//input[@formcontrolname='max']");
    By submitBtnPrice = By.xpath("//button[@type='submit']");
    By discountProductBtn = By.xpath("//span[@class='goods-tile__label promo-label promo-label_type_action ng-star-inserted']/..");

    private WebDriver driver;
    private WebDriverWait wait;

    public SearchPageLogic(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public void pickSeller() {
        driver.findElement(btnCheck).click();
    }

    public void setPrice() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(setPricePick));
        driver.findElement(setPricePick).clear();
        driver.findElement(setPricePick).sendKeys("100000");
    }

    public void btnPriceClick() {
        driver.findElement(submitBtnPrice);
    }

    public ProductPageLogic discountProductClick() {
        driver.findElement(discountProductBtn).click();
        return new ProductPageLogic(driver,wait);
    }
}
