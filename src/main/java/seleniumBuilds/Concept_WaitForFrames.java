package seleniumBuilds;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Concept_WaitForFrames {

    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {

        driver = new ChromeDriver();
        driver.get("https://www.formsite.com/templates/registration-form-templates/vehicle-registration-form/");
        driver.manage().window().maximize();

        driver.findElement(By.cssSelector("#imageTemplateContainer img")).click();

        By frameLocator = By.xpath("//iframe[contains(@id,'frame-one')]");

//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameLocator));
//
//        driver.findElement(By.id("RESULT_TextField-8")).sendKeys("Nathaniel");

        waitForFrameAndSwitchTo(frameLocator, 10);
        driver.findElement(By.id("RESULT_TextField-8")).sendKeys("Nathaniel");
    }

    public static void waitForFrameAndSwitchTo(By locator, int timeOut) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(locator));
    }

    public static void waitForFrameAndSwitchTo(int frameIndex, int timeOut) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameIndex));
    }

    public static void waitForFrameAndSwitchTo(WebElement frameElement, int timeOut) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameElement));
    }


}
