package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.Utilities;

import java.util.List;

public class InteractionsPage extends Utilities {

    @FindBy(css = "[id='demo-tabpane-list'] [class*='list-group-item']")
    public List<WebElement> listItems;

    @FindBy(css = "[id='demo-tabpane-grid'] [class*='list-group-item']")
    public List<WebElement> gridItems;

    @FindBy(css = "a[id*='demo-tab']")
    public List<WebElement> tabs;

    @FindBy(css = "[id='resizableBoxWithRestriction'] [class*='react-resizable-handle']")
    public WebElement resizableBoxHandle;

    public void resizeBox(Integer xOffset, Integer yOffset){dragAndDropByOffset(resizableBoxHandle,xOffset,yOffset);}

    public void dragTabItemTo(List<WebElement> elementList,String targetItemText, String destinationItemText){
        WebElement targetElement = loopNMatch(elementList,targetItemText, false);
        WebElement destinationElement = loopNMatch(elementList,destinationItemText, false);
        dragAndDropTo(targetElement,destinationElement);
    }
}
