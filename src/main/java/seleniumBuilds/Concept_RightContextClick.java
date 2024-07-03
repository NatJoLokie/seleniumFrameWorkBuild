package seleniumBuilds;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class Concept_RightContextClick {
    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {

        driver = new ChromeDriver();

        driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
        driver.manage().window().maximize();

        Thread.sleep(2000);

        WebElement rightClick = driver.findElement(By.xpath("//span[text()='right click me']"));

        Actions act = new Actions(driver);

        act.contextClick(rightClick).perform();

        List<WebElement> menu = driver.findElements(By.cssSelector("ul.context-menu-list >li:not(.context-menu-separator)"));
        for (WebElement e : menu) {
            String text = e.getText();
            System.out.println(text);
            if(text.equals("Copy")){
                e.click();
                break;
            }

        }


    }
}
