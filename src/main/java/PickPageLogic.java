import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PickPageLogic {

    By btnPick = By.xpath("//a[@title='Ноутбуки']");

    private WebDriver driver;
    private WebDriverWait wait;

    public PickPageLogic (WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public SearchPageLogic btnPickClick() {
        driver.findElement(btnPick).click();
        return new SearchPageLogic(driver,wait);
    }
}
