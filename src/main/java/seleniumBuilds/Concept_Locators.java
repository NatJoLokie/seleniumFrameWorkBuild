package seleniumBuilds;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Concept_Locators {
    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {

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
//        ElementUtil elementUtil = new ElementUtil(driver);// gets the driver from this class and passes to ElementUtil Class
//
//        By byEmail = By.id("input-email");
//        By byPassword = By.id("input-password");
//
//        elementUtil.doSendKeys(byEmail,"user@mail.com");
//        elementUtil.doSendKeys(byPassword, "user@P@5$W0rd");

/**
 * ---- Approach 7
 *  BrowserUtil + ElementUtil approach
 */

        ElementUtil elementUtil = new ElementUtil(driver);

        Thread.sleep(3000);

////       elementUtil.doSendKeys("element/locatorType","element/locatorValue","valueToPass");
//
////      <input type="text" name="email" value="" placeholder="E-Mail Address"
////      id="input-email" class="form-control">
//
////        <input type="password" name="password" value="" placeholder="Password"
////        id="input-password" class="form-control">

//// 1. id Attribute Locator
//        String s_userName = "input-email";
//        String s_passWord = "input-password";
//
//        elementUtil.doSendKeys("id",s_userName,"auto@username");
//        elementUtil.doSendKeys("id",s_passWord,"user@P@5$W0rd");

//        By byEmail = By.id("input-email");
//        By byPassword = By.id("input-password");
//
//        elementUtil.doSendKeys(byEmail,"auto@username");
//        elementUtil.doSendKeys(byPassword,"user@P@5$W0rd");

//// 2. Name Locator Attribute
//        String n_userName = "email";
//        String n_password = "password";
//
//        elementUtil.doSendKeys("name",n_userName,"auto@username");
//        elementUtil.doSendKeys("name",n_password,"auto@username");

//        By byEmail = By.name("email");
//        By byPassword = By.name("password");
//
//        elementUtil.doSendKeys(byEmail,"auto@username");
//        elementUtil.doSendKeys(byPassword,"user@P@5$W0rd");

//// 3. ClasName Locator
//// 4. CSS Locator

//// 5. XPath Locator
//
//        By byEmail = By.xpath("//*[@id=\"input-email\"]");
//        By byPassword = By.xpath("//*[@id=\"input-password\"]");
////
//        elementUtil.doSendKeys(byEmail,"xauto@username");
//        elementUtil.doSendKeys(byPassword,"user@P@5$W0rd");
//
//    }
//// 6. LinkText Locator

//        By byLogin = By.linkText("Continue");
//        elementUtil.doClick(byLogin);

//        String byLogin = "Continue";
//        elementUtil.doClick("linkText", byLogin);

//// 7. Partial Link Text
//        String byLogin = "Continue";
//        elementUtil.doClick("linkText", byLogin);

//   8. Tag Name
        By pageHeader = By.tagName("h2");

        System.out.println(elementUtil.doGetElementText(pageHeader));



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

//    public static void doClick(String locatorType, String locatorValue) {
//        getElement(locatorType, locatorValue).click();
//    }

}
