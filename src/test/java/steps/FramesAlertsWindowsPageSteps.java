package steps;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import pages.FramesAlertsWindowsPage;

public class FramesAlertsWindowsPageSteps {

    FramesAlertsWindowsPage framesAlertsWindowsPage = new FramesAlertsWindowsPage();

    @Given("Print small modal title")
    public void printSmallModalTitle(){
        System.out.println(framesAlertsWindowsPage.smallModal.getTitle());
    }

    @Given("Print small modal content")
    public void printSmallModalContent(){
        System.out.println(framesAlertsWindowsPage.smallModal.getContent());
    }

    @Given("Verify presence of the cross button")
    public void verifyCrossButtonPresence(){
        Assert.assertTrue(framesAlertsWindowsPage.smallModal.crossButton.isDisplayed());
        System.out.println("Presence of the cross button has been verified!");
    }

    @Given("Close small modal")
    public void closeSmallModal(){framesAlertsWindowsPage.smallModal.close();}

    @Given("Open small modal")
    public void showSmallModal(){framesAlertsWindowsPage.clickElement(framesAlertsWindowsPage.showSmallModalButton);}

    @Given("Open Large modal")
    public void showLargeModal(){framesAlertsWindowsPage.clickElement(framesAlertsWindowsPage.showLargeModalButton);}
}
