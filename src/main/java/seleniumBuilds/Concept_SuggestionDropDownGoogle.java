package seleniumBuilds;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Concept_SuggestionDropDownGoogle {

    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        driver = new ChromeDriver();

        driver.get("https://www.google.com");
        driver.manage().window().maximize();

        By searchLoc = By.xpath("//textarea[@class='gLFyf']");
        By suggestionLoc = By.xpath("//ul[@class='G43f7e' and @role='listbox']//div[@class='wM6W7d']/span");

        doSearch(searchLoc, suggestionLoc, "naveen automation labs", "java");


    }

    public static void doSearch(By searchLocator, By suggestLocator, String searchKey, String searchValue) throws InterruptedException {
        driver.findElement(searchLocator).sendKeys(searchKey);
        Thread.sleep(3000);
        List<WebElement> suggestList = driver.findElements(suggestLocator);
        System.out.println(suggestList.size());

        for (WebElement e : suggestList) {
            String text = e.getText();
            if (text.contains(searchValue)) {
                e.click();
                break;
            }
        }

    }
}
