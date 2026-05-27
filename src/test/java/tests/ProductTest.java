package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ProductTest {

    @Test
    public void productValidationTest() {

        System.out.println("Product Test Started");

        boolean productVisible = true;

        Assert.assertTrue(productVisible);

        System.out.println("Product Test Passed");
    }
}