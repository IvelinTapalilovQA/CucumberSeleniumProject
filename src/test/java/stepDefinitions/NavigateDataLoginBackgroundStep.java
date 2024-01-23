package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import pageObjects.HomePage;
import pageObjects.MyAccountPage;
import pageObjects.PersonalDataModal;
import utils.HelperClass;

public class NavigateDataLoginBackgroundStep {

    PersonalDataModal personalDataModal;
    HomePage homePage;
    MyAccountPage myAccountPage;

    public NavigateDataLoginBackgroundStep(PersonalDataModal personalDataModal, HomePage homePage, MyAccountPage myAccountPage){
        this.personalDataModal = personalDataModal;
        this.homePage = homePage;
        this.myAccountPage = myAccountPage;
    }

    @Given("The user access practice.automationtesting homepage")
    public void the_user_access_practice_automationtesting_homepage() {
        HelperClass.openPage("https://practice.automationtesting.in");

    }

    @And("The user cancel the personal data modal window")
    public void theUserCancelThePersonalDataModalWindow() {
        personalDataModal.cancelPersonalDataModal();
    }

    @And("The user clicks on my account button")
    public void theUserClicksOnMyAccountButton() {
        homePage.clickOnMyAccount();
    }

    @And("The user log in to account")
    public void theUserLogInToAccount() {
        myAccountPage.login();
    }
}
