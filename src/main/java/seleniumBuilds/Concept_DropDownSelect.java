package seleniumBuilds;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Concept_DropDownSelect {
    static WebDriver driver;

    public static void main(String[] args) {
        driver = new ChromeDriver();

        driver.get("https://www.orangehrm.com/30-day-free-trial/");
        driver.manage().window().maximize();

//        WebElement countries = driver.findElement(By.id("Form_getForm_Country"));

        By countriesLocator = By.id("Form_getForm_Country");

//        Select select = new Select(countries);
//
//        select.selectByIndex(5);
//
//        select.selectByVisibleText("India");
//
//        select.selectByValue("Australia");

        doSelectByVisibleText(countriesLocator,"Germany");
    }

    public static WebElement getElement(By locator) {
        return driver.findElement(locator);
    }

    public static void doSelectByIndex(By locator, int index) {
        Select select = new Select(getElement(locator));
        select.selectByIndex(index);
    }

    public static void doSelectByVisibleText(By locator, String visibleText) {
        if (visibleText.length() == 0 || visibleText == null) {
            throw new ExceptionMyElement("Visible Text cannot be null or blank");
        }
        Select select = new Select(getElement(locator));
        select.selectByVisibleText(visibleText);
    }

    public static void doSelectByValue(By locator, String value) {
        if (value.length() == 0 || value == null) {
            throw new ExceptionMyElement("Visible Text cannot be null or blank");
        }
        Select select = new Select(getElement(locator));
        select.selectByValue(value);
    }
}
