package base;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class DriverFactory {

    public static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    public static void initDriver(String browser) {

        try {

            if(browser.equalsIgnoreCase("chrome")) {

                driver.set(new RemoteWebDriver(
                        new URL("http://localhost:4444"),
                        new ChromeOptions()));

            }

            else if(browser.equalsIgnoreCase("firefox")) {

                driver.set(new RemoteWebDriver(
                        new URL("http://localhost:4444"),
                        new FirefoxOptions()));
            }

        } catch (MalformedURLException e) {

            e.printStackTrace();
        }

        getDriver().manage().window().maximize();
    }

    public static WebDriver getDriver() {

        return driver.get();
    }

    public static void quitDriver() {

        if(getDriver() != null) {

            getDriver().quit();

            driver.remove();
        }
    }
}