package hayat;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginTest1 {
	//public class LoginTest
	//{
		
		WebDriver driver;
		@BeforeMethod
		public void setup()
		{
			driver= new ChromeDriver();
			driver.manage().window().maximize();
		}
		@Test(dataProvider="excelData")
		public void loginTest(String username, String password)
		{
			driver.get("https://practicetestautomation.com/practice-test-login");
			driver.findElement(By.id("username")).sendKeys(username);
			driver.findElement(By.id("password")).sendKeys(password);
			driver.findElement(By.id("submit")).click();
		}
		@AfterMethod
		public void tearDown()
		{
			driver.quit();
		}
		@DataProvider(name="excelData")
		public Object[][] getExcelData()throws Exception
		{
			return ExcelUtils.getEcelData("C:\\Users\\Md Sanauwar Alam\\eclipse-workspace\\SeleniumTst_maven\\src\\test_data\\test_data.xlsx","Sheet1");
		}
}
