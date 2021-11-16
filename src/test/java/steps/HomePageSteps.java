package steps;

import io.cucumber.java.en.Given;
import pages.HomePage;

public class HomePageSteps {

    HomePage homePage = new HomePage();

    @Given("Click home page card named {}")
    public void clickHomePageCardNamed(String cardName){homePage.clickHomePageCard(cardName);}

}
