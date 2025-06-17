package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CheckoutTest {
    @Given("User has items in the cart")
public void userHasItemsInCart() {
    System.out.println("→ Items are present in the shopping cart");
}

@When("User proceeds to checkout")
public void userProceedsToCheckout() {
    System.out.println(">> Proceeding to checkout page");
}

@And("User enters valid payment details")
public void userEntersPaymentDetails() {
    System.out.println(">> Entering valid payment information");
}

@And("User confirms the order")
public void userConfirmsOrder() {
    System.out.println("→ Confirming the order");
}

@Then("User should see an order confirmation message")
public void userSeesConfirmationMessage() {
    System.out.println("✓ Order confirmed! Confirmation message is displayed.");
}

}
