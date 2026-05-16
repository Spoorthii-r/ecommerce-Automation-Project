package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory {

    public static WebDriver driver;

    // Initialize Driver
    public static void initDriver() {

        driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://tutorialsninja.com/demo/");
    }

    // Get Driver
    public static WebDriver getDriver() {

        return driver;
    }

    // Quit Driver
    public static void quitDriver() {

        if(driver != null) {

            driver.quit();
        }
    }
}