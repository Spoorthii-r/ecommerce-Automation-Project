package pages;

import org.openqa.selenium.By;

import base.DriverFactory;

public class LoginPage {

    By emailField = By.id("input-email");

    By passwordField = By.id("input-password");

    By loginButton = By.xpath("//input[@value='Login']");

    public void login(String email, String password) {

        DriverFactory.getDriver()
                .findElement(emailField)
                .sendKeys(email);

        DriverFactory.getDriver()
                .findElement(passwordField)
                .sendKeys(password);

        DriverFactory.getDriver()
                .findElement(loginButton)
                .click();
    }
}