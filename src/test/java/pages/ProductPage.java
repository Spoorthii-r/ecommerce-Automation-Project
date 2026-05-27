package pages;

import org.openqa.selenium.By;

import base.DriverFactory;

public class ProductPage {

    By searchBox = By.name("search");
    By searchButton = By.xpath("//button[@class='btn btn-default btn-lg']");

    public void searchProduct(String productName) {

        DriverFactory.getDriver()
                .findElement(searchBox)
                .sendKeys(productName);

        DriverFactory.getDriver()
                .findElement(searchButton)
                .click();
    }
}