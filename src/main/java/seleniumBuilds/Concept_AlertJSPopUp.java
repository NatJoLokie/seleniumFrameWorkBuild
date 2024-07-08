package seleniumBuilds;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Concept_AlertJSPopUp {

    static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
        driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.manage().window().maximize();

        Thread.sleep(3000);

//      1. JS Alert Pop-Up
//        driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
//
//        Alert alert = driver.switchTo().alert();
//
//        String alertTexts = alert.getText();
//
//        System.out.println(alertTexts);
//
////        alert.accept();
//
//        alert.dismiss();

// ---------------------------------------------

////      2. JS Confirm Alert Pop-Up
//
//        driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
//
//        Alert confirmAlert = driver.switchTo().alert();
//
//        System.out.println(confirmAlert.getText());
//
//        confirmAlert.accept();
//
////        confirmAlert.dismiss();

// ---------------------------------------------

//      2. JS Confirm Alert Pop-Up

        driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();

        Alert PromptAlert = driver.switchTo().alert();

        System.out.println(PromptAlert.getText());

        Thread.sleep(3000);

        PromptAlert.sendKeys("Nathaniel");

        PromptAlert.accept();

//        PromptAlert.dismiss();

    }
}
