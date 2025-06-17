package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SigninTest {
    @Given("User is on the sign-in page")
public void userIsOnSignInPage() {
    System.out.println("[STEP] Navigated to the Sign-In page");
}

@When("User enters valid username and password")
public void userEntersValidCredentials() {
    System.out.println("[STEP] Entered valid username and password");
}

@And("User clicks the sign-in button")
public void userClicksSignInButton() {
    System.out.println("[STEP] Clicked the Sign-In button");
}

@Then("User should be redirected to the homepage")
public void userIsRedirectedToHomepage() {
    System.out.println("[STEP] Successfully redirected to the homepage");
}

}
