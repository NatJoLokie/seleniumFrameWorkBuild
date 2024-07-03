package seleniumBuilds;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Concept_DragAndDrop {

    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        driver = new ChromeDriver();

        driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
        driver.manage().window().maximize();

        Thread.sleep(2000);

        WebElement src = driver.findElement(By.id("draggable"));
        WebElement tgt = driver.findElement(By.id("droppable"));

//        Actions act = new Actions(driver);
//        act.clickAndHold(src)
//                    .moveToElement(tgt)
//                        .release()
//                            .build()
//                                .perform();

        Actions act = new Actions(driver);
        Action action = act
                .clickAndHold(src)
                    .moveToElement(tgt)
                        .release()
                            .build();
        action.perform();

//        act.dragAndDrop(src,tgt).perform();


    }
}
