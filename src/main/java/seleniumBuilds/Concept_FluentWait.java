package seleniumBuilds;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Concept_FluentWait {

    static WebDriver driver;

    public static void main(String[] args) {
        driver = new ChromeDriver();
        driver.get("https://www.formsite.com/templates/registration-form-templates/vehicle-registration-form/");
        driver.manage().window().maximize();

        By image = By.cssSelector("#imageTemplateContainer img");

//  //---- Fluent Wait - Parent Class
//  //---- FluentWait for Elements
        Wait<WebDriver> waitE = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(5))
                .ignoring(NoSuchElementException.class) // multiple ignoring methods can be added
                .ignoring(StaleElementReferenceException.class)
                .withMessage("time out..No Element Present");
//      WebElement image_ele = waitE.until(ExpectedConditions.visibilityOfElementLocated(image));
//        image_ele.click();

//  //---- FluentWait for Alerts
        Wait<WebDriver> waitA = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(5))
                .ignoring(NoAlertPresentException.class) // multiple ignoring methods can be added
                .withMessage("time out..No Alert Present");

//  //---- WebDriverWait with Fluent Wait Features
//  //  WebDriverWait(Child Class), can inherit the FluentWait(Parent Class)methods

//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(image));
//
//        WebElement image_ele = wait.until(ExpectedConditions.visibilityOfElementLocated(image));
//        image_ele.click();

//  //---- WebDriverWait is the child of FluentWait
//  //---- with fluent wait or without fluent wait features are given to us
//  //---- Purpose of fluent wait is effectively used when creating custom waits or building a separate tools using selenium

    }


}
