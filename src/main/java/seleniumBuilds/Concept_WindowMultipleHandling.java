package seleniumBuilds;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class Concept_WindowMultipleHandling {

    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        driver = new ChromeDriver();

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();

        String parentWindow = driver.getWindowHandle();

        Thread.sleep(3000);

        driver.findElement(By.xpath("//a[contains(@href,'twitter')]")).click();
        driver.findElement(By.xpath("//a[contains(@href,'linkedin')]")).click();
        driver.findElement(By.xpath("//a[contains(@href,'youtube')]")).click();
        driver.findElement(By.xpath("//a[contains(@href,'facebook')]")).click();

        Set<String> handles = driver.getWindowHandles();

        Iterator<String> it = handles.iterator();

        while (it.hasNext()) {
            String windowId = it.next();
            driver.switchTo().window(windowId);
            String currentUrl = driver.getCurrentUrl();
            System.out.println("window URL :: "+currentUrl);

            if (!windowId.equals(parentWindow)) {
                driver.close();
                Thread.sleep(3000);
            }

        }

        driver.switchTo().window(parentWindow);
        System.out.println(driver.getCurrentUrl()+" "+driver.getTitle());
    }
}