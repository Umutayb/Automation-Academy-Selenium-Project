package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.Utilities;
import java.util.List;

public class ElementsPage extends Utilities {

    @FindBy(css = "[class='element-list collapse show'] li")
    public List<WebElement> menuElements;

    @FindBy(css = "[class='rct-text']")
    public List<WebElement> toggleElements;

    @FindBy(css = "[id='result']")
    public WebElement result;

    @FindBy(css = "[id='userName']")
    public WebElement usernameInput;

    @FindBy(css = "[id='userEmail']")
    public WebElement emailInput;

    @FindBy(css = "[id='currentAddress']")
    public WebElement currentAddressInput;

    @FindBy(css = "[id='permanentAddress']")
    public WebElement permanentAddressInput;

    @FindBy(css = "[id='submit']")
    public WebElement submitButton;

    public void printResultText(){System.out.println(result.getText());}

    public void resultVerification(String expectedResult){
        String[] expectedResults = expectedResult.split(" ");
        int verificationCount = 0;
        for (String expected:expectedResults) {
            for (String actual:result.getText().split(" ")) {
                if (actual.contains(expected))
                    verificationCount++;
            }
        }
        Assert.assertEquals(expectedResults.length,verificationCount);
    }

    public void checkCheckBox(String itemName){
        By checkboxSelector = By.cssSelector("span[class='rct-checkbox']");
        for (WebElement checkboxElement:toggleElements) {
            if (checkboxElement.getText().equalsIgnoreCase(itemName)){
                clickElement(checkboxElement.findElement(checkboxSelector));
                return;
            }
        }
        Assert.fail("No toggle is sharing a div with the text \""+itemName+"\" in it, could be located on the elements page.");
    }

    public void clickToggleElement(String itemName){
        By toggleSelector = By.cssSelector("[title='Toggle']");
        for (WebElement toggleElement:toggleElements) {
            if (toggleElement.getText().equalsIgnoreCase(itemName)){
                clickElement(toggleElement.findElement(toggleSelector));
                return;
            }
        }
        Assert.fail("No toggle is sharing a div with the text \""+itemName+"\" in it, could be located on the elements page.");
    }

    public void clickMenuElement(String itemName){
        for (WebElement menuElement:menuElements) {
            if (menuElement.getText().equalsIgnoreCase(itemName)){
                clickElement(menuElement);
                return;
            }
        }
        Assert.fail("No menu item called "+itemName+" could be located on the elements page.");
    }
}
