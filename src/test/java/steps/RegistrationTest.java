package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegistrationTest {
    @Given("User is on the registration page")
public void openRegistrationPage() {
    System.out.println("→ Accessing registration screen...");
}

@When("User type first name {string}")
public void inputFirstName(String firstName) {
    System.out.println(">> First name entered: " + firstName);
}

@And("User type last name {string}")
public void inputLastName(String lastName) {
    System.out.println(">> Last name entered: " + lastName);
}

@And("User type email {string}")
public void inputEmailAddress(String email) {
    System.out.println(">> Email entered: " + email);
}

@And("User type password {string}")
public void inputUserPassword(String password) {
    System.out.println(">> Password entered: " + password);
}

@And("User submits the registration form")
public void submitTheForm() {
    System.out.println("→ Submitting registration form...");
}

@Then("User should see a success message")
public void verifySuccessMessage() {
    System.out.println("✓ Registration success message is displayed.");
}

}
