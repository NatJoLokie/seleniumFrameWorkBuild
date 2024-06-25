package seleniumBuilds;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Concept_DropDownWithoutSelect {

    static WebDriver driver;

    public static void main(String[] args) {
        driver = new ChromeDriver();

        driver.get("https://www.orangehrm.com/30-day-free-trial/");
        driver.manage().window().maximize();

//        List<WebElement> optionsList = driver.findElements(By.xpath("//select[@id='Form_getForm_Country']/option"));

        By opts = By.xpath("//select[@id='Form_getForm_Country']/option");

        doSelectValueDropDownWS(opts,"Germany");
    }


    public static List<WebElement> getElements(By locator) {
        return driver.findElements(locator);
    }

    public static void doSelectValueDropDownWS(By locators, String value) {
        List<WebElement> optionsList = getElements(locators);
        System.out.println(optionsList.size());
        for (WebElement e : optionsList) {
            String text = e.getText();
            if (text.equals(value)) {
                e.click();
                break;
            }
        }

    }
}
