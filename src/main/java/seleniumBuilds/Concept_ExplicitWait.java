package seleniumBuilds;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Concept_ExplicitWait {
    static WebDriver driver;

    public static void main(String[] args) {
        //Wait(I) : until(); --> FluentWait(C): (@Overriden)until(){} + other methods --> WebDriverWait(C)

        driver = new ChromeDriver();
        driver.get("https://www.orangehrm.com/en/book-a-free-demo/");
        driver.manage().window().maximize();

        By fullName = By.id("Form_getForm_FullName");
        By bussEmail = By.id("Form_getForm_Email");
        By companyName = By.id("Form_getForm_CompanyName");
        By contact = By.id("Form_getForm_Contact");

//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        wait.until(ExpectedConditions.presenceOfElementLocated(fullName));
//        WebElement sendFullName = wait.until(ExpectedConditions.presenceOfElementLocated(fullName));
//        sendFullName.sendKeys("FirstName");

        waitForElementPresent(fullName, 10).sendKeys("userName");
        waitForElementPresent(bussEmail, 10).sendKeys("userName@gmail.com");
        getElement(companyName).sendKeys("Zephyr");
        waitForElementVisible(contact, 10).sendKeys("7105547447");

    }

    /**
     * An expectation for checking that an element is present on the DOM of a page. This does not necessarily mean that the element is visible.
     * Params:
     * locator – used to find the element
     * Returns:
     * the WebElement once it is located
     */
    public static WebElement waitForElementPresent(By locator, int timeOut) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
        return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
    }

    /**
     * An expectation for checking that an element is present on the DOM of a page and visible. Visibility means that the element is not only displayed but also has a height and width that is greater than 0.
     * Params:
     * locator – used to find the element
     * Returns:
     * the WebElement once it is located and visible
     */
    public static WebElement waitForElementVisible(By locator, int timeOut) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public static WebElement getElement(By locator) {
        return driver.findElement(locator);

    }
}
