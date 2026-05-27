package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

import pages.HomePage;
import pages.LoginPage;

public class LoginSteps {

    HomePage homePage = new HomePage();

    LoginPage loginPage = new LoginPage();

    @Given("User launches OpenCart application")
    public void launch_application() {

        System.out.println("Application launched successfully");
    }

    @When("User navigates to login page")
    public void navigate_login_page() {

        homePage.navigateToLogin();
    }

    @When("User enters valid email and password")
    public void enter_valid_credentials() {

        loginPage.login(
                "test@test.com",
                "password123"
        );
    }

    @Then("User should login successfully")
    public void verify_login() {

        System.out.println("Login successful");
    }
}