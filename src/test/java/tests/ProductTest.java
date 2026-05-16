package tests;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import listeners.TestListener;
import utils.LoggerUtils;

@Listeners(TestListener.class)

public class ProductTest {

    @Test

    public void sampleProductTest() {

        LoggerUtils.info("Product Test Started");

        Assert.assertTrue(true);

        LoggerUtils.info("Product Test Passed");
    }
}