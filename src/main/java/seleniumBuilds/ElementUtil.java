package seleniumBuilds;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

//SRP-Single Responsibility Principle
public class ElementUtil {

    private WebDriver driver;

    //    Constructor
    public ElementUtil(WebDriver driver) {
        this.driver = driver;
    }

    /**
     * Method to get single element
     * driver.findElement(locator)
     *
     * @param locator By WebElement
     * @return
     */
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

    /**
     * Helps to use the desired locator
     *
     * @param locatorType  String
     * @param locatorValue String
     * @return
     */
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

    /**
     * Overloaded method that helps to get element using the desired locator type
     *
     * @param locatorType
     * @param locatorValue
     * @return
     */
    public WebElement getElement(String locatorType, String locatorValue) {
        return driver.findElement(getBy(locatorType, locatorValue));
    }

    public void doSendKeys(By locator, String value) {
        nullBlankCheck(value);
        getElement(locator).sendKeys(value);
    }

    public void doSendKeys(By locator, String value, int timeOut) {
        nullBlankCheck(value);
        waitForElementVisible(locator, timeOut).sendKeys(value);
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
//      List<WebElement> optionsList = driver.findElements(By.xpath("//select[@id='Form_getForm_Country']/option"));
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

    public void doSearch(By searchLocator, By suggestLocator, String searchKey, String searchValue) throws InterruptedException {
//      driver.findElement(searchLocator).sendKeys(searchKey);
        doSendKeys(searchLocator, searchKey);
        Thread.sleep(3000);

//        List<WebElement> suggestList = driver.findElements(suggestLocator);
        List<WebElement> suggestList = getElements(suggestLocator);
        System.out.println(suggestList.size());

        for (WebElement e : suggestList) {
            String text = e.getText();
            if (text.contains(searchValue)) {
                e.click();
                break;
            }
        }

    }

    public void selectChoiceDropDown(By dropDownLocator, By dropDownOptionsLocator, String... value) throws InterruptedException {
        driver.findElement(dropDownLocator).click();
        Thread.sleep(3000);
        List<WebElement> multiDropDownOptions = driver.findElements(dropDownOptionsLocator);

        System.out.println(multiDropDownOptions.size());
        if (!value[0].equals("all")) {
            for (WebElement e : multiDropDownOptions) {
                String text = e.getText();
                for (String val : value) {
                    if (text.equals(val)) {
                        e.click();
                    }
                }
            }
        } else {
            for (WebElement e : multiDropDownOptions) {
                try {
                    e.click();
                } catch (ElementNotInteractableException ex) {
                    break;
                }


            }
        }

    }

    public void selectUser(String name) {
        String xpath = "//a[text()='" + name + "']/ancestor::tr//input[@type='checkbox']";
        driver.findElement(By.xpath(xpath)).click();
    }

    public ArrayList<String> selectUsers(String name) {
        String xpath = "//a[text()='" + name + "']/parent::td/following-sibling::td";
        List<WebElement> elements = driver.findElements(By.xpath(xpath));
        ArrayList<String> userElements = new ArrayList<String>();
        for (WebElement e : elements) {
            String text = e.getText();
            userElements.add(text);
        }
        return userElements;
    }

    /**
     * Method to hover and select the desired number of items
     *
     * @param l1
     * @param l2
     * @param l3
     * @param l4
     * @throws InterruptedException
     */
    public void handleMultipleSubMenu(By l1, By l2, By l3, By l4) throws InterruptedException {
//        getElement(l1).click();
        doClick(l1);
        Thread.sleep(1500);

        Actions act = new Actions(driver);

        act.moveToElement(getElement(l2)).perform();
        Thread.sleep(1500);
        act.moveToElement(getElement(l3)).perform();
        Thread.sleep(1500);
//        getElement(l4).click();
        doClick(l4);

    }

    //
    public void doActionsClick(By locator) {
        Actions act = new Actions(driver);
        act.click(getElement(locator)).perform();
    }

    public void doActionsSendKeys(By locator, String value) {
        Actions act = new Actions(driver);
        act.sendKeys(getElement(locator), value).perform();
    }

//-------------------Wait Utility---------------------

    public void doClickWhenReady(By locator, int timeOut) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
        wait.until(ExpectedConditions.elementToBeClickable(locator)).click();
    }

    /**
     * An expectation for checking that an element is present on the DOM of a page. This does not necessarily mean that the element is visible.
     * Params:
     * locator – used to find the element
     * Returns:
     * the WebElement once it is located
     */
    public WebElement waitForElementPresent(By locator, int timeOut) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
        return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
    }

    /**
     * An expectation for checking that there is at least one element present on a web page.
     * Params:
     * locator – used to find the element
     * Returns:
     * the list of WebElements once they are located     *
     */
    public List<WebElement> waitForElementsPresent(By locator, int timeOut) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
        return wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator));
    }

    public List<WebElement> waitForElementsPresentByFluentWait(By locator, int timeOut, int pollingTimeOut) {
        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(timeOut))
                .pollingEvery(Duration.ofSeconds(pollingTimeOut))
                .ignoring(NoSuchElementException.class) // multiple ignoring methods can be added
                .ignoring(StaleElementReferenceException.class)
                .withMessage("time out..No Element Present");
        return wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator));
    }

    /**
     * An expectation for checking that an element is present on the DOM of a page and visible. Visibility means that the element is not only displayed but also has a height and width that is greater than 0.
     * Params:
     * locator – used to find the element
     * Returns:
     * the WebElement once it is located and visible
     */
    public WebElement waitForElementVisible(By locator, int timeOut) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    /**
     * driver – The WebDriver instance to pass to the expected conditions
     * timeout – The timeout in seconds when an expectation is called
     * intervalTimeOut/sleep – The duration in milliseconds to sleep between polls.
     */
    public WebElement waitForElementVisible(By locator, int timeOut, int intervalTimeOut) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut), Duration.ofSeconds(intervalTimeOut));
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public List<WebElement> waitForElementsVisible(By locator, int timeOut) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
        return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
    }

    /**
     * Wait for Title Contains
     */
    public String waitForTitleContains(String titleFraction, int timeOut) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
        try {
            if (wait.until(ExpectedConditions.titleContains(titleFraction))) {
                return driver.getTitle();
            }
        } catch (Exception e) {
            System.out.println("title is not found :" + timeOut);
        }
        return null;
    }

    /**
     * Wait for Title Equals
     */
    public String waitForTitleEquals(String title, int timeOut) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
        try {
            if (wait.until(ExpectedConditions.titleIs(title))) {
                return driver.getTitle();
            }
        } catch (Exception e) {
            System.out.println("title is not found :" + timeOut);
        }
        return null;
    }

    /**
     * Wait for URL Contains
     */
    public String waitForURLContains(String urlFraction, int timeOut) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
        try {
            if (wait.until(ExpectedConditions.urlContains(urlFraction))) {
                return driver.getTitle();
            }
        } catch (Exception e) {
            System.out.println("title is not found :" + timeOut);
        }
        return null;
    }

    /**
     * Wait for URL Equals
     */
    public String waitForURLEquals(String url, int timeOut) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
        try {
            if (wait.until(ExpectedConditions.urlToBe(url))) {
                return driver.getTitle();
            }
        } catch (Exception e) {
            System.out.println("title is not found :" + timeOut);
        }
        return null;
    }

    public Alert waitForJSAlert(int timeOut) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
        return wait.until(ExpectedConditions.alertIsPresent());
    }

    public Alert waitForJSAlertFluentWait(int timeOut, int pollingTimeOut) {
        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(timeOut))
                .pollingEvery(Duration.ofSeconds(pollingTimeOut))
                .ignoring(NoSuchElementException.class) // multiple ignoring methods can be added
                .ignoring(StaleElementReferenceException.class)
                .withMessage("time out..No Alert Present");
        return wait.until(ExpectedConditions.alertIsPresent());
    }

    public String getAlertText(int timeOut) {
        return waitForJSAlert(timeOut).getText();
    }

    public void acceptAlert(int timeOut) {
        waitForJSAlert(timeOut).accept();
    }

    public void dismissAlert(int timeOut) {
        waitForJSAlert(timeOut).dismiss();
    }

    public void alertSendKeys(int timeOut, String value) {
        waitForJSAlert(timeOut).sendKeys(value);
    }

    public Boolean waitForWindow(int noOfWindowsToBe, int timeOut) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
        return wait.until(ExpectedConditions.numberOfWindowsToBe(noOfWindowsToBe));
    }

    public void waitForFrameAndSwitchTo(By locator, int timeOut) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(locator));
    }

    public void waitForFrameAndSwitchTo(int frameIndex, int timeOut) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameIndex));
    }

    public void waitForFrameAndSwitchTo(WebElement frameElement, int timeOut) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameElement));
    }


}
