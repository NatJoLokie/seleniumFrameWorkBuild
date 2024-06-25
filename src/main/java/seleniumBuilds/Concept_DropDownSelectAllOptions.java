package seleniumBuilds;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class Concept_DropDownSelectAllOptions {

    static WebDriver driver;

    public static void main(String[] args) {
        driver = new ChromeDriver();

        driver.get("https://www.orangehrm.com/30-day-free-trial/");
        driver.manage().window().maximize();

        By countries = By.id("Form_getForm_Country");

        doSelectDropdownValue(countries, "India");


    }

    public static WebElement getElement(By locator) {
        return driver.findElement(locator);
    }

    public static List<WebElement> getDropDownOptionsList(By locator) {
        Select select = new Select(getElement(locator));
        return select.getOptions();
    }

    public static int getDropDownValueCount(By locator) {
        return getDropDownOptionsList(locator).size();
    }

    public static void doSelectDropdownValue(By locator, String value) {

        List<WebElement> OptionsList = getDropDownOptionsList(locator);

        for (WebElement e : OptionsList) {
            String text = e.getText();
            System.out.println(text);
            if (text.equals(value)) {
                e.click();
                break;
            }
        }
    }

    public static List<String> getDropdownOptionsTextList(By locator) {

        List<WebElement> OptionsList = getDropDownOptionsList(locator);
        List<String> optionsText = new ArrayList<String>();

        for (WebElement e : OptionsList) {
            String text = e.getText();
            optionsText.add(text);
        }
        return optionsText;
    }


    public static void printDropdownValue(By locator) {

        List<WebElement> OptionsList = getDropDownOptionsList(locator);

        for (WebElement e : OptionsList) {
            String text = e.getText();
            System.out.println(text);

        }

    }
}