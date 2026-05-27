package tests;

import org.testng.annotations.Test;

import base.BaseTest;
import base.DriverFactory;

public class LoginTest extends BaseTest {

	@Test

	public void googleTest() throws InterruptedException {

	    DriverFactory.getDriver().get("https://www.google.com");

	    System.out.println("Google opened successfully");

	    Thread.sleep(10000);
	}
}