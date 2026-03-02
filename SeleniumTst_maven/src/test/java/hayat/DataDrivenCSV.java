package hayat;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDrivenCSV {
	WebDriver driver;

	@BeforeMethod
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com");
		
	}
	@Test(dataProvider = "loginTest")
	public void loginTest(String username, String password) {
		driver.findElement(By.name("user-name")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.id("login-button")).click();
	}



	@DataProvider(name= "loginTest")
	public Object[][] getData() throws Exception {
	    return CSVUtils.getCSVData("C:\\Users\\Md Sanauwar Alam\\eclipse-workspace\\SeleniumTst_maven\\src\\test_data\\test_data1.csv");
	}

	@AfterMethod
	public void Destroy() {
		driver.quit();
	}


}
