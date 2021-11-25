package pages.components;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.Utilities;

import java.util.List;

public class SelectMenuContainer extends Utilities {

    @FindBy(css = "[class='row']:first-of-type")
    public WebElement title;

    @FindBy(css = "[id='withOptGroup']")
    public WebElement valueDropdownButton;

    @FindBy(css = "[class=' css-26l3qy-menu']")
    public WebElement valueDropdownContainer;

    @FindBy(css = "[id='selectMenuContainer'] [id='react-select-12-input']")
    public WebElement multiSelectDropdownButton;

    public String getTitle(){return title.getText();}

    public void expandValueDropdown(){clickElement(valueDropdownButton);}

    public void expandMultiSelectDropdown(){clickElement(multiSelectDropdownButton);}

    public void printDropdownItems(){
        List<WebElement> dropdownOptions = valueDropdownContainer.findElements(By.cssSelector("*"));
        System.out.println(dropdownOptions.size());
    }

    public WebElement getValueDropdownItem(String itemName){
        List<WebElement> dropdownItems = valueDropdownContainer.findElements(By.cssSelector("*"));
        return loopNMatch(dropdownItems,itemName, true);
    }

    public void clickValueDropdownItem(String itemName){clickElement(getValueDropdownItem(itemName));}

}
