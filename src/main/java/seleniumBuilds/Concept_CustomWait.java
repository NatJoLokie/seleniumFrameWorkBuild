package seleniumBuilds;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Concept_CustomWait {
    static WebDriver driver;
    public static WebElement retryingElement(By locator, int timeOut) {
        WebElement element = null;
        int attempts = 0;

        while (attempts < timeOut) {
            try {
                element = driver.findElement(locator);
                System.out.println("element is found...." + locator + " in attempt " + attempts);
                break;
            } catch (NoSuchElementException e) {
                System.out.println("element is not found.... " + " in attempts " + attempts);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e1) {
                    e1.printStackTrace();
                }
            }
            attempts++;
        }
        if (element == null) {
            System.out.println("element is not found.....tried for " + timeOut + " times " + " with the interval of " + 500 + " milliseconds...");
            throw new BrowserException("No Such Element");
        }
        return element;
    }

    public static void main(String[] args) {
        driver = new ChromeDriver();


    }
}