package factory;

import constant.ConstantBrowser;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebDriverFactory {
    public WebDriver getWebDriver(ConstantBrowser browserName){
        switch (browserName){
            case CHROME:
                return new ChromeDriver();
            case YANDEX:
                System.setProperty("webdriver.chrome.driver", "src/test/resources/webdriver/yandexdriver.exe");
                ChromeOptions options = new ChromeOptions();
                return new ChromeDriver(options);
            default:
                throw new RuntimeException("Incorrect BrowserName");
        }
    }
}
