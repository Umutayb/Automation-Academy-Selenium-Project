package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.components.SmallModal;
import utils.Utilities;

public class FramesAlertsWindowsPage extends Utilities {

    @FindBy(css = "[class='modal-content']")
    public SmallModal smallModal;

    @FindBy(css = "[id='showSmallModal']")
    public WebElement showSmallModalButton;

    @FindBy(css = "[id='showLargeModal']")
    public WebElement showLargeModalButton;
    
}
