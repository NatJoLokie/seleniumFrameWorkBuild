package seleniumBuilds;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Concept_iFrameHandling {

    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        driver = new ChromeDriver();

        driver.get("https://www.formsite.com/templates/registration-form-templates/vehicle-registration-form/");
        driver.manage().window().maximize();

        Thread.sleep(3000);

        driver.findElement(By.cssSelector("#imageTemplateContainer img")).click();

        Thread.sleep(3000);

        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@id,'frame-one')]")));

        driver.findElement(By.id("RESULT_TextField-8")).sendKeys("Nathaniel");

        driver.switchTo().defaultContent();



    }
}
