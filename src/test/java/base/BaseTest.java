package base;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseTest {

    @Parameters("browser")

    @BeforeMethod
    public void setup() {

        DriverFactory.initDriver("chrome");
    }

    @AfterMethod
    public void tearDown() {

        DriverFactory.quitDriver();
    }
}