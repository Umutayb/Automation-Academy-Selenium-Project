package steps;

import io.cucumber.java.en.Given;
import pages.ElementsPage;

public class ElementsPageSteps {

    ElementsPage elementsPage = new ElementsPage();

    @Given("Click menu item called {}")
    public void clickMenuItem(String itemName){elementsPage.clickMenuElement(itemName);}

    @Given("Click toggle of the item called {}")
    public void clickToggle(String itemName){elementsPage.clickToggleElement(itemName);}

    @Given("Check checkbox of the item called {}")
    public void clickCheckbox(String itemName){elementsPage.checkCheckBox(itemName);}

    @Given("Print result text")
    public void printResult(){elementsPage.printResultText();}

    @Given("The result is {}")
    public void verifyResult(String expectedResult){elementsPage.resultVerification(expectedResult);}

    @Given("Enter {} to the username filed")
    public void fillUsername(String username){elementsPage.fillInput(username,elementsPage.usernameInput);}

    @Given("Enter {} to the email filed")
    public void fillEmail(String email){elementsPage.fillInput(email,elementsPage.emailInput);}

    @Given("Enter {} to the current address filed")
    public void fillCurrentAddress(String currentAddress){elementsPage.fillInput(currentAddress,elementsPage.currentAddressInput);}

    @Given("Enter {} to the permanent address filed")
    public void fillPermanentAddress(String permanentAddress){elementsPage.fillInput(permanentAddress,elementsPage.permanentAddressInput);}

    @Given("Click text box submit button")
    public void clickTextBoxSubmit(){elementsPage.clickElement(elementsPage.submitButton);}
}
