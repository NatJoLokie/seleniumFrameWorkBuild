package seleniumBuilds;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Concept_DropDownWithCheckBoxMultiSelection {
    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        driver = new ChromeDriver();

        driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/#google_vignette");
        driver.manage().window().maximize();

        Thread.sleep(3000);

        By ddLocator = By.id("justAnInputBox");
        By ddOptionsLocator = By.xpath("//span[@class='comboTreeItemTitle']");

//      Case 1 -  Single Parameter/Value
//        selectChoiceDropDown(ddLocator, ddOptionsLocator, "choice 1");

//      Case 2 - Multiple Parameters/Values
//        selectChoiceDropDown(ddLocator, ddOptionsLocator, "choice 1", "choice 4", "choice 6 2 2", "choice 7", "choice 2 2");

//      Case 3 - All
        selectChoiceDropDown(ddLocator, ddOptionsLocator, "all");

    }

    public static void selectChoiceDropDown(By dropDownLocator, By dropDownOptionsLocator, String... value) throws InterruptedException {
        driver.findElement(dropDownLocator).click();
        Thread.sleep(3000);
        List<WebElement> multiDropDownOptions = driver.findElements(dropDownOptionsLocator);

        System.out.println(multiDropDownOptions.size());
        if (!value[0].equals("all")) {
            for (WebElement e : multiDropDownOptions) {
                String text = e.getText();
                for (String val : value) {
                    if (text.equals(val)) {
                        e.click();
                    }
                }
            }
        } else {
            for (WebElement e : multiDropDownOptions) {
                try {
                    e.click();
                } catch (ElementNotInteractableException ex) {
                    break;
                }


            }
        }

    }
}