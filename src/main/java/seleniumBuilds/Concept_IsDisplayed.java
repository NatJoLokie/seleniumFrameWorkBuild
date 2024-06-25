package seleniumBuilds;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Concept_IsDisplayed {

    static WebDriver driver;

    public static void main(String[] args) {
        driver = new ChromeDriver();

        driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
        driver.manage().window().maximize();

        By logo = By.cssSelector(".img-responsive");

        boolean dLogo = driver.findElement(logo).isDisplayed();

        System.out.println("dLogo : " + dLogo);

        System.out.println("isElement Displayed : " + isElementDisplayed(logo));

    }

    public static List<WebElement> getElements(By locator) {
        return driver.findElements(locator);

    }

    //    Method to check if single elements is available using inbuilt selenium isDisplayed method
    public static boolean isElementDisplayed(By locator) {
        return driver.findElement(locator).isDisplayed();
    }

    //     Alternate & Efficient Method to check if single elements is available
    public static boolean isElementExists(By locator) {
        if (getElements(locator).size() == 1) {
            return true;
        }
        return false;
    }

    //    Method to check if multiple elements are available
    public static boolean isMultipleElementExists(By locator) {
        if (getElements(locator).size() > 0) {
            return true;
        }
        return false;
    }



}
