package seleniumBuilds;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsConcept {
    static WebDriver driver;

    public static void main(String[] args) {

        driver = new ChromeDriver();

        driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
        driver.manage().window().maximize();

/**
 * ---- Approach 1
 */

//        driver.findElement(By.id("input-email")).sendKeys("user@name.com");
//        driver.findElement(By.id("input-password")).sendKeys("User@123");

/**
 * ---- Approach 2
 */

//        WebElement email = driver.findElement(By.id("input-email"));
//        WebElement password = driver.findElement(By.id("input-password"));
//
//        email.sendKeys("user@name.com");
//        password.sendKeys("User@123");

/**
 * ---- Approach 3
 *  By Locator Approach
 */

//        By byEmail = By.id("input-email");
//        By byPassword = By.id("input-password");
//
//        WebElement emailId = driver.findElement(byEmail);
//        WebElement password = driver.findElement(byPassword);
//
//        emailId.sendKeys("by@webelement.com");
//        password.sendKeys("by@password");

/**
 * ---- Approach 4
 *  By Locator with Element Utility Approach
 */

//        By byEmail = By.id("input-email");
//        By byPassword = By.id("input-password");
//
//        WebElement emailId = getElement(byEmail);
//        WebElement password = getElement(byPassword);
//
//        emailId.sendKeys("user@name");
//        password.sendKeys("user@P@5$W0rd");

/**
 * ---- Approach 5
 *  By Locator with Element and Action Utility Approach
 */
//        By byEmail = By.id("input-email");
//        By byPassword = By.id("input-password");
//
//        doSendKeys(byEmail, "user@mail.com");
//        doSendKeys(byPassword, "user@P@5$W0rd");
/**
 * ---- Approach 6
 *  By Locator Approach with: Create a common util Class for Elements (ElementUtil)
 *  Also known as Page By Locators or Object Repository
 */
        ElementUtil elementUtil = new ElementUtil(driver);// gets the driver from this class and passes to ElementUtil Class

        By byEmail = By.id("input-email");
        By byPassword = By.id("input-password");

        elementUtil.doSendKeys(byEmail,"user@mail.com");
        elementUtil.doSendKeys(byPassword, "user@P@5$W0rd");


    }

    /**
     * ---- Methods of Approach 5
     * By Locator with Element and Action Utility Approach
     */
    public static WebElement getElement(By locator) {
        return driver.findElement(locator);
    }

    public static void doSendKeys(By locator, String value) {
        getElement(locator).sendKeys(value);
    }

}
