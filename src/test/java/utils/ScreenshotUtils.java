package utils;

import base.DriverFactory;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;

public class ScreenshotUtils {

    public static void capture(String screenshotName) {

        try {

            File source =
                    ((TakesScreenshot)
                            DriverFactory.getDriver())
                            .getScreenshotAs(OutputType.FILE);

            File destination =
                    new File("screenshots/"
                            + screenshotName + ".png");

            FileUtils.copyFile(source, destination);

            System.out.println("Screenshot Captured");

        } catch (Exception e) {

            e.printStackTrace();
        }
    }
}