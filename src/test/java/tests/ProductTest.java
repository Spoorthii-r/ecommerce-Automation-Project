package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import base.DriverFactory;

public class ProductTest extends BaseTest {

    @Test

    public void productTest() {

        System.out.println("Product Test Started");

        DriverFactory.getDriver().findElement(
                By.id("user-name"))
                .sendKeys("standard_user");

        DriverFactory.getDriver().findElement(
                By.id("password"))
                .sendKeys("secret_sauce");

        DriverFactory.getDriver().findElement(
                By.id("login-button"))
                .click();
        try {
            Thread.sleep(5000);
        } catch (Exception e) {

        }

        System.out.println("Logged Into Application");

        boolean productVisible =
                DriverFactory.getDriver()
                .findElement(By.className("inventory_list"))
                .isDisplayed();

        Assert.assertTrue(productVisible);

        System.out.println("Products Displayed");

        System.out.println("Product Test Passed");
    }
}