package pages.components;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.Utilities;
import java.util.List;

public class PracticeForm extends Utilities {

    @FindBy(css = "h5")
    public WebElement title;

    @FindBy(css = "[id='firstName']")
    public WebElement firstNameInput;

    @FindBy(css = "[id='lastName']")
    public WebElement lastNameInput;

    @FindBy(css = "[id='userEmail']")
    public WebElement userEmailInput;

    @FindBy(css = "[class*='custom-radio']")
    public List<WebElement> genderRadioInputs;

    @FindBy(css = "[id='userNumber']")
    public WebElement userNumberInput;

    @FindBy(css = "[class='react-datepicker__month-container']")
    public DatePicker datePicker;

    @FindBy(css = "[id='dateOfBirthInput']")
    public WebElement dateOfBirthInput;

    @FindBy(css = "[id='subjectsContainer'] input")
    public WebElement subjectsInput;

    @FindBy(css = "[class*='custom-checkbox']")
    public List<WebElement> hobbyItems;

    @FindBy(css = "[id='uploadPicture']")
    public WebElement uploadPictureButton;

    @FindBy(css = "[id='currentAddress']")
    public WebElement currentAddressInput;

    @FindBy(css = "[id='state']")
    public WebElement stateDropdownButton;

    @FindBy(css = "[id='city']")
    public WebElement cityDropdownButton;

    @FindBy(css = "[class*='menu'] [class*='option']")
    public List<WebElement> dropdownItems;

    @FindBy(css = "[id='submit']")
    public WebElement submitButton;

    public boolean verifyFormTitle(String formTitle){return formTitle.equalsIgnoreCase(getTitle());}

    public void fillFirstName(String firstName){fillInput(firstName,firstNameInput);}

    public void fillLastName(String lastName){fillInput(lastName,lastNameInput);}

    public void fillEmail(String email){fillInput(email,userEmailInput);}

    public void checkGenderRadioInput(String gender){clickElement(getGenderRadioButton(gender));}

    public void fillMobileNumber(String mobileNumber){fillInput(mobileNumber,userNumberInput);}

    public void expandDatePicker(){clickElement(dateOfBirthInput);}

    public void uploadFile(String filePath){fillInput(filePath,uploadPictureButton);}

    public void fillSubjectsInput(String subjects){fillInput(subjects,subjectsInput);}

    public void checkHobbyCheckboxes(String hobbies){
        int verificationCounter = 0;
        for (String hobby:hobbies.split(", ")) {
            for (WebElement hobbyItem:hobbyItems) {
                if (hobby.equalsIgnoreCase(hobbyItem.getText())){
                    clickElement(hobbyItem);
                    verificationCounter++;
                }
            }
        }
        Assert.assertEquals(hobbies.split(" ").length,verificationCounter);
    }

    public void selectGender(String gender){clickElement(getGender(gender));}

    public void fillCurrentAddressInput(String address){fillInput(address,currentAddressInput);}

    public WebElement getGender(String gender){return loopNMatch(genderRadioInputs,gender,false);}

    public void selectCity(String cityName){
        clickElement(cityDropdownButton);
        clickElement(getDropdownItem(cityName));
    }

    public void selectState(String stateName){
        clickElement(stateDropdownButton);
        clickElement(getDropdownItem(stateName));
    }

    public void submit(){clickElement(submitButton);}

    public String getTitle(){return title.getText();}

    public WebElement getDropdownItem(String itemName){return loopNMatch(dropdownItems,itemName,true);}

    public boolean verifyDate(String year, String month, String day){
        String verificationString = day+" "+shorten(month,3)+" "+year;
        return dateOfBirthInput.getAttribute("value").equalsIgnoreCase(verificationString);
    }

    public WebElement getGenderRadioButton(String gender){
        for (WebElement genderRadioInput:genderRadioInputs) {
            if (genderRadioInput.getAttribute("value").equalsIgnoreCase(gender))
                return genderRadioInput;
        }
        Assert.fail("No such gender was found on PracticeForm @getGenderRadioButton");
        return null;
    }
}
