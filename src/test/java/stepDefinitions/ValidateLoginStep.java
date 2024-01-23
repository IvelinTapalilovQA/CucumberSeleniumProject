package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pageObjects.AccountDetailsPage;
import pageObjects.MyAccountPage;

public class ValidateLoginStep {

    MyAccountPage myAccountPage;
    AccountDetailsPage accountDetailsPage;
    String username;

    public ValidateLoginStep(MyAccountPage accountPage, AccountDetailsPage accountDetailsPage){
        this.myAccountPage = accountPage;
        this.accountDetailsPage = accountDetailsPage;
    }

    @When("The user enters a valid email into the login section")
    public void theUserEntersAValidEmailIntoTheLoginSection() {
        username = "testuser477";
        myAccountPage.enterUsername(username);

    }

    @And("The user enters a valid password into the login section")
    public void theUserEntersAValidPasswordIntoTheLoginSection() {
        myAccountPage.enterPassword("Testuser477!");
    }

    @And("The user clicks on login button")
    public void theUserClicksOnLoginButton() {
        myAccountPage.clickOnLoginButton();
    }

    @Then("The user should be presented with a successful login message")
    public void theUserShouldBePresentedWithASuccessfulLoginMessage() {
        Assert.assertEquals("Hello testuser477", accountDetailsPage.extractGreetingMessage());
    }
}
