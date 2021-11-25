package steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import pages.FormsPage;

public class FormsPageSteps {
    FormsPage formsPage = new FormsPage();

    @Given("Set & verify date as:")
    public void setDate(DataTable table){formsPage.setBirthDate(table);}

    @Given("Enter name {}")
    public void fillNameInput(String name){formsPage.practiceForm.fillFirstName(name);}

    @Given("Enter surname {}")
    public void fillSurnameInput(String surname){formsPage.practiceForm.fillLastName(surname);}

    @Given("Enter email {}")
    public void fillEmailInput(String email){formsPage.practiceForm.fillEmail(email);}

    @Given("Select gender as {}")
    public void selectGenderInput(String gender){formsPage.practiceForm.selectGender(gender);}

    @Given("Enter mobile number {}")
    public void fillNumberInput(String number){formsPage.practiceForm.fillMobileNumber(number);}

    @Given("Upload file located at {}")
    public void uploadFile(String filePath){formsPage.practiceForm.uploadFile(filePath);}

    @Given("Check hobby checkboxes: {}")
    public void checkHobbies(String hobbies){formsPage.practiceForm.checkHobbyCheckboxes(hobbies);}

    @Given("Enter subjects {}")
    public void fillSubjectsInput(String subjects){formsPage.practiceForm.fillSubjectsInput(subjects);}

    @Given("Enter current address {}")
    public void fillAddressInput(String address){formsPage.practiceForm.fillCurrentAddressInput(address);}

    @Given("Select city {}")
    public void selectCity(String cityName){formsPage.practiceForm.selectCity(cityName);}

    @Given("Select state {}")
    public void selectState(String stateName){formsPage.practiceForm.selectState(stateName);}

    @Given("Submit form")
    public void submitForm(){formsPage.practiceForm.submit();}
}
