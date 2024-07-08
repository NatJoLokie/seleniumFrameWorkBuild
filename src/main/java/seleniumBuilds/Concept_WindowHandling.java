package seleniumBuilds;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class Concept_WindowHandling {
    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        driver = new ChromeDriver();

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();

        Thread.sleep(3000);

        driver.findElement(By.xpath("//a[contains(@href,'twitter')]")).click();

        Set<String> handles = driver.getWindowHandles();

        Iterator<String> it = handles.iterator();

        String parentWindowId = it.next();
        System.out.println(parentWindowId);

        String childWindowId = it.next();
        System.out.println(childWindowId);

        driver.switchTo().window(parentWindowId);
        System.out.println(driver.getCurrentUrl());

        driver.switchTo().window(childWindowId);
        System.out.println(driver.getCurrentUrl());




    }
}
