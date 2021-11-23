package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.Utilities;

import java.util.List;

public class InteractionsPage extends Utilities {

    @FindBy(css = "[id='demo-tabpane-list'] [class*='list-group-item']")
    List<WebElement> listItems;

    public void dragTabItemTo(String targetItemText, String destinationItemText){
        WebElement targetElement = getTabItem(targetItemText);
        WebElement destinationElement = getTabItem(destinationItemText);
        dragAndDropTo(targetElement,destinationElement);
    }

    public WebElement getTabItem(String itemText){
        for (WebElement listItem:listItems) {
            if (listItem.getText().contains(itemText))
                return listItem;
        }
        Assert.fail("No tab item with text "+itemText+" could be located on the InteractionsPage @getTabItem");
        return null;
    }
}
