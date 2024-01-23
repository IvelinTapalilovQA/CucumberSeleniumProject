package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pageObjects.AccountDetailsPage;
import pageObjects.MyAccountPage;

public class ValidateRegistrationStep {

    MyAccountPage myAccountPage;
    AccountDetailsPage accountDetailsPage;


    public ValidateRegistrationStep(MyAccountPage myAccountPage, AccountDetailsPage accountDetailsPage){
        this.myAccountPage = myAccountPage;
        this.accountDetailsPage = accountDetailsPage;
    }


    @When("The user enters a valid email address in the registration section")
    public void theUserEntersAValidEmailAddressInTheRegistrationSection() {
        myAccountPage.enterRegEmail();
    }

    @And("The user enters a valid password in the registration section")
    public void theUserEntersAValidPasswordInTheRegistrationSection() {
        myAccountPage.enterRegPassword("Testpass123!");
    }

    @And("The user clicks on register button")
    public void theUserClicksOnRegisterButton() {
        myAccountPage.clickOnRegisterButton();
    }

    @Then("The user should be presented with a successful registration message")
    public void theUserShouldBePresentedWithASuccessfulRegistrationMessage() {
        Assert.assertEquals("Hello " + myAccountPage.getExtractUsernameFromEmail(), accountDetailsPage.extractGreetingMessage());
    }
}
