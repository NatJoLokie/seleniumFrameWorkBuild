package seleniumBuilds;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Concept_FileUploadPopUp {
    static WebDriver driver;

    public static void main(String[] args) {
        driver = new ChromeDriver();

        driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");
        driver.manage().window().maximize();

        driver.findElement(By.name("upfile")).sendKeys("D:\\learning\\testFiles\\TestingUpload.JPG");


    }
}
