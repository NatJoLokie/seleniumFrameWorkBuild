package seleniumBuilds;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Concept_getTextAttribute {
    static WebDriver driver;

    public static void main(String[] args) {
        driver = new ChromeDriver();

        driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
        driver.manage().window().maximize();

//        String text = driver.findElement(By.xpath("(//p/strong)[1]")).getText();
//        System.out.println(text);

        ElementUtil elementUtil = new ElementUtil(driver);

        By text = By.xpath("(//p/strong)[1]");
        String doGetText = elementUtil.doGetElementText(text);
        System.out.println("doGetTextMethod : "+doGetText );

//      <input type="text" name="email" value=""
//      placeholder="E-Mail Address"
//      id="input-email" class="form-control">

        By attText = By.id("input-email");

//        String getAttText = driver.findElement(attText).getAttribute("placeholder");
//        System.out.println(getAttText);

        String getAttText  = elementUtil.doGetAttText(attText,"placeholder");
        System.out.println("getAttTextMethod : "+getAttText);


    }
//
//    public static WebElement getElement(By locator){
//        return driver.findElement(locator);
//    }
//
//    public static String doGetText(By locator){
//       return getElement(locator).getText();
//    }
//
//    public static String doGetAttText(By locator, String attValue){
//        return getElement(locator).getAttribute(attValue);
//    }

}
