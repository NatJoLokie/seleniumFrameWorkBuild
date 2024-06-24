package seleniumBuilds;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class Concept_GetElements {
    static WebDriver driver;

    public static void main(String[] args) {
        driver = new ChromeDriver();

        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();

        By links = By.tagName("a");
        By images = By.tagName("img");


//        List<WebElement> allLinks = driver.findElements(links);
//        System.out.println(allLinks.size());
//
//        List<WebElement> allImages = driver.findElements(images);
//        System.out.println(allImages.size());

        System.out.println("Links Count :" + getElementsCount(links));
        System.out.println("Images Count :" + getElementsCount(images));

        System.out.println("ElementsTextList : "+getElementsTextList(links));
        System.out.println("------------------------");
        System.out.println("ElementsAttributeList : "+getElementsAttributeList(images,"alt"));



    }


    public static List<WebElement> getElements(By locator) {
        return driver.findElements(locator);

    }

    public static int getElementsCount(By locator) {
        return getElements(locator).size();
    }

    public static List<String> getElementsTextList(By locator) {
        List<WebElement> eleList = getElements(locator);
        ArrayList<String> eleTextList = new ArrayList<String>();

        for (WebElement e : eleList) {
            String eleText = e.getText();
            if (eleText.length() != 0) {
                eleTextList.add(eleText);
            }
        }
        return eleTextList;
    }

    public static List<String> getElementsAttributeList(By locator, String attributeName) {
        List<WebElement> eleList = getElements(locator);
        ArrayList<String> eleAttList = new ArrayList<String>();

        for (WebElement e : eleList) {
            String attValue = e.getAttribute(attributeName);
            if (attValue.length() != 0) {
                eleAttList.add(attValue);
            }
        }
        return eleAttList;

    }

}
