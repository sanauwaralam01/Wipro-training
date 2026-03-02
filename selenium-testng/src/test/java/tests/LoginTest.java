package tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.Assert;
import base.BaseTest;
//import dev.failsafe.internal.util.Assert;
import pages.LoginPage;
import utils.RetryAnalyzer;

public class LoginTest extends BaseTest {
	 @DataProvider(name = "loginData")
	    public Object[][] loginTestData() {
	        return new Object[][]{
	                {"standard_user", "secret_sauce", "success"},
	                {"standard_user", "wrongPass", "error"},
	                {"wrongUser", "secret_sauce", "error"},
	                {"", "", "validation"}
	        };
	    }

	    @Test(dataProvider = "loginData", retryAnalyzer = RetryAnalyzer.class)
	    public void loginTest(String username, String password, String expectedResult) {

	        LoginPage loginPage = new LoginPage(driver);

	        loginPage.enterUsername(username);
	        loginPage.enterPassword(password);
	        loginPage.clickLogin();

	        if (expectedResult.equals("success")) {

	            // Assertion for successful login
	            Assert.assertTrue(driver.getCurrentUrl().contains("inventory.html"),
	                    "User not redirected to dashboard!");

	        } else if (expectedResult.equals("error")) {

	            // Assertion for error message
	            String error = loginPage.getErrorMessage();
	            Assert.assertTrue(error.contains("Username and password do not match"),
	                    "Error message mismatch!");

	        } /*else if (expectedResult.equals("validation")) {

	            // Assertion for empty field validation
	            String validation = loginPage.getValidationMessage();
	            Assert.assertEquals(validation, "Username and Password required",
	                    "Validation message mismatch!");
	        }*/
	    }

}
