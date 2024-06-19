package seleniumBuilds;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.net.URL;

/**
 *
 */
public class BrowserUtil {

    WebDriver driver;

    /**
     * Method to initialize the Browser
     *
     * @param browserName
     * @return
     */
    public WebDriver launchBrowser(String browserName) {
        System.out.println("browserName: " + browserName);

        switch (browserName.toLowerCase().trim()) {
            case "chrome":
                driver = new ChromeDriver();
                break;
            case "firefox":
                driver = new FirefoxDriver();
                break;
            case "edge":
                driver = new EdgeDriver();
                break;
            case "safari":
                driver = new SafariDriver();
                break;
            default:
                System.out.println("Browser not available" + browserName);
                throw new BrowserException("BROWSER NOT FOUND");

        }
        return driver;
    }

    public void launchURL(String url) {
        if (url == null) {
            throw new BrowserException("URL IS NULL");
        }

        if (url.indexOf("http") == 0) {
            driver.get(url);
        } else {
            throw new BrowserException("HTTP/s MISSING IN URL");
        }

    }

    public void launchURL(URL url) {
        if (url == null) {
            throw new BrowserException("URL IS NULL");
        }

        String AppUrl = String.valueOf(url);
        if (AppUrl.indexOf("http") == 0) {
            driver.navigate().to(url);
//            driver.get(AppUrl);
        } else {
            throw new BrowserException("HTTP/s MISSING IN URL");
        }

    }

    public String getPageTitle() {
        return driver.getTitle();
    }

    public String getPageURL() {
        return driver.getCurrentUrl();
    }

    public void closeBrowser() {
        driver.close();
    }

    public void quitBrowser() {
        driver.quit();
    }

}
