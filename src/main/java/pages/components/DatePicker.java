package pages.components;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.Utilities;

import java.util.List;

public class DatePicker extends Utilities {

    @FindBy(css = "select[class='react-datepicker__year-select']")
    public WebElement yearDropdown;

    @FindBy(css = "select[class='react-datepicker__year-select'] option")
    public List<WebElement> years;

    @FindBy(css = "select[class='react-datepicker__month-select']")
    public WebElement monthDropdown;

    @FindBy(css = "select[class='react-datepicker__month-select'] option")
    public List<WebElement> months;

    @FindBy(css = "[role='listbox'] [role='option']")
    public List<WebElement> days;

    public void setDate(String year, String month, String day){
        clickElement(yearDropdown);
        clickElement(getYear(year));
        clickElement(monthDropdown);
        clickElement(getMonth(month));
        clickElement(getDay(day));
    }

    public WebElement getYear(String year){return loopNMatch(years,year,true);}
    public WebElement getMonth(String month){return loopNMatch(months,month,true);}
    public WebElement getDay(String day){return loopNMatch(days,day,true);}

}
