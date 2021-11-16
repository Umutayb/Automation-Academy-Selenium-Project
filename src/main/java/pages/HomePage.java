package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;
import utils.Utilities;
import java.util.List;

public class HomePage extends Utilities {

    public HomePage(){PageFactory.initElements(driver,this);}

    @FindBy(css = "[class*='top-card']")
    public List<WebElement> homePageCards;

    public void clickHomePageCard(String cardName){
        for (WebElement card:homePageCards) {
            if (card.getText().equalsIgnoreCase(cardName)){
                card.click();
                return;
            }
        }
        Assert.fail("No card named "+cardName+" could be located on the home page.");
    }
}
