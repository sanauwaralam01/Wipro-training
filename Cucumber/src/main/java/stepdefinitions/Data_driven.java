package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.time.Duration;

public class Data_driven {
	WebDriver driver;
    @Given("the user is on login page")
    public void user_is_on_login_page() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.saucedemo.com/");
    }
	@When("the user enters {string} and {string}")
	public void user_enters_credentials(String username, String password) {

	    driver.findElement(By.id("user-name")).sendKeys(username);
	    driver.findElement(By.id("password")).sendKeys(password);
	    driver.findElement(By.id("login-button")).click();
	}

	@Then("the login result should be {string}")
	public void verify_login_result(String result) {

	    if(result.equals("success")) {
	        System.out.println("Login successful");
	    } else {
	        System.out.println("Login failed");
	    }

	    driver.quit();
	}

}
