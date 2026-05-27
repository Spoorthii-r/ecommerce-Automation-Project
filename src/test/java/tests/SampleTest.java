package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import base.DriverFactory;

public class SampleTest extends BaseTest {

    @Test
    public void verifyTitle() {

        String title = DriverFactory.getDriver().getTitle();

        System.out.println("Page Title: " + title);

        Assert.assertTrue(true);
    }
}