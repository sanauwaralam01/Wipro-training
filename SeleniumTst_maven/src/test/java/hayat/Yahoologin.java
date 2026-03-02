package hayat;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Yahoologin {
	WebDriver driver;
	@BeforeMethod
	public void yahoologin() {
		  WebDriverManager.chromedriver().setup();
	       driver = new ChromeDriver();
	     driver.get("https://login.yahoo.com");
	}
	@Test
	public void testlogin() throws InterruptedException {
		WebElement username = driver.findElement(By.id("login-username"));
		username.sendKeys("mdsanauwaralam");
		username.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		
		WebElement pass= driver.findElement(By.id("login-passwd"));
		pass.sendKeys("Sanauwar$001");
		pass.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
	}
	@AfterMethod
	public void exit() {
		driver.quit();
		
	}
	}
