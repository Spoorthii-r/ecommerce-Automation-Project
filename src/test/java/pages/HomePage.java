package pages;

import org.openqa.selenium.By;

import base.DriverFactory;

public class HomePage {

    By myAccount = By.xpath("//span[text()='My Account']");

    By loginLink = By.linkText("Login");

    public void navigateToLogin() {

        DriverFactory.getDriver()
                .findElement(myAccount)
                .click();

        DriverFactory.getDriver()
                .findElement(loginLink)
                .click();
    }
}