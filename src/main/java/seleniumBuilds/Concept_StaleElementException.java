package seleniumBuilds;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Concept_StaleElementException {

    static WebDriver driver;

    public static void main(String[] args) {

        driver = new ChromeDriver();
        driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

        WebElement emailId = driver.findElement(By.id("input-email"));
        emailId.sendKeys("test@mail.com");

        driver.navigate().refresh();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.pollingEvery(Duration.ofSeconds(5))
                .ignoring(StaleElementReferenceException.class)
                .withMessage("elementNotFound");

        By email2 = By.id("input-email");

        wait.until(ExpectedConditions.visibilityOfElementLocated(email2)).sendKeys("test2@mail.co.uk");



    }
}

