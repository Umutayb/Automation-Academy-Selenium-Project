package steps;

import io.cucumber.java.en.Given;
import pages.InteractionsPage;

public class InteractionsPageSteps {
    InteractionsPage interactionsPage = new InteractionsPage();

    @Given("Drag list item {} onto {}")
    public void dragListItem(String targetElementText, String destinationElementText){
        interactionsPage.dragTabItemTo(interactionsPage.listItems,targetElementText,destinationElementText);
    }

    @Given("Drag grid item {} onto {}")
    public void dragGridItem(String targetElementText, String destinationElementText){
        interactionsPage.dragTabItemTo(interactionsPage.gridItems,targetElementText,destinationElementText);
    }

    @Given("Click sortable tab option {}")
    public void clickTabOption(String tabName){
        interactionsPage.clickElement(interactionsPage.loopNMatch(interactionsPage.tabs,tabName, false));
    }

    @Given("Resize the restricted bow by x: {} & y: {}")
    public void resizeByOffset(Integer xOffset, Integer yOffset){
        interactionsPage.resizeBox(xOffset,yOffset);
    }
}
