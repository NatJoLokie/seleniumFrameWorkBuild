package seleniumBuilds;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Concept_CustomPageLoadTimeOut {

    static WebDriver driver;

    public static void main(String[] args) {

        driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(120));

//  // Gives the time in seconds it took to load the page
        driver.manage().timeouts().getPageLoadTimeout().getSeconds();

    }

//  // Custom Method for Wait page to load

    public static boolean isPageLoaded() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        String flag = wait.until(ExpectedConditions
                .jsReturnsValue("return document.readyState ==='complete'"))
                .toString();
        return Boolean.parseBoolean(flag);

    }

}
