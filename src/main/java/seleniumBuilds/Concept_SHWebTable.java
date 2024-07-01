package seleniumBuilds;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class Concept_SHWebTable {

    static WebDriver driver;

    public static void main(String[] args) {
        driver = new ChromeDriver();

        driver.get("https://selectorshub.com/xpath-practice-page/");
        driver.manage().window().maximize();

//        //a[text()='Joe.Root']/ancestor::tr//input[@type='checkbox']
        String name = "Joe.Root";
//        String xpath = "//a[text()='" + name + "']/ancestor::tr//input[@type='checkbox']";
//        driver.findElement(By.xpath(xpath)).click();
        selectUser(name);
        selectUser("John.Smith");

//        //a[text()='Joe.Root']/parent::td/following-sibling::td
        String xpath = "//a[text()='"+name+"']/parent::td/following-sibling::td";
        List<WebElement> elements = driver.findElements(By.xpath(xpath));
        ArrayList<String> userElements = new ArrayList<String>();
        for(WebElement e:elements){
            String text = e.getText();
            userElements.add(text);
        }

        System.out.println(userElements);


    }

    public static void selectUser(String name) {
        String xpath = "//a[text()='" + name + "']/ancestor::tr//input[@type='checkbox']";
        driver.findElement(By.xpath(xpath)).click();
    }
    public static ArrayList<String> selectUsers(String name) {
        String xpath = "//a[text()='"+name+"']/parent::td/following-sibling::td";
        List<WebElement> elements = driver.findElements(By.xpath(xpath));
        ArrayList<String> userElements = new ArrayList<String>();
        for(WebElement e:elements){
            String text = e.getText();
            userElements.add(text);
        }
        return userElements;
    }

}