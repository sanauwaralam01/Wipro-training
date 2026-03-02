package base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import utils.ScreenshotUtil;

public class BaseTest {
	 protected WebDriver driver;

	    @BeforeClass
	    public void setupEnvironment() {
	        System.out.println("Setting up test environment...");
	    }

	    @BeforeMethod
	    public void launchBrowser() {
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	        driver.get("https://www.saucedemo.com");
	    }

	    @AfterMethod
	    public void tearDown(ITestResult result) {

	        System.out.println("Test Status: " + result.getStatus());

	    
	        if (ITestResult.FAILURE == result.getStatus()) {
	            ScreenshotUtil.capture(driver, result.getName());
	        }

	        if (driver != null) {
	            driver.quit();
	        }
	    }

	    @AfterClass
	    public void cleanupEnvironment() {
	        System.out.println("Cleaning up test environment...");
	    }

}
