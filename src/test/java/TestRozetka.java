import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static java.util.concurrent.TimeUnit.SECONDS;

public class TestRozetka {

    private WebDriver driver;
    private WebDriverWait wait;

    @BeforeMethod
    public void before() {
        System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver,3);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, SECONDS);
        driver.get("https://rozetka.com.ua/");
    }

    @Test
    public void test() {

        new MainPageLogic(driver,wait)
                .btnMenuClick();

        new PickPageLogic(driver,wait)
                .btnPickClick();

        new SearchPageLogic(driver,wait).pickSeller();
        new SearchPageLogic(driver,wait).setPrice();
        new SearchPageLogic(driver,wait).btnPriceClick();
        new SearchPageLogic(driver,wait).discountProductClick();

        new ProductPageLogic(driver,wait)
                .discountLabelDisplayed();
    }

    @AfterMethod
    public void after(){
        driver.quit();
    }
}
