package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	 WebDriver driver;

	    public LoginPage(WebDriver driver) {
	        this.driver = driver;
	    }

	    By username = By.id("user-name");
	    By password = By.id("password");
	    By loginBtn = By.id("login-button");
	    By errorMessage = By.xpath("//h3[@data-test='error']");
	    //By validationMessage = By.id("validationMsg");

	    public void enterUsername(String user) {
	        driver.findElement(username).clear();
	        driver.findElement(username).sendKeys(user);
	    }

	    public void enterPassword(String pass) {
	        driver.findElement(password).clear();
	        driver.findElement(password).sendKeys(pass);
	    }

	    public void clickLogin() {
	        driver.findElement(loginBtn).click();
	    }

	    public String getErrorMessage() {
	        return driver.findElement(errorMessage).getText();
	    }

	   /* public String getValidationMessage() {
	        return driver.findElement(validationMessage).getText();
	    }*/

}
