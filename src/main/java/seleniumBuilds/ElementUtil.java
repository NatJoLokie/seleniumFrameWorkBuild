package seleniumBuilds;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

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
        WebElement element = null;
        try {
            element = driver.findElement(locator);
        } catch (NoSuchElementException e) {
            System.out.println("Element not available in the page");
            e.printStackTrace();
            return null;
        }
        return element;
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
        nullBlankCheck(value);
        getElement(locator).sendKeys(value);
    }

    public void doSendKeys(String locatorType, String locatorValue, String value) {
        nullBlankCheck(value);
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

    public boolean isElementDisplayed(By locator) {
        return driver.findElement(locator).isDisplayed();
    }

    //     Alternate & Efficient Method to check if single elements is available
    public boolean isElementExists(By locator) {
        if (getElements(locator).size() == 1) {
            return true;
        }
        return false;
    }

    //    Method to check if multiple elements are available
    public boolean isMultipleElementExists(By locator) {
        if (getElements(locator).size() > 0) {
            return true;
        }
        return false;
    }

    //------------------ Dropdown Utils--------------------------------//
    private void nullBlankCheck(String value) {
        if (value.length() == 0 || value == null) {
            throw new ExceptionMyElement(value + "Visible Text cannot be null or blank");
        }
    }

    public void doSelectByIndex(By locator, int index) {
        Select select = new Select(getElement(locator));
        select.selectByIndex(index);
    }

    public void doSelectByVisibleText(By locator, String visibleText) {
        nullBlankCheck(visibleText);
        Select select = new Select(getElement(locator));
        select.selectByVisibleText(visibleText);
    }

    public void doSelectByValue(By locator, String value) {
        nullBlankCheck(value);
        Select select = new Select(getElement(locator));
        select.selectByValue(value);
    }

    public List<WebElement> getDropDownOptionsList(By locator) {
        Select select = new Select(getElement(locator));
        return select.getOptions();
    }

    public int getDropDownValueCount(By locator) {
        return getDropDownOptionsList(locator).size();
    }

    public void doSelectDropdownValue(By locator, String value) {

        List<WebElement> OptionsList = getDropDownOptionsList(locator);

        for (WebElement e : OptionsList) {
            String text = e.getText();
            System.out.println(text);
            if (text.equals(value)) {
                e.click();
                break;
            }
        }
    }

    public List<String> getDropdownOptionsTextList(By locator) {

        List<WebElement> OptionsList = getDropDownOptionsList(locator);
        List<String> optionsText = new ArrayList<String>();

        for (WebElement e : OptionsList) {
            String text = e.getText();
            optionsText.add(text);
        }
        return optionsText;
    }


    public void printDropdownValue(By locator) {

        List<WebElement> OptionsList = getDropDownOptionsList(locator);

        for (WebElement e : OptionsList) {
            String text = e.getText();
            System.out.println(text);

        }

    }

    //Dropdownto select a value without using select
    public void doSelectValueDropDownWS(By locators, String value) {
        List<WebElement> optionsList = getElements(locators);
        System.out.println(optionsList.size());
        for (WebElement e : optionsList) {
            String text = e.getText();
            if (text.equals(value)) {
                e.click();
                break;
            }
        }

    }
}
