package seleniumBuilds;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BrowserElementTest {

    public static void main(String[] args) {
        BrowserUtil browserUtil = new BrowserUtil();
        WebDriver driver = browserUtil.launchBrowser("chrome");

        browserUtil.launchURL("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

        String pageTitle = browserUtil.getPageTitle();
        System.out.println(pageTitle);

        By byEmail = By.id("input-email");
        By byPassword = By.id("input-password");

        ElementUtil elementUtil = new ElementUtil(driver);

        elementUtil.doSendKeys(byEmail,"user@mail.com");
        elementUtil.doSendKeys(byPassword,"user@P@5$W0rd");
    }
}
