import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainPageLogic {

    By btnMenu = By.xpath("//a[@class='menu-categories__link']");

    private WebDriver driver;
    private WebDriverWait wait;

    public MainPageLogic(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public PickPageLogic btnMenuClick() {
        driver.findElement(btnMenu).click();
        return new PickPageLogic(driver, wait);
    }
}
