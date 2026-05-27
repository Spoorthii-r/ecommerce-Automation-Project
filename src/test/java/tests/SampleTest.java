package tests;

import base.BaseTest;
import base.DriverFactory;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SampleTest extends BaseTest {

    @Test
    public void verifyTitle() {

        String title =
                DriverFactory.getDriver().getTitle();

        System.out.println("Page Title: " + title);

        Assert.assertTrue(title.contains("Swag Labs"));
    }
}