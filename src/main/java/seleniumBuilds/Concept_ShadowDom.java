package seleniumBuilds;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Concept_ShadowDom {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://selectorshub.com/iframe-in-shadow-dom/");
        driver.manage().window().maximize();
        Thread.sleep(25000);

//****  Scenario 1 ->Browser -->Page -->shadowDom(Open) -->element
        String searchScript = "return document.querySelector(\"#userName\").shadowRoot.querySelector(\"#app2\").shadowRoot.querySelector(\"#pizza\");";

        JavascriptExecutor js = (JavascriptExecutor) driver;

        WebElement pizzaName = (WebElement) js.executeScript(searchScript);

        pizzaName.sendKeys("Margerita");

//****  Scenario 2 ->Browser -->Page -->shadowDom(Open) -->iFrame -->element
        String frameScript = "return document.querySelector(\"#userName\").shadowRoot.querySelector(\"#pact1\");";

        JavascriptExecutor js1 = (JavascriptExecutor) driver;
        WebElement frameElement = (WebElement) js1.executeScript(frameScript);

        driver.switchTo().frame(frameElement);

        driver.findElement(By.id("glaf")).sendKeys("Pass");






    }
}
