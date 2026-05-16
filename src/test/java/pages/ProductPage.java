package pages;

import org.openqa.selenium.By;

import base.BasePage;

public class ProductPage extends BasePage {

    private By searchBox =
            By.name("search");

    private By searchBtn =
            By.xpath("//button[@class='btn btn-default btn-lg']");

    private By firstProduct =
            By.linkText("MacBook");

    private By addToCartBtn =
            By.id("button-cart");

    private By successMsg =
            By.xpath("//div[contains(@class,'alert-success')]");

    public void searchProduct(String productName) {

        driver.findElement(searchBox).clear();

        driver.findElement(searchBox)
              .sendKeys(productName);

        driver.findElement(searchBtn)
              .click();
    }

    public void selectFirstProduct() {

        driver.findElement(firstProduct)
              .click();
    }

    public void addToCart() {

        driver.findElement(addToCartBtn)
              .click();
    }

    public String getSuccessMessage() {

        return driver.findElement(successMsg)
                     .getText();
    }
}