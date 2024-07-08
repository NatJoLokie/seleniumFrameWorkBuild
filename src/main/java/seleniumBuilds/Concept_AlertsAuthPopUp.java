package seleniumBuilds;

import org.openqa.selenium.HasAuthentication;
import org.openqa.selenium.UsernameAndPassword;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Concept_AlertsAuthPopUp {
    static WebDriver driver;

    public static void main(String[] args) {
        driver = new ChromeDriver();

//        driver.get("https://USERNAME:PASSWORD@the-internet.herokuapp.com/basic_auth");
        driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
        driver.manage().window().maximize();

//        For password having special characters

        ((HasAuthentication) driver).register(() -> new UsernameAndPassword("admin", "admin@123"));

        driver.get("https://the-internet.herokuapp.com/basic_auth");

    }
}
