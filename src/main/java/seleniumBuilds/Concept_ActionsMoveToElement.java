package seleniumBuilds;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Concept_ActionsMoveToElement {
    static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
        driver = new ChromeDriver();

        driver.get("https://www.bigbasket.com/?nc=logo");
        driver.manage().window().maximize();

        Thread.sleep(3000);

//        driver.findElement(By.xpath("(//button[contains(@id,'headless')]//span[text()='Shop by'])[2]")).click();
//        Thread.sleep(3000);
//
//        Actions act = new Actions(driver);
//        act.moveToElement(driver.findElement(By.linkText("Beverages"))).perform();
//        Thread.sleep(1000);
//        act.moveToElement(driver.findElement(By.linkText("Tea"))).perform();
//        Thread.sleep(1000);
//        act.moveToElement(driver.findElement(By.linkText("Green Tea"))).perform();

        By lm1 = By.xpath("(//button[contains(@id,'headless')]//span[text()='Shop by'])[2]");
        By lm2 = By.linkText("Beverages");
        By lm3 = By.linkText("Tea");
        By lm4 = By.linkText("Green Tea");

        handleMultipleSubMenu(lm1,lm2,lm3,lm4);
    }

    public static WebElement getElement(By locator) {
        return driver.findElement(locator);
    }

    public static void handleMultipleSubMenu(By l1, By l2, By l3, By l4) throws InterruptedException {
        getElement(l1).click();
        Thread.sleep(1500);

        Actions act = new Actions(driver);

        act.moveToElement(getElement(l2)).perform();
        Thread.sleep(1500);
        act.moveToElement(getElement(l3)).perform();
        Thread.sleep(1500);
        getElement(l4).click();
    }


}
