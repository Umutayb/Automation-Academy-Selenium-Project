package steps;

import io.cucumber.java.en.Given;
import pages.WidgetsPage;

public class WidgetPageSteps {
    WidgetsPage widgetsPage = new WidgetsPage();

    @Given("Hover over navigation tab {}")
    public void hoverOverNavigationTab(String tabText){
        widgetsPage.hoverOver(widgetsPage.loopNMatch(widgetsPage.navigationTabs,tabText),System.currentTimeMillis());
    }
}
