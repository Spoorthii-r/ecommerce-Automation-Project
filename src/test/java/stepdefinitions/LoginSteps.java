package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class LoginSteps {

    @Given("User opens login page")
    public void user_opens_login_page() {
        System.out.println("Login page opened");
    }

    @When("User enters username and password")
    public void user_enters_username_and_password() {
        System.out.println("Entered username and password");
    }

    @Then("User should login successfully")
    public void user_should_login_successfully() {
        System.out.println("Login successful");
    }
}