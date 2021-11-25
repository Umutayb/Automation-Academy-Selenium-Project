package pages;

import io.cucumber.datatable.DataTable;
import org.openqa.selenium.support.FindBy;
import pages.components.PracticeForm;
import utils.Utilities;
import java.util.List;
import java.util.Map;

public class FormsPage extends Utilities {

    @FindBy(css = "[class='practice-form-wrapper']")
    public PracticeForm practiceForm;

    public void setBirthDate(DataTable table){

        List<Map<String, String>> signForms = table.asMaps();

        String year;
        String month;
        String day;

        practiceForm.expandDatePicker();

        for (Map<String, String> form : signForms) {
            day = form.get("Day");
            month = form.get("Month");
            year = form.get("Year");

            practiceForm.datePicker.setDate(year,month,day);
            practiceForm.verifyDate(year,month,day);
        }
    }
}
