package pages.components;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.Utilities;

public class SmallModal extends Utilities {

    @FindBy(css = "[class='modal-title h4']")
    public WebElement title;

    @FindBy(css = "[class='close']")
    public WebElement crossButton;

    @FindBy(css = "[class='modal-body']")
    public WebElement modalContent;

    @FindBy(css = "[id='closeSmallModal']")
    public WebElement closeButton;

    public String getContent(){return modalContent.getText();}

    public String getTitle(){return title.getText();}

    public void clickCrossButton(){clickElement(crossButton);}

    public void close(){clickElement(closeButton);}
}
