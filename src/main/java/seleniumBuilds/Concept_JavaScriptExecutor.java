package seleniumBuilds;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Concept_JavaScriptExecutor {
    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {

        driver = new ChromeDriver();

        driver.get("https://naveenautomationlabs.com/opencart/");

        driver.manage().window().maximize();

        JavascriptExecutor js = (JavascriptExecutor) driver;

        String title = js.executeScript("return document.title;").toString();
        System.out.println(title);

        String Url = js.executeScript("return document.URL;").toString();
        System.out.println(Url);


    }

    public static void flash(WebElement element) {
        String bgcolor = element.getCssValue("backgroundColor");//red
        for (int i = 0; i < 10; i++) {
            changeColor("rgb(0,200,0)", element);// green
            changeColor(bgcolor, element);// red
        }
    }

    private static void changeColor(String color, WebElement element) {
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("arguments[0].style.backgroundColor = '" + color + "'", element);

        try {
            Thread.sleep(20);
        } catch (InterruptedException e) {
        }
    }

    public static String getTitleByJS() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        return js.executeScript("return document.title;").toString();
    }

    public static void goBackByJS() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("history.go(-1)");
    }

    public static void goForwardByJS() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("history.go(1)");
    }

    public static void refreshBrowserByJS() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("history.go(0);");
    }

    public static void generateAlert(String message) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("alert('" + message + "')");
    }

    public static void generateConfirmPopUp(String message) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("confirm('" + message + "')");
    }

    public static String getPageInnerText() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        return js.executeScript("return document.documentElement.innerText;").toString();
    }

    public static void clickElementByJS(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", element);
    }

    public static void sendKeysUsingWithId(String id, String value) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("document.getElementById('" + id + "').value='" + value + "'");
        //document.getElementById('input-email').value ='tom@gmail.com'
    }

    public static void scrollPageDown() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
    }

    public static void scrollPageUp() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(document.body.scrollHeight, 0)");
    }

    public static void scrollPageDown(String height) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, '" + height + "')");
    }

}
