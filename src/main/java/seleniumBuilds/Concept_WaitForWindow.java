package seleniumBuilds;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

public class Concept_WaitForWindow {

    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        driver = new ChromeDriver();

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();

        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[contains(@href,'twitter')]")).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        if (wait.until(ExpectedConditions.numberOfWindowsToBe(2))) {
            Set<String> handles = driver.getWindowHandles();
            Iterator<String> it = handles.iterator();

            String parentWindowId = it.next();
            System.out.println(parentWindowId);

            String childWindowId = it.next();
            System.out.println(childWindowId);
        }


    }

    public static Boolean waitForWindow(int noOfWindowsToBe, int timeOut) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
        return wait.until(ExpectedConditions.numberOfWindowsToBe( noOfWindowsToBe));
    }



}
