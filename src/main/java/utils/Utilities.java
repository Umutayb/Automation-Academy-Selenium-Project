package utils;

import com.github.webdriverextensions.WebDriverExtensionFieldDecorator;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import utils.driver.Driver;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class Utilities extends Driver {

    public Utilities(){PageFactory.initElements(new WebDriverExtensionFieldDecorator(driver),this);}

    public void clickElement(WebElement element){centerElement(element).click();}

    public WebElement waitForElementVisibility(WebElement element, Long initialTime){
        return null;
    }

    public WebElement hoverOver(WebElement element, Long initialTime){
        if (System.currentTimeMillis()-initialTime > 10000)
            return null;
        centerElement(element);
        Actions actions = new Actions(driver);
        try{actions.moveToElement(element).build().perform();}
        catch (StaleElementReferenceException ignored) {hoverOver(element,initialTime);}
        return element;
    }

    public WebElement loopNMatch(List<WebElement> elementList, String itemText, boolean strict){
        for (WebElement item:elementList) {
            if(strict){
                if (item.getText().equalsIgnoreCase(itemText))
                    return item;
            }
            else {
                if (item.getText().equalsIgnoreCase(itemText) || item.getText().contains(itemText))
                    return item;
            }

        }
        Assert.fail("Item could not be located!");
        return null;
    }

    public WebElement centerElement(WebElement element){
        String script =
                "var viewPortHeight = Math.max(document.documentElement.clientHeight, window.innerHeight || 0);"
                + "var elementTop = arguments[0].getBoundingClientRect().top;"
                + "window.scrollBy(0, elementTop-(viewPortHeight/2));";

        ((JavascriptExecutor) driver).executeScript(script, element);

        return element;
    }

    public void fillInput(String input, WebElement inputElement){inputElement.sendKeys(input);}

    public void dragAndDropTo(WebElement targetElement, WebElement destinationElement){
        centerElement(targetElement);
        Actions actions = new Actions(driver);
        actions.moveToElement(targetElement)
                .clickAndHold(targetElement)
                .moveToElement(destinationElement)
                .release()
                .build()
                .perform();
        waitFor(0.2);
    }

    public void dragAndDropByOffset(WebElement targetElement, Integer xOffset, Integer yOffset){
        centerElement(targetElement);
        Actions actions = new Actions(driver);
        actions.moveToElement(targetElement)
                .clickAndHold(targetElement)
                .moveToElement(targetElement,xOffset,yOffset)
                .release()
                .build()
                .perform();
        waitFor(0.2);
    }

    public void navigate(String url){driver.get(url);}

    public void predeterminedNavigate(String pageName){
        Properties properties = new Properties();
        String url;
        try{
            properties.load(new FileReader("src/main/resources/test.properties"));
            url = properties.getProperty("url."+pageName);
        }
        catch (IOException exception) {return;}
        driver.get(url);
    }

    public void waitFor(double seconds) {
        try {Thread.sleep((long) (seconds*1000));}
        catch (InterruptedException ignored){}
    }

    public String shorten(String inputString, int length) { //Shortens string to the given length
        return inputString.substring(0, Math.min(inputString.length(), length));
    }

    public WebElement waitUntilElementIsClickable(WebElement element, long initialTime){
        driver.manage().timeouts().implicitlyWait(500, TimeUnit.MILLISECONDS);
        if (System.currentTimeMillis()-initialTime>15000){
            driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
            return null;
        }
        try {
            if (!element.isEnabled()){waitUntilElementIsClickable(element, initialTime);}
        }
        catch (StaleElementReferenceException| NoSuchElementException | TimeoutException exception){
            waitUntilElementIsClickable(element, initialTime);
        }
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        return element;
    }

    public WebElement waitUntilElementIsVisible(WebElement element, long initialTime){
        driver.manage().timeouts().implicitlyWait(500, TimeUnit.MILLISECONDS);
        if (System.currentTimeMillis()-initialTime>15000){
            driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
            return null;
        }
        try {
            if (!element.isDisplayed()){waitUntilElementIsVisible(element, initialTime);}
        }
        catch (StaleElementReferenceException|NoSuchElementException|TimeoutException exception){
            waitUntilElementIsVisible(element, initialTime);
        }
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        return element;
    }

}
