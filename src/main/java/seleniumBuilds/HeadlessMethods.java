package seleniumBuilds;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class HeadlessMethods {

    public static void main(String[] args) {

        ChromeOptions co = new ChromeOptions();
        FirefoxOptions fo = new FirefoxOptions();

        WebDriver cDriver = new ChromeDriver(co);
        WebDriver fDriver = new FirefoxDriver(fo);

//        co.addArguments("--headless");
        co.addArguments("--incognito");

        fo.addArguments("--headless");
//        fo.addArguments("--incognito");



        cDriver.get("https://naveenautomationlabs.com/opencart/");
        fDriver.get("https://naveenautomationlabs.com/opencart/");

        System.out.println(cDriver.getTitle());
        System.out.println(fDriver.getTitle());

    }


}
