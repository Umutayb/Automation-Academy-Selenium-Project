package steps;

import io.cucumber.java.*;
import io.cucumber.java.en.*;
import utils.Utilities;

public class CommonSteps extends Utilities {

    @Before
    public void startDriver(){initialize();}

    @After
    public void terminateDriver(){terminate();}

    @Given("Navigate to {}")
    public void browserNavigate(String url){navigate(url);}

    @And("Go to {} page")
    public void predeterminedNavigation(String pageName){predeterminedNavigate(pageName);}

    @Then("Wait for {}")
    public void browserNavigate(double duration){waitFor(duration);}
}
