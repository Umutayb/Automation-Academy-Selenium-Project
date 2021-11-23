package steps;

import io.cucumber.java.en.Given;
import pages.InteractionsPage;

public class InteractionsPageSteps {
    InteractionsPage interactionsPage = new InteractionsPage();

    @Given("Drag {} onto {}")
    public void dragListItem(String targetElementText, String destinationElementText){
        interactionsPage.dragTabItemTo(targetElementText,destinationElementText);
    }
}
