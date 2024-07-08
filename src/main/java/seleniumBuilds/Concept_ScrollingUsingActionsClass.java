package seleniumBuilds;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Concept_ScrollingUsingActionsClass {
    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {

        driver = new ChromeDriver();

        driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
        driver.manage().window().maximize();

        Thread.sleep(2000);

        Actions act = new Actions(driver);

//        act.sendKeys(Keys.PAGE_DOWN).perform();

        Thread.sleep(1000);

//        act.sendKeys(Keys.CONTROL).sendKeys(Keys.END).perform();
//
//        Thread.sleep(1000);
//
//        act.sendKeys(Keys.CONTROL).sendKeys(Keys.HOME).perform();
//
//        Thread.sleep(1000);
//
//        act.sendKeys(Keys.CONTROL).sendKeys(Keys.END).perform();

        act.scrollToElement(driver.findElement(By.xpath("//a[text()='Delivery Information']")))
                .click(driver.findElement(By.xpath("//a[text()='Delivery Information']")))
                .build().perform();





    }
}
