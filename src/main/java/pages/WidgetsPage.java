package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.components.SelectMenuContainer;
import utils.Utilities;

import java.util.List;

public class WidgetsPage extends Utilities {

    @FindBy(css = "[class='nav-menu-container'] li a")
    public List<WebElement> navigationTabs;

    @FindBy(css = "[id='selectMenuContainer']")
    public SelectMenuContainer selectMenu;
}
