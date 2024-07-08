package seleniumBuilds;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import static org.openqa.selenium.support.locators.RelativeLocator.with;
//import org.openqa.selenium.support.locators.;


public class Concept_RelativeLocator {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.aqi.in/dashboard/canada");
        driver.manage().window().maximize();
        Thread.sleep(3000);

        WebElement ele = driver.findElement(By.linkText("Cold Lake, Canada"));

//        String leftElement = driver.findElement(RelativeLocator.with(By.tagName("p")).toLeftOf(ele)).getText();
        String leftText = driver.findElement(with(By.tagName("p")).toLeftOf(ele)).getText();
        System.out.println(leftText);

        String rightText = driver.findElement(with(By.tagName("p")).toRightOf(ele)).getText();
        System.out.println(rightText);

        String aboveText = driver.findElement(with(By.tagName("p")).above(ele)).getText();
        System.out.println(aboveText);

        String belowText = driver.findElement(with(By.tagName("p")).below(ele)).getText();
        System.out.println(belowText);






    }
}
