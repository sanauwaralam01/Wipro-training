package stepdefinitions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Data_Driven_List {
	WebDriver driver;
	 @Given("user is on login page")
	    public void user_is_on_login_page() {
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	        driver.get("https://www.saucedemo.com/");
	    }
	 @When("user enters usernames")
	 public void user_enters_usernames(DataTable dataTable) {

	     List<String> usernames = dataTable.asList();

	     for (String username : usernames) {

	         driver.findElement(By.id("user-name")).clear();
	         driver.findElement(By.id("password")).clear();

	         driver.findElement(By.id("user-name")).sendKeys(username);
	         driver.findElement(By.id("password")).sendKeys("secret_sauce");
	         driver.findElement(By.id("login-button")).click();

	         driver.navigate().back();
	     }
	 }
	 @Then("login process should complete")
	 public void login_process_complete(){
		 driver.quit();
	 }

}
