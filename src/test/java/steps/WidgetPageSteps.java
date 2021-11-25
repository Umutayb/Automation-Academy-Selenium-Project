package steps;

import io.cucumber.java.en.Given;
import pages.WidgetsPage;

public class WidgetPageSteps {
    WidgetsPage widgetsPage = new WidgetsPage();

    @Given("Hover over navigation tab {}")
    public void hoverOverNavigationTab(String tabText){
        widgetsPage.hoverOver(widgetsPage.loopNMatch(widgetsPage.navigationTabs,tabText, false),System.currentTimeMillis());
    }

    @Given("Expand value dropdown")
    public void expandValueDropdown(){widgetsPage.selectMenu.expandValueDropdown();}

    @Given("Print value dropdown items")
    public void printValueDropdownItems(){widgetsPage.selectMenu.printDropdownItems();}

    @Given("Click value dropdown item named {}")
    public void clickValueDropdownItem(String itemName){widgetsPage.selectMenu.clickValueDropdownItem(itemName);}
}
