package seleniumBuilds;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Concept_WindowNew {
    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        driver = new ChromeDriver();

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();

        String parentWindowId = driver.getWindowHandle();

//        driver.switchTo().newWindow(WindowType.TAB);
        driver.switchTo().newWindow(WindowType.WINDOW);

        driver.get("https://google.com");
        System.out.println(driver.getTitle());
        driver.close();

        driver.switchTo().window(parentWindowId);

        System.out.println(driver.getTitle());

    }
}