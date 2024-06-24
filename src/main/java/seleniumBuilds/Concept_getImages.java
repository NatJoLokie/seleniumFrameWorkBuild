package seleniumBuilds;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Concept_getImages {
    static WebDriver driver;
    public static void main(String[] args) {

        driver = new ChromeDriver();

        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();

        List<WebElement> allImages =  driver.findElements(By.tagName("img"));
        System.out.println(allImages.size());


    }
}
