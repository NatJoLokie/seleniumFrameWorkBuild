package seleniumBuilds;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class Concept_SVGLocator {

    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {

        driver = new ChromeDriver();

        driver.get("https://petdiseasealerts.org/forecast-map");

        driver.manage().window().maximize();

        Thread.sleep(300);

        String svgXpath = "//*[local-name()='svg' and @id='map-svg']//*[name()='g' and @id='regions']/*[name()='g']";

        List<WebElement> stateList = driver.findElements(By.xpath(svgXpath));

        Actions act = new Actions(driver);

        for(WebElement e: stateList){
            act.moveToElement(e).perform();
            String stateId = e.getAttribute("id");
            System.out.println(stateId);
            Thread.sleep(1000);
        }
    }
}
