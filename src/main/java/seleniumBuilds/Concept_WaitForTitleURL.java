package seleniumBuilds;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Concept_WaitForTitleURL {

    static WebDriver driver;

    public static void main(String[] args) {

        driver = new ChromeDriver();
        driver.get("https://classic.crmpro.com/");
        driver.manage().window().maximize();
/**
 * Wait for Title Contains
 */
//      WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
//      wait.until(ExpectedConditions.titleContains("Free CRM software"));
//      System.out.println(driver.getTitle());

//        String titleCOntains = waitForTitleContains("Free CRM software", 5);
//        System.out.println(title);

//        ------------------
/**
 * Wait for Title Equals
 */
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
//        wait.until(ExpectedConditions.titleIs("Free CRM software for customer relationship management, sales, and support."));
//        System.out.println(driver.getTitle());

//        String titleEquals = waitForTitleEquals("Free CRM software for customer relationship management, sales, and support.", 5);
//        System.out.println(titleEquals);

/**
 * Wait for URL contains
 */
        driver.findElement(By.linkText("Sign Up")).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.urlContains("/register"));
        System.out.println(driver.getCurrentUrl());


    }

    //----------------------------------------------------------------------------------------------

    /**
     * Wait for Title Contains
     */
    public static String waitForTitleContains(String titleFraction, int timeOut) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
        try {
            if (wait.until(ExpectedConditions.titleContains(titleFraction))) {
                return driver.getTitle();
            }
        } catch (Exception e) {
            System.out.println("title is not found :" + timeOut);
        }
        return null;
    }

    /**
     * Wait for Title Equals
     */
    public static String waitForTitleEquals(String title, int timeOut) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
        try {
            if (wait.until(ExpectedConditions.titleIs(title))) {
                return driver.getTitle();
            }
        } catch (Exception e) {
            System.out.println("title is not found :" + timeOut);
        }
        return null;
    }

    /**
     * Wait for URL Contains
     */
    public static String waitForURLContains(String urlFraction, int timeOut) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
        try {
            if (wait.until(ExpectedConditions.urlContains(urlFraction))) {
                return driver.getTitle();
            }
        } catch (Exception e) {
            System.out.println("title is not found :" + timeOut);
        }
        return null;
    }

    /**
     * Wait for URL Equals
     */
    public static String waitForURLEquals(String url, int timeOut) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
        try {
            if (wait.until(ExpectedConditions.urlToBe(url))) {
                return driver.getTitle();
            }
        } catch (Exception e) {
            System.out.println("title is not found :" + timeOut);
        }
        return null;
    }

}
