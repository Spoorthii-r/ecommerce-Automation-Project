package tests;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import base.BaseTest;
import listeners.TestListener;
import pages.HomePage;
import pages.LoginPage;
import utils.ExcelUtils;
import utils.LoggerUtils;
import utils.RetryAnalyzer;
import utils.ScreenshotUtils;

@Listeners(TestListener.class)

public class LoginTest extends BaseTest {

    @Test(retryAnalyzer = RetryAnalyzer.class)

    public void loginTest() {

        LoggerUtils.info("Login Test Started");

        String email =
                ExcelUtils.getCellData(1,0);

        String password =
                ExcelUtils.getCellData(1,1);

        HomePage homePage = new HomePage();

        homePage.navigateToLogin();

        LoginPage loginPage = new LoginPage();

        loginPage.login(email, password);

        ScreenshotUtils.capture("LoginTest");

        LoggerUtils.info("Login Test Completed");
    }
}