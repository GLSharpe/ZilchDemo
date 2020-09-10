import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverBuilder {

    public WebDriver getDriver(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\glsha\\Documents\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://skyronic.github.io/vue-spa/#/");
        return driver;
    }
}
