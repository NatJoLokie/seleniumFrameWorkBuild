package seleniumBuilds;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

//SRP-Single Responsibility Principle
public class ElementUtil {

    private WebDriver driver;

    //    Constructor
    public ElementUtil(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getElement(By locator) {
        return driver.findElement(locator);
    }

    public By getBy(String locatorType, String locatorValue) {

        By locator = null;

        switch (locatorType.toLowerCase().trim()) {
            case "id":
                locator = By.id(locatorValue);
                break;
            case "name":
                locator = By.name(locatorValue);
                break;
            case "classname":
                locator = By.className(locatorValue);
                break;
            case "xpath":
                locator = By.xpath(locatorValue);
                break;
            case "css":
                locator = By.cssSelector(locatorValue);
                break;
            case "linktext":
                locator = By.linkText(locatorValue);
                break;

        }

        return locator;
    }

    public WebElement getElement(String locatorType, String locatorValue) {
        return driver.findElement(getBy(locatorType, locatorValue));
    }

    public void doSendKeys(By locator, String value) {
        getElement(locator).sendKeys(value);
    }

    public void doSendKeys(String locatorType, String locatorValue, String value) {
        getElement(locatorType, locatorValue).sendKeys(value);
    }

    public void doClick(By locator) {
        getElement(locator).click();
    }

    public void doClick(String locatorType, String locatorValue) {
        getElement(locatorType, locatorValue).click();
    }

    public String doGetElementText(By locator) {
        return getElement(locator).getText();
    }

    public String doGetAttText(By locator, String attValue) {
        return getElement(locator).getAttribute(attValue);
    }

    public List<WebElement> getElements(By locator) {
        return driver.findElements(locator);

    }

    public int getElementsCount(By locator) {
        return getElements(locator).size();
    }

    public List<String> getElementsTextList(By locator) {
        List<WebElement> eleList = getElements(locator);
        ArrayList<String> eleTextList = new ArrayList<String>();

        for (WebElement e : eleList) {
            String eleText = e.getText();
            if (eleText.length() != 0) {
                eleTextList.add(eleText);
            }
        }
        return eleTextList;
    }

    public List<String> getElementsAttributeList(By locator, String attributeName) {
        List<WebElement> eleList = getElements(locator);
        ArrayList<String> eleAttList = new ArrayList<String>();

        for (WebElement e : eleList) {
            String attValue = e.getAttribute(attributeName);
            if (attValue.length() != 0) {
                eleAttList.add(attValue);
            }
        }
        return eleAttList;

    }

}
